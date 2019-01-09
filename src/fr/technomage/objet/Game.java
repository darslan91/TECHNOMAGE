package fr.technomage.objet;

import java.util.ArrayList;

public class Game {
	
	private static ArrayList<Classe> lesClasses;

	public static ArrayList<Classe> getLesClasses() {
		return lesClasses;
	}

	public static void setLesClasses(ArrayList<Classe> lesClasses) {
		Game.lesClasses = lesClasses;
	}
	
	public static void addUneClasse(Classe classe) {
		Game.lesClasses.add(classe);
	}
	
	public static Classe getUneClasseByIndex(int index) {
		return Game.lesClasses.get(index);
	}
}
