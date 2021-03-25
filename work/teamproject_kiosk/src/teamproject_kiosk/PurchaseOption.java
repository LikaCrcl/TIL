package teamproject_kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PurchaseOption {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PurchaseOption window = new PurchaseOption();
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
	public PurchaseOption() {
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
		
		JPanel panelPayOption = new JPanel();
		panelPayOption.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelPayOption);
		panelPayOption.setLayout(null);
		
		JButton btn_payCash = new JButton("\uD604\uAE08 \uACB0\uC81C");
		btn_payCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// cash 패널 출력
			}
		});
		btn_payCash.setBounds(12, 136, 124, 292);
		panelPayOption.add(btn_payCash);
		
		JButton btn_payCard = new JButton("\uCE74\uB4DC \uACB0\uC81C");
		btn_payCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// card 패널 출력
			}
		});
		btn_payCard.setBounds(178, 136, 124, 292);
		panelPayOption.add(btn_payCard);
		
		JButton btn_payCoupon = new JButton(" \uCFE0\uD3F0 \uC785\uB825");
		btn_payCoupon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// couponinput 패널 출력
			}
		});
		btn_payCoupon.setBounds(348, 136, 124, 292);
		panelPayOption.add(btn_payCoupon);
		
		JLabel lblPriceSumMsg = new JLabel("\uACB0\uC81C \uAE08\uC561");
		lblPriceSumMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceSumMsg.setBounds(12, 515, 172, 45);
		panelPayOption.add(lblPriceSumMsg);
		
		JLabel lblPriceSum = new JLabel("\uD569\uC0B0 \uAE08\uC561 \uD45C\uC2DC\uB420 \uBD80\uBD84");
		lblPriceSum.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceSum.setBounds(304, 515, 168, 45);
		panelPayOption.add(lblPriceSum);
		
		JButton btn_payOptionClear = new JButton("\uC804\uCCB4 \uCDE8\uC18C");
		btn_payOptionClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 메뉴 클리어하고 메뉴화면 출력
			}
		});
		btn_payOptionClear.setBounds(12, 598, 130, 63);
		panelPayOption.add(btn_payOptionClear);
		
		JButton btn_payOptionBack = new JButton("\uC774\uC804");
		btn_payOptionBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 메뉴 클리어 안된 주문확인 화면 출력
			}
		});
		btn_payOptionBack.setBounds(172, 598, 130, 63);
		panelPayOption.add(btn_payOptionBack);
		
		JLabel lblPayOptionMsg = new JLabel("\uACB0\uC81C \uC218\uB2E8\uC744 \uC120\uD0DD\uD574\uC8FC\uC138\uC694");
		lblPayOptionMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayOptionMsg.setBounds(12, 10, 460, 45);
		panelPayOption.add(lblPayOptionMsg);
	}
}
