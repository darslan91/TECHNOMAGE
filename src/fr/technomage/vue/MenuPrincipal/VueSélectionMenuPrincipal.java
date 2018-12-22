package fr.technomage.vue.MenuPrincipal;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import fr.technomage.controleur.action.ActionMenuPrincipal;
import fr.technomage.objet.swing.TBouton;
import fr.technomage.objet.swing.TLabel;
import fr.technomage.objet.swing.TPanel;
import fr.technomage.vue.Vue;

@SuppressWarnings("serial")
public class VueSélectionMenuPrincipal extends TPanel {

	private TLabel jlTitre;
	
	private TBouton jbJouer;
	private TBouton jbNouveauJoueur;
	private TBouton jbQuitter;

	public VueSélectionMenuPrincipal(Vue vue) {
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(5,5,5,5);
		this.jlTitre = new TLabel("<html><body style='text-align: center'><h1>Tainted Crystal<br>Monster Rise</h1></body></html>");
		c.gridx = 0;
		c.gridy = 0;
		this.add(this.jlTitre, c);
		
		this.jbJouer = new TBouton("Jouer", 150, 35);
		this.jbJouer.addActionListener(new ActionMenuPrincipal(vue, "Jouer"));
		
		
		this.jbNouveauJoueur = new TBouton("Nouveau Joueur", 150, 35);
		this.jbNouveauJoueur.addActionListener(new ActionMenuPrincipal(vue, "NouveauJoueur"));
		
		this.jbQuitter = new TBouton("Quitter", 150, 35);
		this.jbQuitter.addActionListener(new ActionMenuPrincipal(vue, "Quitter"));
		
		c.gridy++;
		this.add(this.jbJouer, c);
		c.gridy++;
		this.add(this.jbNouveauJoueur, c);
		c.gridy++;
		this.add(this.jbQuitter, c);
	}

}
