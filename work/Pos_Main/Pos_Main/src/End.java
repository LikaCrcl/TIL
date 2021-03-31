

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



public class End {

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
					End window = new End();
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
	public End() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	int coffee_price[] = {2500,3000,3500,4000,4500,4000,3500,3000,2500};
	int beverage_price[] = {3500,4800,4200,4000,3800,3500,4800,4200,4000,3800,4500,5000};
	
	 
	String coffee_name[] = {"�Ƹ޸�ī��","ī���","ī���ī","���ν����",
			"�ݵ���","������","����������","�����ƶ�","����ī�����","�ݵ���Ƽ��̼�","�������������ĳ�","���������Ҹ����ƶ�"};
	String beverage_name[]= {"�����","��ȭ��","������","������",
			"������","�̰��","ICED���ݸ�","��ũƼ",
			"���� �� ��","�ް���","������",
			"ȭ��Ʈ���ݸ�"};
	
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 486, 663);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel menu_3_panel = new JPanel();
		menu_3_panel.setBounds(0, 151, 486, 326);
		panel.add(menu_3_panel);
		menu_3_panel.setLayout(null);
		menu_3_panel.setVisible(false);
		
		JPanel menu_4_panel = new JPanel();
		menu_4_panel.setBounds(0, 151, 486, 326);
		panel.add(menu_4_panel);
		menu_4_panel.setLayout(null);
		menu_4_panel.setVisible(false);
		
		JButton �Ƹ޸�ī�� = new JButton("�Ƹ޸�ī��");
		�Ƹ޸�ī��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);			
				sum+= coffee_price[0];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
				
					
			}
		});
		�Ƹ޸�ī��.setBounds(12, 10, 111, 95);
		menu_3_panel.add(�Ƹ޸�ī��);
		
		JButton ī��� = new JButton("ī���");
	
		ī���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum+= coffee_price[1];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
				
			}
		});
		
		ī���.setBounds(126, 10, 111, 95);
		menu_3_panel.add(ī���);
		
		JButton ī���ī = new JButton("ī���ī");
		
		ī���ī.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= coffee_price[2];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			
				
			}
		});

		ī���ī.setBounds(240, 10, 111, 95);
		menu_3_panel.add(ī���ī);
		
		JButton ���ν���� = new JButton("���ν����");
		
		���ν����.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= coffee_price[3];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
	
		���ν����.setBounds(355, 10, 111, 95);
		menu_3_panel.add(���ν����);
		
		JButton �ݵ��� = new JButton("�ݵ���");
		
		�ݵ���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= coffee_price[4];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
				
			}
		});

		�ݵ���.setBounds(12, 115, 111, 95);
		menu_3_panel.add(�ݵ���);
		
		JButton ������ = new JButton("������");
		
		������.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= coffee_price[5];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		
		������.setBounds(126, 115, 111, 95);
		menu_3_panel.add(������);
		
		JButton ���������� = new JButton("����������");
		
		����������.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= coffee_price[6];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
	
		����������.setBounds(240, 115, 111, 95);
		menu_3_panel.add(����������);
		
		JButton �����ƶ� = new JButton("�����ƶ�");
		
		�����ƶ�.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= coffee_price[7];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		
		�����ƶ�.setBounds(355, 115, 111, 95);
		menu_3_panel.add(�����ƶ�);
		
		JButton ����ī����� = new JButton("����ī�����");
		����ī�����.setBounds(12, 217, 111, 95);
		menu_3_panel.add(����ī�����);
		
		JButton �ݵ���Ƽ��̼� = new JButton("�ݵ���Ƽ��̼�");
		�ݵ���Ƽ��̼�.setBounds(126, 217, 111, 95);
		menu_3_panel.add(�ݵ���Ƽ��̼�);
		
		JButton �������������ĳ� = new JButton("�������������ĳ�");
		�������������ĳ�.setBounds(240, 217, 111, 95);
		menu_3_panel.add(�������������ĳ�);
		
		JButton ���������Ҹ����ƶ� = new JButton("���������Ҹ����ƶ�");
		���������Ҹ����ƶ�.setBounds(355, 217, 111, 95);
		menu_3_panel.add(���������Ҹ����ƶ�);
		
		JButton ����� = new JButton("�����");
		�����.setFont(new Font("����", Font.PLAIN, 12));
		�����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);	
				sum+=beverage_price[0];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		�����.setBounds(12, 10, 111, 95);
		menu_4_panel.add(�����);
	
		JButton ��ȭ�� = new JButton("��ȭ��");
		
		��ȭ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[1];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
			
		});
		��ȭ��.setBounds(126, 10, 111, 95);
		menu_4_panel.add(��ȭ��);
		
		JButton ������ = new JButton("������");
		������.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[2];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		������.setBounds(240, 10, 111, 95);
		menu_4_panel.add(������);
		
		JButton ������ = new JButton("������");
		������.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[3];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		������.setBounds(355, 10, 111, 95);
		menu_4_panel.add(������);
		
		JButton ������ = new JButton("������");
		������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[4];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		������.setBounds(126, 115, 111, 95);
		menu_4_panel.add(������);
		
		JButton �̰�� = new JButton("�̰�� ");
		�̰��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[5];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		�̰��.setBounds(240, 115, 111, 95);
		menu_4_panel.add(�̰��);
		
		JButton ICED���ݸ� = new JButton("ICED���ݸ�");
		ICED���ݸ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[6];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		ICED���ݸ�.setBounds(355, 115, 111, 95);
		menu_4_panel.add(ICED���ݸ�);
		
		JButton ��ũƼ = new JButton("��ũƼ");
		��ũƼ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[7];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		��ũƼ.setBounds(12, 115, 111, 95);
		menu_4_panel.add(��ũƼ);
		
		JButton ���ǳӶ� = new JButton("���� �� ��");
		���ǳӶ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[8];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		���ǳӶ�.setBounds(12, 220, 111, 95);
		menu_4_panel.add(���ǳӶ�);
		
		JButton �ް��� = new JButton("�ް���");
		�ް���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[9];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		�ް���.setBounds(126, 220, 111, 95);
		menu_4_panel.add(�ް���);
		
		JButton ������ = new JButton("������");
		������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[10];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		������.setBounds(240, 220, 111, 95);
		menu_4_panel.add(������);
		
		JButton ȭ��Ʈ���ݸ� = new JButton("ȭ��Ʈ���ݸ�");
		ȭ��Ʈ���ݸ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[11];
				price.setText(sum+"��");
				label.setText(count2+"");
				count2++;
			}
		});
		ȭ��Ʈ���ݸ�.setBounds(355, 220, 111, 95);
		menu_4_panel.add(ȭ��Ʈ���ݸ�);
	}
}
