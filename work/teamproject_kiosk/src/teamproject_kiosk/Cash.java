package teamproject_kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cash {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cash window = new Cash();
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
	public Cash() {
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
		
		JPanel panelInputCash = new JPanel();
		panelInputCash.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelInputCash);
		panelInputCash.setLayout(null);
		
		JLabel lblCashMsg = new JLabel("\uD604\uAE08\uC744 \uD22C\uC785\uD558\uC5EC \uC8FC\uC138\uC694");
		lblCashMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblCashMsg.setBounds(12, 83, 460, 184);
		panelInputCash.add(lblCashMsg);
		
		JLabel lblCashPriceSumMsg = new JLabel("\uAD6C\uB9E4 \uAE08\uC561");
		lblCashPriceSumMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblCashPriceSumMsg.setBounds(12, 277, 130, 48);
		panelInputCash.add(lblCashPriceSumMsg);
		
		JLabel lblInputPriceMsg = new JLabel("\uD22C\uC785 \uAE08\uC561");
		lblInputPriceMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblInputPriceMsg.setBounds(12, 332, 130, 48);
		panelInputCash.add(lblInputPriceMsg);
		
		JLabel lblCashPriceSum = new JLabel("");
		lblCashPriceSum.setHorizontalAlignment(SwingConstants.CENTER);
		lblCashPriceSum.setBounds(154, 277, 238, 48);
		panelInputCash.add(lblCashPriceSum);
		
		JLabel lblInputPrice = new JLabel(Integer.toString(0));
		lblInputPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblInputPrice.setBounds(154, 332, 238, 48);
		panelInputCash.add(lblInputPrice);
		
		
		JButton btn_input50000 = new JButton("5\uB9CC \uC6D0");
		btn_input50000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(lblInputPrice.getText());
				lblInputPrice.setText(Integer.toString(a+50000));
			}
		});
		btn_input50000.setBounds(12, 390, 130, 63);
		panelInputCash.add(btn_input50000);
		
		JButton btn_input5000 = new JButton("5\uCC9C \uC6D0");
		btn_input5000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(lblInputPrice.getText());
				lblInputPrice.setText(Integer.toString(a+5000));
			}
		});
		btn_input5000.setBounds(342, 390, 130, 63);
		panelInputCash.add(btn_input5000);
		
		JButton btn_input10000 = new JButton("1\uB9CC \uC6D0");
		btn_input10000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(lblInputPrice.getText());
				lblInputPrice.setText(Integer.toString(a+10000));
			}
		});
		btn_input10000.setBounds(177, 390, 130, 63);
		panelInputCash.add(btn_input10000);
		
		JButton btn_input1000 = new JButton("1\uCC9C \uC6D0");
		btn_input1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(lblInputPrice.getText());
				lblInputPrice.setText(Integer.toString(a+1000));
			}
		});
		btn_input1000.setBounds(12, 463, 130, 63);
		panelInputCash.add(btn_input1000);
		
		JButton btn_input500 = new JButton("500\uC6D0");
		btn_input500.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(lblInputPrice.getText());
				lblInputPrice.setText(Integer.toString(a+500));
			}
		});
		btn_input500.setBounds(177, 463, 130, 63);
		panelInputCash.add(btn_input500);
		
		JButton btn_input100 = new JButton("100\uC6D0");
		btn_input100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(lblInputPrice.getText());
				lblInputPrice.setText(Integer.toString(a+100));
			}
		});
		btn_input100.setBounds(342, 463, 130, 63);
		panelInputCash.add(btn_input100);
		
		JButton btn_cashConfirm = new JButton("\uD655\uC778");
		btn_cashConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 잔돈 반환 화면 출력
			}
		});
		btn_cashConfirm.setBounds(342, 588, 130, 63);
		panelInputCash.add(btn_cashConfirm);
		
		JButton btn_cashCancel = new JButton("\uCDE8\uC18C");
		btn_cashCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 결제수단 선택 화면 출력
			}
		});
		btn_cashCancel.setBounds(12, 587, 129, 64);
		panelInputCash.add(btn_cashCancel);
		
		JButton btn_cashClear = new JButton("\uC815\uC815");
		btn_cashClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblInputPrice.setText("0");
			}
		});
		btn_cashClear.setBounds(406, 332, 66, 48);
		panelInputCash.add(btn_cashClear);
	}
}
