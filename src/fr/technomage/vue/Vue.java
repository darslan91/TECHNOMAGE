package fr.technomage.vue;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Vue extends JFrame{
	public Vue() {
		this.setTitle("Technomage");
		this.setSize(1600, 900);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage("assets/cursor/cursor.png");
		Cursor c = toolkit.createCustomCursor(image , new Point(0, 0), "img");
		this.setCursor(c);
	}
}
