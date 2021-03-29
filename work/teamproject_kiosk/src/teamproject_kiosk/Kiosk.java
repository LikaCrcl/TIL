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
	public void initialize() {
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
		panelMenuDummy.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelMenuDummy);
		panelMenuDummy.setLayout(null);
		
		JPanel panelSelectMenu = new JPanel();
		panel_list.add(panelSelectMenu);
		panelSelectMenu.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelSelectMenu);
		panelSelectMenu.setLayout(null);
		// 이 위로 패널코드 추가
		for (int i = 0; i < panel_list.size(); i++) {
			panel_list.get(i).setVisible(false);
		}
		panelMain.setVisible(true);
		
		JButton btn_nextDummy = new JButton("\uB2E4\uC74C");
		btn_nextDummy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 주문확인 화면 출력
			}
		});
		btn_nextDummy.setBounds(317, 589, 130, 63);
		panelMenuDummy.add(btn_nextDummy);
		
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
		
		JLabel lblMenuNameMsg = new JLabel("\uBA54\uB274 \uC774\uB984 \uD45C\uC2DC");
		lblMenuNameMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuNameMsg.setBounds(12, 10, 460, 62);
		panelSelectMenu.add(lblMenuNameMsg);
		
		JLabel lblMenuPrice = new JLabel("\uBA54\uB274 \uAC00\uACA9 \uD45C\uC2DC");
		lblMenuPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice.setBounds(302, 82, 170, 49);
		panelSelectMenu.add(lblMenuPrice);
		
		JLabel lblOptionMsg = new JLabel("\uC635\uC158");
		lblOptionMsg.setBackground(Color.BLACK);
		lblOptionMsg.setForeground(Color.BLACK);
		lblOptionMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblOptionMsg.setBounds(12, 141, 134, 52);
		panelSelectMenu.add(lblOptionMsg);
		
		ArrayList<JButton> menu_list = new ArrayList<JButton>();
		
		JButton btn_menuDummy1 = new JButton("\uBA54\uB274 1");
		menu_list.add(btn_menuDummy1);
		btn_menuDummy1.setBounds(38, 73, 111, 99);
		panelMenuDummy.add(btn_menuDummy1);
		
		JButton btn_menuDummy2 = new JButton("\uBA54\uB274 2");
		menu_list.add(btn_menuDummy2);
		btn_menuDummy2.setBounds(180, 73, 111, 99);
		panelMenuDummy.add(btn_menuDummy2);
		
		JButton btn_menuDummy3 = new JButton("\uBA54\uB274 3");
		menu_list.add(btn_menuDummy3);
		btn_menuDummy3.setBounds(317, 73, 111, 99);
		panelMenuDummy.add(btn_menuDummy3);
		
		JButton btn_addOption = new JButton("\uCD94\uAC00");
		btn_addOption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// option 패널 표시
			}
		});
		btn_addOption.setBounds(344, 141, 128, 52);
		panelSelectMenu.add(btn_addOption);
		
		JButton btn_selectCancel = new JButton("\uCDE8\uC18C");
		btn_selectCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 이 메뉴 추가 안 시키고 메뉴화면 출력
			}
		});
		btn_selectCancel.setBounds(12, 588, 130, 63);
		panelSelectMenu.add(btn_selectCancel);
		
		JButton btn_selectComplete = new JButton("\uC120\uD0DD\uC644\uB8CC");
		btn_selectComplete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 이 메뉴 추가 시키고 메뉴화면 출력
			}
		});
		btn_selectComplete.setBounds(342, 588, 130, 63);
		panelSelectMenu.add(btn_selectComplete);
		
		JButton btn_setHot = new JButton("Hot");
		btn_setHot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 이 패널 위쪽 메뉴명, confirm 패널 메뉴명에 (HOT) 추가
			}
		});
		btn_setHot.setBounds(22, 82, 124, 52);
		panelSelectMenu.add(btn_setHot);
		
		JButton btn_setIced = new JButton("Iced");
		btn_setIced.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 이 패널 위쪽 메뉴명, confirm 패널 메뉴명에 (ICED) 추가
			}
		});
		btn_setIced.setBounds(158, 82, 124, 52);
		panelSelectMenu.add(btn_setIced);

	}
	
	public void setLblMenuName() {
		for (i = 0; i < menu_list.size(); i++) {
			menu_list.get(i).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						panelMenuDummy.setVisible(false);
						panelSelectMenu.setVisible(true);
						lblMenuNameMsg.setText(menu_list.get(i).getText());
				}
			});
		}
	}

}
