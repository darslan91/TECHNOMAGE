package fr.technomage.vue.panel;

import java.awt.Color;
import java.awt.Graphics;

import fr.technomage.objet.swing.Panel;
import fr.technomage.vue.Vue;
import fr.technomage.vue.VueSélectionMenuPrincipal;

@SuppressWarnings("serial")
public class VueMenuPrincipal extends Panel {

	private VueSélectionMenuPrincipal vueSélectionMenuPrincipal;

	public VueMenuPrincipal(Vue vue) {
		this.setLayout(null);
		
		this.vueSélectionMenuPrincipal = new VueSélectionMenuPrincipal(vue);
		
		this.vueSélectionMenuPrincipal.setBounds((vue.getWidth()-400)/2, (vue.getHeight()-400)/2, 400, 400);
		
		this.add(this.vueSélectionMenuPrincipal);
	}
}
