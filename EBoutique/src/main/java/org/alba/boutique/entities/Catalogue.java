package org.alba.boutique.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Id;

public class Catalogue implements Serializable {
	
	@Id
	private Long idCategorie;
	
	private String nomCategorie; private String description;
	private String nomPhoto;
	
	private byte[] photo;
	
	private Collection<Produit> produits=new ArrayList<Produit>();

	public Catalogue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Catalogue(Long idCategorie, String nomCategorie, String description,
			String nomPhoto, byte[] photo, Collection<Produit> produits) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.description = description;
		this.nomPhoto = nomPhoto;
		this.photo = photo;
		this.produits = produits;
	}

	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNomPhoto() {
		return nomPhoto;
	}

	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public Collection<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}

}
