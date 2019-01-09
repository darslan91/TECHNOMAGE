package objet;


import java.io.Serializable;

public class Classe implements Serializable{
	
	private static final long serialVersionUID = -6750257853944725032L;
	
	private String nom;
	private int force;
	private int intelligence;
	private int agilité;
	private int constitution;
	private int esprit;
	
	public Classe(String nom, int force, int intelligence, int agilité, int constitution, int esprit) {
		this.nom = nom;
		this.force = force;
		this.intelligence = intelligence;
		this.agilité = agilité;
		this.constitution = constitution;
		this.esprit = esprit;
		
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public int getAgilité() {
		return agilité;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getEsprit() {
		return esprit;
	}

	public int getConstitution() {
		return constitution;
	}
}
