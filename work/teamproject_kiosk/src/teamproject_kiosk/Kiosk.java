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
		ArrayList<JCheckBox> optionChckbxGroup = new ArrayList<>();
		ArrayList<JLabel> confirmName_list = new ArrayList<>();
		ArrayList<JLabel> confirmPrice_list = new ArrayList<JLabel>();
		ArrayList<JLabel> priceSum_list = new ArrayList<JLabel>();
						
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
		
		JPanel panelConfirmPage1 = new JPanel();
		panel_list.add(panelConfirmPage1);
		panelConfirmPage1.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelConfirmPage1);
		panelConfirmPage1.setLayout(null);
		
		JPanel panelConfirmPage2 = new JPanel();
		panel_list.add(panelConfirmPage2);
		panelConfirmPage2.setLayout(null);
		panelConfirmPage2.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelConfirmPage2);
		
		JPanel panelPayOption = new JPanel();
		panel_list.add(panelPayOption);
		panelPayOption.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelPayOption);
		panelPayOption.setLayout(null);
		
		JPanel panelInputCash = new JPanel();
		panel_list.add(panelInputCash);
		panelInputCash.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelInputCash);
		panelInputCash.setLayout(null);
		
		JPanel panelChange = new JPanel();
		panel_list.add(panelChange);
		panelChange.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelChange);
		panelChange.setLayout(null);
		
		JPanel panelCardIn = new JPanel();
		panel_list.add(panelCardIn);
		panelCardIn.setLayout(null);
		panelCardIn.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelCardIn);
		
		JPanel panelCardOut = new JPanel();
		panel_list.add(panelCardOut);
		panelCardOut.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelCardOut);
		panelCardOut.setLayout(null);
		
		JPanel panelFinish = new JPanel();
		panel_list.add(panelFinish);
		panelFinish.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelFinish);
		panelFinish.setLayout(null);
		
		// 이 위로 패널코드 추가 및 배열에 add

		System.out.println("진행도 : "+panel_list.size()+"/12");
		
		for (int i = 0; i < panel_list.size(); i++) {
			panel_list.get(i).setVisible(false);
		}
		panelMain.setVisible(true);
		
		JButton btn_nextDummy = new JButton("\uB2E4\uC74C");
		btn_nextDummy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuDummy.setVisible(false);
				panelConfirmPage1.setVisible(true);
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
		
		JLabel lblSelectedMenuName_1 = new JLabel("");
		confirmName_list.add(lblSelectedMenuName_1);
		lblSelectedMenuName_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_1.setBounds(12, 65, 213, 45);
		panelConfirmPage1.add(lblSelectedMenuName_1);
		
		JLabel lblMenuPrice_1 = new JLabel(""/*선택한 메뉴1 가격*/);
		confirmPrice_list.add(lblMenuPrice_1);
		lblMenuPrice_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_1.setBounds(268, 65, 204, 45);
		panelConfirmPage1.add(lblMenuPrice_1);
		
		JLabel lblSelectedMenuName_2 = new JLabel("");
		confirmName_list.add(lblSelectedMenuName_2);
		lblSelectedMenuName_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_2.setBounds(12, 120, 213, 45);
		panelConfirmPage1.add(lblSelectedMenuName_2);
		
		JLabel lblMenuPrice_2 = new JLabel("");
		confirmPrice_list.add(lblMenuPrice_2);
		lblMenuPrice_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_2.setBounds(268, 120, 204, 45);
		panelConfirmPage1.add(lblMenuPrice_2);
		
		JLabel lblSelectedMenuName_3 = new JLabel("");
		confirmName_list.add(lblSelectedMenuName_3);
		lblSelectedMenuName_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_3.setBounds(12, 173, 213, 45);
		panelConfirmPage1.add(lblSelectedMenuName_3);
		
		JLabel lblMenuPrice_3 = new JLabel("");
		confirmPrice_list.add(lblMenuPrice_3);
		lblMenuPrice_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_3.setBounds(268, 173, 204, 45);
		panelConfirmPage1.add(lblMenuPrice_3);
		
		JLabel lblSelectedMenuName_4 = new JLabel("");
		confirmName_list.add(lblSelectedMenuName_4);
		lblSelectedMenuName_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_4.setBounds(12, 228, 213, 45);
		panelConfirmPage1.add(lblSelectedMenuName_4);
		
		JLabel lblMenuPrice_4 = new JLabel("");
		confirmPrice_list.add(lblMenuPrice_4);
		lblMenuPrice_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_4.setBounds(268, 228, 204, 45);
		panelConfirmPage1.add(lblMenuPrice_4);
		
		JLabel lblSelectedMenuName_5 = new JLabel("");
		confirmName_list.add(lblSelectedMenuName_5);
		lblSelectedMenuName_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_5.setBounds(12, 283, 213, 45);
		panelConfirmPage1.add(lblSelectedMenuName_5);
		
		JLabel lblMenuPrice_5 = new JLabel("");
		confirmPrice_list.add(lblMenuPrice_5);
		lblMenuPrice_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_5.setBounds(268, 283, 204, 45);
		panelConfirmPage1.add(lblMenuPrice_5);
		
		JLabel lblSelectedMenuName_6 = new JLabel();
		confirmName_list.add(lblSelectedMenuName_6);
		lblSelectedMenuName_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_6.setBounds(12, 338, 213, 45);
		panelConfirmPage1.add(lblSelectedMenuName_6);
		
		JLabel lblMenuPrice_6 = new JLabel();
		confirmPrice_list.add(lblMenuPrice_6);
		lblMenuPrice_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_6.setBounds(268, 338, 204, 45);
		panelConfirmPage1.add(lblMenuPrice_6);
		
		JLabel lblSelectedMenuName_7 = new JLabel();
		confirmName_list.add(lblSelectedMenuName_7);
		lblSelectedMenuName_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_7.setBounds(12, 393, 213, 45);
		panelConfirmPage1.add(lblSelectedMenuName_7);
		
		JLabel lblMenuPrice_7 = new JLabel();
		confirmPrice_list.add(lblMenuPrice_7);
		lblMenuPrice_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_7.setBounds(268, 393, 204, 45);
		panelConfirmPage1.add(lblMenuPrice_7);
		
		JLabel lblPriceSumName1 = new JLabel("\uACB0\uC81C \uAE08\uC561");
		lblPriceSumName1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceSumName1.setBounds(12, 505, 172, 45);
		panelConfirmPage1.add(lblPriceSumName1);
		
		JLabel lblPriceSum1 = new JLabel("");
		priceSum_list.add(lblPriceSum1);
		// 선택한 메뉴 가격 합계 표시(Integer.parseInt, Integer.toString)
		lblPriceSum1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceSum1.setBounds(304, 505, 168, 45);
		panelConfirmPage1.add(lblPriceSum1);
		
		JLabel lblSelectedMenuName_8 = new JLabel("");
		confirmName_list.add(lblSelectedMenuName_8);
		lblSelectedMenuName_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_8.setBounds(12, 65, 213, 45);
		panelConfirmPage2.add(lblSelectedMenuName_8);
		
		JLabel lblMenuPrice_8 = new JLabel("");
		confirmPrice_list.add(lblMenuPrice_8);
		lblMenuPrice_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_8.setBounds(268, 65, 204, 45);
		panelConfirmPage2.add(lblMenuPrice_8);
		
		JLabel lblSelectedMenuName_9 = new JLabel("");
		confirmName_list.add(lblSelectedMenuName_9);
		lblSelectedMenuName_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_9.setBounds(12, 120, 213, 45);
		panelConfirmPage2.add(lblSelectedMenuName_9);
		
		JLabel lblMenuPrice_9 = new JLabel("");
		confirmPrice_list.add(lblMenuPrice_9);
		lblMenuPrice_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_9.setBounds(268, 120, 204, 45);
		panelConfirmPage2.add(lblMenuPrice_9);
		
		JLabel lblSelectedMenuName_10 = new JLabel("");
		confirmName_list.add(lblSelectedMenuName_10);
		lblSelectedMenuName_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_10.setBounds(12, 173, 213, 45);
		panelConfirmPage2.add(lblSelectedMenuName_10);
		
		JLabel lblMenuPrice_10 = new JLabel("");
		confirmPrice_list.add(lblMenuPrice_10);
		lblMenuPrice_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_10.setBounds(268, 173, 204, 45);
		panelConfirmPage2.add(lblMenuPrice_10);
		
		JLabel lblSelectedMenuName_11 = new JLabel("");
		confirmName_list.add(lblSelectedMenuName_11);
		lblSelectedMenuName_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_11.setBounds(12, 228, 213, 45);
		panelConfirmPage2.add(lblSelectedMenuName_11);
		
		JLabel lblMenuPrice_11 = new JLabel("");
		confirmPrice_list.add(lblMenuPrice_11);
		lblMenuPrice_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_11.setBounds(268, 228, 204, 45);
		panelConfirmPage2.add(lblMenuPrice_11);
		
		JLabel lblSelectedMenuName_12 = new JLabel("");
		confirmName_list.add(lblSelectedMenuName_12);
		lblSelectedMenuName_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_12.setBounds(12, 283, 213, 45);
		panelConfirmPage2.add(lblSelectedMenuName_12);
		
		JLabel lblMenuPrice_12 = new JLabel("");
		confirmPrice_list.add(lblMenuPrice_12);
		lblMenuPrice_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_12.setBounds(268, 283, 204, 45);
		panelConfirmPage2.add(lblMenuPrice_12);
		
		JLabel lblSelectedMenuName_13 = new JLabel("");
		confirmName_list.add(lblSelectedMenuName_13);
		lblSelectedMenuName_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_13.setBounds(12, 338, 213, 45);
		panelConfirmPage2.add(lblSelectedMenuName_13);
		
		JLabel lblMenuPrice_13 = new JLabel("");
		confirmPrice_list.add(lblMenuPrice_13);
		lblMenuPrice_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_13.setBounds(268, 338, 204, 45);
		panelConfirmPage2.add(lblMenuPrice_13);
		
		JLabel lblSelectedMenuName_14 = new JLabel("");
		confirmName_list.add(lblSelectedMenuName_14);
		lblSelectedMenuName_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_14.setBounds(12, 393, 213, 45);
		panelConfirmPage2.add(lblSelectedMenuName_14);
		
		JLabel lblMenuPrice_14 = new JLabel("");
		confirmPrice_list.add(lblMenuPrice_14);
		lblMenuPrice_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrice_14.setBounds(268, 393, 204, 45);
		panelConfirmPage2.add(lblMenuPrice_14);
		
		JLabel lblPriceSumName2 = new JLabel("\uACB0\uC81C \uAE08\uC561");
		lblPriceSumName2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceSumName2.setBounds(12, 505, 172, 45);
		panelConfirmPage2.add(lblPriceSumName2);
		
		JLabel lblPriceSum2 = new JLabel(""); // 결제금액 총합
		priceSum_list.add(lblPriceSum2);
		lblPriceSum2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceSum2.setBounds(304, 505, 168, 45);
		panelConfirmPage2.add(lblPriceSum2);

		JLabel lblPriceSumMsg = new JLabel("\uACB0\uC81C \uAE08\uC561");
		lblPriceSumMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceSumMsg.setBounds(12, 505, 172, 45);
		panelPayOption.add(lblPriceSumMsg);
		
		JLabel lblPriceSum = new JLabel("\uD569\uC0B0 \uAE08\uC561 \uD45C\uC2DC\uB420 \uBD80\uBD84");
		priceSum_list.add(lblPriceSum);
		// 가격합계 로직
		lblPriceSum.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceSum.setBounds(304, 505, 168, 45);
		panelPayOption.add(lblPriceSum);

		JLabel lblCashPriceSum = new JLabel("");
		priceSum_list.add(lblCashPriceSum);
		lblCashPriceSum.setHorizontalAlignment(SwingConstants.CENTER);
		lblCashPriceSum.setBounds(154, 277, 238, 48);
		panelInputCash.add(lblCashPriceSum);
		
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
				panelSelectMenu.setVisible(false);
				panelMenuDummy.setVisible(true);
				ConfirmLabelSet(confirmName_list, lblMenuNameMsg);
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
		
		JButton btn_confirm1Next = new JButton("\uB2E4\uC74C");
		btn_confirm1Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelConfirmPage1.setVisible(false);
				panelPayOption.setVisible(true);
			}
		});
		btn_confirm1Next.setBounds(342, 588, 130, 63);
		panelConfirmPage1.add(btn_confirm1Next);

		JButton btn_confirm2Next = new JButton("\uB2E4\uC74C");
		btn_confirm2Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelConfirmPage2.setVisible(false);
				panelPayOption.setVisible(true);
			}
		});
		btn_confirm2Next.setBounds(342, 588, 130, 63);
		panelConfirmPage2.add(btn_confirm2Next);
		
		JButton btn_confirm1Back = new JButton("\uC774\uC804");
		btn_confirm1Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelConfirmPage1.setVisible(false);
				panelMenuDummy.setVisible(true);
			}
		});
		btn_confirm1Back.setBounds(177, 588, 130, 63);
		panelConfirmPage1.add(btn_confirm1Back);
		
		JButton btn_comfirm2Back = new JButton("\uC774\uC804");
		btn_comfirm2Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelConfirmPage2.setVisible(false);
				panelMenuDummy.setVisible(true);
			}
		});
		btn_comfirm2Back.setBounds(177, 588, 130, 63);
		panelConfirmPage2.add(btn_comfirm2Back);

		JLabel lblConfirm1Msg = new JLabel("\uC8FC\uBB38 \uD655\uC778");
		lblConfirm1Msg.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirm1Msg.setBounds(12, 10, 460, 45);
		panelConfirmPage1.add(lblConfirm1Msg);
		
		JLabel lblConfirm2Msg = new JLabel("\uC8FC\uBB38 \uD655\uC778");
		lblConfirm2Msg.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirm2Msg.setBounds(12, 10, 460, 45);
		panelConfirmPage2.add(lblConfirm2Msg);
		
		JButton btn_confirm1NextPage = new JButton("\uB2E4\uC74C");
		btn_confirm1NextPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelConfirmPage2.setVisible(true);
				panelConfirmPage1.setVisible(false);
			}
		});
		btn_confirm1NextPage.setBounds(206, 448, 86, 33);
		panelConfirmPage1.add(btn_confirm1NextPage);

		JButton btn_comfirm2BackPage = new JButton("\uC774\uC804");
		btn_comfirm2BackPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelConfirmPage2.setVisible(false);
				panelConfirmPage1.setVisible(true);
			}
		});
		btn_comfirm2BackPage.setBounds(206, 448, 86, 33);
		panelConfirmPage2.add(btn_comfirm2BackPage);
		
		JButton btn_confirm1Clear = new JButton("\uC804\uCCB4 \uCDE8\uC18C");
		btn_confirm1Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clear(confirmName_list, lblPriceSum, priceSum_list);
			}
		});
		btn_confirm1Clear.setBounds(12, 588, 130, 63);
		panelConfirmPage1.add(btn_confirm1Clear);
		
		JButton btn_confirm2Clear = new JButton("\uC804\uCCB4 \uCDE8\uC18C");
		btn_confirm2Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clear(confirmName_list, lblPriceSum, priceSum_list);
			}
		});
		btn_confirm2Clear.setBounds(12, 588, 130, 63);
		panelConfirmPage2.add(btn_confirm2Clear);

		JLabel lblPayOptionMsg = new JLabel("\uACB0\uC81C \uC218\uB2E8\uC744 \uC120\uD0DD\uD574\uC8FC\uC138\uC694");
		lblPayOptionMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayOptionMsg.setBounds(12, 10, 460, 45);
		panelPayOption.add(lblPayOptionMsg);
		
		JButton btn_payCash = new JButton("\uD604\uAE08 \uACB0\uC81C");
		btn_payCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPayOption.setVisible(false);
				panelInputCash.setVisible(true);
			}
		});
		btn_payCash.setBounds(50, 136, 180, 292);
		panelPayOption.add(btn_payCash);

		JButton btn_payCard = new JButton("\uCE74\uB4DC \uACB0\uC81C");
		btn_payCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPayOption.setVisible(false);
				panelCardIn.setVisible(true);
			}
		});
		btn_payCard.setBounds(255, 136, 180, 292);
		panelPayOption.add(btn_payCard);
		
		JButton btn_payOptionBack = new JButton("\uC774\uC804");
		btn_payOptionBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPayOption.setVisible(false);
				panelConfirmPage1.setVisible(true);
			}
		});
		btn_payOptionBack.setBounds(177, 588, 130, 63);
		panelPayOption.add(btn_payOptionBack);

		JButton btn_payOptionClear = new JButton("\uC804\uCCB4 \uCDE8\uC18C");
		btn_payOptionClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clear(confirmName_list, lblPriceSum, priceSum_list);
			}
		});
		btn_payOptionClear.setBounds(12, 588, 130, 63);
		panelPayOption.add(btn_payOptionClear);

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
				panelInputCash.setVisible(false);
				panelChange.setVisible(true);
			}
		});
		btn_cashConfirm.setBounds(342, 588, 130, 63);
		panelInputCash.add(btn_cashConfirm);

		JButton btn_cashCancel = new JButton("\uCDE8\uC18C");
		btn_cashCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInputCash.setVisible(false);
				panelPayOption.setVisible(true);
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
		// 합산금액 - 투입금액 결과값 표시
		lblChangePrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChangePrice.setBounds(154, 330, 238, 48);
		panelChange.add(lblChangePrice);

		JButton btn_changeConfirm = new JButton("\uD655\uC778");
		btn_changeConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelChange.setVisible(false);
				panelFinish.setVisible(true);
			}
		});
		btn_changeConfirm.setBounds(163, 444, 159, 75);
		panelChange.add(btn_changeConfirm);

		JLabel lblChangeWon = new JLabel("\uC6D0");
		lblChangeWon.setHorizontalAlignment(SwingConstants.LEFT);
		lblChangeWon.setBounds(404, 330, 68, 48);
		panelChange.add(lblChangeWon);

		JLabel lblCardInMessage = new JLabel("\uCE74\uB4DC\uB97C \uD22C\uC785\uD558\uC5EC \uC8FC\uC138\uC694");
		lblCardInMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblCardInMessage.setBounds(12, 83, 460, 184);
		panelCardIn.add(lblCardInMessage);

		JButton btn_cardIn = new JButton("\uCE74\uB4DC \uD22C\uC785");
		btn_cardIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCardIn.setVisible(false);
				panelCardOut.setVisible(true);
			}
		});
		btn_cardIn.setBounds(313, 576, 159, 75);
		panelCardIn.add(btn_cardIn);
		
		JButton btn_cardInCancel = new JButton("\uCDE8\uC18C");
		btn_cardInCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCardIn.setVisible(false);
				panelPayOption.setVisible(true);
			}
		});
		btn_cardInCancel.setBounds(12, 576, 159, 75);
		panelCardIn.add(btn_cardInCancel);
		
		JLabel lblCardOutMsg = new JLabel("\uCE74\uB4DC\uB97C \uAEBC\uB0B4 \uC8FC\uC138\uC694");
		lblCardOutMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblCardOutMsg.setBounds(12, 83, 460, 184);
		panelCardOut.add(lblCardOutMsg);

		JButton btn_cardOut = new JButton("\uCE74\uB4DC \uAEBC\uB0B4\uAE30");
		btn_cardOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCardOut.setVisible(false);
				panelFinish.setVisible(true);
			}
		});
		btn_cardOut.setBounds(163, 444, 159, 75);
		panelCardOut.add(btn_cardOut);

		JLabel lblFinishMsg = new JLabel("\uACB0\uC81C\uAC00 \uC644\uB8CC\uB418\uC5C8\uC2B5\uB2C8\uB2E4. \uAC10\uC0AC\uD569\uB2C8\uB2E4.");
		lblFinishMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinishMsg.setBounds(12, 83, 460, 184);
		panelFinish.add(lblFinishMsg);

		JButton btn_confirmFinish = new JButton("\uBA54\uC778\uC73C\uB85C");
		btn_confirmFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelFinish.setVisible(false);
				panelMain.setVisible(true);
				FinishClear(confirmName_list, lblPriceSum, priceSum_list, lblInputPrice); // 합산금액 초기화 로직도 써줘야됨
			}
		});
		btn_confirmFinish.setBounds(163, 444, 159, 75);
		panelFinish.add(btn_confirmFinish);
		
	}
	
}