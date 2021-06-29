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
 * BmdVisiteur generated by hbm2java
 */
@Entity
@Table(name = "BMD_VISITEUR", schema = "BMDRIVE")
public class BmdVisiteur implements java.io.Serializable {

	private BigDecimal visId;

	public BmdVisiteur() {
	}

	public BmdVisiteur(BigDecimal visId) {
		this.visId = visId;
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

}
