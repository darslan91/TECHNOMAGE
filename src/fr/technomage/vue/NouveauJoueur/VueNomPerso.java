package fr.technomage.vue.NouveauJoueur;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import fr.technomage.controleur.action.ActionNouveauJoueur;
import fr.technomage.objet.swing.TComboBox;
import fr.technomage.objet.swing.TLabel;
import fr.technomage.objet.swing.TPanel;
import fr.technomage.objet.swing.TTextField;
import fr.technomage.vue.Vue;

@SuppressWarnings("serial")
public class VueNomPerso extends TPanel{

	/*ATTRIBUTS PRIVES */
	private TLabel lblArme;
	private TLabel lblClasse;
	private TLabel lblNom;
	private TTextField jtfNom;
	private TComboBox lstArmes;
	private TComboBox tcbClasses;

	/* CONSTRUCTEUR */
	public VueNomPerso (Vue vue, VueNouveauJoueur vueNouveauJoueur){
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		this.lblArme = new TLabel("Arme :");
		this.lblClasse = new TLabel("Classe :");
		this.lblNom = new TLabel("Nom du personnage");
		
		String[] typeArmes = {"Épée & Bouclier", "Lance", "Arme test"};
		this.lstArmes = new TComboBox(typeArmes);
		String[] classes = {"Mage", "Guerrier", "ect"};
		this.tcbClasses = new TComboBox(classes);
		this.tcbClasses.addActionListener(new ActionNouveauJoueur(vue, vueNouveauJoueur));
		
		this.jtfNom = new TTextField();
		
		/* AJOUT AU PANEL */
		
			//Le nom
		c.insets = new Insets(5, 5, 5, 5);
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 4;
		this.add(lblNom, c);
			//Le jtfNom
		c.gridy++;
		c.fill = GridBagConstraints.BOTH;
		this.add(jtfNom, c);
		
			//text Les armes
		c.gridy++;
		c.gridx = 0;
		c.gridwidth = 1;
		this.add(lblArme, c);
		
			//JComboBox lstArmes
		c.gridx++;
		this.add(lstArmes, c);
		
			//text Les Classes
		c.gridx++;
		this.add(lblClasse, c);
		
			//JComboBox lssClasses
		c.gridx++;
		this.add(tcbClasses, c);
		
			
	}
	
	//Accesseur
	
	public TTextField getJtfNom() {
		return jtfNom;
	}


	public TComboBox getLstArmes() {
		return lstArmes;
	}


	public TComboBox getTcbClasses() {
		return tcbClasses;
	}
	
	
	
	
	
	
	
}
