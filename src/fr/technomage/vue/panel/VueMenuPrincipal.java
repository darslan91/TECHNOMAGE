package fr.technomage.vue.panel;

import java.awt.Color;
import java.awt.Graphics;

import fr.technomage.objet.swing.TPanel;
import fr.technomage.vue.Vue;
import fr.technomage.vue.VueS�lectionMenuPrincipal;

@SuppressWarnings("serial")
public class VueMenuPrincipal extends TPanel {

	private VueS�lectionMenuPrincipal vueS�lectionMenuPrincipal;

	public VueMenuPrincipal(Vue vue) {
		this.setLayout(null);
		
		this.vueS�lectionMenuPrincipal = new VueS�lectionMenuPrincipal(vue);
		
		this.vueS�lectionMenuPrincipal.setBounds((vue.getWidth()-400)/2, (vue.getHeight()-400)/2, 400, 400);
		
		this.add(this.vueS�lectionMenuPrincipal);
	}
}
