package fr.technomage.objet.item;

public class Arme extends Item {
	
	private int[] d�gats;
	private int critique;
	private int force;
	private int intelligence;
	private int agilit�;
	private int constitution;
	private int esprit;
	
	private ArmeGenerique sonArmeG�n�rique;

	public Arme(String nom, String id, int valeur, String description) {
		super(nom, id, valeur, description);
	}

	
}
