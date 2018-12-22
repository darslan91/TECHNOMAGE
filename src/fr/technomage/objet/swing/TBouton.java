package fr.technomage.objet.swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class TBouton extends JButton {

	public TBouton(String label) {
		super(label);
		
		this.setOpaque(true);
		this.setContentAreaFilled(false);
		this.setFocusable(false);
		this.setForeground(Color.lightGray);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage("assets/pictures/cursor/cursor_select.png");
		Cursor c = toolkit.createCustomCursor(image , new Point(0, 0), "img");
		this.setCursor(c);
	}
	
	public TBouton(String label, int width, int height) {
		this(label);
		this.setPreferredSize(new Dimension(width, height));
	}

}
