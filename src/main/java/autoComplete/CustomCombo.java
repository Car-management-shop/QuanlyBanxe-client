package autoComplete;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.PlainDocument;


public class CustomCombo extends PlainDocument{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("rawtypes")
	JComboBox comboBox;
    @SuppressWarnings("rawtypes")
	ComboBoxModel model;
    JTextComponent editor;
    boolean selecting = false;

    @SuppressWarnings("rawtypes")
	public CustomCombo(final JComboBox comboBox) {
        this.comboBox = comboBox;
        model = comboBox.getModel();
        editor = (JTextComponent) comboBox.getEditor().getEditorComponent();
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        try {
            if (selecting) {
                return;
            }
            super.insertString(offs, str, a);

            Object item = lookupItem(getText(0, getLength()));
            setSelectedItem(item);
            if (item == null)
            	setText(getText(0, getLength()));
            else
            	setText(item.toString());
            highlightCompletedText(offs + str.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(int offs, int len) throws BadLocationException {
        if (selecting) {
            return;
        }
        super.remove(offs, len);
    }

    private void setText(String text) throws BadLocationException {
        super.remove(0, getLength());
        super.insertString(0, text, null);
    }

    private void highlightCompletedText(int start) {
        editor.setSelectionStart(start);
        editor.setSelectionEnd(getLength());
    }

    private void setSelectedItem(Object item) {
        selecting = true;
        model.setSelectedItem(item);
        selecting = false;
    }

    private Object lookupItem(String pattern) {
        Object selectedItem = model.getSelectedItem();
        if (selectedItem != null && startsWithIgnoreCase(selectedItem.toString(), pattern)) {
            return selectedItem;
        } else {
            for (int i = 0, n = model.getSize(); i < n; i++) {
                Object currentItem = model.getElementAt(i);
                if (startsWithIgnoreCase(currentItem.toString(), pattern)) {
                    return currentItem;
                }
            }
        }
        return null;
    }

    private boolean startsWithIgnoreCase(String str1, String str2) {
        return str1.toUpperCase().startsWith(str2.toUpperCase());
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public void custom(JComboBox combo, String data) {
        combo.setEditable(true);
        JTextComponent editor = (JTextComponent) combo.getEditor().getEditorComponent();
        editor.setDocument(new CustomCombo(combo));
        combo.addItem(data);
    }
}
