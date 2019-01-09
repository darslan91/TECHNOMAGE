package fr.technomage.modele;

import java.io.File;

public class ModeleInit {

	public ModeleInit() {
		InitLesClasses();
	}

	private void InitLesClasses() {
		File dossier = new File("classe\\");
		File[] files = dossier.listFiles();
		for(File file : files) {
			
		}
	}

}
