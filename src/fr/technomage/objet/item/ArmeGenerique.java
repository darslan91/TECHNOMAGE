package fr.technomage.objet.item;


public class ArmeGenerique extends Item {
	private String typeArme;
	private int[] d�gatsMin;
	private int[] d�gatsMax;
	private String typeD�gats;
	private int[] critiques;
	private int[] stats;

	public ArmeGenerique(String id, String nom, int valeur, String description, int[] d�gatsMin, int[] d�gatsMax, int[] critiques, int[] stats) {
		super(nom, id, valeur, description);
		this.d�gatsMin = d�gatsMin;
		this.d�gatsMax = d�gatsMax;
		this.critiques = critiques;
		this.stats = stats;
	}
}
