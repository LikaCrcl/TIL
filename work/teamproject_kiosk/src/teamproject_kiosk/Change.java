package teamproject_kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Change {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Change window = new Change();
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
	public Change() {
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
		
		JPanel panelChange = new JPanel();
		panelChange.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelChange);
		panelChange.setLayout(null);
		
		JLabel lblChangeMsg = new JLabel("\uC794\uB3C8\uC744 \uD655\uC778\uD558\uC5EC \uC8FC\uC138\uC694");
		lblChangeMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblChangeMsg.setEnabled(true);
		lblChangeMsg.setBounds(12, 83, 460, 184);
		panelChange.add(lblChangeMsg);
		
		JLabel lblChangePriceMsg = new JLabel("\uBC18\uD658 \uAE08\uC561");
		lblChangePriceMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblChangePriceMsg.setBounds(12, 330, 130, 48);
		panelChange.add(lblChangePriceMsg);
		
		JLabel lblChangePrice = new JLabel("0");
		lblChangePrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChangePrice.setBounds(154, 330, 238, 48);
		panelChange.add(lblChangePrice);
		
		JButton btn_changeConfirm = new JButton("\uD655\uC778");
		btn_changeConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 구매 완료 화면 출력
			}
		});
		btn_changeConfirm.setBounds(163, 444, 159, 75);
		panelChange.add(btn_changeConfirm);
		
		JLabel lblChangeWon = new JLabel("\uC6D0");
		lblChangeWon.setHorizontalAlignment(SwingConstants.LEFT);
		lblChangeWon.setBounds(404, 330, 68, 48);
		panelChange.add(lblChangeWon);
	}

}
