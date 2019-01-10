package fr.technomage.vue.NouveauJoueur;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import fr.technomage.objet.swing.TComboBox;
import fr.technomage.objet.swing.TLabel;
import fr.technomage.objet.swing.TPanel;
import fr.technomage.vue.Vue;


@SuppressWarnings("serial")
public class VueKit extends TPanel{

	/* ATTRIBUTS PRIVEE */
	private TLabel lblKit;
	private TComboBox lstKit;
	
	
	/* CONSTRUCTEUR */
	public VueKit (Vue uneVue, VueNouveauJoueur vueNouveauJoueur){
		super(true);
		
		//Gestion du GridBag Layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//Police
		Font font = new Font("Calibri", Font.BOLD, 20);
		
		//Instanciatio du label
		this.lblKit = new TLabel("KIT");
		this.lblKit.setFont(font);
		
		//Instanciation du JComboBox (Remplacer ce qu'il y a dans les paranthèses)
		this.lstKit = new TComboBox();
		
		/* AJOUT DANS LE PANEL */
		
			//Le message "KIT"
		c.gridx = 0;
		c.gridy = 0;
		this.add(lblKit, c);
		
			//La liste des kit
		c.gridx = 0;
		c.gridy = 1;
		this.add(lstKit, c);
		
		
		
	
		
	}
	
	
	
	
	
	
	
	
	
}
