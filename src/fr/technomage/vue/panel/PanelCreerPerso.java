package fr.technomage.vue.panel;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import fr.technomage.objet.swing.Panel;
import fr.technomage.vue.Vue;
import fr.technomage.vue.VueKit;
import fr.technomage.vue.VueStat;

@SuppressWarnings("serial")
public class PanelCreerPerso extends Panel {
	
	/* ATTRIBUTS PRIVEE */
	private VueKit vueKit;
	private VueStat vueStat;
	private Vue vue;
	
	
	/* CONSTRUCTEUR */
	public PanelCreerPerso (Vue vue ){
		
		//Récuperation de la vue principale
		this.vue = vue;
		
		//Pour pouvoir récupérer les vues créer au paravant on fait appel a leur constructeur propre. 
		this.vueStat = new VueStat(this.vue);
		this.vueStat.setBounds(200, 200, 50, 100);
		
		this.vueKit = new VueKit(this.vue);
		this.vueKit.setBounds(400, 400, 50, 50);
		
		this.add(this.vueStat);
		this.add(this.vueKit);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.MAGENTA);
		g.fillRect(this.getWidth()-60, 10, 50, 50);
	}
	

}
