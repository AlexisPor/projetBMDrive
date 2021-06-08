package com.projetBMDrive.entities;
// Generated 8 juin 2021 � 11:44:16 by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TReservation generated by hbm2java
 */
@Entity
@Table(name = "T_RESERVATION", schema = "BMDRIVE")
public class TReservation implements java.io.Serializable {

	private BigDecimal resIdReservation;
	private TCasier TCasier;
	private Date resDateReservation;
	private Set<TAgentbm> TAgentbms = new HashSet<TAgentbm>(0);
	private Set<TPanier> TPaniers = new HashSet<TPanier>(0);

	public TReservation() {
	}

	public TReservation(BigDecimal resIdReservation, TCasier TCasier, Date resDateReservation) {
		this.resIdReservation = resIdReservation;
		this.TCasier = TCasier;
		this.resDateReservation = resDateReservation;
	}

	public TReservation(BigDecimal resIdReservation, TCasier TCasier, Date resDateReservation, Set<TAgentbm> TAgentbms,
			Set<TPanier> TPaniers) {
		this.resIdReservation = resIdReservation;
		this.TCasier = TCasier;
		this.resDateReservation = resDateReservation;
		this.TAgentbms = TAgentbms;
		this.TPaniers = TPaniers;
	}

	@Id

	@Column(name = "RES_ID_RESERVATION", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getResIdReservation() {
		return this.resIdReservation;
	}

	public void setResIdReservation(BigDecimal resIdReservation) {
		this.resIdReservation = resIdReservation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RES_ID_CASIER", nullable = false)
	public TCasier getTCasier() {
		return this.TCasier;
	}

	public void setTCasier(TCasier TCasier) {
		this.TCasier = TCasier;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "RES_DATE_RESERVATION", nullable = false, length = 7)
	public Date getResDateReservation() {
		return this.resDateReservation;
	}

	public void setResDateReservation(Date resDateReservation) {
		this.resDateReservation = resDateReservation;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TReservation")
	public Set<TAgentbm> getTAgentbms() {
		return this.TAgentbms;
	}

	public void setTAgentbms(Set<TAgentbm> TAgentbms) {
		this.TAgentbms = TAgentbms;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TReservation")
	public Set<TPanier> getTPaniers() {
		return this.TPaniers;
	}

	public void setTPaniers(Set<TPanier> TPaniers) {
		this.TPaniers = TPaniers;
	}

}
