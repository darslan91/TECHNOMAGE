package fr.technomage.objet.item;

public class Arme extends Item {
	
	private int[] dégats;
	private int critique;
	private int force;
	private int intelligence;
	private int agilité;
	private int constitution;
	private int esprit;
	
	private ArmeGenerique sonArmeGénérique;

	public Arme(String nom, String id, int valeur, String description) {
		super(nom, id, valeur, description);
	}

	
}
