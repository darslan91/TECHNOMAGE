import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URISyntaxException;
import java.net.URLDecoder;


public class Modele {
	public static Object getCéréale(String filename) {
		Object obj = null;
		try { 
			FileInputStream fichier = new FileInputStream("objet/" + filename + ".obj"); 
			ObjectInputStream s = new ObjectInputStream(fichier); 
			obj  = s.readObject();
		}  
		catch (IOException e) { 
			System.out.println(e);
		}
		catch (ClassNotFoundException e) { 
			System.out.println("Fichier non trouvé");
		}
		return obj;
	}
	
	public static void céréale(Object obj, String filename) {
		try {
			String jarPath = URLDecoder.decode(new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent(), "UTF-8");
			String dossPath = jarPath + "\\objet";
	        File dir = new File(dossPath);
	        dir.mkdirs();
	        
			FileOutputStream fichier = new FileOutputStream("objet/" + filename + ".obj"); 
			ObjectOutputStream s = new ObjectOutputStream(fichier); 
			s.writeObject(obj);
			s.flush(); 
			s.close();
		} catch (IOException e) { 
			System.out.println("Problème IO" + e);
		} catch (URISyntaxException e) {
			System.out.println("hum, un truc la syntaxe URI ? '^'");
		} 
	}
	
	
}
