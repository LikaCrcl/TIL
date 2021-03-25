package teamproject_kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
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
		
		JPanel panelMain = new JPanel();
		panelMain.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);
		
		JButton btn_hall = new JButton("\uB9E4\uC7A5\uC5D0\uC11C \uBA39\uACE0 \uAC00\uC694");
		btn_hall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 메뉴화면 출력
			}
		});
		btn_hall.setBounds(48, 150, 189, 319);
		panelMain.add(btn_hall);
		
		JButton btn_takeOut = new JButton("\uD3EC\uC7A5\uD574\uC11C \uAC08\uB798\uC694");
		btn_takeOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 메뉴화면 출력
			}
		});
		btn_takeOut.setBounds(249, 150, 189, 319);
		panelMain.add(btn_takeOut);
	}

}
