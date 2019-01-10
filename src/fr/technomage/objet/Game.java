package fr.technomage.objet;

import java.util.ArrayList;

import fr.technomage.objet.miscellaneous.Classe;

public class Game {
	
	private static ArrayList<Classe> lesClasses;

	public static ArrayList<Classe> getLesClasses() {
		return lesClasses;
	}

	public static void setLesClasses(ArrayList<Classe> lesClasses) {
		Game.lesClasses = lesClasses;
	}
	
	public static void addUneClasse(Classe classe) {
		lesClasses.add(classe);
	}
	
	public static Classe getUneClasseByIndex(int index) {
		return lesClasses.get(index);
	}
	
	public static String[] getLesNomsDesClasses() {
		String[] lesNoms = new String[lesClasses.size()];
		int i = 0;
		for(Classe classe : lesClasses) {
			lesNoms[i] = classe.getNom();
			i++;
		}
		return lesNoms;
	}
}
