package teamproject_kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class SelectMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectMenu window = new SelectMenu();
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
	public SelectMenu() {
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
		
		JPanel panelSelectMenu = new JPanel();
		panelSelectMenu.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelSelectMenu);
		panelSelectMenu.setLayout(null);
		
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
		
		ButtonGroup rdbtnSlctMenu = new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hot");
		rdbtnNewRadioButton.setBounds(35, 94, 49, 23);
		panelSelectMenu.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnIced = new JRadioButton("Iced");
		rdbtnIced.setBounds(88, 94, 58, 23);
		panelSelectMenu.add(rdbtnIced);
		
		rdbtnSlctMenu.add(rdbtnNewRadioButton);
		rdbtnSlctMenu.add(rdbtnIced);
		
		JRadioButton rdbtnClear = new JRadioButton("radio button to clear");
		
		rdbtnSlctMenu.add(rdbtnClear);
		
	}
}
