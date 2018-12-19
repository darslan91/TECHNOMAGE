package fr.technomage.objet.swing;

import java.awt.Color;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Label extends JLabel {
	public Label(String text) {
		super(text);
		this.setForeground(Color.lightGray);
	}
}
