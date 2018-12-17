package fr.technomage.vue;

import java.awt.*;
import javax.swing.*;

public class VueStat extends Panel{

	/* ATTRIBUTS PRIVES */
	private Vue vue;
	private JLabel lblStat;
	
	
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
		this.lblStat = new JLabel("STAT");
		this.lblStat.setFont(font);
		
		/* AJOUT AU PANEL */
		
			//Label "STAT"
		c.gridx = 0;
		c.gridy = 0;
		this.add(lblStat, c);
		
	}
	
	
	
	
	
	
}
