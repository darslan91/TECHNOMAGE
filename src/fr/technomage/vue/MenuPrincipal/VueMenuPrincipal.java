package fr.technomage.vue.MenuPrincipal;

import fr.technomage.objet.swing.TPanel;
import fr.technomage.vue.Vue;

@SuppressWarnings("serial")
public class VueMenuPrincipal extends TPanel {

	private VueS�lectionMenuPrincipal vueS�lectionMenuPrincipal;

	public VueMenuPrincipal(Vue vue) {
		this.setLayout(null);
		
		this.vueS�lectionMenuPrincipal = new VueS�lectionMenuPrincipal(vue);
		
		this.vueS�lectionMenuPrincipal.setBounds(600, 250, 400, 400);
		
		this.add(this.vueS�lectionMenuPrincipal);
	}
}
