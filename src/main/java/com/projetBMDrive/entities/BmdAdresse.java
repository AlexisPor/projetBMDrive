package com.projetBMDrive.entities;
// Generated 17 juin 2021 � 10:20:52 by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * BmdAdresse generated by hbm2java
 */
@Entity
@Table(name = "BMD_ADRESSE", schema = "BMDRIVE")
public class BmdAdresse implements java.io.Serializable {

	private BigDecimal adrId;
	private BigDecimal adrNumRue;
	private String adrNomRue;
	private String adrCplAdr;
	private BigDecimal adrCp;
	private String adrVille;
	private Set<BmdIdentite> bmdIdentites = new HashSet<BmdIdentite>(0);

	public BmdAdresse() {
	}

	public BmdAdresse(BigDecimal adrId, BigDecimal adrNumRue, String adrNomRue, BigDecimal adrCp, String adrVille) {
		this.adrId = adrId;
		this.adrNumRue = adrNumRue;
		this.adrNomRue = adrNomRue;
		this.adrCp = adrCp;
		this.adrVille = adrVille;
	}

	public BmdAdresse(BigDecimal adrId, BigDecimal adrNumRue, String adrNomRue, String adrCplAdr, BigDecimal adrCp,
			String adrVille, Set<BmdIdentite> bmdIdentites) {
		this.adrId = adrId;
		this.adrNumRue = adrNumRue;
		this.adrNomRue = adrNomRue;
		this.adrCplAdr = adrCplAdr;
		this.adrCp = adrCp;
		this.adrVille = adrVille;
		this.bmdIdentites = bmdIdentites;
	}

	@Id
	@SequenceGenerator(name="BMD_ADRESSE_SEQ", sequenceName = "BMD_ADRESSE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BMD_ADRESSE_SEQ")
	@Column(name = "ADR_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getAdrId() {
		return this.adrId;
	}

	public void setAdrId(BigDecimal adrId) {
		this.adrId = adrId;
	}

	@Column(name = "ADR_NUM_RUE", nullable = false, precision = 22, scale = 0)
	public BigDecimal getAdrNumRue() {
		return this.adrNumRue;
	}

	public void setAdrNumRue(BigDecimal adrNumRue) {
		this.adrNumRue = adrNumRue;
	}

	@Column(name = "ADR_NOM_RUE", nullable = false, length = 30)
	public String getAdrNomRue() {
		return this.adrNomRue;
	}

	public void setAdrNomRue(String adrNomRue) {
		this.adrNomRue = adrNomRue;
	}

	@Column(name = "ADR_CPL_ADR", length = 20)
	public String getAdrCplAdr() {
		return this.adrCplAdr;
	}

	public void setAdrCplAdr(String adrCplAdr) {
		this.adrCplAdr = adrCplAdr;
	}

	@Column(name = "ADR_CP", nullable = false, precision = 22, scale = 0)
	public BigDecimal getAdrCp() {
		return this.adrCp;
	}

	public void setAdrCp(BigDecimal adrCp) {
		this.adrCp = adrCp;
	}

	@Column(name = "ADR_VILLE", nullable = false, length = 30)
	public String getAdrVille() {
		return this.adrVille;
	}

	public void setAdrVille(String adrVille) {
		this.adrVille = adrVille;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bmdAdresse")
	public Set<BmdIdentite> getBmdIdentites() {
		return this.bmdIdentites;
	}

	public void setBmdIdentites(Set<BmdIdentite> bmdIdentites) {
		this.bmdIdentites = bmdIdentites;
	}

}
