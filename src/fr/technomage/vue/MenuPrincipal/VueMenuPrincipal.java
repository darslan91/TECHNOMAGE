package fr.technomage.vue.MenuPrincipal;

import fr.technomage.objet.swing.TPanel;
import fr.technomage.vue.Vue;

@SuppressWarnings("serial")
public class VueMenuPrincipal extends TPanel {

	private VueSélectionMenuPrincipal vueSélectionMenuPrincipal;

	public VueMenuPrincipal(Vue vue) {
		super(false);
		
		this.setLayout(null);
		
		this.vueSélectionMenuPrincipal = new VueSélectionMenuPrincipal(vue);
		this.vueSélectionMenuPrincipal.setBounds(600, 250, 400, 400);
		
		this.add(this.vueSélectionMenuPrincipal);
	}
}
