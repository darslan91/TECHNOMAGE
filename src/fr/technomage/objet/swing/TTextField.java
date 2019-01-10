package fr.technomage.objet.swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TTextField extends JTextField {
	
	public TTextField() {
		super();
		this.setBackground(new Color(40, 40, 40));
		this.setForeground(Color.lightGray);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage("assets/cursor/cursor_select.png");
		Cursor c = toolkit.createCustomCursor(image , new Point(0, 0), "img");
		this.setCursor(c);
	}
}
