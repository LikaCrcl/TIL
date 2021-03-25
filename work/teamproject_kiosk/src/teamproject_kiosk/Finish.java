package teamproject_kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finish {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finish window = new Finish();
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
	public Finish() {
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
		
		JPanel panelFinish = new JPanel();
		panelFinish.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelFinish);
		panelFinish.setLayout(null);
		
		JLabel lblFinishMsg = new JLabel("\uACB0\uC81C\uAC00 \uC644\uB8CC\uB418\uC5C8\uC2B5\uB2C8\uB2E4. \uAC10\uC0AC\uD569\uB2C8\uB2E4.");
		lblFinishMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinishMsg.setBounds(12, 83, 460, 184);
		panelFinish.add(lblFinishMsg);
		
		JButton btn_confirmFinish = new JButton("\uBA54\uC778\uC73C\uB85C");
		btn_confirmFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 메인화면 출력
			}
		});
		btn_confirmFinish.setBounds(163, 444, 159, 75);
		panelFinish.add(btn_confirmFinish);
	}
}
