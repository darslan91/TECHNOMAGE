package fr.technomage.controleur.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fr.technomage.vue.Vue;
import fr.technomage.vue.NouveauJoueur.VueNouveauJoueur;
import fr.technomage.vue.NouveauJoueur.VueStat;

public class ActionNouveauJoueur implements ActionListener {

	private Vue vue;
	private VueNouveauJoueur vueNouveauJoueur;

	public ActionNouveauJoueur(Vue vue, VueNouveauJoueur vueNouveauJoueur) {
		this.vue = vue;
		this.vueNouveauJoueur = vueNouveauJoueur;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == vueNouveauJoueur.getVueNomPerso().getTcbClasses()) {
			vueNouveauJoueur.getVueNomPerso().getTcbClasses().getSelectedIndex();
		}
	}

}
