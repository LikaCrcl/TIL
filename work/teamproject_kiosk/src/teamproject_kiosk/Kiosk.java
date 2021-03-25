package teamproject_kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Color;

public class Kiosk {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kiosk window = new Kiosk();
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
	public Kiosk() {
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
		
		ArrayList<JPanel> panel_list = new ArrayList<>();
						
		JPanel panelMain = new JPanel();
		panel_list.add(panelMain);
		panelMain.setLayout(null);
		panelMain.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelMain);
		
		JPanel panelMenuDummy = new JPanel();
		panel_list.add(panelMenuDummy);
		panelMenuDummy.setLayout(null);
		panelMenuDummy.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelMenuDummy);
		
		JPanel panelSelectMenu = new JPanel();
		panel_list.add(panelSelectMenu);
		panelSelectMenu.setLayout(null);
		panelSelectMenu.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelSelectMenu);
		
		for (int i = 0; i < panel_list.size(); i++) {
			panel_list.get(i).setVisible(false);
		}
		panelMain.setVisible(true);
		
		JButton btn_hall = new JButton("\uB9E4\uC7A5\uC5D0\uC11C \uBA39\uACE0 \uAC00\uC694");
		btn_hall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMain.setVisible(false);
				panelMenuDummy.setVisible(true);
			}
		});
		btn_hall.setBounds(48, 150, 189, 319);
		panelMain.add(btn_hall);
		
		JButton btn_takeOut = new JButton("\uD3EC\uC7A5\uD574\uC11C \uAC08\uB798\uC694");
		btn_takeOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMain.setVisible(false);
				panelMenuDummy.setVisible(true);
			}
		});
		btn_takeOut.setBounds(249, 150, 189, 319);
		panelMain.add(btn_takeOut);
		
		JButton btn_nextDummy = new JButton("\uB2E4\uC74C");
		btn_nextDummy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuDummy.setVisible(false);
				panelSelectMenu.setVisible(true);
			}
		});
		btn_nextDummy.setBounds(317, 589, 155, 62);
		panelMenuDummy.add(btn_nextDummy);
		
		textField = new JTextField();
		textField.setText("\uBA54\uB274");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(12, 10, 460, 550);
		panelMenuDummy.add(textField);
		
		JLabel lblMenuName = new JLabel("menu name");
		lblMenuName.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuName.setBounds(12, 10, 460, 62);
		panelSelectMenu.add(lblMenuName);
		
		JLabel lblDefaultCount = new JLabel("1");
		lblDefaultCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblDefaultCount.setBounds(58, 82, 48, 38);
		panelSelectMenu.add(lblDefaultCount);
		
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_minus.setBounds(22, 82, 41, 41);
		panelSelectMenu.add(btn_minus);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_plus.setBounds(105, 82, 41, 41);
		panelSelectMenu.add(btn_plus);
		
		JLabel lblMenuPrice = new JLabel("menu price");
		lblMenuPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMenuPrice.setBounds(239, 82, 204, 38);
		panelSelectMenu.add(lblMenuPrice);
		
		JLabel lblOption = new JLabel("\uC635\uC158");
		lblOption.setHorizontalAlignment(SwingConstants.CENTER);
		lblOption.setForeground(Color.BLACK);
		lblOption.setBackground(Color.BLACK);
		lblOption.setBounds(12, 130, 134, 52);
		panelSelectMenu.add(lblOption);
		
		JButton btn_addOption = new JButton("\uCD94\uAC00");
		btn_addOption.setBounds(344, 130, 128, 52);
		panelSelectMenu.add(btn_addOption);
		
		JButton btn_cancel = new JButton("\uCDE8\uC18C");
		btn_cancel.setBounds(12, 579, 204, 72);
		panelSelectMenu.add(btn_cancel);
		
		JButton btn_finish = new JButton("\uC120\uD0DD\uC644\uB8CC");
		btn_finish.setBounds(268, 579, 204, 72);
		panelSelectMenu.add(btn_finish);

	}

}
