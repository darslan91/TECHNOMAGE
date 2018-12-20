package fr.technomage.objet.swing;

import java.awt.Color;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class TLabel extends JLabel {
	public TLabel(String text) {
		super(text);
		this.setForeground(Color.lightGray);
	}
}
