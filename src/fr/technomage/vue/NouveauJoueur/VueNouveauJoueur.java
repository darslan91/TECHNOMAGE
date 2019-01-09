package fr.technomage.vue.NouveauJoueur;

import java.awt.Graphics;

import fr.technomage.objet.swing.TPanel;
import fr.technomage.vue.Vue;

@SuppressWarnings("serial")
public class VueNouveauJoueur extends TPanel {
	
	/* ATTRIBUTS PRIVEE */
	private VueKit vueKit;
	private VueStat vueStat;
	private VueNomPerso vueNomPerso;
	private VueAvatar vueAvatar;
	
	
	
	/* CONSTRUCTEUR */
	public VueNouveauJoueur (Vue vue){
		
		//Pour pouvoir récupérer les vues créer au paravant on fait appel a leur constructeur propre. 
		this.vueNomPerso = new VueNomPerso(vue, this);
		this.vueNomPerso.setBounds(350, 50, 900, 100);
		
		this.vueStat = new VueStat(vue, this, 0);
		this.vueStat.setBounds(350, 200, 900, 150);
		
		this.vueKit = new VueKit(vue, this);
		this.vueKit.setBounds(350, 400, 400, 400);
		
		this.vueAvatar = new VueAvatar(vue, this);
		this.vueAvatar.setBounds(850, 400, 400, 400);
		
		
		
		this.add(this.vueStat);
		this.add(this.vueKit);
		this.add(this.vueAvatar);
		this.add(this.vueNomPerso);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
	}

	public VueKit getVueKit() {
		return vueKit;
	}

	public VueStat getVueStat() {
		return vueStat;
	}

	public VueNomPerso getVueNomPerso() {
		return vueNomPerso;
	}

	public VueAvatar getVueAvatar() {
		return vueAvatar;
	}
	

}
