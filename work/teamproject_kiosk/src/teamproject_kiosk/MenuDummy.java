package teamproject_kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MenuDummy {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuDummy window = new MenuDummy();
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
	public MenuDummy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JPanel panelMenuDummy = new JPanel();
		panelMenuDummy.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelMenuDummy);
		panelMenuDummy.setLayout(null);
		
		JButton btn_nextDummy = new JButton("\uB2E4\uC74C");
		btn_nextDummy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 주문확인 화면 출력
			}
		});
		btn_nextDummy.setBounds(317, 589, 130, 63);
		panelMenuDummy.add(btn_nextDummy);
		
		JButton btn_menuDummy1 = new JButton("\uBA54\uB274 1");
		btn_menuDummy1.setBounds(38, 73, 111, 99);
		panelMenuDummy.add(btn_menuDummy1);
		
		JButton btn_menuDummy2 = new JButton("\uBA54\uB274 2");
		btn_menuDummy2.setBounds(180, 73, 111, 99);
		panelMenuDummy.add(btn_menuDummy2);
		
		JButton btn_menuDummy3 = new JButton("\uBA54\uB274 3");
		btn_menuDummy3.setBounds(317, 73, 111, 99);
		panelMenuDummy.add(btn_menuDummy3);
	}
}
