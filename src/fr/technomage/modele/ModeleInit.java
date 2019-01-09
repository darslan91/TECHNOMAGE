package fr.technomage.modele;

import java.io.File;

import fr.technomage.objet.Classe;

public class ModeleInit {

	public ModeleInit() {
		initLesClasses();
	}

	private void initLesClasses() {
		String path = "assets\\classe\\";
		File dossier = new File(path);
		String[] files = dossier.list();
		for(String file : files) {
			if(file.matches(".*[.]obj$")){
				Classe classe = (Classe) Modele.getSerializedObject(path + file);
			}
		}
	}

}
