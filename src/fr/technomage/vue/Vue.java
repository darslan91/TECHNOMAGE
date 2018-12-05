package fr.technomage.vue;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Vue extends JFrame{
	public Vue() {
		this.setTitle("Technomage");
		this.setSize(1600, 900);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}
}
