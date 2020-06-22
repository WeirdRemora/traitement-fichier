package fr.diginamic.off.entites;

/**
 * @author Leo
 * Marque d'un produit
 */
public class Marque {
	private String nom;

	/** Constructeur
	 * @param nom
	 */
	public Marque(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
