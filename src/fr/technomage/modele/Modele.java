package fr.technomage.modele;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;



public class Modele {

	public static final SAXReader saxReader = new SAXReader();

	public static Document getXMLDocument(String path) {
		Document xml = null;
		try {
			File fileXML = new File(path);
			xml = saxReader.read(fileXML);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return xml;
	}
}
