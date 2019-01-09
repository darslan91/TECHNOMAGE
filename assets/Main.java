import objet.Classe;


public class Main {
	public static void main(String[] args) {
		Classe mage = new Classe("Mage", 4, 10, 4, 4, 6);
		Classe invocateur = new Classe("Invocateur", 6, 6, 4, 5, 7);
		Classe chasseur = new Classe("Chasseur", 8, 4, 6, 6, 4);
		Classe assassin = new Classe("Assassin", 6, 6, 8, 4, 4);
		Classe guerrier = new Classe("Guerrier", 8, 4, 4, 8, 4);
		Classe berserker = new Classe("Berserker", 10, 4, 5, 5, 4);
		Classe colosse = new Classe("Colosse", 6, 4, 6, 8, 4);
		Classe paladin = new Classe("Paladin", 6, 4, 5, 7, 6);
		
		Modele.céréale(mage, mage.getNom());
		Modele.céréale(invocateur, invocateur.getNom());
		Modele.céréale(chasseur, chasseur.getNom());
		Modele.céréale(assassin, assassin.getNom());
		Modele.céréale(guerrier, guerrier.getNom());
		Modele.céréale(berserker, berserker.getNom());
		Modele.céréale(colosse, colosse.getNom());
		Modele.céréale(paladin, paladin.getNom());
		
		
		
		
		//Classe laclasse = (Classe) Modele.getCéréale("Mage");
		//System.out.println(laclasse.getIntelligence());
	}
}
