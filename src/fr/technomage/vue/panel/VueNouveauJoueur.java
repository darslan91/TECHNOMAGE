package fr.technomage.vue.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import fr.technomage.objet.swing.TPanel;
import fr.technomage.vue.Vue;
import fr.technomage.vue.VueKit;
import fr.technomage.vue.VueNomPerso;
import fr.technomage.vue.VueStat;

@SuppressWarnings("serial")
public class VueNouveauJoueur extends TPanel {
	
	/* ATTRIBUTS PRIVEE */
	private VueKit vueKit;
	private VueStat vueStat;
	private VueNomPerso vueNomPerso;
	
	
	
	/* CONSTRUCTEUR */
	public VueNouveauJoueur (Vue vue){
		
		//Pour pouvoir récupérer les vues créer au paravant on fait appel a leur constructeur propre. 
		this.vueNomPerso = new VueNomPerso(vue);
		this.vueNomPerso.setBounds(350, 50, 900, 100);
		
		this.vueStat = new VueStat(vue);
		this.vueStat.setBounds(350, 200, 900, 150);
		
		this.vueKit = new VueKit(vue);
		this.vueKit.setBounds(350, 400, 400, 400);
		
		
		
		this.add(this.vueStat);
		this.add(this.vueKit);
		this.add(this.vueNomPerso);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
	}
	

}
