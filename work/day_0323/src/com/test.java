package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class test {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
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
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 617, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 96, 577, 217);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¸¶À½´ë·ÎÇÏ¼¼¿ä");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 29));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 577, 73);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn_1 = new JButton("1");
		btn_1.setFont(new Font("±¼¸²", Font.PLAIN, 29));
		btn_1.setBounds(12, 10, 109, 197);
		panel.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.setFont(new Font("±¼¸²", Font.PLAIN, 29));
		btn_2.setBounds(157, 10, 109, 197);
		panel.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setFont(new Font("±¼¸²", Font.PLAIN, 29));
		btn_3.setBounds(306, 10, 109, 197);
		panel.add(btn_3);
		
		JButton btn_4 = new JButton("4");
		btn_4.setFont(new Font("±¼¸²", Font.PLAIN, 29));
		btn_4.setBounds(456, 10, 109, 197);
		panel.add(btn_4);
		
		JButton btn_hi = new JButton("¾È³çÇÏ¼¼¿ä");
		btn_hi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(btn_hi.getText());
				btn_1.setText("¸ð");
				btn_2.setText("¸ð");
				btn_3.setText("¸ð");
				btn_4.setText("¸ð");
			}
		});
		btn_hi.setBounds(12, 350, 143, 134);
		frame.getContentPane().add(btn_hi);
		
		JButton btn_ntmy = new JButton("¹Ý°©½À´Ï´Ù");
		btn_ntmy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(btn_ntmy.getText());
				btn_1.setText("1");
				btn_2.setText("2");
				btn_3.setText("3");
				btn_4.setText("4");
			}
		});
		btn_ntmy.setBounds(446, 350, 143, 134);
		frame.getContentPane().add(btn_ntmy);
		
	}
}
