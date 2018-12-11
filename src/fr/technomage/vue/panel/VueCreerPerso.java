package fr.technomage.vue.panel;

import javax.swing.JPanel;

import fr.technomage.vue.Vue;
import fr.technomage.vue.VueKit;
import fr.technomage.vue.VueStat;

@SuppressWarnings("serial")
public class VueCreerPerso extends JPanel {
	
	/* ATTRIBUTS PRIVEE */
	private VueKit vueKit;
	private VueStat vueStat;
	private Vue vue;
	
	
	/* CONSTRUCTEUR */
	public VueCreerPerso (Vue vue ){
		
		//Récuperation de la vue principale
		this.vue = vue;
		
		//Pour pouvoir récupérer les vues créer au paravant on fait appel a leur constructeur propre. 
		this.vueStat = new VueStat(this.vue);
		this.vueKit = new VueKit(this.vue);
		
		this.add(this.vueStat);
		this.add(this.vueKit);
	}
	

}
