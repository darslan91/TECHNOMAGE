package fr.technomage.vue;

import java.awt.*;
import javax.swing.*;

public class VueKit extends JPanel{

	/* ATTRIBUTS PRIVEE */
	private JLabel lblKit;
	private JComboBox<String> lstKit;
	private Vue vue;
	
	
	/* CONSTRUCTEUR */
	public VueKit (Vue uneVue){
		
		//Gestion du GridBag Layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//Récupération de la vue
		this.vue = uneVue;
		
		//Police
		Font font = new Font("Calibri", Font.BOLD,20);
		
		//Instanciatio du label
		this.lblKit = new JLabel("KIT");
		this.lblKit.setFont(font);
		
		//Instanciation du JComboBox (Remplacer ce qu'il y a dans les paranthèses)
		this.lstKit = new JComboBox(/*Modele.getLesMois()*/);
		
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
