package ui;
/*
* (C) Copyright 2020 IUH. All rights reserved.
*
* @author: nhathung
* @date: Nov 27, 2020
* @version: 1.0
*/

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;


import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JTextArea;
import java.awt.SystemColor;
import com.toedter.calendar.JCalendar;


public class HomePage extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lbltieuDe,lblanh;
	private JLabel lbClock;
	private String[] list = {
			"banner1.jpg",
			"banner2.jpg",
			"Banner03.jpg"
	};
	int x = 0;
	@SuppressWarnings("unused")
	private JLabel lblimg;
	int position=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SecurityManager securityManager = System.getSecurityManager();
		if(securityManager == null)
		{
			System.setProperty("java.security.policy", "policy/policy.policy");
			System.setSecurityManager(new SecurityManager());
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomePage() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		} catch (InstantiationException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		} catch (IllegalAccessException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		} catch (UnsupportedLookAndFeelException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(100, 100, screen.width, (screen.height-50));

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		lbltieuDe = new JLabel("CH??O M???NG ?????N V???I C???A H??NG XE M??Y TH??NH NAM");
		lbltieuDe.setBackground(new Color(255, 140, 0));
		lbltieuDe.setHorizontalAlignment(SwingConstants.CENTER);
		lbltieuDe.setFont(new Font("Tahoma", Font.BOLD, 35));
		
		lbltieuDe.setBounds(0, 0, 1522, 72);
		
		contentPane.add(lbltieuDe);
		
		JPanel panelthongTin = new JPanel();
		panelthongTin.setBackground(new Color(102, 102, 255));
		panelthongTin.setBounds(10, 545, 1512, 232);
		contentPane.add(panelthongTin);
		panelthongTin.setLayout(null);
		
		JLabel lblCngTy = new JLabel("@ C???a H??ng Xe M??y Th??nh Nam");
		lblCngTy.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCngTy.setBounds(33, 92, 254, 20);
		panelthongTin.add(lblCngTy);
		
		JLabel lblNewLabel = new JLabel("M?? s??? doanh nghi???p: 0108617038. \r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(33, 122, 237, 36);
		panelthongTin.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("G???I MUA H??NG, H??? TR??? (08:00 - 21:00): 1900.272737");
		lblNewLabel_1.setBounds(33, 169, 294, 14);
		panelthongTin.add(lblNewLabel_1);
		
		JLabel lblThng = new JLabel("TH??NG TIN");
		lblThng.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblThng.setBounds(31, 24, 170, 36);
		panelthongTin.add(lblThng);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(31, 71, 164, 4);
		panelthongTin.add(panel);
		
		JLabel lblLinH = new JLabel("Li??n H???");
		lblLinH.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLinH.setBounds(605, 24, 170, 36);
		panelthongTin.add(lblLinH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(551, 71, 229, 4);
		panelthongTin.add(panel_1);
		
		JLabel lblChiNhnhH = new JLabel("Chi nh??nh t???i TPHCM :");
		lblChiNhnhH.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblChiNhnhH.setBounds(595, 92, 179, 14);
		panelthongTin.add(lblChiNhnhH);
		
		JLabel lblNewLabel_2 = new JLabel("14-16 Qu???c H????ng, Ph?????ng Th???o ??i???n, Qu???n 2");
		lblNewLabel_2.setBounds(595, 123, 229, 14);
		panelthongTin.add(lblNewLabel_2);
		
		JLabel lblChiNhnhTi = new JLabel("Chi nh??nh t???i H?? N???i :");
		lblChiNhnhTi.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblChiNhnhTi.setBounds(595, 148, 179, 19);
		panelthongTin.add(lblChiNhnhTi);
		
		JLabel lblNewLabel_2_1 = new JLabel("T???ng 2, T-231, Aeon H?? ????ng");
		lblNewLabel_2_1.setBounds(595, 181, 229, 14);
		panelthongTin.add(lblNewLabel_2_1);
		
		JLabel lbCall = new JLabel("");
		lbCall.setIcon(new ImageIcon(HomePage.class.getResource("/img/Phone-icon.png")));
		lbCall.setBounds(7, 169, 16, 14);
		panelthongTin.add(lbCall);
		
		JLabel lbH = new JLabel("");
		lbH.setIcon(new ImageIcon(HomePage.class.getResource("/img/blue-home-icon.png")));
		lbH.setBounds(565, 122, 20, 15);
		panelthongTin.add(lbH);
		
		JLabel lbh1 = new JLabel("");
		lbh1.setIcon(new ImageIcon(HomePage.class.getResource("/img/blue-home-icon.png")));
		lbh1.setBounds(565, 181, 20, 15);
		panelthongTin.add(lbh1);
		
		JLabel lblTheoDiChng = new JLabel("Theo d??i ch??ng t??i t???i");
		lblTheoDiChng.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTheoDiChng.setBounds(1020, 24, 322, 36);
		panelthongTin.add(lblTheoDiChng);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.BLACK);
		panel_1_1.setBounds(1020, 71, 294, 4);
		panelthongTin.add(panel_1_1);
		
		JLabel lbFb = new JLabel("");
		lbFb.setIcon(new ImageIcon(HomePage.class.getResource("/img/social-facebook-box-blue-icon.png")));
		lbFb.setBounds(1030, 92, 39, 30);
		panelthongTin.add(lbFb);
		
		JLabel lbt = new JLabel("");
		lbt.setIcon(new ImageIcon(HomePage.class.getResource("/img/Twitter-icon.png")));
		lbt.setBounds(1097, 92, 39, 30);
		panelthongTin.add(lbt);
		
		JLabel lbGG = new JLabel("");
		lbGG.setIcon(new ImageIcon(HomePage.class.getResource("/img/google-plus-icon.png")));
		lbGG.setBounds(1159, 92, 39, 30);
		panelthongTin.add(lbGG);
		
		JLabel lbIn = new JLabel("");
		lbIn.setIcon(new ImageIcon(HomePage.class.getResource("/img/Linked-In-icon.png")));
		lbIn.setBounds(1219, 92, 39, 30);
		panelthongTin.add(lbIn);
		
		JLabel lbYt = new JLabel("");
		lbYt.setIcon(new ImageIcon(HomePage.class.getResource("/img/youtube-icon.png")));
		lbYt.setBounds(1275, 92, 39, 30);
		panelthongTin.add(lbYt);
		
	    lblanh = new JLabel("");
	    lblanh.setHorizontalAlignment(SwingConstants.CENTER);
		lblanh.setBounds(49, 111, 673, 386);
		contentPane.add(lblanh);
		
		JTextArea txtrCaHngXe = new JTextArea();
		txtrCaHngXe.setForeground(SystemColor.desktop);
		txtrCaHngXe.setEditable(false);
		txtrCaHngXe.setBackground(SystemColor.control);
		txtrCaHngXe.setFont(new Font("Courier New", Font.PLAIN, 20));
		txtrCaHngXe.setText("C???a h??ng xe m??y Th??nh Nam l?? m???t trong c??c c???a h??ng kinh\r\ndoanh xe m??y t???i TP. H??? Ch?? Minh, b??n c???nh ???? C???a h??ng xe\r\nm??y Th??nh Nam c??n l?? h??? th???ng ?????u ti??n c?? chu???i cung ???ng \r\nho??n thi???n xe m??y ch??nh h??ng t??? c??c nh?? s???n xu???t trong v??\r\nngo??i Vi???t Nam. ");
		txtrCaHngXe.setBounds(751, 99, 706, 169);
		contentPane.add(txtrCaHngXe);
		
		JLabel lbAnh1 = new JLabel("New label");
		lbAnh1.setBounds(751, 278, 405, 232);
		ImageIcon icon1 = new ImageIcon("img//them.png");
		Image img1 = icon1.getImage();
		Image imgScale1 = img1.getScaledInstance(lbAnh1.getWidth(), lbAnh1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
		lbAnh1.setIcon(scaledIcon1);
		contentPane.add(lbAnh1);
		
		JCalendar cld = new JCalendar();
		cld.setBounds(1166, 278, 298, 198);
		contentPane.add(cld);
		
		lbClock = new JLabel("New label");
		lbClock.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbClock.setBounds(1166, 479, 335, 38);
		contentPane.add(lbClock);
		clock();
		
		Timer timer = new Timer(1500,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int n = (int) Math.floor(Math.random() * 3);
				String image = list[n];
				ImageIcon icon1 = new ImageIcon("img//"+image+"");
				Image img1 = icon1.getImage();
				Image imgScale1 = img1.getScaledInstance(lblanh.getWidth(), lblanh.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
				lblanh.setIcon(scaledIcon1);

			}
		});
		timer.start();
		
	}
	public void clock() {
	    Thread clock = new Thread() {
	        public void run() {
	            try {
	                while (true) {
	                    Calendar cal = new GregorianCalendar();
	                    int second = cal.get(Calendar.SECOND);
	                    int minute = cal.get(Calendar.MINUTE);
	                    int hour = cal.get(Calendar.HOUR_OF_DAY);
	                    String thu;
	                    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	                    if (dayOfWeek == 1) {
	                        thu = "Ch??? nh???t";
	                    } else {
	                        thu = "Th??? " + Integer.toString(dayOfWeek);
	                    }
	                    int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
	                    int month = cal.get(Calendar.MONTH)+1;
	                    int year = cal.get(Calendar.YEAR);

	                    lbClock.setText(hour + "h:" + minute + "p:" + second +"s "+thu+" Ng??y "+dayOfMonth+" Th??ng "+month+" N??m "+year);
	                    sleep(1000);
	                }
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    };
	    clock.start();
	}
}


