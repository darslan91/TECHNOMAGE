package fr.technomage.vue;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import fr.technomage.objet.Game;

@SuppressWarnings("serial")
public class Vue extends JFrame{

	public Vue() {
		this.setTitle("Technomage");
		this.setSize(1600, 900);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setUndecorated(true);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage("assets/cursor/cursor.png");
		Cursor c = toolkit.createCustomCursor(image , new Point(0, 0), "img");
		this.setCursor(c);
		
		//Menubar debug
		JMenuBar jMenuBar = new JMenuBar();
		JMenuItem jmiX = new JMenuItem("X");
		Vue vue = this;
		jmiX.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				vue.dispose();
			}
		});
		jMenuBar.add(jmiX);
		this.setJMenuBar(jMenuBar);
		this.setSize(1600, 900+23);
		
	}
}
