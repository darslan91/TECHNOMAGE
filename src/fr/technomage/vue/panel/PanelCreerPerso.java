package fr.technomage.vue.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import fr.technomage.objet.swing.Panel;
import fr.technomage.vue.Vue;
import fr.technomage.vue.VueKit;
import fr.technomage.vue.VueNomPerso;
import fr.technomage.vue.VueStat;

@SuppressWarnings("serial")
public class PanelCreerPerso extends Panel {
	
	/* ATTRIBUTS PRIVEE */
	private VueKit vueKit;
	private VueStat vueStat;
	private VueNomPerso vueNomPerso;
	
	
	
	/* CONSTRUCTEUR */
	public PanelCreerPerso (Vue vue){
		
		//Pour pouvoir récupérer les vues créer au paravant on fait appel a leur constructeur propre. 
		this.vueStat = new VueStat(vue);
		this.vueStat.setBounds(425, 200, 800, 175);
		
		this.vueKit = new VueKit(vue);
		this.vueKit.setBounds(100, 425, 400, 400);
		
		this.vueNomPerso = new VueNomPerso(vue);
		this.vueNomPerso.setBounds(425, 10, 800, 175);
		
		this.add(this.vueStat);
		this.add(this.vueKit);
		this.add(this.vueNomPerso);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
	}
	

}
