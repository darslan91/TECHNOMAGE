package fr.technomage.controleur.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fr.technomage.vue.Vue;
import fr.technomage.vue.panel.PanelCreerPerso;
import fr.technomage.vue.panel.PanelJouer;


public class ActionMenuPrincipal implements ActionListener {

	private Vue vue;
	private String code;

	public ActionMenuPrincipal(Vue vue, String code) {
		this.vue = vue;
		this.code = code;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		switch(this.code) {
		case "Jouer":
			this.vue.getContentPane().removeAll();
			this.vue.getContentPane().add(new PanelJouer()).revalidate();
			break;
		case "NouveauJoueur":
			this.vue.getContentPane().removeAll();
			this.vue.getContentPane().add(new PanelCreerPerso(vue)).revalidate();
			break;
		}
		
	}

}
