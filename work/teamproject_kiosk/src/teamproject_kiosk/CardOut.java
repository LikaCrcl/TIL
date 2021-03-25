package teamproject_kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CardOut {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardOut window = new CardOut();
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
	public CardOut() {
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
		
		JPanel panelCardOut = new JPanel();
		panelCardOut.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelCardOut);
		panelCardOut.setLayout(null);
		
		JLabel lblCardOutMsg = new JLabel("\uCE74\uB4DC\uB97C \uAEBC\uB0B4 \uC8FC\uC138\uC694");
		lblCardOutMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblCardOutMsg.setBounds(12, 83, 460, 184);
		panelCardOut.add(lblCardOutMsg);
		
		JButton btn_cardOut = new JButton("\uCE74\uB4DC \uAEBC\uB0B4\uAE30");
		btn_cardOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 결제 완료 화면 출력
			}
		});
		btn_cardOut.setBounds(163, 444, 159, 75);
		panelCardOut.add(btn_cardOut);
	}

}
