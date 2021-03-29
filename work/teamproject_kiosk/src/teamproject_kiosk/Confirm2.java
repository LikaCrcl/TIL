package teamproject_kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Confirm2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Confirm2 window = new Confirm2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Confirm2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelConfirmPage2 = new JPanel();
		panelConfirmPage2.setLayout(null);
		panelConfirmPage2.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelConfirmPage2);
		
		ArrayList<JLabel> confirmlbl_list = new ArrayList<>(); // 다 합치면 하나 지워야됨
		
		JButton btn_confirm2Next = new JButton("\uB2E4\uC74C");
		btn_confirm2Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 구매수단 선택 화면 출력
			}
		});
		btn_confirm2Next.setBounds(342, 588, 130, 63);
		panelConfirmPage2.add(btn_confirm2Next);
		
		JButton btn_comfirm2Back = new JButton("\uC774\uC804");
		btn_comfirm2Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 메뉴화면 출력
			}
		});
		btn_comfirm2Back.setBounds(175, 588, 130, 63);
		panelConfirmPage2.add(btn_comfirm2Back);
		
		JLabel lblConfirm2Msg = new JLabel("\uC8FC\uBB38 \uD655\uC778");
		lblConfirm2Msg.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirm2Msg.setBounds(12, 10, 460, 45);
		panelConfirmPage2.add(lblConfirm2Msg);
		
		JLabel lblSelectedMenuName_8 = new JLabel("");
		confirmlbl_list.add(lblSelectedMenuName_8);
		lblSelectedMenuName_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_8.setBounds(12, 65, 213, 45);
		panelConfirmPage2.add(lblSelectedMenuName_8);
		
		JLabel lblMenuPrice_8 = new JLabel("");
		confirmlbl_list.add(lblMenuPrice_8);
		lblMenuPrice_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_8.setBounds(268, 65, 204, 45);
		panelConfirmPage2.add(lblMenuPrice_8);
		
		JLabel lblSelectedMenuName_9 = new JLabel("");
		confirmlbl_list.add(lblSelectedMenuName_9);
		lblSelectedMenuName_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_9.setBounds(12, 120, 213, 45);
		panelConfirmPage2.add(lblSelectedMenuName_9);
		
		JLabel lblMenuPrice_9 = new JLabel("");
		confirmlbl_list.add(lblMenuPrice_9);
		lblMenuPrice_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_9.setBounds(268, 120, 204, 45);
		panelConfirmPage2.add(lblMenuPrice_9);
		
		JLabel lblSelectedMenuName_10 = new JLabel("");
		confirmlbl_list.add(lblSelectedMenuName_10);
		lblSelectedMenuName_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_10.setBounds(12, 173, 213, 45);
		panelConfirmPage2.add(lblSelectedMenuName_10);
		
		JLabel lblMenuPrice_10 = new JLabel("");
		confirmlbl_list.add(lblMenuPrice_10);
		lblMenuPrice_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_10.setBounds(268, 173, 204, 45);
		panelConfirmPage2.add(lblMenuPrice_10);
		
		JLabel lblSelectedMenuName_11 = new JLabel("");
		confirmlbl_list.add(lblSelectedMenuName_11);
		lblSelectedMenuName_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_11.setBounds(12, 228, 213, 45);
		panelConfirmPage2.add(lblSelectedMenuName_11);
		
		JLabel lblMenuPrice_11 = new JLabel("");
		confirmlbl_list.add(lblMenuPrice_11);
		lblMenuPrice_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_11.setBounds(268, 228, 204, 45);
		panelConfirmPage2.add(lblMenuPrice_11);
		
		JLabel lblSelectedMenuName_12 = new JLabel("");
		confirmlbl_list.add(lblSelectedMenuName_12);
		lblSelectedMenuName_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_12.setBounds(12, 283, 213, 45);
		panelConfirmPage2.add(lblSelectedMenuName_12);
		
		JLabel lblMenuPrice_12 = new JLabel("");
		confirmlbl_list.add(lblMenuPrice_12);
		lblMenuPrice_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_12.setBounds(268, 283, 204, 45);
		panelConfirmPage2.add(lblMenuPrice_12);
		
		JLabel lblSelectedMenuName_13 = new JLabel("");
		confirmlbl_list.add(lblSelectedMenuName_13);
		lblSelectedMenuName_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_13.setBounds(12, 338, 213, 45);
		panelConfirmPage2.add(lblSelectedMenuName_13);
		
		JLabel lblMenuPrice_13 = new JLabel("");
		confirmlbl_list.add(lblMenuPrice_13);
		lblMenuPrice_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_13.setBounds(268, 338, 204, 45);
		panelConfirmPage2.add(lblMenuPrice_13);
		
		JLabel lblSelectedMenuName_14 = new JLabel("");
		confirmlbl_list.add(lblSelectedMenuName_14);
		lblSelectedMenuName_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_14.setBounds(12, 393, 213, 45);
		panelConfirmPage2.add(lblSelectedMenuName_14);
		
		JLabel lblMenuPrice_14 = new JLabel("");
		confirmlbl_list.add(lblMenuPrice_14);
		lblMenuPrice_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_14.setBounds(268, 393, 204, 45);
		panelConfirmPage2.add(lblMenuPrice_14);
		
		JLabel lblPriceSumName2 = new JLabel("\uACB0\uC81C \uAE08\uC561");
		lblPriceSumName2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceSumName2.setBounds(12, 505, 172, 45);
		panelConfirmPage2.add(lblPriceSumName2);
		
		JLabel lblPriceSum2 = new JLabel(""); // 결제금액 총합
		lblPriceSum2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceSum2.setBounds(304, 505, 168, 45);
		panelConfirmPage2.add(lblPriceSum2);
		
		JButton btn_comfirm2BackPage = new JButton("\uC774\uC804");
		btn_comfirm2BackPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 페이지2 끔, 페이지1 출력
			}
		});
		btn_comfirm2BackPage.setBounds(206, 448, 86, 33);
		panelConfirmPage2.add(btn_comfirm2BackPage);
		
		
		JButton btn_confirm2Clear = new JButton("\uC804\uCCB4 \uCDE8\uC18C");
		btn_confirm2Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < confirmlbl_list.size(); i++) {
					confirmlbl_list.get(i).setText("");
				}
			}
		});
		btn_confirm2Clear.setBounds(12, 588, 130, 63);
		panelConfirmPage2.add(btn_confirm2Clear);
	}
}
