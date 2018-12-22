package fr.technomage.vue.NouveauJoueur;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import fr.technomage.objet.swing.TLabel;
import fr.technomage.objet.swing.TPanel;
import fr.technomage.vue.Vue;



@SuppressWarnings("serial")
public class VueAvatar extends TPanel{

	/* ATTRIBUTS PRIVES */
	private TLabel lbAvatar;
	
	
	/* CONSTRUCTEUR */
	public VueAvatar(Vue uneVue){
		
		//Gestion du GridBag Layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//Déclaration et Instanciation d'un Label
		Font font = new Font("Calibri", Font.BOLD,20);
		
		//Instanciation du label stat
		this.lbAvatar = new TLabel("AVATAR");
		this.lbAvatar.setFont(font);
		
		/* AJOUT AU PANEL */
		
			//Label "STAT"
		c.gridx = 0;
		c.gridy = 0;
		this.add(lbAvatar, c);
		
	}
	
	
	
	
	
	
}
