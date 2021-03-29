package com;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.BorderLayout;

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
		frame.setBounds(100, 100, 466, 714);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImgPanel loginpanel = new ImgPanel(new ImageIcon("C:\\Users\\ahgus\\Desktop\\JAVA_PROJECT\\work\\day_0326\\img\\i_test.jpg").getImage());
//		loginpanel.setBounds(0, 0, 427, 640);
		frame.getContentPane().add(loginpanel);
		frame.setSize(loginpanel.getDimension()); // 프레임 사이즈를 이미지에 맞춤
		
	}

}
