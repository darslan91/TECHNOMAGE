package fr.technomage.objet;

import java.util.ArrayList;

public class Game {
	
	private ArrayList<Classe> lesClasses;
	
	public Game() {
		this.setLesClasses(new ArrayList<Classe>());
	}

	public ArrayList<Classe> getLesClasses() {
		return lesClasses;
	}

	public void setLesClasses(ArrayList<Classe> lesClasses) {
		this.lesClasses = lesClasses;
	}
}
