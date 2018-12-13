package fr.technomage.vue;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import fr.technomage.controleur.action.ActionMenuPrincipal;
import fr.technomage.objet.swing.Bouton;
import fr.technomage.objet.swing.Panel;

@SuppressWarnings("serial")
public class VueS�lectionMenuPrincipal extends Panel {

	private JLabel jlTitre;
	private Bouton jbJouer;
	private Bouton jbNouveauJoueur;

	public VueS�lectionMenuPrincipal(Vue vue) {
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(5,5,5,5);
		this.jlTitre = new JLabel("<html><body style='text-align: center'><h1>Tainted Crystal<br>Monster Rise</h1></body></html>");
		this.jlTitre.setForeground(Color.lightGray);
		c.gridx = 0;
		c.gridy = 0;
		this.add(this.jlTitre, c);
		
		this.jbJouer = new Bouton("Jouer", 150, 35);
		this.jbJouer.addActionListener(new ActionMenuPrincipal(vue, "Jouer"));
		
		c.gridy++;
		this.add(this.jbJouer, c);
		
		this.jbNouveauJoueur = new Bouton("Nouveau Joueur", 150, 35);
		this.jbNouveauJoueur.addActionListener(new ActionMenuPrincipal(vue, "NouveauJoueur"));
		
		c.gridy++;
		this.add(this.jbNouveauJoueur, c);
	}

}
