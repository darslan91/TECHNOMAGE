package fr.technomage.vue;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.technomage.controleur.action.ActionMenuPrincipal;

@SuppressWarnings("serial")
public class VueMenuPrincipal extends JPanel{

	private JLabel jlTitre;
	private JButton jbJouer;
	private JButton jbNouveauJoueur;

	public VueMenuPrincipal(Vue vue) {
		
		this.setBackground(new Color(40, 40, 40));
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(5,5,5,5);
		this.jlTitre = new JLabel("<html><body style='text-align: center'>Tainted Crystal<br>Monster Rise</body></html>");
		this.jlTitre.setForeground(Color.lightGray);
		c.gridx = 0;
		c.gridy = 0;
		this.add(this.jlTitre, c);
		
		this.jbJouer = new JButton("Jouer");
		this.jbJouer.setOpaque(true);
		this.jbJouer.setContentAreaFilled(false);
		this.jbJouer.setFocusable(false);
		this.jbJouer.addActionListener(new ActionMenuPrincipal(vue, "Jouer"));
		this.jbJouer.setForeground(Color.lightGray);
		c.gridy++;
		this.add(this.jbJouer, c);
		
		this.jbNouveauJoueur = new JButton("Nouveau Joueur");
		this.jbNouveauJoueur.setOpaque(true);
		this.jbNouveauJoueur.setContentAreaFilled(false);
		this.jbNouveauJoueur.setFocusable(false);
		this.jbNouveauJoueur.addActionListener(new ActionMenuPrincipal(vue, "NouveauJoueur"));
		this.jbNouveauJoueur.setForeground(Color.lightGray);
		c.gridy++;
		this.add(this.jbNouveauJoueur, c);
	}

}
