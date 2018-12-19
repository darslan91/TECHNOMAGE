package fr.technomage.vue;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;

import fr.technomage.objet.swing.Label;
import fr.technomage.objet.swing.TPanel;


@SuppressWarnings("serial")
public class VueKit extends TPanel{

	/* ATTRIBUTS PRIVEE */
	private Label lblKit;
	private JComboBox<String> lstKit;
	private Vue vue;
	
	
	/* CONSTRUCTEUR */
	public VueKit (Vue uneVue){
		
		//Gestion du GridBag Layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//R�cup�ration de la vue
		this.vue = uneVue;
		
		//Police
		Font font = new Font("Calibri", Font.BOLD, 20);
		
		//Instanciatio du label
		this.lblKit = new Label("KIT");
		this.lblKit.setFont(font);
		
		//Instanciation du JComboBox (Remplacer ce qu'il y a dans les paranth�ses)
		this.lstKit = new JComboBox<String>();
		
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
