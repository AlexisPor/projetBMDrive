package com.projetBMDrive.entities;
// Generated 17 juin 2021 � 10:20:52 by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * BmdCasier generated by hbm2java
 */
@Entity
@Table(name = "BMD_CASIER", schema = "BMDRIVE")
public class BmdCasier implements java.io.Serializable {

	private BigDecimal casId;
	private String casNumero;
	private Set<BmdReservation> bmdReservations = new HashSet<BmdReservation>(0);

	public BmdCasier() {
	}

	public BmdCasier(BigDecimal casId, String casNumero) {
		this.casId = casId;
		this.casNumero = casNumero;
	}

	public BmdCasier(BigDecimal casId, String casNumero, Set<BmdReservation> bmdReservations) {
		this.casId = casId;
		this.casNumero = casNumero;
		this.bmdReservations = bmdReservations;
	}

	@Id

	@Column(name = "CAS_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getCasId() {
		return this.casId;
	}

	public void setCasId(BigDecimal casId) {
		this.casId = casId;
	}

	@Column(name = "CAS_NUMERO", nullable = false, length = 20)
	public String getCasNumero() {
		return this.casNumero;
	}

	public void setCasNumero(String casNumero) {
		this.casNumero = casNumero;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bmdCasier")
	public Set<BmdReservation> getBmdReservations() {
		return this.bmdReservations;
	}

	public void setBmdReservations(Set<BmdReservation> bmdReservations) {
		this.bmdReservations = bmdReservations;
	}

}
