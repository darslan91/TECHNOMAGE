package fr.technomage.modele;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.Element;



public class ModeleInit {
	
	public ModeleInit() {
		initLesClasses();
	}
	
	public void initLesClasses() {
		String path = "assets\\classe\\";
		File dossier = new File(path);
		String[] files = dossier.list();
		for(String file : files) {
			if(file.matches(".*[.]xml$")){
				Document xml = Modele.getXMLDocument(path + file);
				Element classe = xml.getRootElement();
				int force = Integer.parseInt(classe.element("Force").getText());
			}
			
		
		}
	}
}
