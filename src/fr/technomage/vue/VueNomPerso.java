package fr.technomage.vue;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

import fr.technomage.objet.swing.Panel;

public class VueNomPerso extends Panel{

	/*ATTRIBUTS PRIVES */
	private JLabel lblArme;
	private JLabel lblClasse;
	private JLabel lblNom;
	private JTextField jtfNom;
	private Vue vue;
	private JComboBox<String> lstArmes;
	private JComboBox<String> lstClasses;
	
	
	/* CONSTRUCTEUR */
	public VueNomPerso (Vue vue){
		this.vue = vue;
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		this.lblArme = new JLabel("Arme");
		this.lblClasse = new JLabel("Classe");
		this.lblNom = new JLabel("Nom du personnage");
		
		this.lstArmes = new JComboBox(/*Modele.getLesMois()*/);
		this.lstClasses = new JComboBox(/*Modele.getLesMois()*/);
		
		this.jtfNom = new JTextField();
		
		/* AJOUT AU PANEL */
		
			//Le nom
		c.gridx = 0;
		c.gridy = 0;
		this.add(lblNom, c);
		
			//Le jtfNom
		c.gridx = 0;
		c.gridy = 1;
		this.add(jtfNom, c);
		
			//text Les armes
		c.gridx = 1;
		c.gridy = 1;
		this.add(lblArme, c);
		
			//text Les Classes
		c.gridx = 1;
		c.gridy = 2;
		this.add(lblClasse, c);
		
			//JComboBox lstArmes
		c.gridx = 2;
		c.gridy = 1;
		this.add(lstArmes, c);
		
			//JComboBox lstArmes
		c.gridx = 2;
		c.gridy = 2;
		this.add(lstClasses, c);
		
			
	}
	
	
	
	
	
	
	
}
