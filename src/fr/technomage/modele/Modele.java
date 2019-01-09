package fr.technomage.modele;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Modele {
	public static Object getSerializedObject(String path) {
		Object obj = null;
		try {
			FileInputStream fichier = new FileInputStream(path); 
			ObjectInputStream s = new ObjectInputStream(fichier); 
			obj  = s.readObject();
		}  
		catch (IOException e) { 
			System.out.println(e);
		}
		catch (ClassNotFoundException e) { 
			System.out.println("Fichier non trouv�");
		}
		return obj;
	}
}
