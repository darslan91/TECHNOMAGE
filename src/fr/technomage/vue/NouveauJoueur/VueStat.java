package fr.technomage.vue.NouveauJoueur;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import fr.technomage.objet.Classe;
import fr.technomage.objet.Game;
import fr.technomage.objet.swing.TLabel;
import fr.technomage.objet.swing.TPanel;
import fr.technomage.vue.Vue;



@SuppressWarnings("serial")
public class VueStat extends TPanel{

	/* ATTRIBUTS PRIVES */
	
	private TPanel panelGauche;
	private TLabel lbForce;
	private TLabel lbIntelligence;
	private TLabel lbAgilité;
	private TLabel lbConstitution;
	private TLabel lbEsprit;
	
	
	/* CONSTRUCTEUR */
	public VueStat(Vue vue, VueNouveauJoueur vueNouveauJoueur, int index){
		
		//Gestion du GridBag Layout
		this.setLayout(new GridLayout(3, 2));
		
		Classe classe = Game.getUneClasseByIndex(index);
		
		//Instanciation du label stat
		this.lbForce = new TLabel("Force : " + classe.getForce() );
		this.lbIntelligence = new TLabel("Intelligence : " + classe.getIntelligence());
		this.lbAgilité = new TLabel("Agilité : " + classe.getAgilité());
		this.lbConstitution = new TLabel("Constitution : " + classe.getConstitution());
		this.lbEsprit = new TLabel("Esprit : " + classe.getEsprit());
		
		/* AJOUT AU PANEL */
		
		this.panelGauche = new TPanel();
		this.panelGauche.add(lbForce);
		this.panelGauche.add(lbIntelligence);
		this.panelGauche.add(lbAgilité);
		this.panelGauche.add(lbConstitution);
		this.panelGauche.add(lbEsprit);
		
	}
	
	
	
	
	
	
}
