package fr.technomage.vue.NouveauJoueur;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

import fr.technomage.objet.swing.TLabel;
import fr.technomage.objet.swing.TPanel;
import fr.technomage.vue.Vue;



@SuppressWarnings("serial")
public class VueStat extends TPanel{

	/* ATTRIBUTS PRIVES */
	private Vue vue;
	private TLabel lblStat;
	
	
	/* CONSTRUCTEUR */
	public VueStat(Vue uneVue){
		
		//Gestion du GridBag Layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//laVue
		this.vue = uneVue;
		
		//Déclaration et Instanciation d'un Label
		Font font = new Font("Calibri", Font.BOLD,20);
		
		//Instanciation du label stat
		this.lblStat = new TLabel("STAT");
		this.lblStat.setFont(font);
		
		/* AJOUT AU PANEL */
		
			//Label "STAT"
		c.gridx = 0;
		c.gridy = 0;
		this.add(lblStat, c);
		
	}
	
	
	
	
	
	
}
