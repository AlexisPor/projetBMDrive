package com.projetBMDrive.entities;
// Generated 17 juin 2021 � 10:20:52 by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BmdArticle generated by hbm2java
 */
@Entity
@Table(name = "BMD_ARTICLE", schema = "BMDRIVE")
public class BmdArticle implements java.io.Serializable {

	private BigDecimal artId;
	private String artCote;
	private String artTitre;
	private String artAuteur;
	private Date artDateEmprunt;
	private Date artDateRetour;
	private Set<BmdLivre> bmdLivres = new HashSet<BmdLivre>(0);
	private Set<BmdPanier> bmdPaniers = new HashSet<BmdPanier>(0);
	private Set<BmdCategorie> bmdCategories = new HashSet<BmdCategorie>(0);
	private Set<BmdSupportmedia> bmdSupportmedias = new HashSet<BmdSupportmedia>(0);

	public BmdArticle() {
	}

	public BmdArticle(BigDecimal artId, String artTitre, String artAuteur) {
		this.artId = artId;
		this.artTitre = artTitre;
		this.artAuteur = artAuteur;
	}

	public BmdArticle(BigDecimal artId, String artCote, String artTitre, String artAuteur, Date artDateEmprunt,
			Date artDateRetour, Set<BmdLivre> bmdLivres, Set<BmdPanier> bmdPaniers, Set<BmdCategorie> bmdCategories,
			Set<BmdSupportmedia> bmdSupportmedias) {
		this.artId = artId;
		this.artCote = artCote;
		this.artTitre = artTitre;
		this.artAuteur = artAuteur;
		this.artDateEmprunt = artDateEmprunt;
		this.artDateRetour = artDateRetour;
		this.bmdLivres = bmdLivres;
		this.bmdPaniers = bmdPaniers;
		this.bmdCategories = bmdCategories;
		this.bmdSupportmedias = bmdSupportmedias;
	}

	@Id

	@Column(name = "ART_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getArtId() {
		return this.artId;
	}

	public void setArtId(BigDecimal artId) {
		this.artId = artId;
	}

	@Column(name = "ART_COTE", length = 20)
	public String getArtCote() {
		return this.artCote;
	}

	public void setArtCote(String artCote) {
		this.artCote = artCote;
	}

	@Column(name = "ART_TITRE", nullable = false, length = 40)
	public String getArtTitre() {
		return this.artTitre;
	}

	public void setArtTitre(String artTitre) {
		this.artTitre = artTitre;
	}

	@Column(name = "ART_AUTEUR", nullable = false, length = 40)
	public String getArtAuteur() {
		return this.artAuteur;
	}

	public void setArtAuteur(String artAuteur) {
		this.artAuteur = artAuteur;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ART_DATE_EMPRUNT", length = 7)
	public Date getArtDateEmprunt() {
		return this.artDateEmprunt;
	}

	public void setArtDateEmprunt(Date artDateEmprunt) {
		this.artDateEmprunt = artDateEmprunt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ART_DATE_RETOUR", length = 7)
	public Date getArtDateRetour() {
		return this.artDateRetour;
	}

	public void setArtDateRetour(Date artDateRetour) {
		this.artDateRetour = artDateRetour;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bmdArticle")
	public Set<BmdLivre> getBmdLivres() {
		return this.bmdLivres;
	}

	public void setBmdLivres(Set<BmdLivre> bmdLivres) {
		this.bmdLivres = bmdLivres;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bmdArticle")
	public Set<BmdPanier> getBmdPaniers() {
		return this.bmdPaniers;
	}

	public void setBmdPaniers(Set<BmdPanier> bmdPaniers) {
		this.bmdPaniers = bmdPaniers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bmdArticle")
	public Set<BmdCategorie> getBmdCategories() {
		return this.bmdCategories;
	}

	public void setBmdCategories(Set<BmdCategorie> bmdCategories) {
		this.bmdCategories = bmdCategories;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bmdArticle")
	public Set<BmdSupportmedia> getBmdSupportmedias() {
		return this.bmdSupportmedias;
	}

	public void setBmdSupportmedias(Set<BmdSupportmedia> bmdSupportmedias) {
		this.bmdSupportmedias = bmdSupportmedias;
	}

}
