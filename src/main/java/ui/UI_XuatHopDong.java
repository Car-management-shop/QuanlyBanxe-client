package ui;





import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import businesslogic.facade.HopDongFacade;
import businesslogic.facade.LoaiXeFacade;
import others.BillHopDong;
import others.PrintSupport;


import javax.swing.JLabel;


import java.awt.Font;



import java.sql.SQLException;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class UI_XuatHopDong extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private HopDongFacade hopDongFacade = (HopDongFacade) Naming.lookup("rmi://DESKTOP-1NNGN4I:9999/hopDongFacade");
	public static JLabel label_edit_tenKH;
	public static JLabel label_edit_diachi;
	public static JLabel label_edit_phankhoi;
	public static JLabel label_edit_sdt;
	public static JLabel label_edit_somay;
	public static JLabel label_edit_tgbh;
	public static JLabel label_edit_dongia ;
	public static JLabel label_edit_sokhung;
	public static JLabel label_edit_cmnd;
	public static JLabel label_edit_mauxe;
	public static JLabel label_edit_tenxe;
	public static JLabel label_edit_loaixe;
	public static JLabel lbl_edit_tenNV;
	public static JLabel label_edit_thue;
	
	public static JDateChooser dateChooser;

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
					UI_XuatHopDong frame = new UI_XuatHopDong();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws NotBoundException 
	 * @throws RemoteException 
	 * @throws MalformedURLException 
	 */
	public UI_XuatHopDong() throws MalformedURLException, RemoteException, NotBoundException {

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setBounds(320, 0, 718, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblHpngMua = new JLabel("H???p ?????ng mua b??n xe");
		lblHpngMua.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHpngMua.setBounds(255, 57, 232, 32);
		contentPane.add(lblHpngMua);
		LoaiXeFacade loaiXeFacade = (LoaiXeFacade) Naming.lookup("rmi://DESKTOP-1NNGN4I:9999/loaiXeFacade");
		//Dao_LoaiXe dao_lx = new Dao_LoaiXe();
		
		JLabel lblCngHaX = new JLabel("C???NG H??A X?? H???I CH??? NGH??A VI???T NAM");
		lblCngHaX.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCngHaX.setBounds(202, 10, 353, 23);
		contentPane.add(lblCngHaX);
		
		JLabel lblcLp = new JLabel("?????c l???p - T??? do - H???nh ph??c");
		lblcLp.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblcLp.setBounds(266, 43, 188, 13);
		contentPane.add(lblcLp);
		
		JLabel lblBnBn = new JLabel("B??n b??n");
		lblBnBn.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBnBn.setBounds(23, 87, 77, 13);
		contentPane.add(lblBnBn);
		
		JLabel lblCngTyMua = new JLabel("C??ng ty mua b??n xe m??y Th??nh Nam");
		lblCngTyMua.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCngTyMua.setBounds(54, 108, 220, 13);
		contentPane.add(lblCngTyMua);
		
		JLabel lblTnNhnVin = new JLabel("T??n nh??n vi??n");
		lblTnNhnVin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTnNhnVin.setBounds(54, 131, 93, 13);
		contentPane.add(lblTnNhnVin);
		
		lbl_edit_tenNV = new JLabel("...");
		lbl_edit_tenNV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl_edit_tenNV.setBounds(176, 131, 232, 13);
		contentPane.add(lbl_edit_tenNV);
		
		JLabel lblBnMua = new JLabel("B??n mua");
		lblBnMua.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBnMua.setBounds(23, 151, 77, 13);
		contentPane.add(lblBnMua);
		
		JLabel lblTnKhchHng = new JLabel("T??n kh??ch h??ng");
		lblTnKhchHng.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTnKhchHng.setBounds(54, 174, 93, 13);
		contentPane.add(lblTnKhchHng);
		
		label_edit_tenKH = new JLabel("...");
		label_edit_tenKH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_edit_tenKH.setBounds(176, 174, 278, 13);
		contentPane.add(label_edit_tenKH);
		
		
		JLabel lblCmnd = new JLabel("CMND");
		lblCmnd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCmnd.setBounds(54, 197, 46, 13);
		contentPane.add(lblCmnd);
		
		label_edit_cmnd = new JLabel("...");
		label_edit_cmnd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_edit_cmnd.setBounds(176, 197, 278, 13);
		contentPane.add(label_edit_cmnd);

		
		JLabel lblSinThoi = new JLabel("S??? ??i???n tho???i");
		lblSinThoi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSinThoi.setBounds(54, 220, 93, 13);
		contentPane.add(lblSinThoi);
		
		label_edit_sdt = new JLabel("...");
		label_edit_sdt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_edit_sdt.setBounds(176, 220, 277, 13);
		contentPane.add(label_edit_sdt);
		
		
		JLabel lblaCh = new JLabel("?????a ch???");
		lblaCh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblaCh.setBounds(54, 243, 46, 13);
		contentPane.add(lblaCh);
		
		label_edit_diachi = new JLabel("...");
		label_edit_diachi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_edit_diachi.setBounds(176, 243, 277, 13);
		contentPane.add(label_edit_diachi);
		
		
		JLabel lblThngTinXe = new JLabel("Th??ng tin xe ");
		lblThngTinXe.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblThngTinXe.setBounds(23, 258, 102, 23);
		contentPane.add(lblThngTinXe);
		
		JLabel lblLoiXe = new JLabel("Lo???i xe");
		lblLoiXe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLoiXe.setBounds(54, 280, 46, 13);
		contentPane.add(lblLoiXe);
		
		label_edit_loaixe = new JLabel("...");
		label_edit_loaixe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_edit_loaixe.setBounds(176, 280, 278, 13);
		contentPane.add(label_edit_loaixe);
	
		
		JLabel lblTnXe = new JLabel("T??n xe");
		lblTnXe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTnXe.setBounds(54, 299, 46, 13);
		contentPane.add(lblTnXe);
		
		label_edit_tenxe = new JLabel("...");
		label_edit_tenxe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_edit_tenxe.setBounds(176, 303, 278, 13);
		contentPane.add(label_edit_tenxe);

		
		JLabel lblHngSnXut = new JLabel("Ph??n kh???i");
		lblHngSnXut.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHngSnXut.setBounds(54, 322, 93, 13);
		contentPane.add(lblHngSnXut);
		
		label_edit_phankhoi = new JLabel("...");
		label_edit_phankhoi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_edit_phankhoi.setBounds(176, 326, 278, 13);
		contentPane.add(label_edit_phankhoi);
		
		
		
		JLabel lblSKhung = new JLabel("S??? khung");
		lblSKhung.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSKhung.setBounds(54, 345, 71, 13);
		contentPane.add(lblSKhung);
		
		
		label_edit_sokhung = new JLabel("...");
		label_edit_sokhung.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_edit_sokhung.setBounds(176, 349, 278, 13);
		contentPane.add(label_edit_sokhung);
	
		
		JLabel lblSMy = new JLabel("S??? m??y");
		lblSMy.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSMy.setBounds(54, 368, 46, 13);
		contentPane.add(lblSMy);
	
		
		label_edit_somay = new JLabel("...");
		label_edit_somay.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_edit_somay.setBounds(176, 372, 278, 13);
		contentPane.add(label_edit_somay);
		
		
		JLabel lblMuXe = new JLabel("M??u xe");
		lblMuXe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMuXe.setBounds(54, 391, 46, 13);
		contentPane.add(lblMuXe);
		
		label_edit_mauxe = new JLabel("...");
		label_edit_mauxe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_edit_mauxe.setBounds(176, 395, 278, 13);
		contentPane.add(label_edit_mauxe);

		
		JLabel lblnGi = new JLabel("????n gi??");
		lblnGi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblnGi.setBounds(54, 414, 46, 13);
		contentPane.add(lblnGi);
		
		label_edit_dongia = new JLabel("...");
		label_edit_dongia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_edit_dongia.setBounds(176, 418, 278, 13);
		contentPane.add(label_edit_dongia);
		
		JLabel lblThiGianBo = new JLabel("Th???i gian b???o h??nh");
		lblThiGianBo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblThiGianBo.setBounds(54, 460, 116, 13);
		contentPane.add(lblThiGianBo);
		
		label_edit_tgbh = new JLabel("...");
		label_edit_tgbh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_edit_tgbh.setBounds(176, 460, 278, 13);
		contentPane.add(label_edit_tgbh);
		
		JLabel lblThu = new JLabel("Thu???");
		lblThu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblThu.setBounds(54, 437, 46, 13);
		contentPane.add(lblThu);
		
		label_edit_thue = new JLabel("...");
		label_edit_thue.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_edit_thue.setBounds(176, 437, 278, 13);
		contentPane.add(label_edit_thue);
		
		JLabel lblCamoan = new JLabel("Cam ??oan");
		lblCamoan.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCamoan.setBounds(23, 483, 93, 13);
		contentPane.add(lblCamoan);
		
		JLabel lblBnBnCam = new JLabel("B??n b??n cam ??oan");
		lblBnBnCam.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBnBnCam.setBounds(54, 506, 116, 13);
		contentPane.add(lblBnBnCam);
		
		JTextPane txtpnKhiemBn = new JTextPane();
		txtpnKhiemBn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnKhiemBn.setText("Khi ??em b??n theo b???n h???p ?????ng n??y, chi???c xe n??i tr??n thu???c quy???n s??? h???u v?? s??? d???ng h???p ph??p c???a B??n b??n; ch??a ??em c???m c???, th??? ch???p ho???c d??ng ????? ?????m b???o cho b???t k??? ngh??a v??? t??i s???n n??o");
		txtpnKhiemBn.setBounds(64, 529, 623, 39);
		contentPane.add(txtpnKhiemBn);
		
		JLabel lblBnMuaCam = new JLabel("B??n mua cam ??oan");
		lblBnMuaCam.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBnMuaCam.setBounds(54, 578, 116, 13);
		contentPane.add(lblBnMuaCam);
		
		JTextPane txtpnBnMua = new JTextPane();
		txtpnBnMua.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnBnMua.setText("B??n mua ???? t??? m??nh xem x??t k???, bi???t r?? v??? ngu???n g???c s??? h???u v?? hi???n tr???ng chi???c xe n??i tr??n c???a B??n b??n, b???ng l??ng mua v?? kh??ng c?? ??i???u g?? th???c m???c.");
		txtpnBnMua.setBounds(64, 601, 623, 39);
		contentPane.add(txtpnBnMua);
		
		JLabel lbliuKhonCui = new JLabel("??i???u kho???n cu???i c??ng");
		lbliuKhonCui.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbliuKhonCui.setBounds(23, 650, 180, 13);
		contentPane.add(lbliuKhonCui);
		
		JTextPane txtpnHaiBn = new JTextPane();
		txtpnHaiBn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnHaiBn.setText("Hai b??n ???? t??? ?????c l???i nguy??n v??n b???n h???p ?????ng n??y, ?????u hi???u v?? ch???p thu???n to??n b??? n???i dung c???a h???p ?????ng, kh??ng c?? ??i???u g?? v?????ng m???c. Hai b??n c??ng k?? t??n d?????i ????y ????? l??m b???ng ch???ng.");
		txtpnHaiBn.setBounds(64, 673, 623, 32);
		contentPane.add(txtpnHaiBn);
		
		JLabel lblNgyThngNm = new JLabel("Ng??y      Th??ng      N??m ");
		lblNgyThngNm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNgyThngNm.setBounds(526, 719, 142, 13);
		contentPane.add(lblNgyThngNm);
		
		JLabel lblBnBn_1 = new JLabel("B??n b??n");
		lblBnBn_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBnBn_1.setBounds(82, 742, 65, 13);
		contentPane.add(lblBnBn_1);
		
		JLabel lblBnMua_1 = new JLabel("B??n mua");
		lblBnMua_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBnMua_1.setBounds(566, 742, 65, 13);
		contentPane.add(lblBnMua_1);
		
		JButton btnXut = new JButton("Xu???t");
		btnXut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BillHopDong bill = new BillHopDong();
				PrintSupport.printComponent(bill.textArea);
				String cmds[] = new String[] {"cmd", "/d", "D:\\nam4ky1\\LapTrinhPhanTan\\BAITAPDOAN\\HopDong\\a.pdf"};
				try {
				    Runtime.getRuntime().exec(cmds);
				}catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnXut.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnXut.setBounds(417, 782, 85, 21);
		contentPane.add(btnXut);
		
		JButton btnng = new JButton("????ng");
		btnng.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnng.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnng.setBounds(602, 782, 85, 21);
		contentPane.add(btnng);
	}
}
