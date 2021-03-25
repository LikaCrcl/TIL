package teamproject_kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CouponApply {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CouponApply window = new CouponApply();
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
	public CouponApply() {
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
		
		JPanel panelCouponApply = new JPanel();
		panelCouponApply.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelCouponApply);
		panelCouponApply.setLayout(null);
		
		JLabel lblCouponApply = new JLabel("\uCFE0\uD3F0\uC774 \uC801\uC6A9\uB418\uC5C8\uC2B5\uB2C8\uB2E4");
		lblCouponApply.setHorizontalAlignment(SwingConstants.CENTER);
		lblCouponApply.setBounds(12, 83, 460, 184);
		panelCouponApply.add(lblCouponApply);
		
		JButton btn_couponApplyConfirm = new JButton("\uD655\uC778");
		btn_couponApplyConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 최종 금액 표시화면 출력
			}
		});
		btn_couponApplyConfirm.setBounds(163, 444, 159, 75);
		panelCouponApply.add(btn_couponApplyConfirm);
	}

}
