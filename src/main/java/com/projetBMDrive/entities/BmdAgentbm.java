package com.projetBMDrive.entities;
// Generated 29 juin 2021 � 14:18:41 by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * BmdAgentbm generated by hbm2java
 */
@Entity
@Table(name = "BMD_AGENTBM", schema = "BMDRIVE")
public class BmdAgentbm implements java.io.Serializable {

	private BigDecimal abmId;
	private String abmMotDePasse;
	private String abmNomUtilisateur;

	public BmdAgentbm() {
	}

	public BmdAgentbm(BigDecimal abmId, String abmMotDePasse, String abmNomUtilisateur) {
		this.abmId = abmId;
		this.abmMotDePasse = abmMotDePasse;
		this.abmNomUtilisateur = abmNomUtilisateur;
	}

	@Id
	@SequenceGenerator(name="BMD_AGENTBM_SEQ", sequenceName = "BMD_AGENTBM_SEQ", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BMD_AGENTBM_SEQ")
	@Column(name = "ABM_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getAbmId() {
		return this.abmId;
	}

	public void setAbmId(BigDecimal abmId) {
		this.abmId = abmId;
	}

	@Column(name = "ABM_MOT_DE_PASSE", nullable = false, length = 320)
	public String getAbmMotDePasse() {
		return this.abmMotDePasse;
	}

	public void setAbmMotDePasse(String abmMotDePasse) {
		this.abmMotDePasse = abmMotDePasse;
	}

	@Column(name = "ABM_NOM_UTILISATEUR", nullable = false, length = 320)
	public String getAbmNomUtilisateur() {
		return this.abmNomUtilisateur;
	}

	public void setAbmNomUtilisateur(String abmNomUtilisateur) {
		this.abmNomUtilisateur = abmNomUtilisateur;
	}

}
