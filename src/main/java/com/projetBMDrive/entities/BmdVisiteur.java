package com.projetBMDrive.entities;
// Generated 17 juin 2021 � 10:20:52 by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * BmdVisiteur generated by hbm2java
 */
@Entity
@Table(name = "BMD_VISITEUR", schema = "BMDRIVE")
public class BmdVisiteur implements java.io.Serializable {

	private BigDecimal visId;
	private BmdIdentite bmdIdentite;
	private BmdPanier bmdPanier;

	public BmdVisiteur() {
	}

	public BmdVisiteur(BigDecimal visId) {
		this.visId = visId;
	}

	public BmdVisiteur(BigDecimal visId, BmdIdentite bmdIdentite, BmdPanier bmdPanier) {
		this.visId = visId;
		this.bmdIdentite = bmdIdentite;
		this.bmdPanier = bmdPanier;
	}

	@Id
	@SequenceGenerator(name="BMD_VISITEUR_SEQ", sequenceName = "BMD_VISITEUR_SEQ", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BMD_VISITEUR_SEQ")
	@Column(name = "VIS_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getVisId() {
		return this.visId;
	}

	public void setVisId(BigDecimal visId) {
		this.visId = visId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIS_ID_IDENTITE")
	public BmdIdentite getBmdIdentite() {
		return this.bmdIdentite;
	}

	public void setBmdIdentite(BmdIdentite bmdIdentite) {
		this.bmdIdentite = bmdIdentite;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIS_ID_PANIER")
	public BmdPanier getBmdPanier() {
		return this.bmdPanier;
	}

	public void setBmdPanier(BmdPanier bmdPanier) {
		this.bmdPanier = bmdPanier;
	}

}
