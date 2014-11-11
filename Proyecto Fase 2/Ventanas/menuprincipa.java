package Ventanas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class menuprincipa extends JPanel {
	private Image img;
	public menuprincipa(Image i) {
		img = i;
		Dimension tam = getSize();
		this.setLayout(null);
	}
	
	
	public void paintComponent(Graphics g){
		
		
		g.drawImage(img, 0, 0,null);
	}
}
