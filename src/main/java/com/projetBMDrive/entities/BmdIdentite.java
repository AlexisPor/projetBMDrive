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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * BmdIdentite generated by hbm2java
 */
@Entity
@Table(name = "BMD_IDENTITE", schema = "BMDRIVE")
public class BmdIdentite implements java.io.Serializable {

	private BigDecimal ideId;
	private BmdAdresse bmdAdresse;
	private String ideNom;
	private String idePrenom;
	private BigDecimal ideAge;
	private char ideSexe;
	private String ideTelephone;
	private String ideMail;
	private Set<BmdAgentbm> bmdAgentbms = new HashSet<BmdAgentbm>(0);
	private Set<BmdVisiteur> bmdVisiteurs = new HashSet<BmdVisiteur>(0);
	private Set<BmdAdherent> bmdAdherents = new HashSet<BmdAdherent>(0);

	public BmdIdentite() {
	}

	public BmdIdentite(BigDecimal ideId, BmdAdresse bmdAdresse, String ideNom, String idePrenom, BigDecimal ideAge,
			char ideSexe, String ideTelephone, String ideMail) {
		this.ideId = ideId;
		this.bmdAdresse = bmdAdresse;
		this.ideNom = ideNom;
		this.idePrenom = idePrenom;
		this.ideAge = ideAge;
		this.ideSexe = ideSexe;
		this.ideTelephone = ideTelephone;
		this.ideMail = ideMail;
	}

	public BmdIdentite(BigDecimal ideId, BmdAdresse bmdAdresse, String ideNom, String idePrenom, BigDecimal ideAge,
			char ideSexe, String ideTelephone, String ideMail, Set<BmdAgentbm> bmdAgentbms,
			Set<BmdVisiteur> bmdVisiteurs, Set<BmdAdherent> bmdAdherents) {
		this.ideId = ideId;
		this.bmdAdresse = bmdAdresse;
		this.ideNom = ideNom;
		this.idePrenom = idePrenom;
		this.ideAge = ideAge;
		this.ideSexe = ideSexe;
		this.ideTelephone = ideTelephone;
		this.ideMail = ideMail;
		this.bmdAgentbms = bmdAgentbms;
		this.bmdVisiteurs = bmdVisiteurs;
		this.bmdAdherents = bmdAdherents;
	}

	@Id
	@SequenceGenerator(name="BMD_IDENTITE_SEQ", sequenceName = "BMD_IDENTITE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BMD_IDENTITE_SEQ")
	@Column(name = "IDE_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdeId() {
		return this.ideId;
	}

	public void setIdeId(BigDecimal ideId) {
		this.ideId = ideId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDE_ADRESSE", nullable = false)
	public BmdAdresse getBmdAdresse() {
		return this.bmdAdresse;
	}

	public void setBmdAdresse(BmdAdresse bmdAdresse) {
		this.bmdAdresse = bmdAdresse;
	}

	@Column(name = "IDE_NOM", nullable = false, length = 40)
	public String getIdeNom() {
		return this.ideNom;
	}

	public void setIdeNom(String ideNom) {
		this.ideNom = ideNom;
	}

	@Column(name = "IDE_PRENOM", nullable = false, length = 30)
	public String getIdePrenom() {
		return this.idePrenom;
	}

	public void setIdePrenom(String idePrenom) {
		this.idePrenom = idePrenom;
	}

	@Column(name = "IDE_AGE", nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdeAge() {
		return this.ideAge;
	}

	public void setIdeAge(BigDecimal ideAge) {
		this.ideAge = ideAge;
	}

	@Column(name = "IDE_SEXE", nullable = false, length = 1)
	public char getIdeSexe() {
		return this.ideSexe;
	}

	public void setIdeSexe(char ideSexe) {
		this.ideSexe = ideSexe;
	}

	@Column(name = "IDE_TELEPHONE", nullable = false, length = 20)
	public String getIdeTelephone() {
		return this.ideTelephone;
	}

	public void setIdeTelephone(String ideTelephone) {
		this.ideTelephone = ideTelephone;
	}

	@Column(name = "IDE_MAIL", nullable = false, length = 40)
	public String getIdeMail() {
		return this.ideMail;
	}

	public void setIdeMail(String ideMail) {
		this.ideMail = ideMail;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bmdIdentite")
	public Set<BmdAgentbm> getBmdAgentbms() {
		return this.bmdAgentbms;
	}

	public void setBmdAgentbms(Set<BmdAgentbm> bmdAgentbms) {
		this.bmdAgentbms = bmdAgentbms;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bmdIdentite")
	public Set<BmdVisiteur> getBmdVisiteurs() {
		return this.bmdVisiteurs;
	}

	public void setBmdVisiteurs(Set<BmdVisiteur> bmdVisiteurs) {
		this.bmdVisiteurs = bmdVisiteurs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bmdIdentite")
	public Set<BmdAdherent> getBmdAdherents() {
		return this.bmdAdherents;
	}

	public void setBmdAdherents(Set<BmdAdherent> bmdAdherents) {
		this.bmdAdherents = bmdAdherents;
	}

}
