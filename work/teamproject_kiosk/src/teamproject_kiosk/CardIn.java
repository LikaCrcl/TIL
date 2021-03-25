package teamproject_kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CardIn {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardIn window = new CardIn();
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
	public CardIn() {
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
		
		JPanel panelCardIn = new JPanel();
		panelCardIn.setLayout(null);
		panelCardIn.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelCardIn);
		
		JLabel lblCardInMessage = new JLabel("\uCE74\uB4DC\uB97C \uD22C\uC785\uD558\uC5EC \uC8FC\uC138\uC694");
		lblCardInMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblCardInMessage.setBounds(12, 83, 460, 184);
		panelCardIn.add(lblCardInMessage);
		
		JButton btn_cardIn = new JButton("\uCE74\uB4DC \uD22C\uC785");
		btn_cardIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 카드아웃 화면 출력
			}
		});
		btn_cardIn.setBounds(163, 444, 159, 75);
		panelCardIn.add(btn_cardIn);
	}
}
