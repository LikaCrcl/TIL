package teamproject_kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Color;

public class Kiosk extends Logic {
	
	
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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ArrayList<JPanel> panel_list = new ArrayList<>();
		ArrayList<JButton> menu_list = new ArrayList<JButton>();
		ArrayList<String> addedMenu_list = new ArrayList<>();
		ArrayList<JCheckBox> optionChckbxGroup = new ArrayList<>();
		ArrayList<Integer> price_list = new ArrayList<>();
						
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
		
		JPanel panelOption = new JPanel();
		panel_list.add(panelOption);
		panelOption.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelOption);
		panelOption.setLayout(null);
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
		
		JLabel lblOptionMenuMsg = new JLabel();
		lblOptionMenuMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblOptionMenuMsg.setBounds(12, 10, 460, 62);
		panelOption.add(lblOptionMenuMsg);
		
		JButton btn_menuDummy1 = new JButton("\uBA54\uB274 1");
		menu_list.add(btn_menuDummy1);
		LabelSetText(0, menu_list, panelMenuDummy, panelSelectMenu, lblMenuNameMsg, lblOptionMenuMsg);
		btn_menuDummy1.setBounds(38, 73, 111, 99);
		panelMenuDummy.add(btn_menuDummy1);
		
		JButton btn_menuDummy2 = new JButton("\uBA54\uB274 2");
		menu_list.add(btn_menuDummy2);
		LabelSetText(1, menu_list, panelMenuDummy, panelSelectMenu, lblMenuNameMsg, lblOptionMenuMsg);
		btn_menuDummy2.setBounds(180, 73, 111, 99);
		panelMenuDummy.add(btn_menuDummy2);
		
		JButton btn_menuDummy3 = new JButton("\uBA54\uB274 3");
		menu_list.add(btn_menuDummy3);
		LabelSetText(2, menu_list, panelMenuDummy, panelSelectMenu, lblMenuNameMsg, lblOptionMenuMsg);
		btn_menuDummy3.setBounds(317, 73, 111, 99);
		panelMenuDummy.add(btn_menuDummy3);
		
		// ********************** 부터
		ButtonGroup rdbtnSlctMenu = new ButtonGroup();
		
		JRadioButton rdbtnHot = new JRadioButton("Hot");
		rdbtnHot.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					lblMenuNameMsg.setText(lblMenuNameMsg.getText()+"(Hot)");
					lblOptionMenuMsg.setText(lblMenuNameMsg.getText());
				}
				else if (e.getStateChange() == ItemEvent.DESELECTED) {
					lblMenuNameMsg.setText(lblMenuNameMsg.getText().substring(0, lblMenuNameMsg.getText().indexOf("(")));
					lblOptionMenuMsg.setText(lblMenuNameMsg.getText());
				}
			}
			
		});
		rdbtnHot.setBounds(35, 94, 49, 23);
		panelSelectMenu.add(rdbtnHot);
		
		JRadioButton rdbtnIced = new JRadioButton("Iced");
		rdbtnIced.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					lblMenuNameMsg.setText(lblMenuNameMsg.getText()+"(Iced)");
					lblOptionMenuMsg.setText(lblMenuNameMsg.getText());
				}
				else if (e.getStateChange() == ItemEvent.DESELECTED) {
					lblMenuNameMsg.setText(lblMenuNameMsg.getText().substring(0, lblMenuNameMsg.getText().indexOf("(")));
					lblOptionMenuMsg.setText(lblMenuNameMsg.getText());
				}
			}
			
		});
		rdbtnIced.setBounds(88, 94, 58, 23);
		panelSelectMenu.add(rdbtnIced);
		
		rdbtnSlctMenu.add(rdbtnHot);
		rdbtnSlctMenu.add(rdbtnIced);
		
		JRadioButton rdbtnClear = new JRadioButton("radio button to clear");
		
		rdbtnSlctMenu.add(rdbtnClear);
		// 까지 confirm 패널에 들어가는 메뉴명도 hot iced 반영해줘야함
		
		JButton btn_addOption = new JButton("\uCD94\uAC00");
		btn_addOption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSelectMenu.setVisible(false);
				panelOption.setVisible(true);
			}
		});
		btn_addOption.setBounds(344, 141, 128, 52);
		panelSelectMenu.add(btn_addOption);
		
		JButton btn_selectCancel = new JButton("\uCDE8\uC18C");
		btn_selectCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnClear.setSelected(true);
				panelSelectMenu.setVisible(false);
				panelMenuDummy.setVisible(true);
			}
		});
		btn_selectCancel.setBounds(12, 588, 130, 63);
		panelSelectMenu.add(btn_selectCancel);
		
		JButton btn_selectComplete = new JButton("\uC120\uD0DD \uC644\uB8CC");
		btn_selectComplete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 해당 메뉴 confirm에도 추가하는 로직 짜야함
				panelSelectMenu.setVisible(false);
				panelMenuDummy.setVisible(true);
				addedMenu_list.add(lblMenuNameMsg.getText());
				rdbtnClear.setSelected(true);
			}
		});
		btn_selectComplete.setBounds(342, 588, 130, 63);
		panelSelectMenu.add(btn_selectComplete);
		
		JLabel lblAddShot = new JLabel(" \uC0F7 \uCD94\uAC00");
		lblAddShot.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddShot.setBounds(12, 82, 161, 49);
		panelOption.add(lblAddShot);
		
		JCheckBox chckbxAddShot = new JCheckBox("");
		// chckbx 체크 시 금액 추가, 다시 해제 시 금액 감소 로직 필요
		chckbxAddShot.setBounds(374, 95, 21, 23);
		panelOption.add(chckbxAddShot);
		
		JCheckBox chckbxAddIce = new JCheckBox("");
		chckbxAddIce.setBounds(374, 154, 21, 23);
		panelOption.add(chckbxAddIce);
		
		JCheckBox chckbxAddCaramel = new JCheckBox("");
		chckbxAddCaramel.setBounds(374, 213, 21, 23);
		panelOption.add(chckbxAddCaramel);
		
		JCheckBox chckbxAddVanilla = new JCheckBox("");
		chckbxAddVanilla.setBounds(374, 272, 21, 23);
		panelOption.add(chckbxAddVanilla);
		
		JCheckBox chckbxAddHazelnut = new JCheckBox("");
		chckbxAddHazelnut.setBounds(374, 331, 21, 23);
		panelOption.add(chckbxAddHazelnut);
		
		optionChckbxGroup.add(chckbxAddHazelnut);
		optionChckbxGroup.add(chckbxAddVanilla);
		optionChckbxGroup.add(chckbxAddCaramel);
		optionChckbxGroup.add(chckbxAddIce);
		optionChckbxGroup.add(chckbxAddShot);
		
		JButton btn_optionCancel = new JButton("\uCDE8\uC18C");
		btn_optionCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelOption.setVisible(false);
				panelSelectMenu.setVisible(true);
				for (int i = 0; i < optionChckbxGroup.size(); i++) {
					optionChckbxGroup.get(i).setSelected(false);
				}
			}
		});
		btn_optionCancel.setBounds(12, 588, 130, 63);
		panelOption.add(btn_optionCancel);
		
		JButton btn_optionFinish = new JButton("\uC120\uD0DD \uC644\uB8CC");
		btn_optionFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 체크박스에서 실시간 계산 말고 여기서 완료 누르면 체크한 애들 만큼 금액 추가되게 해야될 듯
				panelOption.setVisible(false);
				panelSelectMenu.setVisible(true);
				for (int i = 0; i < optionChckbxGroup.size(); i++) {
					optionChckbxGroup.get(i).setSelected(false);
				}
			}
		});
		btn_optionFinish.setBounds(342, 588, 130, 63);
		panelOption.add(btn_optionFinish);

		JLabel lblAddIce = new JLabel("\uC5BC\uC74C \uCD94\uAC00");
		lblAddIce.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddIce.setBounds(12, 141, 161, 49);
		panelOption.add(lblAddIce);
		
		JLabel lblAddCaramel = new JLabel("\uCE74\uB77C\uBA5C \uC2DC\uB7FD \uCD94\uAC00");
		lblAddCaramel.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddCaramel.setBounds(12, 200, 161, 49);
		panelOption.add(lblAddCaramel);
		
		JLabel lblAddVanilla = new JLabel("\uBC14\uB2D0\uB77C \uC2DC\uB7FD \uCD94\uAC00");
		lblAddVanilla.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddVanilla.setBounds(12, 259, 161, 49);
		panelOption.add(lblAddVanilla);
		
		JLabel lblAddHazelnut = new JLabel("\uD5E4\uC774\uC990\uB11B \uC2DC\uB7FD \uCD94\uAC00");
		lblAddHazelnut.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddHazelnut.setBounds(12, 318, 161, 49);
		panelOption.add(lblAddHazelnut);
		
		JLabel lblAddShotPrice = new JLabel("500\uC6D0");
		lblAddShotPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddShotPrice.setBounds(185, 82, 147, 49);
		panelOption.add(lblAddShotPrice);
		
		JLabel lblAddIcePrice = new JLabel("200\uC6D0");
		lblAddIcePrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddIcePrice.setBounds(185, 141, 147, 49);
		panelOption.add(lblAddIcePrice);
		
		JLabel lblAddCaramelPrice = new JLabel("300\uC6D0");
		lblAddCaramelPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddCaramelPrice.setBounds(185, 200, 147, 49);
		panelOption.add(lblAddCaramelPrice);
		
		JLabel lblAddVanillaPrice = new JLabel("300\uC6D0");
		lblAddVanillaPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddVanillaPrice.setBounds(185, 259, 147, 49);
		panelOption.add(lblAddVanillaPrice);
		
		JLabel lblAddHazelnutPrice = new JLabel("300\uC6D0");
		lblAddHazelnutPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddHazelnutPrice.setBounds(185, 318, 147, 49);
		panelOption.add(lblAddHazelnutPrice);

	}
	
}