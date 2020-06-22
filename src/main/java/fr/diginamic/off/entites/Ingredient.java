package fr.diginamic.off.entites;

/**
 * @author Leo
 * Ingrédient constituant un produit
 */
public class Ingredient {
	private String libelle;

	/** Constructeur
	 * @param libelle Libellé
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
