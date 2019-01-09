package fr.technomage.controleur;

import fr.technomage.modele.ModeleInit;
import fr.technomage.vue.Vue;
import fr.technomage.vue.MenuPrincipal.VueMenuPrincipal;

public class Controleur {

	public static void main(String[] args) {
		Vue vue = new Vue();
		VueMenuPrincipal panel = new VueMenuPrincipal(vue);
		vue.getContentPane().add(panel);
		vue.setVisible(true);
		new ModeleInit();
	}
}
