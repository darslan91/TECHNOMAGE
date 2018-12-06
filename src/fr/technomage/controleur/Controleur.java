package fr.technomage.controleur;

import javax.swing.JPanel;

import fr.technomage.vue.Vue;
import fr.technomage.vue.VueMenuPrincipal;

public class Controleur {

	public static void main(String[] args) {
		Vue vue = new Vue();
		VueMenuPrincipal panel = new VueMenuPrincipal(vue);
		vue.getContentPane().add(panel);
		vue.setVisible(true);
	}
}
