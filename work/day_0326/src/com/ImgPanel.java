package com;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class ImgPanel extends JPanel {
	
	private Image img;
	public ImgPanel (Image img) {
		
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
		
	}
	
	public Dimension getDimension() {
		return new Dimension(img.getWidth(null), img.getHeight(null));
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null); // 이미지 강제 호출
	}

}
