package fr.diginamic.off.entites;

/**
 * @author Leo
 * Allergène présent dans un produit
 */
public class Allergene {
	private String libelle;

	/** Constructeur
	 * @param libelle Libellé
	 */
	public Allergene(String libelle) {
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
