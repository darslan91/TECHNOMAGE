package fr.technomage.modele;

import java.io.File;
import java.util.ArrayList;

import fr.technomage.objet.Classe;
import fr.technomage.objet.Game;

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
			System.out.println(file);
			if(file.matches(".*[.]obj$")){
				Classe classe = (Classe) Modele.getSerializedObject(path + file);
				System.out.println(classe.getNom());
				Game.addUneClasse(classe);
			}
		}
	}

}
