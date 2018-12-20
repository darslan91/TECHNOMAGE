package fr.technomage.vue;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

import fr.technomage.objet.swing.TLabel;
import fr.technomage.objet.swing.TPanel;

public class VueNomPerso extends JPanel{

	/*ATTRIBUTS PRIVES */
	private TLabel lblArme;
	private TLabel lblClasse;
	private TLabel lblNom;
	private JTextField jtfNom;
	private Vue vue;
	private JComboBox<String> lstArmes;
	private JComboBox<String> lstClasses;
	
	
	/* CONSTRUCTEUR */
	public VueNomPerso (Vue vue){
		this.vue = vue;
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		this.lblArme = new TLabel("Arme");
		this.lblClasse = new TLabel("Classe");
		this.lblNom = new TLabel("Nom du personnage");
		
		this.lstArmes = new JComboBox<String>(/*Modele.getLesMois()*/);
		this.lstClasses = new JComboBox<String>(/*Modele.getLesMois()*/);
		
		this.jtfNom = new JTextField();
		
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
		
			//JComboBox lstArmes
		c.gridx++;
		this.add(lstClasses, c);
		
			
	}
	
	
	
	
	
	
	
}
