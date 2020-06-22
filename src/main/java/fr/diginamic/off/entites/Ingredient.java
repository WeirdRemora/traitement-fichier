package fr.diginamic.off.entites;

/**
 * @author Leo
 * Ingr�dient constituant un produit
 */
public class Ingredient {
	private String libelle;

	/** Constructeur
	 * @param libelle Libell�
	 */
	public Ingredient(String libelle) {
		this.libelle = libelle;
	}

	/** Getter
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/** Setter
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
