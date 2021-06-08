package com.projetBMDrive.entities;
// Generated 8 juin 2021 � 13:57:09 by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TAgentbm generated by hbm2java
 */
@Entity
@Table(name = "T_AGENTBM", schema = "BMDRIVE")
public class TAgentbm implements java.io.Serializable {

	private BigDecimal abmId;
	private TIdentite TIdentite;
	private TReservation TReservation;
	private String abmNomUtilisateur;
	private String abmMotDePasse;

	public TAgentbm() {
	}

	public TAgentbm(BigDecimal abmId, TIdentite TIdentite, TReservation TReservation, String abmNomUtilisateur,
			String abmMotDePasse) {
		this.abmId = abmId;
		this.TIdentite = TIdentite;
		this.TReservation = TReservation;
		this.abmNomUtilisateur = abmNomUtilisateur;
		this.abmMotDePasse = abmMotDePasse;
	}

	@Id

	@Column(name = "ABM_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getAbmId() {
		return this.abmId;
	}

	public void setAbmId(BigDecimal abmId) {
		this.abmId = abmId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ABM_ID_IDENTITE", nullable = false)
	public TIdentite getTIdentite() {
		return this.TIdentite;
	}

	public void setTIdentite(TIdentite TIdentite) {
		this.TIdentite = TIdentite;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ABM_ID_RESERVATION", nullable = false)
	public TReservation getTReservation() {
		return this.TReservation;
	}

	public void setTReservation(TReservation TReservation) {
		this.TReservation = TReservation;
	}

	@Column(name = "ABM_NOM_UTILISATEUR", nullable = false, length = 20)
	public String getAbmNomUtilisateur() {
		return this.abmNomUtilisateur;
	}

	public void setAbmNomUtilisateur(String abmNomUtilisateur) {
		this.abmNomUtilisateur = abmNomUtilisateur;
	}

	@Column(name = "ABM_MOT_DE_PASSE", nullable = false, length = 20)
	public String getAbmMotDePasse() {
		return this.abmMotDePasse;
	}

	public void setAbmMotDePasse(String abmMotDePasse) {
		this.abmMotDePasse = abmMotDePasse;
	}

}
