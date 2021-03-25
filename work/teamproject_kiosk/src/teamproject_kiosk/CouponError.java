package teamproject_kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CouponError {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CouponError window = new CouponError();
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
	public CouponError() {
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
		
		JPanel panelCouponError = new JPanel();
		panelCouponError.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelCouponError);
		panelCouponError.setLayout(null);
		
		JLabel lblCouponErrorMsg = new JLabel("\uCFE0\uD3F0 \uBC88\uD638\uB97C \uB2E4\uC2DC \uD655\uC778\uD574\uC8FC\uC138\uC694");
		lblCouponErrorMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblCouponErrorMsg.setEnabled(true);
		lblCouponErrorMsg.setBounds(12, 83, 460, 184);
		panelCouponError.add(lblCouponErrorMsg);
		
		JButton btn_couponErrorConfirm = new JButton("\uD655\uC778");
		btn_couponErrorConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 쿠폰번호 입력 화면으로 돌아가기
			}
		});
		btn_couponErrorConfirm.setBounds(163, 444, 159, 75);
		panelCouponError.add(btn_couponErrorConfirm);
	}

}
