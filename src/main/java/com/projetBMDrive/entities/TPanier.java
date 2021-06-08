package com.projetBMDrive.entities;
// Generated 8 juin 2021 � 13:57:09 by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TPanier generated by hbm2java
 */
@Entity
@Table(name = "T_PANIER", schema = "BMDRIVE")
public class TPanier implements java.io.Serializable {

	private BigDecimal panId;
	private TArticle TArticle;
	private TReservation TReservation;
	private Set<TVisiteur> TVisiteurs = new HashSet<TVisiteur>(0);
	private Set<TAdherent> TAdherents = new HashSet<TAdherent>(0);

	public TPanier() {
	}

	public TPanier(BigDecimal panId, TArticle TArticle, TReservation TReservation) {
		this.panId = panId;
		this.TArticle = TArticle;
		this.TReservation = TReservation;
	}

	public TPanier(BigDecimal panId, TArticle TArticle, TReservation TReservation, Set<TVisiteur> TVisiteurs,
			Set<TAdherent> TAdherents) {
		this.panId = panId;
		this.TArticle = TArticle;
		this.TReservation = TReservation;
		this.TVisiteurs = TVisiteurs;
		this.TAdherents = TAdherents;
	}

	@Id

	@Column(name = "PAN_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getPanId() {
		return this.panId;
	}

	public void setPanId(BigDecimal panId) {
		this.panId = panId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAN_ID_OBJET", nullable = false)
	public TArticle getTArticle() {
		return this.TArticle;
	}

	public void setTArticle(TArticle TArticle) {
		this.TArticle = TArticle;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAN_ID_RESERVATION", nullable = false)
	public TReservation getTReservation() {
		return this.TReservation;
	}

	public void setTReservation(TReservation TReservation) {
		this.TReservation = TReservation;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TPanier")
	public Set<TVisiteur> getTVisiteurs() {
		return this.TVisiteurs;
	}

	public void setTVisiteurs(Set<TVisiteur> TVisiteurs) {
		this.TVisiteurs = TVisiteurs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TPanier")
	public Set<TAdherent> getTAdherents() {
		return this.TAdherents;
	}

	public void setTAdherents(Set<TAdherent> TAdherents) {
		this.TAdherents = TAdherents;
	}

}
