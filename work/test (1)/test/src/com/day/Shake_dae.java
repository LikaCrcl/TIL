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
	
	 
	String shake_name[] = {"������ ����ũ","���� ��Ű����ũ","���� ����ũ","���� ���̵�",
			"(Ex) �����̵�","�ڸ� ���̵�","(Ex) �ڸ����̵�","û���� ���̵�","(Ex) û���� ���̵�"};
	String Flatccino_name[]= {"�ܺ����� �÷�ġ��","Ŀ�� �÷�ġ��","���� �÷�ġ��","��ī �÷�ġ��",
			"ī��� �÷�ġ��","�ڸ� �÷�ġ��","���� �÷�ġ��","���ڷ� Ĩ �÷�ġ��",
			"��Ʈ ���ڷ� Ĩ �÷�ġ��","�÷��� ���Ʈ �÷�ġ��","��纣�� ���Ʈ �÷�ġ��",
			"���� ���Ʈ �÷�ġ��"};
	
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
		main.setFont(new Font("����", Font.PLAIN, 15));
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
		label.setFont(new Font("����", Font.PLAIN, 12));
		label.setBounds(123, 568, 89, 85);
		panelMenu.add(label);
		
		JLabel price = new JLabel("");
		price.setHorizontalAlignment(SwingConstants.CENTER);
		price.setForeground(Color.BLACK);
		price.setFont(new Font("����", Font.PLAIN, 12));
		price.setBackground(Color.WHITE);
		price.setBounds(302, 616, 89, 37);
		panelMenu.add(price);
		
		JButton ����������ũ = new JButton("\uC624\uB9AC\uC9C4\r\n\uC250\uC774\uD06C");
		����������ũ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);			
				sum+= shake_price[0];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
				
					
			}
		});
		����������ũ.setBounds(12, 10, 111, 95);
		menu_1_panel.add(����������ũ);
		
		JButton ������Ű����ũ = new JButton("\uCD08\uCF54\uCFE0\uD0A4\uC250\uC774\uD06C");
	
		������Ű����ũ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum+= shake_price[1];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
				
			}
		});
		
		������Ű����ũ.setBounds(126, 10, 111, 95);
		menu_1_panel.add(������Ű����ũ);
		
		JButton ���⽦��ũ = new JButton("\uB538\uAE30\uC250\uC774\uD06C");
		
		���⽦��ũ.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= shake_price[2];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			
				
			}
		});

		���⽦��ũ.setBounds(240, 10, 111, 95);
		menu_1_panel.add(���⽦��ũ);
		
		JButton �����̵� = new JButton("\uB808\uBAAC\uC5D0\uC774\uB4DC");
		
		�����̵�.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= shake_price[3];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
	
		�����̵�.setBounds(355, 10, 111, 95);
		menu_1_panel.add(�����̵�);
		
		JButton Ex�����̵� = new JButton("(Ex)\uB808\uBAAC\uC5D0\uC774\uB4DC");
		Ex�����̵�.setFont(new Font("gulim", Font.PLAIN, 12));
		
		Ex�����̵�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= shake_price[4];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
				
			}
		});

		Ex�����̵�.setBounds(12, 115, 111, 95);
		menu_1_panel.add(Ex�����̵�);
		
		JButton �ڸ����̵� = new JButton("\uC790\uBABD\uC5D0\uC774\uB4DC");
		
		�ڸ����̵�.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= shake_price[5];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		
		�ڸ����̵�.setBounds(126, 115, 111, 95);
		menu_1_panel.add(�ڸ����̵�);
		
		JButton Ex�ڸ����̵� = new JButton("(Ex)\uC790\uBABD\uC5D0\uC774\uB4DC");
		
		Ex�ڸ����̵�.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= shake_price[6];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
	
		Ex�ڸ����̵�.setBounds(240, 115, 111, 95);
		menu_1_panel.add(Ex�ڸ����̵�);
		
		JButton û�������̵� = new JButton("\uCCAD\uD3EC\uB3C4\uC5D0\uC774\uB4DC");
		
		û�������̵�.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= shake_price[7];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		
		û�������̵�.setBounds(355, 115, 111, 95);
		menu_1_panel.add(û�������̵�);
		
		JButton Exû�������̵� = new JButton("Ex\uCCAD\uD3EC\uB3C4\uC5D0\uC774\uB4DC");
		
		Exû�������̵�.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= shake_price[8];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		Exû�������̵�.setBounds(12, 220, 111, 95);
		menu_1_panel.add(Exû�������̵�);
		
		JButton �ܺ������÷�ġ�� = new JButton(" \uAFC0\uBCF5\uC22D\uC544\r\n \uD50C\uB7AB\uCE58\uB178");
		�ܺ������÷�ġ��.setFont(new Font("����", Font.PLAIN, 12));
		�ܺ������÷�ġ��.setHorizontalAlignment(SwingConstants.LEFT);
		�ܺ������÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);	
				sum+=Flatccino_price[0];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		�ܺ������÷�ġ��.setBounds(12, 10, 111, 95);
		menu_2_panel.add(�ܺ������÷�ġ��);
	
		JButton Ŀ���÷�ġ�� = new JButton("\uCEE4\uD53C \uD50C\uB7AB\uCE58\uB178");
		
		Ŀ���÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[1];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
			
		});
		Ŀ���÷�ġ��.setBounds(126, 10, 111, 95);
		menu_2_panel.add(Ŀ���÷�ġ��);
		
		JButton �����÷�ġ�� = new JButton("\uB9DD\uACE0 \uD50C\uB7AB\uCE58\uB178");
		�����÷�ġ��.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[2];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		�����÷�ġ��.setBounds(240, 10, 111, 95);
		menu_2_panel.add(�����÷�ġ��);
		
		JButton ��ī�÷�ġ�� = new JButton("\uBAA8\uCE74 \uD50C\uB7AB\uCE58\uB178");
		��ī�÷�ġ��.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[3];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		��ī�÷�ġ��.setBounds(355, 10, 111, 95);
		menu_2_panel.add(��ī�÷�ġ��);
		
		JButton ī�����÷�ġ�� = new JButton("\uCE74\uCC28\uBA5C\uD50C\uB7AB\uCE58\uB178");
		ī�����÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[4];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		ī�����÷�ġ��.setBounds(126, 115, 111, 95);
		menu_2_panel.add(ī�����÷�ġ��);
		
		JButton �ڸ��÷�ġ�� = new JButton("\uC790\uBABD \uD50C\uB7AB\uCE58\uB178");
		�ڸ��÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[5];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		�ڸ��÷�ġ��.setBounds(240, 115, 111, 95);
		menu_2_panel.add(�ڸ��÷�ġ��);
		
		JButton �����÷�ġ�� = new JButton("\uB179\uCC28\uD50C\uB7AB\uCE58\uB178");
		�����÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[6];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		�����÷�ġ��.setBounds(355, 115, 111, 95);
		menu_2_panel.add(�����÷�ġ��);
		
		JButton ���ڷ�Ĩ�÷�ġ�� = new JButton("\uCD08\uCF54\uB81B \uCE69 \uD50C\uB7AB\uCE58\uB178");
		���ڷ�Ĩ�÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[7];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		���ڷ�Ĩ�÷�ġ��.setBounds(12, 115, 111, 95);
		menu_2_panel.add(���ڷ�Ĩ�÷�ġ��);
		
		JButton ��Ʈ���ڷ�Ĩ�÷�ġ�� = new JButton("\uBBFC\uD2B8 \uCD08\uCF54\uB81B \uCE69 \uD50C\uB7AB\uCE58\uB178");
		��Ʈ���ڷ�Ĩ�÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[8];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		��Ʈ���ڷ�Ĩ�÷�ġ��.setBounds(12, 220, 111, 95);
		menu_2_panel.add(��Ʈ���ڷ�Ĩ�÷�ġ��);
		
		JButton �÷��ο��Ʈ�÷�ġ�� = new JButton("\uD50C\uB808\uC778 \uC694\uAC70\uD2B8 \uD50C\uB7AB\uCE58\uB178");
		�÷��ο��Ʈ�÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[9];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		�÷��ο��Ʈ�÷�ġ��.setBounds(126, 220, 111, 95);
		menu_2_panel.add(�÷��ο��Ʈ�÷�ġ��);
		
		JButton ��纣�����Ʈ�÷�ġ�� = new JButton("\uBE14\uB8E8\uBCA0\uB9AC \uC694\uAC70\uD2B8 \uD50C\uB7AB\uCE58\uB178");
		��纣�����Ʈ�÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[10];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		��纣�����Ʈ�÷�ġ��.setBounds(240, 220, 111, 95);
		menu_2_panel.add(��纣�����Ʈ�÷�ġ��);
		
		JButton ������Ʈ�÷�ġ�� = new JButton("\uB538\uAE30 \uC694\uAC70\uD2B8 \uD50C\uB7AB\uCE58\uB178");
		������Ʈ�÷�ġ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=Flatccino_price[11];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		������Ʈ�÷�ġ��.setBounds(355, 220, 111, 95);
		menu_2_panel.add(������Ʈ�÷�ġ��);
		
		JLabel lblNewLabel = new JLabel("\uC8FC\uBB38 \uC218\uB7C9 :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 568, 99, 85);
		panelMenu.add(lblNewLabel);

		JButton �ֹ���� = new JButton("\uC8FC\uBB38\uCDE8\uC18C");
		�ֹ����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// clear �޼ҵ� ������
			}
		});
		�ֹ����.setBounds(212, 568, 179, 47);
		panelMenu.add(�ֹ����);

		JButton ���� = new JButton("\uACB0\uC81C");
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		����.setBounds(403, 568, 71, 85);
		panelMenu.add(����);
		
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
		price_1.setFont(new Font("����", Font.PLAIN, 12));
		price_1.setBackground(Color.WHITE);
		price_1.setBounds(212, 616, 89, 37);
		panelMenu.add(price_1);
		
	}
}
