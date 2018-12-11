package fr.technomage.vue;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.technomage.controleur.action.ActionMenuPrincipal;
import fr.technomage.objet.swing.Bouton;

@SuppressWarnings("serial")
public class VueSélectionMenuPrincipal extends JPanel {

	private JLabel jlTitre;
	private Bouton jbJouer;
	private Bouton jbNouveauJoueur;

	public VueSélectionMenuPrincipal(Vue vue) {
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
