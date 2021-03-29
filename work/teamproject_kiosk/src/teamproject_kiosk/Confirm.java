package teamproject_kiosk;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Confirm {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Confirm window = new Confirm();
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
	public Confirm() {
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
		
		ArrayList<JLabel> confirmlbl_list = new ArrayList<>();
		
		JPanel panelConfirmPage1 = new JPanel();
		panelConfirmPage1.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelConfirmPage1);
		panelConfirmPage1.setLayout(null);
		
		JButton btn_confirm1Next = new JButton("\uB2E4\uC74C");
		btn_confirm1Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 구매수단 선택 화면 출력
			}
		});
		btn_confirm1Next.setBounds(342, 588, 130, 63);
		panelConfirmPage1.add(btn_confirm1Next);
		
		JButton btn_confirm1Back = new JButton("\uC774\uC804");
		btn_confirm1Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 메뉴 화면 출력
			}
		});
		btn_confirm1Back.setBounds(177, 588, 130, 63);
		panelConfirmPage1.add(btn_confirm1Back);
		
		JLabel lblConfirm1Msg = new JLabel("\uC8FC\uBB38 \uD655\uC778");
		lblConfirm1Msg.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirm1Msg.setBounds(12, 10, 460, 45);
		panelConfirmPage1.add(lblConfirm1Msg);
		
		JLabel lblSelectedMenuName_1 = new JLabel(""/*선택한 메뉴1 이름*/);
		confirmlbl_list.add(lblSelectedMenuName_1);
		lblSelectedMenuName_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_1.setBounds(12, 65, 213, 45);
		panelConfirmPage1.add(lblSelectedMenuName_1);
		
		JLabel lblMenuPrice_1 = new JLabel(""/*선택한 메뉴1 가격*/);
		lblMenuPrice_1.setText(1413+"");
		confirmlbl_list.add(lblMenuPrice_1);
		lblMenuPrice_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_1.setBounds(268, 65, 204, 45);
		panelConfirmPage1.add(lblMenuPrice_1);
		
		JLabel lblSelectedMenuName_2 = new JLabel("");
		confirmlbl_list.add(lblSelectedMenuName_2);
		lblSelectedMenuName_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_2.setBounds(12, 120, 213, 45);
		panelConfirmPage1.add(lblSelectedMenuName_2);
		
		JLabel lblMenuPrice_2 = new JLabel("");
		confirmlbl_list.add(lblMenuPrice_2);
		lblMenuPrice_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_2.setBounds(268, 120, 204, 45);
		panelConfirmPage1.add(lblMenuPrice_2);
		
		JLabel lblSelectedMenuName_3 = new JLabel("");
		confirmlbl_list.add(lblSelectedMenuName_3);
		lblSelectedMenuName_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_3.setBounds(12, 173, 213, 45);
		panelConfirmPage1.add(lblSelectedMenuName_3);
		
		JLabel lblMenuPrice_3 = new JLabel("");
		confirmlbl_list.add(lblMenuPrice_3);
		lblMenuPrice_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_3.setBounds(268, 173, 204, 45);
		panelConfirmPage1.add(lblMenuPrice_3);
		
		JLabel lblSelectedMenuName_4 = new JLabel("");
		confirmlbl_list.add(lblSelectedMenuName_4);
		lblSelectedMenuName_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_4.setBounds(12, 228, 213, 45);
		panelConfirmPage1.add(lblSelectedMenuName_4);
		
		JLabel lblMenuPrice_4 = new JLabel("");
		confirmlbl_list.add(lblMenuPrice_4);
		lblMenuPrice_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_4.setBounds(268, 228, 204, 45);
		panelConfirmPage1.add(lblMenuPrice_4);
		
		JLabel lblSelectedMenuName_5 = new JLabel("");
		confirmlbl_list.add(lblSelectedMenuName_5);
		lblSelectedMenuName_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_5.setBounds(12, 283, 213, 45);
		panelConfirmPage1.add(lblSelectedMenuName_5);
		
		JLabel lblMenuPrice_5 = new JLabel("");
		confirmlbl_list.add(lblMenuPrice_5);
		lblMenuPrice_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_5.setBounds(268, 283, 204, 45);
		panelConfirmPage1.add(lblMenuPrice_5);
		
		JLabel lblSelectedMenuName_6 = new JLabel();
		confirmlbl_list.add(lblSelectedMenuName_6);
		lblSelectedMenuName_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_6.setBounds(12, 338, 213, 45);
		panelConfirmPage1.add(lblSelectedMenuName_6);
		
		JLabel lblMenuPrice_6 = new JLabel();
		confirmlbl_list.add(lblMenuPrice_6);
		lblMenuPrice_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_6.setBounds(268, 338, 204, 45);
		panelConfirmPage1.add(lblMenuPrice_6);
		
		JLabel lblSelectedMenuName_7 = new JLabel();
		confirmlbl_list.add(lblSelectedMenuName_7);
		lblSelectedMenuName_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_7.setBounds(12, 393, 213, 45);
		panelConfirmPage1.add(lblSelectedMenuName_7);
		
		JLabel lblMenuPrice_7 = new JLabel();
		confirmlbl_list.add(lblMenuPrice_7);
		lblMenuPrice_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_7.setBounds(268, 393, 204, 45);
		panelConfirmPage1.add(lblMenuPrice_7);
		
		JLabel lblPriceSumName1 = new JLabel("\uACB0\uC81C \uAE08\uC561");
		lblPriceSumName1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceSumName1.setBounds(12, 505, 172, 45);
		panelConfirmPage1.add(lblPriceSumName1);
		
		JLabel lblPriceSum1 = new JLabel("");
		// 선택한 메뉴 가격 합계 표시(Integer.parseInt, Integer.toString)
		lblPriceSum1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceSum1.setBounds(304, 505, 168, 45);
		panelConfirmPage1.add(lblPriceSum1);

		
		JButton btn_confirm1NextPage = new JButton("\uB2E4\uC74C");
		btn_confirm1NextPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// confirmpage2패널 출력
			}
		});
		btn_confirm1NextPage.setBounds(206, 448, 86, 33);
		panelConfirmPage1.add(btn_confirm1NextPage);
		
		JButton btn_confirm1Clear = new JButton("\uC804\uCCB4 \uCDE8\uC18C");
		btn_confirm1Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				for (int i = 0; i < confirmlbl_list.size(); i++) {
					confirmlbl_list.clear();
//				}
			}
		});
		btn_confirm1Clear.setBounds(12, 588, 130, 63);
		panelConfirmPage1.add(btn_confirm1Clear);
	}
}
