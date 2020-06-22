package fr.diginamic.off.entites;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leo
 * Stock de produits
 */
public class Stock {
	private List<Produit> listeProduits = new ArrayList<Produit>();

	/** Constructeur
	 * @param listeProduits ArrayList de produits
	 */
	public Stock(List<Produit> listeProduits) {
		this.listeProduits = listeProduits;
	}

	/** Getter
	 * @return the listeProduits
	 */
	public List<Produit> getListeProduits() {
		return listeProduits;
	}

	/** Setter
	 * @param listeProduits the listeProduits to set
	 */
	public void setListeProduits(List<Produit> listeProduits) {
		this.listeProduits = listeProduits;
	}
	
}
