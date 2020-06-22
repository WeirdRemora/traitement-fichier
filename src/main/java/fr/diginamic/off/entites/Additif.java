package fr.diginamic.off.entites;

/**
 * @author Leo
 * Additif dans un produit
 */
public class Additif {
	private String libelle;

	/** Constructeur
	 * @param libelle Libell�
	 */
	public Additif(String libelle) {
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
