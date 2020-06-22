package fr.diginamic.off.entites;

/**
 * @author Leo
 * Catégorie d'un produit
 */
public class Categorie {
	private String libelle;

	/** Constructeur
	 * @param libelle Libellé
	 */
	public Categorie(String libelle) {
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
