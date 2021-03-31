

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
	
	 
	String coffee_name[] = {"아메리카노","카페라떼","카페모카","아인슈페너",
			"콜드브루","연유라떼","에스프레소","마끼아또","블략모카슈페너","콜드블루티라미수","에스프레소콘파냐","에스프레소마끼아또"};
	String beverage_name[]= {"딸기라떼","쌍화차","대추차","생강차",
			"고구마라떼","이곡라떼","ICED초콜릿","밀크티",
			"도피 넛 라떼","달고나라떼","녹차라떼",
			"화이트초콜릿"};
	
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
		
		JButton 아메리카노 = new JButton("아메리카노");
		아메리카노.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);			
				sum+= coffee_price[0];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
				
					
			}
		});
		아메리카노.setBounds(12, 10, 111, 95);
		menu_3_panel.add(아메리카노);
		
		JButton 카페라떼 = new JButton("카페라떼");
	
		카페라떼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum+= coffee_price[1];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
				
			}
		});
		
		카페라떼.setBounds(126, 10, 111, 95);
		menu_3_panel.add(카페라떼);
		
		JButton 카페모카 = new JButton("카페모카");
		
		카페모카.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= coffee_price[2];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			
				
			}
		});

		카페모카.setBounds(240, 10, 111, 95);
		menu_3_panel.add(카페모카);
		
		JButton 아인슈페너 = new JButton("아인슈페너");
		
		아인슈페너.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= coffee_price[3];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
	
		아인슈페너.setBounds(355, 10, 111, 95);
		menu_3_panel.add(아인슈페너);
		
		JButton 콜드블루 = new JButton("콜드브루");
		
		콜드블루.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= coffee_price[4];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
				
			}
		});

		콜드블루.setBounds(12, 115, 111, 95);
		menu_3_panel.add(콜드블루);
		
		JButton 연유라떼 = new JButton("연유라떼");
		
		연유라떼.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= coffee_price[5];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		
		연유라떼.setBounds(126, 115, 111, 95);
		menu_3_panel.add(연유라떼);
		
		JButton 에스프레소 = new JButton("에스프레소");
		
		에스프레소.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= coffee_price[6];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
	
		에스프레소.setBounds(240, 115, 111, 95);
		menu_3_panel.add(에스프레소);
		
		JButton 마끼아또 = new JButton("마끼아또");
		
		마끼아또.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+= coffee_price[7];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		
		마끼아또.setBounds(355, 115, 111, 95);
		menu_3_panel.add(마끼아또);
		
		JButton 블랙모카슈페너 = new JButton("블랙모카슈페너");
		블랙모카슈페너.setBounds(12, 217, 111, 95);
		menu_3_panel.add(블랙모카슈페너);
		
		JButton 콜드블루티라미수 = new JButton("콜드블루티라미수");
		콜드블루티라미수.setBounds(126, 217, 111, 95);
		menu_3_panel.add(콜드블루티라미수);
		
		JButton 에스프레소콘파냐 = new JButton("에스프레소콘파냐");
		에스프레소콘파냐.setBounds(240, 217, 111, 95);
		menu_3_panel.add(에스프레소콘파냐);
		
		JButton 에스프레소마끼아또 = new JButton("에스프레소마끼아또");
		에스프레소마끼아또.setBounds(355, 217, 111, 95);
		menu_3_panel.add(에스프레소마끼아또);
		
		JButton 딸기라떼 = new JButton("딸기라떼");
		딸기라떼.setFont(new Font("굴림", Font.PLAIN, 12));
		딸기라떼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);	
				sum+=beverage_price[0];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		딸기라떼.setBounds(12, 10, 111, 95);
		menu_4_panel.add(딸기라떼);
	
		JButton 쌍화차 = new JButton("쌍화차");
		
		쌍화차.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[1];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
			
		});
		쌍화차.setBounds(126, 10, 111, 95);
		menu_4_panel.add(쌍화차);
		
		JButton 대추차 = new JButton("대추차");
		대추차.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[2];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		대추차.setBounds(240, 10, 111, 95);
		menu_4_panel.add(대추차);
		
		JButton 생강차 = new JButton("생강차");
		생강차.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[3];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		생강차.setBounds(355, 10, 111, 95);
		menu_4_panel.add(생강차);
		
		JButton 고구마라떼 = new JButton("고구마라떼");
		고구마라떼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[4];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		고구마라떼.setBounds(126, 115, 111, 95);
		menu_4_panel.add(고구마라떼);
		
		JButton 이곡라떼 = new JButton("이곡라떼 ");
		이곡라떼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[5];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		이곡라떼.setBounds(240, 115, 111, 95);
		menu_4_panel.add(이곡라떼);
		
		JButton ICED초콜릿 = new JButton("ICED초콜릿");
		ICED초콜릿.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[6];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		ICED초콜릿.setBounds(355, 115, 111, 95);
		menu_4_panel.add(ICED초콜릿);
		
		JButton 밀크티 = new JButton("밀크티");
		밀크티.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[7];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		밀크티.setBounds(12, 115, 111, 95);
		menu_4_panel.add(밀크티);
		
		JButton 도피넛라떼 = new JButton("도피 넛 라떼");
		도피넛라떼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[8];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		도피넛라떼.setBounds(12, 220, 111, 95);
		menu_4_panel.add(도피넛라떼);
		
		JButton 달고나라떼 = new JButton("달고나라떼");
		달고나라떼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[9];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		달고나라떼.setBounds(126, 220, 111, 95);
		menu_4_panel.add(달고나라떼);
		
		JButton 녹차라떼 = new JButton("녹차라떼");
		녹차라떼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[10];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		녹차라떼.setBounds(240, 220, 111, 95);
		menu_4_panel.add(녹차라떼);
		
		JButton 화이트초콜릿 = new JButton("화이트초콜릿");
		화이트초콜릿.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelSelectMenu.setVisible(true);
				sum+=beverage_price[11];
				price.setText(sum+"원");
				label.setText(count2+"");
				count2++;
			}
		});
		화이트초콜릿.setBounds(355, 220, 111, 95);
		menu_4_panel.add(화이트초콜릿);
	}
}
