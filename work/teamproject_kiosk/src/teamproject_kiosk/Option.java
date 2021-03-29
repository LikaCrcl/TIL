package teamproject_kiosk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Option {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Option window = new Option();
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
	public Option() {
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
		
		JPanel panelOption = new JPanel();
		panelOption.setBounds(0, 0, 484, 661);
		frame.getContentPane().add(panelOption);
		panelOption.setLayout(null);
		
		JLabel lblOptionMenuMsg = new JLabel("\uC120\uD0DD\uD55C \uBA54\uB274 \uC774\uB984");
		lblOptionMenuMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblOptionMenuMsg.setBounds(12, 10, 460, 62);
		panelOption.add(lblOptionMenuMsg);
		
		JLabel lblAddShot = new JLabel(" \uC0F7 \uCD94\uAC00");
		lblAddShot.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddShot.setBounds(12, 82, 161, 49);
		panelOption.add(lblAddShot);
		
		JCheckBox chckbxAddShot = new JCheckBox("");
		// chckbx 체크 시 금액 추가, 다시 해제 시 금액 감소 로직 필요
		chckbxAddShot.setBounds(374, 95, 21, 23);
		panelOption.add(chckbxAddShot);
		
		JButton btn_optionCancel = new JButton("\uCDE8\uC18C");
		btn_optionCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_optionCancel.setBounds(12, 588, 130, 63);
		panelOption.add(btn_optionCancel);
		
		JButton btn_optionFinish = new JButton("\uC120\uD0DD \uC644\uB8CC");
		btn_optionFinish.setBounds(342, 588, 130, 63);
		panelOption.add(btn_optionFinish);
		
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
