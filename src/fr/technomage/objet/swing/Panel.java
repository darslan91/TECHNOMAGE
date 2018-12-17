package fr.technomage.objet.swing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel {

	public Panel() {
		this.setBackground(new Color(40, 40, 40));
		this.setLayout(null);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		//grid(g);
	}
	
	public void grid(Graphics g) {
		g.setColor(Color.GRAY);
		for(int j = 0; j < this.getHeight(); j+=50) {
			for(int i = 0; i < this.getWidth(); i+=50) {
				g.drawRect(i, j, i+50, j+50);
			}
		}
		g.setColor(Color.RED);
		for(int j = 0; j < this.getHeight(); j+=100) {
			for(int i = 0; i < this.getWidth(); i+=100) {
				g.drawRect(i, j, i+100, j+100);
			}
		}
	}
}
