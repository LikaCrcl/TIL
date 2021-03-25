package teamproject_kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CouponInput {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CouponInput window = new CouponInput();
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
	public CouponInput() {
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
		
		JPanel panelCouponInput = new JPanel();
		panelCouponInput.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelCouponInput);
		panelCouponInput.setLayout(null);
		
		JLabel lblCouponMsg = new JLabel("\uCFE0\uD3F0\uC744 \uC785\uB825\uD558\uC5EC \uC8FC\uC138\uC694(ex. 1234567890)");
		lblCouponMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblCouponMsg.setBounds(12, 41, 460, 72);
		panelCouponInput.add(lblCouponMsg);
		
		JLabel lblCouponNum = new JLabel("");
		lblCouponNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblCouponNum.setBounds(12, 123, 304, 72);
		panelCouponInput.add(lblCouponNum);
		
		JButton btn_couponClear = new JButton("\uC815\uC815");
		btn_couponClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCouponNum.setText("");
			}
		});
		btn_couponClear.setBounds(352, 123, 97, 72);
		panelCouponInput.add(btn_couponClear);
		
		JButton btn_coupon_1 = new JButton("1");
		btn_coupon_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCouponNum.setText(lblCouponNum.getText()+"1");
			}
		});
		btn_coupon_1.setBounds(12, 239, 79, 72);
		panelCouponInput.add(btn_coupon_1);
		
		JButton btn_coupon_2 = new JButton("2");
		btn_coupon_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCouponNum.setText(lblCouponNum.getText()+"2");
			}
		});
		btn_coupon_2.setBounds(103, 239, 79, 72);
		panelCouponInput.add(btn_coupon_2);
		
		JButton btn_coupon_3 = new JButton("3");
		btn_coupon_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCouponNum.setText(lblCouponNum.getText()+"3");
			}
		});
		btn_coupon_3.setBounds(194, 239, 79, 72);
		panelCouponInput.add(btn_coupon_3);
		
		JButton btn_coupon_4 = new JButton("4");
		btn_coupon_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCouponNum.setText(lblCouponNum.getText()+"4");
			}
		});
		btn_coupon_4.setBounds(285, 239, 79, 72);
		panelCouponInput.add(btn_coupon_4);
		
		JButton btn_coupon_5 = new JButton("5");
		btn_coupon_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCouponNum.setText(lblCouponNum.getText()+"5");
			}
		});
		btn_coupon_5.setBounds(376, 239, 79, 72);
		panelCouponInput.add(btn_coupon_5);
		
		JButton btn_coupon_6 = new JButton("6");
		btn_coupon_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCouponNum.setText(lblCouponNum.getText()+"6");
			}
		});
		btn_coupon_6.setBounds(12, 321, 79, 72);
		panelCouponInput.add(btn_coupon_6);
		
		JButton btn_coupon_7 = new JButton("7");
		btn_coupon_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCouponNum.setText(lblCouponNum.getText()+"7");
			}
		});
		btn_coupon_7.setBounds(103, 321, 79, 72);
		panelCouponInput.add(btn_coupon_7);
		
		JButton btn_coupon_8 = new JButton("8");
		btn_coupon_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCouponNum.setText(lblCouponNum.getText()+"8");
			}
		});
		btn_coupon_8.setBounds(194, 321, 79, 72);
		panelCouponInput.add(btn_coupon_8);
		
		JButton btn_coupon_9 = new JButton("9");
		btn_coupon_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCouponNum.setText(lblCouponNum.getText()+"9");
			}
		});
		btn_coupon_9.setBounds(285, 321, 79, 72);
		panelCouponInput.add(btn_coupon_9);
		
		JButton btn_coupon_0 = new JButton("0");
		btn_coupon_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCouponNum.setText(lblCouponNum.getText()+"0");
			}
		});
		btn_coupon_0.setBounds(376, 321, 79, 72);
		panelCouponInput.add(btn_coupon_0);
		
		JButton btn_couponConfirm = new JButton("\uD655\uC778");
		btn_couponConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblCouponNum.getText().equals("1234567890")) {
					// 쿠폰번호 일치 패널 출력
				}
				else {
					// 쿠폰번호 재확인 패널 출력
				}
			}
		});
		btn_couponConfirm.setBounds(342, 588, 130, 63);
		panelCouponInput.add(btn_couponConfirm);
		
		JButton btn_couponCancel = new JButton("\uCDE8\uC18C");
		btn_couponCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 결제수단 선택 패널 출력
			}
		});
		btn_couponCancel.setBounds(12, 588, 130, 63);
		panelCouponInput.add(btn_couponCancel);
	}

}
