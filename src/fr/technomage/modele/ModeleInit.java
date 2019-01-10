package fr.technomage.modele;

import java.io.File;
import java.util.ArrayList;

import fr.technomage.objet.Game;
import fr.technomage.objet.miscellaneous.Classe;

public class ModeleInit {

	public ModeleInit() {
		initLesClasses();
	}

	private void initLesClasses() {
		Game.setLesClasses(new ArrayList<Classe>());
		String path = "assets\\classe\\";
		File dossier = new File(path);
		String[] files = dossier.list();
		for(String file : files) {
			if(file.matches(".*[.]obj$")){
				Classe classe = (Classe) Modele.getSerializedObject(path + file);
				Game.addUneClasse(classe);
			}
		}
	}

}
