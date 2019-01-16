package fr.technomage.objet.item;

public abstract class Item {
	protected String id;
	protected String nom;
	protected int valeur;
	protected String description;
	
	public Item(String id, String nom, int valeur, String description) {
		this.id = id;
		this.nom = nom;
		this.valeur = valeur;
		this.description = description;
	}
}
