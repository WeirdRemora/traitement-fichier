package fr.diginamic.off.entites;

public enum NutriScore {
	A("A"),
	B("B"),
	C("C"),
	D("D"),
	E("E"),
	F("F"),
	Inconnu("Inconnu");
	
	private String libelle;

	/** Constructeur
	 * @param libelle Libellé
	 */
	private NutriScore(String libelle) {
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
