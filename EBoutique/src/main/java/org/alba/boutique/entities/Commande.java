package org.alba.boutique.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCommande;
	private Date dateCommande;
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	@OneToMany
	@JoinColumn(name="idCommande")
	private Collection<LigneCommande> ligneCommandes;

	public Commande(Long idCommande, Date dateCommande, Client client,
			Collection<LigneCommande> ligneCommandes) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
		this.client = client;
		this.ligneCommandes = ligneCommandes;
	}


	public Long getIdCommande() {
		return idCommande;
	}


	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}


	public Date getDateCommande() {
		return dateCommande;
	}


	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Collection<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}


	public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}


	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
