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
		
		ModeleSerialize.c�r�ale(mage, mage.getNom());
		ModeleSerialize.c�r�ale(invocateur, invocateur.getNom());
		ModeleSerialize.c�r�ale(chasseur, chasseur.getNom());
		ModeleSerialize.c�r�ale(assassin, assassin.getNom());
		ModeleSerialize.c�r�ale(guerrier, guerrier.getNom());
		ModeleSerialize.c�r�ale(berserker, berserker.getNom());
		ModeleSerialize.c�r�ale(colosse, colosse.getNom());
		ModeleSerialize.c�r�ale(paladin, paladin.getNom());
		
		//Classe laclasse = (Classe) Modele.getC�r�ale("Mage");
		//System.out.println(laclasse.getIntelligence());
	}
}
