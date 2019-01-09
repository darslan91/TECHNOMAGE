package fr.technomage.controleur;

import fr.technomage.modele.ModeleSerialize;
import fr.technomage.objet.Classe;




public class MainSerialize {
	public static void main(String[] args) {
		Classe mage = new Classe("Mage", 4, 10, 4, 4, 6);
		Classe invocateur = new Classe("Invocateur", 6, 6, 4, 5, 7);
		Classe chasseur = new Classe("Chasseur", 8, 4, 6, 6, 4);
		Classe assassin = new Classe("Assassin", 6, 6, 8, 4, 4);
		Classe guerrier = new Classe("Guerrier", 8, 4, 4, 8, 4);
		Classe berserker = new Classe("Berserker", 10, 4, 5, 5, 4);
		Classe colosse = new Classe("Colosse", 6, 4, 6, 8, 4);
		Classe paladin = new Classe("Paladin", 6, 4, 5, 7, 6);
		
		ModeleSerialize.céréale(mage, mage.getNom());
		ModeleSerialize.céréale(invocateur, invocateur.getNom());
		ModeleSerialize.céréale(chasseur, chasseur.getNom());
		ModeleSerialize.céréale(assassin, assassin.getNom());
		ModeleSerialize.céréale(guerrier, guerrier.getNom());
		ModeleSerialize.céréale(berserker, berserker.getNom());
		ModeleSerialize.céréale(colosse, colosse.getNom());
		ModeleSerialize.céréale(paladin, paladin.getNom());
		
		//Classe laclasse = (Classe) Modele.getCéréale("Mage");
		//System.out.println(laclasse.getIntelligence());
	}
}
