package fr.technomage.objet.swing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Bouton extends JButton {

	public Bouton(String label) {
		super(label);
		
		this.setOpaque(true);
		this.setContentAreaFilled(false);
		this.setFocusable(false);
		this.setForeground(Color.lightGray);
	}
	
	public Bouton(String label, int width, int height) {
		this(label);
		this.setPreferredSize(new Dimension(width, height));
	}

}
