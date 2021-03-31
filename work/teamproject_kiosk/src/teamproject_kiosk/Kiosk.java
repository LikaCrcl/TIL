package teamproject_kiosk;

import java.awt.EventQueue;
import java.awt.Font;

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
		ArrayList<JButton> menuButton_list = new ArrayList<>();
		ArrayList<JLabel> confirmName_list = new ArrayList<>();
		ArrayList<JLabel> confirmPrice_list = new ArrayList<>();
		ArrayList<JLabel> priceSum_list = new ArrayList<>();
		ArrayList<String> menuName_list = new ArrayList<>();
		ArrayList<String> menuPrice_list = new ArrayList<>();
		ArrayList<JPanel> menuPanel_list = new ArrayList<>();
		
		ListSizeSet(menuName_list);
		ListSizeSet(menuPrice_list);
						
		JPanel panelMain = new JPanel();
		panel_list.add(panelMain);
		panelMain.setLayout(null);
		panelMain.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelMain);
		
		JPanel panelMenu = new JPanel();
		panel_list.add(panelMenu);
		panelMenu.setBounds(0, 0, 486, 663);
		frame.getContentPane().add(panelMenu);
		panelMenu.setLayout(null);
		
		JPanel panelSelectMenu = new JPanel();
		panel_list.add(panelSelectMenu);
		panelSelectMenu.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelSelectMenu);
		panelSelectMenu.setLayout(null);
		
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
		
		// �� ���� �г��ڵ� �߰� �� �迭�� add

		for (int i = 0; i < panel_list.size(); i++) {
			panel_list.get(i).setVisible(false);
		}
		panelMain.setVisible(true);
		
		JPanel menu_1_panel = new JPanel();
		menuPanel_list.add(menu_1_panel);
		menu_1_panel.setBounds(0, 151, 486, 326);
		panelMenu.add(menu_1_panel);
		menu_1_panel.setLayout(null);
		menu_1_panel.setVisible(false);
		
		JPanel menu_2_panel = new JPanel();
		menuPanel_list.add(menu_2_panel);
		menu_2_panel.setBounds(0, 151, 486, 326);
		panelMenu.add(menu_2_panel);
		menu_2_panel.setLayout(null);
		menu_2_panel.setVisible(false);
		
		JPanel menu_3_panel = new JPanel();
		menuPanel_list.add(menu_3_panel);
		menu_3_panel.setBounds(0, 151, 486, 326);
		panelMenu.add(menu_3_panel);
		menu_3_panel.setLayout(null);
		menu_3_panel.setVisible(false);
		
		JPanel menu_4_panel = new JPanel();
		menuPanel_list.add(menu_4_panel);
		menu_4_panel.setBounds(0, 151, 486, 326);
		panelMenu.add(menu_4_panel);
		menu_4_panel.setLayout(null);
		menu_4_panel.setVisible(false);
		
		JButton btn_hall = new JButton("\uB9E4\uC7A5\uC5D0\uC11C \uBA39\uACE0 \uAC00\uC694");
		btn_hall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMain.setVisible(false);
				panelMenu.setVisible(true);
			}
		});
		btn_hall.setBounds(48, 150, 189, 319);
		panelMain.add(btn_hall);
		
		JButton btn_takeOut = new JButton("\uD3EC\uC7A5\uD574\uC11C \uAC08\uB798\uC694");
		btn_takeOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMain.setVisible(false);
				panelMenu.setVisible(true);
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

		JLabel lblPriceSumName2 = new JLabel("\uACB0\uC81C \uAE08\uC561");
		lblPriceSumName2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceSumName2.setBounds(12, 505, 172, 45);
		panelConfirmPage2.add(lblPriceSumName2);
		
		JLabel lblPriceSum2 = new JLabel(""); // �����ݾ� ����
		priceSum_list.add(lblPriceSum2);
		lblPriceSum2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceSum2.setBounds(304, 505, 168, 45);
		panelConfirmPage2.add(lblPriceSum2);

		JLabel lblPriceSumMsg = new JLabel("\uACB0\uC81C \uAE08\uC561");
		lblPriceSumMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceSumMsg.setBounds(12, 505, 172, 45);
		panelPayOption.add(lblPriceSumMsg);
		
		JLabel price = new JLabel("");
		price.setHorizontalAlignment(SwingConstants.CENTER);
		price.setForeground(Color.BLACK);
		price.setFont(new Font("����", Font.PLAIN, 12));
		price.setBackground(Color.WHITE);
		price.setBounds(302, 616, 89, 37);
		panelMenu.add(price);

		JLabel lblPriceSum = new JLabel("\uD569\uC0B0 \uAE08\uC561 \uD45C\uC2DC\uB420 \uBD80\uBD84");
		priceSum_list.add(lblPriceSum);
		lblPriceSum.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceSum.setBounds(304, 505, 168, 45);
		panelPayOption.add(lblPriceSum);

		JLabel lblCashPriceSum = new JLabel("");
		priceSum_list.add(lblCashPriceSum);
		lblCashPriceSum.setHorizontalAlignment(SwingConstants.CENTER);
		lblCashPriceSum.setBounds(154, 277, 238, 48);
		panelInputCash.add(lblCashPriceSum);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("����", Font.PLAIN, 12));
		label.setBounds(123, 568, 89, 85);
		panelMenu.add(label);

		JButton ����������ũ = new JButton("\uC624\uB9AC\uC9C4\uC250\uC774\uD06C");
		menuButton_list.add(����������ũ);
		����������ũ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(0, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
				
				
				
			}
		});
		����������ũ.setBounds(12, 10, 111, 95);
		menu_1_panel.add(����������ũ);
		
		JButton ������Ű����ũ = new JButton("\uCD08\uCF54\uCFE0\uD0A4\uC250\uC774\uD06C");
		������Ű����ũ.setFont(new Font("����", Font.PLAIN, 11));
		menuButton_list.add(������Ű����ũ);
		������Ű����ũ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(1, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		
		������Ű����ũ.setBounds(126, 10, 111, 95);
		menu_1_panel.add(������Ű����ũ);
		
		JButton ���⽦��ũ = new JButton("\uB538\uAE30\uC250\uC774\uD06C");
		menuButton_list.add(���⽦��ũ);
		���⽦��ũ.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				LabelSetText(2, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});

		���⽦��ũ.setBounds(240, 10, 111, 95);
		menu_1_panel.add(���⽦��ũ);
		
		JButton �����̵� = new JButton("\uB808\uBAAC\uC5D0\uC774\uB4DC");
		menuButton_list.add(�����̵�);
		�����̵�.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				LabelSetText(3, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
	
		�����̵�.setBounds(355, 10, 111, 95);
		menu_1_panel.add(�����̵�);
		
		JButton Ex�����̵� = new JButton("Ex\uB808\uBAAC\uC5D0\uC774\uB4DC");
		menuButton_list.add(Ex�����̵�);
		Ex�����̵�.setFont(new Font("gulim", Font.PLAIN, 12));
		
		Ex�����̵�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(4, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});

		Ex�����̵�.setBounds(12, 115, 111, 95);
		menu_1_panel.add(Ex�����̵�);
		
		JButton �ڸ����̵� = new JButton("\uC790\uBABD\uC5D0\uC774\uB4DC");
		menuButton_list.add(�ڸ����̵�);
		�ڸ����̵�.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				LabelSetText(5, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		
		�ڸ����̵�.setBounds(126, 115, 111, 95);
		menu_1_panel.add(�ڸ����̵�);
		
		JButton Ex�ڸ����̵� = new JButton("Ex\uC790\uBABD\uC5D0\uC774\uB4DC");
		menuButton_list.add(Ex�ڸ����̵�);
		Ex�ڸ����̵�.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				LabelSetText(6, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
	
		Ex�ڸ����̵�.setBounds(240, 115, 111, 95);
		menu_1_panel.add(Ex�ڸ����̵�);
		
		JButton û�������̵� = new JButton("\uCCAD\uD3EC\uB3C4\uC5D0\uC774\uB4DC");
		menuButton_list.add(û�������̵�);
		û�������̵�.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				LabelSetText(7, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		
		û�������̵�.setBounds(355, 115, 111, 95);
		menu_1_panel.add(û�������̵�);
		
		JButton Exû�������̵� = new JButton("Ex\uCCAD\uD3EC\uB3C4\uC5D0\uC774\uB4DC");
		Exû�������̵�.setFont(new Font("����", Font.PLAIN, 10));
		menuButton_list.add(Exû�������̵�);
		Exû�������̵�.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				LabelSetText(8, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		Exû�������̵�.setBounds(12, 220, 111, 95);
		menu_1_panel.add(Exû�������̵�);
		
		JButton �ܺ������÷�ġ�� = new JButton("\uAFC0 \uBCF5\uC22D\uC544");
		menuButton_list.add(�ܺ������÷�ġ��);
		�ܺ������÷�ġ��.setFont(new Font("����", Font.PLAIN, 12));
		�ܺ������÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(9, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		�ܺ������÷�ġ��.setBounds(12, 10, 111, 95);
		menu_2_panel.add(�ܺ������÷�ġ��);
	
		JButton Ŀ���÷�ġ�� = new JButton("\uCEE4\uD53C \uD50C\uB7AB\uCE58\uB178");
		menuButton_list.add(Ŀ���÷�ġ��);
		Ŀ���÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(10, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
			
		});
		Ŀ���÷�ġ��.setBounds(126, 10, 111, 95);
		menu_2_panel.add(Ŀ���÷�ġ��);
		
		JButton �����÷�ġ�� = new JButton("\uB9DD\uACE0 \uD50C\uB7AB\uCE58\uB178");
		menuButton_list.add(�����÷�ġ��);
		�����÷�ġ��.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				LabelSetText(11, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		�����÷�ġ��.setBounds(240, 10, 111, 95);
		menu_2_panel.add(�����÷�ġ��);
		
		JButton ��ī�÷�ġ�� = new JButton("\uBAA8\uCE74 \uD50C\uB7AB\uCE58\uB178");
		menuButton_list.add(��ī�÷�ġ��);
		��ī�÷�ġ��.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				LabelSetText(12, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		��ī�÷�ġ��.setBounds(355, 10, 111, 95);
		menu_2_panel.add(��ī�÷�ġ��);
		
		JButton ī�����÷�ġ�� = new JButton("\uCE74\uB77C\uBA5C\uD50C\uB7AB\uCE58\uB178");
		ī�����÷�ġ��.setFont(new Font("����", Font.PLAIN, 11));
		menuButton_list.add(ī�����÷�ġ��);
		ī�����÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(13, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		ī�����÷�ġ��.setBounds(126, 115, 111, 95);
		menu_2_panel.add(ī�����÷�ġ��);
		
		JButton �ڸ��÷�ġ�� = new JButton("\uC790\uBABD \uD50C\uB7AB\uCE58\uB178");
		menuButton_list.add(�ڸ��÷�ġ��);
		�ڸ��÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(14, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		�ڸ��÷�ġ��.setBounds(240, 115, 111, 95);
		menu_2_panel.add(�ڸ��÷�ġ��);
		
		JButton �����÷�ġ�� = new JButton("\uB179\uCC28\uD50C\uB7AB\uCE58\uB178");
		menuButton_list.add(�����÷�ġ��);
		�����÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(15, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		�����÷�ġ��.setBounds(355, 115, 111, 95);
		menu_2_panel.add(�����÷�ġ��);
		
		JButton ���ڷ�Ĩ�÷�ġ�� = new JButton("\uCD08\uCF54\uB81B \uCE69");
		���ڷ�Ĩ�÷�ġ��.setFont(new Font("����", Font.PLAIN, 12));
		menuButton_list.add(���ڷ�Ĩ�÷�ġ��);
		���ڷ�Ĩ�÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(16, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		���ڷ�Ĩ�÷�ġ��.setBounds(12, 115, 111, 95);
		menu_2_panel.add(���ڷ�Ĩ�÷�ġ��);
		
		JButton ��Ʈ���ڷ�Ĩ�÷�ġ�� = new JButton("\uBBFC\uD2B8\uCD08\uCF54 \uCE69");
		��Ʈ���ڷ�Ĩ�÷�ġ��.setFont(new Font("����", Font.PLAIN, 12));
		menuButton_list.add(��Ʈ���ڷ�Ĩ�÷�ġ��);
		��Ʈ���ڷ�Ĩ�÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(17, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		��Ʈ���ڷ�Ĩ�÷�ġ��.setBounds(12, 220, 111, 95);
		menu_2_panel.add(��Ʈ���ڷ�Ĩ�÷�ġ��);
		
		JButton �÷��ο��Ʈ�÷�ġ�� = new JButton("\uD50C\uB808\uC778 \uC694\uAC70\uD2B8");
		menuButton_list.add(�÷��ο��Ʈ�÷�ġ��);
		�÷��ο��Ʈ�÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(18, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		�÷��ο��Ʈ�÷�ġ��.setBounds(126, 220, 111, 95);
		menu_2_panel.add(�÷��ο��Ʈ�÷�ġ��);
		
		JButton ��纣�����Ʈ�÷�ġ�� = new JButton("\uBE14\uB8E8\uBCA0\uB9AC\uC694\uAC70\uD2B8");
		��纣�����Ʈ�÷�ġ��.setFont(new Font("����", Font.PLAIN, 11));
		menuButton_list.add(��纣�����Ʈ�÷�ġ��);
		��纣�����Ʈ�÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(19, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		��纣�����Ʈ�÷�ġ��.setBounds(240, 220, 111, 95);
		menu_2_panel.add(��纣�����Ʈ�÷�ġ��);
		
		JButton ������Ʈ�÷�ġ�� = new JButton("\uB538\uAE30 \uC694\uAC70\uD2B8");
		menuButton_list.add(������Ʈ�÷�ġ��);
		������Ʈ�÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(20, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		������Ʈ�÷�ġ��.setBounds(355, 220, 111, 95);
		menu_2_panel.add(������Ʈ�÷�ġ��);

		JButton �Ƹ޸�ī�� = new JButton("�Ƹ޸�ī��");
		menuButton_list.add(�Ƹ޸�ī��);
		�Ƹ޸�ī��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(21, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		�Ƹ޸�ī��.setBounds(12, 10, 111, 95);
		menu_3_panel.add(�Ƹ޸�ī��);
		
		JButton ī��� = new JButton("ī���");
		menuButton_list.add(ī���);
		ī���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(22, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		
		ī���.setBounds(126, 10, 111, 95);
		menu_3_panel.add(ī���);
		
		JButton ī���ī = new JButton("ī���ī");
		menuButton_list.add(ī���ī);
		ī���ī.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				LabelSetText(23, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});

		ī���ī.setBounds(240, 10, 111, 95);
		menu_3_panel.add(ī���ī);
		
		JButton ���ν���� = new JButton("���ν����");
		menuButton_list.add(���ν����);
		���ν����.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				LabelSetText(24, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
	
		���ν����.setBounds(355, 10, 111, 95);
		menu_3_panel.add(���ν����);
		
		JButton �ݵ��� = new JButton("�ݵ���");
		menuButton_list.add(�ݵ���);
		�ݵ���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(25, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
				
			}
		});

		�ݵ���.setBounds(12, 115, 111, 95);
		menu_3_panel.add(�ݵ���);
		
		JButton ������ = new JButton("������");
		menuButton_list.add(������);
		������.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				LabelSetText(26, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		
		������.setBounds(126, 115, 111, 95);
		menu_3_panel.add(������);
		
		JButton ���������� = new JButton("����������");
		menuButton_list.add(����������);
		����������.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				LabelSetText(27, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
	
		����������.setBounds(240, 115, 111, 95);
		menu_3_panel.add(����������);
		
		JButton �����ƶ� = new JButton("�����ƶ�");
		menuButton_list.add(�����ƶ�);
		�����ƶ�.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				LabelSetText(28, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		
		�����ƶ�.setBounds(355, 115, 111, 95);
		menu_3_panel.add(�����ƶ�);
		
		JButton ����ī����� = new JButton("����ī�����");
		menuButton_list.add(����ī�����);
		����ī�����.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LabelSetText(29, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
				
			}
		});
		����ī�����.setBounds(12, 217, 111, 95);
		menu_3_panel.add(����ī�����);
		
		JButton �ݵ���Ƽ��̼� = new JButton("�ݵ���Ƽ��̼�");
		menuButton_list.add(�ݵ���Ƽ��̼�);
		�ݵ���Ƽ��̼�.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LabelSetText(30, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		�ݵ���Ƽ��̼�.setBounds(126, 217, 111, 95);
		menu_3_panel.add(�ݵ���Ƽ��̼�);
		
		JButton �������������ĳ� = new JButton("�������������ĳ�");
		menuButton_list.add(�������������ĳ�);
		�������������ĳ�.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LabelSetText(31, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		�������������ĳ�.setBounds(240, 217, 111, 95);
		menu_3_panel.add(�������������ĳ�);
		
		JButton ���������Ҹ����ƶ� = new JButton("���������Ҹ����ƶ�");
		menuButton_list.add(���������Ҹ����ƶ�);
		���������Ҹ����ƶ�.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LabelSetText(32, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		���������Ҹ����ƶ�.setBounds(355, 217, 111, 95);
		menu_3_panel.add(���������Ҹ����ƶ�);
		
		JButton ����� = new JButton("�����");
		menuButton_list.add(�����);
		�����.setFont(new Font("����", Font.PLAIN, 12));
		�����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(33, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		�����.setBounds(12, 10, 111, 95);
		menu_4_panel.add(�����);
	
		JButton ��ȭ�� = new JButton("��ȭ��");
		menuButton_list.add(��ȭ��);
		��ȭ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(34, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
			
		});
		��ȭ��.setBounds(126, 10, 111, 95);
		menu_4_panel.add(��ȭ��);
		
		JButton ������ = new JButton("������");
		menuButton_list.add(������);
		������.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				LabelSetText(35, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		������.setBounds(240, 10, 111, 95);
		menu_4_panel.add(������);
		
		JButton ������ = new JButton("������");
		menuButton_list.add(������);
		������.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				LabelSetText(36, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		������.setBounds(355, 10, 111, 95);
		menu_4_panel.add(������);
		
		JButton ������ = new JButton("������");
		menuButton_list.add(������);
		������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(37, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		������.setBounds(126, 115, 111, 95);
		menu_4_panel.add(������);
		
		JButton �̰�� = new JButton("�̰�� ");
		menuButton_list.add(�̰��);
		�̰��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(38, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		�̰��.setBounds(240, 115, 111, 95);
		menu_4_panel.add(�̰��);
		
		JButton ICED���ݸ� = new JButton("���ݸ�");
		menuButton_list.add(ICED���ݸ�);
		ICED���ݸ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(39, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		ICED���ݸ�.setBounds(355, 115, 111, 95);
		menu_4_panel.add(ICED���ݸ�);
		
		JButton ��ũƼ = new JButton("��ũƼ");
		menuButton_list.add(��ũƼ);
		��ũƼ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(40, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		��ũƼ.setBounds(12, 115, 111, 95);
		menu_4_panel.add(��ũƼ);
		
		JButton ���ǳӶ� = new JButton("���� �� ��");
		menuButton_list.add(���ǳӶ�);
		���ǳӶ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(41, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		���ǳӶ�.setBounds(12, 220, 111, 95);
		menu_4_panel.add(���ǳӶ�);
		
		JButton �ް��� = new JButton("�ް���");
		menuButton_list.add(�ް���);
		�ް���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(42, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		�ް���.setBounds(126, 220, 111, 95);
		menu_4_panel.add(�ް���);
		
		JButton ������ = new JButton("������");
		menuButton_list.add(������);
		������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(43, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		������.setBounds(240, 220, 111, 95);
		menu_4_panel.add(������);
		
		JButton ȭ��Ʈ���ݸ� = new JButton("ȭ��Ʈ���ݸ�");
		menuButton_list.add(ȭ��Ʈ���ݸ�);
		ȭ��Ʈ���ݸ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelSetText(44, menuButton_list, panelMenu, panelSelectMenu, lblMenuNameMsg);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText())) {
						SelectMenuPriceSet(i, lblMenuPrice);
					}
				}
			}
		});
		ȭ��Ʈ���ݸ�.setBounds(355, 220, 111, 95);
		menu_4_panel.add(ȭ��Ʈ���ݸ�);
		ButtonGroup rdbtnSlctMenu = new ButtonGroup();
		
		JRadioButton rdbtnHot = new JRadioButton("Hot");
		rdbtnHot.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					lblMenuNameMsg.setText(lblMenuNameMsg.getText()+"(Hot)");
				}
				else if (e.getStateChange() == ItemEvent.DESELECTED) {
					lblMenuNameMsg.setText(lblMenuNameMsg.getText().substring(0, lblMenuNameMsg.getText().indexOf("(")));
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
				}
				else if (e.getStateChange() == ItemEvent.DESELECTED) {
					lblMenuNameMsg.setText(lblMenuNameMsg.getText().substring(0, lblMenuNameMsg.getText().indexOf("(")));
				}
			}
			
		});
		rdbtnIced.setBounds(88, 94, 58, 23);
		panelSelectMenu.add(rdbtnIced);
		
		rdbtnSlctMenu.add(rdbtnHot);
		rdbtnSlctMenu.add(rdbtnIced);
		
		JRadioButton rdbtnClear = new JRadioButton("radio button to clear");
		
		rdbtnSlctMenu.add(rdbtnClear);
		
		JButton btn_selectCancel = new JButton("\uCDE8\uC18C");
		btn_selectCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnClear.setSelected(true);
				panelSelectMenu.setVisible(false);
				panelMenu.setVisible(true);
			}
		});
		btn_selectCancel.setBounds(12, 588, 130, 63);
		panelSelectMenu.add(btn_selectCancel);
		
		JButton btn_selectComplete = new JButton("\uC120\uD0DD \uC644\uB8CC");
		btn_selectComplete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSelectMenu.setVisible(false);
				panelMenu.setVisible(true);
				for (int i = 0; i < menuButton_list.size(); i++) {
					if (menuButton_list.get(i).getText().equals(lblMenuNameMsg.getText().substring(0, lblMenuNameMsg.getText().indexOf("(")))) {
						ClickMenu(i, price, label);
					}
				}
				menuName_list.add(lblMenuNameMsg.getText());
				menuPrice_list.add(lblMenuPrice.getText());
				
				ConfirmLabelSet(confirmName_list, lblMenuNameMsg);
				ConfirmLabelSet2(confirmPrice_list, lblMenuPrice);
				rdbtnClear.setSelected(true);
			}
		});
		btn_selectComplete.setBounds(342, 588, 130, 63);
		panelSelectMenu.add(btn_selectComplete);
		
		JLabel lblSelectedMenuName_1 = new JLabel("");
		confirmName_list.add(lblSelectedMenuName_1);
		lblSelectedMenuName_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedMenuName_1.setBounds(12, 65, 213, 45);
		panelConfirmPage1.add(lblSelectedMenuName_1);
		
		JLabel lblMenuPrice_1 = new JLabel();
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
				panelMenu.setVisible(true);
			}
		});
		btn_confirm1Back.setBounds(177, 588, 130, 63);
		panelConfirmPage1.add(btn_confirm1Back);
		
		JButton btn_comfirm2Back = new JButton("\uC774\uC804");
		btn_comfirm2Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelConfirmPage2.setVisible(false);
				panelMenu.setVisible(true);
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
				price.setText("");
				label.setText("");
				MenuClear();
				Clear(confirmName_list, lblPriceSum, priceSum_list);
				for (int i = 0; i < confirmName_list.size(); i++) {
					confirmName_list.get(i).setText("");
					confirmPrice_list.get(i).setText("");
				}
				ConfirmLabelClear();
				ConfirmLabelClear2();
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
				lblCashPriceSum.setText(lblPriceSum1.getText());
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

		JLabel lblChangePrice = new JLabel("0");
		lblChangePrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChangePrice.setBounds(154, 330, 238, 48);
		panelChange.add(lblChangePrice);

		JButton btn_cashConfirm = new JButton("\uD655\uC778");
		btn_cashConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInputCash.setVisible(false);
				panelChange.setVisible(true);
				lblChangePrice.setText(Integer.parseInt(lblInputPrice.getText())-Integer.parseInt(lblCashPriceSum.getText().substring(0, lblCashPriceSum.getText().indexOf('��')))+"");
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
				FinishClear(confirmName_list, lblPriceSum, priceSum_list, lblInputPrice);
				MenuClear();
				ConfirmLabelClear();
				ConfirmLabelClear2();
				ConfirmLabelClear3();
				price.setText("");
				label.setText("");
				for (int i = 0; i < menuPanel_list.size(); i++) {
					menuPanel_list.get(i).setVisible(false);
				}
			}
		});
		btn_confirmFinish.setBounds(163, 444, 159, 75);
		panelFinish.add(btn_confirmFinish);
				
		JButton main = new JButton("\uBA54\uC778\uC73C\uB85C");
		main.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(false);
				panelMain.setVisible(true);
			}
		});
		main.setFont(new Font("����", Font.PLAIN, 15));
		main.setForeground(new Color(0, 0, 0));
		main.setBounds(0, 0, 108, 39);
		panelMenu.add(main);

		JLabel lblNewLabel = new JLabel("\uC8FC\uBB38 \uC218\uB7C9 :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 568, 99, 85);
		panelMenu.add(lblNewLabel);

		JButton �ֹ���� = new JButton("\uC8FC\uBB38\uCDE8\uC18C");
		�ֹ����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price.setText("");
				label.setText("");
				MenuClear();
				for (int i = 0; i < confirmName_list.size(); i++) {
					confirmName_list.get(i).setText("");
					confirmPrice_list.get(i).setText("");
				}
				ConfirmLabelClear();
				ConfirmLabelClear2();
			}
		});
		�ֹ����.setBounds(212, 568, 179, 47);
		panelMenu.add(�ֹ����);

		JButton ���� = new JButton("\uACB0\uC81C");
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelMenu.setVisible(false);
				panelConfirmPage1.setVisible(true);
				
				lblPriceSum.setText(price.getText());
				lblPriceSum1.setText(price.getText());
				lblPriceSum2.setText(price.getText());
			}
		});
		����.setBounds(403, 568, 71, 85);
		panelMenu.add(����);
		
		JButton coffee = new JButton("coffee");
		coffee.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < menuPanel_list.size(); i++) {
					menuPanel_list.get(i).setVisible(false);
				}
				menu_3_panel.setVisible(true);
			}
		});
		coffee.setBounds(0, 49, 113, 42);
		panelMenu.add(coffee);
		
		JButton beverage = new JButton("beverage");
		beverage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < menuPanel_list.size(); i++) {
					menuPanel_list.get(i).setVisible(false);
				}
				menu_4_panel.setVisible(true);
			}
		});
		beverage.setBounds(125, 49, 113, 42);
		panelMenu.add(beverage);
		
		JButton shake_ade = new JButton("shake_ade");
		shake_ade.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < menuPanel_list.size(); i++) {
					menuPanel_list.get(i).setVisible(false);
				}
				menu_1_panel.setVisible(true);
			}
		});
		shake_ade.setBounds(250, 49, 113, 42);
		panelMenu.add(shake_ade);
		
		JButton Flatccino = new JButton("flatccino");
		Flatccino.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < menuPanel_list.size(); i++) {
					menuPanel_list.get(i).setVisible(false);
				}
				menu_2_panel.setVisible(true);
			}
		});
		Flatccino.setBounds(373, 49, 113, 42);
		panelMenu.add(Flatccino);
		
		JLabel price_1 = new JLabel("\uACB0\uC81C \uAE08\uC561 : ");
		price_1.setHorizontalAlignment(SwingConstants.CENTER);
		price_1.setForeground(Color.BLACK);
		price_1.setFont(new Font("����", Font.PLAIN, 12));
		price_1.setBackground(Color.WHITE);
		price_1.setBounds(212, 616, 89, 37);
		panelMenu.add(price_1);

	}
	
}