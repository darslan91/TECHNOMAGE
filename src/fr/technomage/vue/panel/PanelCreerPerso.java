package fr.technomage.vue.panel;

import java.awt.Color;
import java.awt.Dimension;
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
		this.vueStat.setBounds(400, 200, 900, 200);
		
		this.vueKit = new VueKit(this.vue);
		Dimension size = this.vueKit.getPreferredSize();
		
		this.vueKit.setBounds(100, 450, 300, 400);
		
		this.add(this.vueStat);
		this.add(this.vueKit);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
	}
	

}
