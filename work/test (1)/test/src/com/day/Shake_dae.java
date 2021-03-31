package com.day;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Shake_dae {

	int sum = 0;
	int count2 = 1;
	
	private JFrame frame;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shake_dae window = new Shake_dae();
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
	public Shake_dae() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	int shake_price[] = {2500,3000,3500,4000,4500,4000,3500,3000,2500};
	int Flatccino_price[] = {3500,4800,4200,4000,3800,3500,4800,4200,4000,3800,4500,5000};
	
	 
	String shake_name[] = {"오리진 쉐이크","초코 쿠키쉐이크","딸기 쉐이크","레몬 에이드",
			"(Ex) 레몬에이드","자몽 에이드","(Ex) 자몽에이드","청포도 에이드","(Ex) 청포도 에이드"};
	String Flatccino_name[]= {"꿀복숭아 플랫치노","커피 플랫치노","망고 플랫치노","모카 플랫치노",
			"카라멜 플랫치노","자몽 플랫치노","녹차 플랫치노","초코렛 칩 플랫치노",
			"민트 초코렛 칩 플랫치노","플레인 요거트 플랫치노","블루베리 요거트 플랫치노",
			"딸기 요거트 플랫치노"};
	
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBounds(0, 0, 486, 663);
		frame.getContentPane().add(panelMenu);
		panelMenu.setLayout(null);
		
		JButton main = new JButton("\uBA54\uC778\uC73C\uB85C");
		main.setFont(new Font("굴림", Font.PLAIN, 15));
		main.setForeground(new Color(0, 0, 0));
		main.setBounds(0, 0, 108, 39);
		panelMenu.add(main);
		
		JPanel menu_1_panel = new JPanel();
		menu_1_panel.setBounds(0, 151, 486, 326);
		panelMenu.add(menu_1_panel);
		menu_1_panel.setLayout(null);
		menu_1_panel.setVisible(false);
		
		JPanel menu_2_panel = new JPanel();
		menu_2_panel.setBounds(0, 151, 486, 326);
		panelMenu.add(menu_2_panel);
		menu_2_panel.setLayout(null);
		menu_2_panel.setVisible(false);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("굴림", Font.PLAIN, 12));
		label.setBounds(123, 568, 89, 85);
		panelMenu.add(label);
		
		JLabel price = new JLabel("");
		price.setHorizontalAlignment(SwingConstants.CENTER);
		price.setForeground(Color.BLACK);
		price.setFont(new Font("굴림", Font.PLAIN, 12));
		price.setBackground(Color.WHITE);
		price.setBounds(302, 616, 89, 37);
		panelMenu.add(price);
		
		JButton 오리진쉐이크 = new JButton("\uC624\uB9AC\uC9C4\r\n\uC250\uC774\uD06C");
		오리진쉐이크.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);			
				sum+= shake_price[0];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
				
					
			}
		});
		오리진쉐이크.setBounds(12, 10, 111, 95);
		menu_1_panel.add(오리진쉐이크);
		
		JButton 초코쿠키쉐이크 = new JButton("\uCD08\uCF54\uCFE0\uD0A4\uC250\uC774\uD06C");
	
		초코쿠키쉐이크.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum+= shake_price[1];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
				
			}
		});
		
		초코쿠키쉐이크.setBounds(126, 10, 111, 95);
		menu_1_panel.add(초코쿠키쉐이크);
		
		JButton 딸기쉐이크 = new JButton("\uB538\uAE30\uC250\uC774\uD06C");
		
		딸기쉐이크.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= shake_price[2];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			
				
			}
		});

		딸기쉐이크.setBounds(240, 10, 111, 95);
		menu_1_panel.add(딸기쉐이크);
		
		JButton 레몬에이드 = new JButton("\uB808\uBAAC\uC5D0\uC774\uB4DC");
		
		레몬에이드.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= shake_price[3];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
	
		레몬에이드.setBounds(355, 10, 111, 95);
		menu_1_panel.add(레몬에이드);
		
		JButton Ex레몬에이드 = new JButton("(Ex)\uB808\uBAAC\uC5D0\uC774\uB4DC");
		Ex레몬에이드.setFont(new Font("gulim", Font.PLAIN, 12));
		
		Ex레몬에이드.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= shake_price[4];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
				
			}
		});

		Ex레몬에이드.setBounds(12, 115, 111, 95);
		menu_1_panel.add(Ex레몬에이드);
		
		JButton 자몽에이드 = new JButton("\uC790\uBABD\uC5D0\uC774\uB4DC");
		
		자몽에이드.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= shake_price[5];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		
		자몽에이드.setBounds(126, 115, 111, 95);
		menu_1_panel.add(자몽에이드);
		
		JButton Ex자몽에이드 = new JButton("(Ex)\uC790\uBABD\uC5D0\uC774\uB4DC");
		
		Ex자몽에이드.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= shake_price[6];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
	
		Ex자몽에이드.setBounds(240, 115, 111, 95);
		menu_1_panel.add(Ex자몽에이드);
		
		JButton 청포도에이드 = new JButton("\uCCAD\uD3EC\uB3C4\uC5D0\uC774\uB4DC");
		
		청포도에이드.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= shake_price[7];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		
		청포도에이드.setBounds(355, 115, 111, 95);
		menu_1_panel.add(청포도에이드);
		
		JButton Ex청포도에이드 = new JButton("Ex\uCCAD\uD3EC\uB3C4\uC5D0\uC774\uB4DC");
		
		Ex청포도에이드.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= shake_price[8];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		Ex청포도에이드.setBounds(12, 220, 111, 95);
		menu_1_panel.add(Ex청포도에이드);
		
		JButton 꿀복숭아플랫치노 = new JButton(" \uAFC0\uBCF5\uC22D\uC544\r\n \uD50C\uB7AB\uCE58\uB178");
		꿀복숭아플랫치노.setFont(new Font("굴림", Font.PLAIN, 12));
		꿀복숭아플랫치노.setHorizontalAlignment(SwingConstants.LEFT);
		꿀복숭아플랫치노.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);	
				sum+=Flatccino_price[0];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		꿀복숭아플랫치노.setBounds(12, 10, 111, 95);
		menu_2_panel.add(꿀복숭아플랫치노);
	
		JButton 커피플랫치노 = new JButton("\uCEE4\uD53C \uD50C\uB7AB\uCE58\uB178");
		
		커피플랫치노.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[1];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
			
		});
		커피플랫치노.setBounds(126, 10, 111, 95);
		menu_2_panel.add(커피플랫치노);
		
		JButton 망고플랫치노 = new JButton("\uB9DD\uACE0 \uD50C\uB7AB\uCE58\uB178");
		망고플랫치노.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[2];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		망고플랫치노.setBounds(240, 10, 111, 95);
		menu_2_panel.add(망고플랫치노);
		
		JButton 모카플랫치노 = new JButton("\uBAA8\uCE74 \uD50C\uB7AB\uCE58\uB178");
		모카플랫치노.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[3];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		모카플랫치노.setBounds(355, 10, 111, 95);
		menu_2_panel.add(모카플랫치노);
		
		JButton 카차멜플랫치노 = new JButton("\uCE74\uCC28\uBA5C\uD50C\uB7AB\uCE58\uB178");
		카차멜플랫치노.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[4];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		카차멜플랫치노.setBounds(126, 115, 111, 95);
		menu_2_panel.add(카차멜플랫치노);
		
		JButton 자몽플랫치노 = new JButton("\uC790\uBABD \uD50C\uB7AB\uCE58\uB178");
		자몽플랫치노.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[5];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		자몽플랫치노.setBounds(240, 115, 111, 95);
		menu_2_panel.add(자몽플랫치노);
		
		JButton 녹차플랫치노 = new JButton("\uB179\uCC28\uD50C\uB7AB\uCE58\uB178");
		녹차플랫치노.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[6];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		녹차플랫치노.setBounds(355, 115, 111, 95);
		menu_2_panel.add(녹차플랫치노);
		
		JButton 초코렛칩플랫치노 = new JButton("\uCD08\uCF54\uB81B \uCE69 \uD50C\uB7AB\uCE58\uB178");
		초코렛칩플랫치노.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[7];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		초코렛칩플랫치노.setBounds(12, 115, 111, 95);
		menu_2_panel.add(초코렛칩플랫치노);
		
		JButton 민트초코렛칩플랫치노 = new JButton("\uBBFC\uD2B8 \uCD08\uCF54\uB81B \uCE69 \uD50C\uB7AB\uCE58\uB178");
		민트초코렛칩플랫치노.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[8];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		민트초코렛칩플랫치노.setBounds(12, 220, 111, 95);
		menu_2_panel.add(민트초코렛칩플랫치노);
		
		JButton 플레인요거트플랫치노 = new JButton("\uD50C\uB808\uC778 \uC694\uAC70\uD2B8 \uD50C\uB7AB\uCE58\uB178");
		플레인요거트플랫치노.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[9];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		플레인요거트플랫치노.setBounds(126, 220, 111, 95);
		menu_2_panel.add(플레인요거트플랫치노);
		
		JButton 블루베리요거트플랫치노 = new JButton("\uBE14\uB8E8\uBCA0\uB9AC \uC694\uAC70\uD2B8 \uD50C\uB7AB\uCE58\uB178");
		블루베리요거트플랫치노.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[10];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		블루베리요거트플랫치노.setBounds(240, 220, 111, 95);
		menu_2_panel.add(블루베리요거트플랫치노);
		
		JButton 딸기요거트플랫치노 = new JButton("\uB538\uAE30 \uC694\uAC70\uD2B8 \uD50C\uB7AB\uCE58\uB178");
		딸기요거트플랫치노.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[11];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		딸기요거트플랫치노.setBounds(355, 220, 111, 95);
		menu_2_panel.add(딸기요거트플랫치노);
		
		JLabel lblNewLabel = new JLabel("\uC8FC\uBB38 \uC218\uB7C9 :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 568, 99, 85);
		panelMenu.add(lblNewLabel);

		JButton 주문취소 = new JButton("\uC8FC\uBB38\uCDE8\uC18C");
		주문취소.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// clear 메소드 들어가야함
			}
		});
		주문취소.setBounds(212, 568, 179, 47);
		panelMenu.add(주문취소);

		JButton 결제 = new JButton("\uACB0\uC81C");
		결제.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		결제.setBounds(403, 568, 71, 85);
		panelMenu.add(결제);
		
		JButton coffee = new JButton("coffee");
		coffee.setBounds(0, 49, 113, 42);
		panelMenu.add(coffee);
		
		JButton blending_tea = new JButton("blending_tea");
		blending_tea.setBounds(0, 101, 113, 42);
		panelMenu.add(blending_tea);
		
		JButton bread = new JButton("bread");
		bread.setBounds(125, 101, 113, 42);
		panelMenu.add(bread);
		
		JButton beverage = new JButton("beverage");
		beverage.setBounds(125, 49, 113, 42);
		panelMenu.add(beverage);
		
		JButton shake_ade = new JButton("shake_ade");
		shake_ade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu_1_panel.setVisible(true);
				menu_2_panel.setVisible(false);
			}
		});
		shake_ade.setBounds(250, 49, 113, 42);
		panelMenu.add(shake_ade);
		
		JButton Flatccino = new JButton("flatccino");
		Flatccino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu_1_panel.setVisible(false);
				menu_2_panel.setVisible(true);
			}
		});
		Flatccino.setBounds(373, 49, 113, 42);
		panelMenu.add(Flatccino);
		
		JLabel price_1 = new JLabel("\uACB0\uC81C \uAE08\uC561 : ");
		price_1.setHorizontalAlignment(SwingConstants.CENTER);
		price_1.setForeground(Color.BLACK);
		price_1.setFont(new Font("굴림", Font.PLAIN, 12));
		price_1.setBackground(Color.WHITE);
		price_1.setBounds(212, 616, 89, 37);
		panelMenu.add(price_1);
		
	}
}
