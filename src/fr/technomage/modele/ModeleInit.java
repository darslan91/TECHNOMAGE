package fr.technomage.modele;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Node;

import fr.technomage.objet.Game;
import fr.technomage.objet.miscellaneous.Classe;

public class ModeleInit {

	public ModeleInit() {
		initLesClasses();
	}

	private void initLesClasses() {
		Game.setLesClasses(new ArrayList<Classe>());
		String path = "assets\\character\\class\\";
		File dossier = new File(path);
		String[] files = dossier.list();
		int force, intelligence, agilité, constitution, esprit;
		for(String file : files) {
			if(file.matches(".*[.]tcmr$")){
				Document xml = ModeleCrypt.readDocument(ModeleCrypt.decrypt(new File(path + file)));
				List<Node> nodes = xml.getRootElement().selectNodes("/Classe/*");
					 force = Integer.parseInt(nodes.get(0).getText()); 
					 intelligence = Integer.parseInt(nodes.get(1).getText()); 
					 agilité = Integer.parseInt(nodes.get(2).getText());
					 constitution = Integer.parseInt(nodes.get(3).getText());
					 esprit = Integer.parseInt(nodes.get(4).getText());
				Game.addUneClasse(new Classe(file.substring(0, file.length()-5), force, intelligence, agilité, constitution, esprit));
			}
		}
	}
}
