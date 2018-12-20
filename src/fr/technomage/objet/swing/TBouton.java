package fr.technomage.objet.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JButton;

import com.sun.glass.ui.Cursor;

@SuppressWarnings("serial")
public class TBouton extends JButton {

	public TBouton(String label) {
		super(label);
		
		this.setOpaque(true);
		this.setContentAreaFilled(false);
		this.setFocusable(false);
		this.setForeground(Color.lightGray);
	}
	
	public TBouton(String label, int width, int height) {
		this(label);
		this.setPreferredSize(new Dimension(width, height));
	}

}
