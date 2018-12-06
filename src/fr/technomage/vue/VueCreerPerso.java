package fr.technomage.vue;

public class VueCreerPerso {
	
	/* ATTRIBUTS PRIVEE */
	private VueKit vueKit;
	private VueStat vueStat;
	private Vue vue;
	
	
	/* CONSTRUCTEUR */
	public VueCreerPerso (Vue vue ){
		
		//R�cuperation de la vue principale
		this.vue = vue;
		
		//Pour pouvoir r�cup�rer les vues cr�er au paravant on fait appel a leur constructeur propre. 
		this.vueStat = new VueStat(this.vue);
		this.vueKit = new VueKit(this.vue);
	}
	

}
