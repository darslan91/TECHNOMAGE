package fr.technomage.objet.item;


public class ArmeGenerique extends Item {
	private String typeArme;
	private int[] dégatsMin;
	private int[] dégatsMax;
	private String typeDégats;
	private int[] critiques;
	private int[] stats;

	public ArmeGenerique(String id, String nom, int valeur, String description, int[] dégatsMin, int[] dégatsMax, int[] critiques, int[] stats) {
		super(nom, id, valeur, description);
		this.dégatsMin = dégatsMin;
		this.dégatsMax = dégatsMax;
		this.critiques = critiques;
		this.stats = stats;
	}
}
