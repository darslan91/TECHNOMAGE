package fr.technomage.controleur.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fr.technomage.vue.Vue;
import fr.technomage.vue.MenuPrincipal.VueMenuPrincipal;
import fr.technomage.vue.NouveauJoueur.VueNouveauJoueur;

public class ActionNouveauJoueur implements ActionListener {

	private Vue vue;
	private VueNouveauJoueur vueNouveauJoueur;

	public ActionNouveauJoueur(Vue vue, VueNouveauJoueur vueNouveauJoueur) {
		this.vue = vue;
		this.vueNouveauJoueur = vueNouveauJoueur;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == vueNouveauJoueur.getTbRetour()) {
			this.vue.getContentPane().removeAll();
			this.vue.getContentPane().add(new VueMenuPrincipal(vue)).revalidate();
		}
		else if(event.getSource() == vueNouveauJoueur.getVueNomPerso().getTcbClasses()) {
			int index = vueNouveauJoueur.getVueNomPerso().getTcbClasses().getSelectedIndex();
			this.vueNouveauJoueur.getVueStat().updateStat(index);
		}
	}

}
