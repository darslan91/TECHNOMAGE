package fr.technomage.vue.Jouer;

import fr.technomage.objet.swing.TLabel;
import fr.technomage.objet.swing.TPanel;

@SuppressWarnings("serial")
public class VueJouer extends TPanel {

	public VueJouer() {
		super(false);
		this.add(new TLabel("JEUX"));
	}
	
}
