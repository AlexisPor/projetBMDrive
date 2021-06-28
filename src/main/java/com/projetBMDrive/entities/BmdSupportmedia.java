package com.projetBMDrive.entities;
// Generated 28 juin 2021 � 11:55:43 by Hibernate Tools 5.0.6.Final

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
 * BmdSupportmedia generated by hbm2java
 */
@Entity
@Table(name = "BMD_SUPPORTMEDIA", schema = "BMDRIVE")
public class BmdSupportmedia implements java.io.Serializable {

	private BigDecimal supId;
    private BmdArticle bmdArticle;
    private String supType;
    private BigDecimal supDuree;

    public BmdSupportmedia() {
    }

    public BmdSupportmedia(BigDecimal supId, String supType) {
        this.supId = supId;
        this.supType = supType;
    }

    public BmdSupportmedia(BigDecimal supId, BmdArticle bmdArticle, String supType, BigDecimal supDuree) {
        this.supId = supId;
        this.bmdArticle = bmdArticle;
        this.supType = supType;
        this.supDuree = supDuree;
    }

    @Id
    @SequenceGenerator(name="BMD_SUPPORTMEDIA_SEQ", sequenceName = "BMD_SUPPORTMEDIA_SEQ", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BMD_SUPPORTMEDIA_SEQ")
    @Column(name = "SUP_ID", unique = true, nullable = false, precision = 22, scale = 0)
    public BigDecimal getSupId() {
        return this.supId;
    }

    public void setSupId(BigDecimal supId) {
        this.supId = supId;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SUP_ARTICLE_ID")
    public BmdArticle getBmdArticle() {
        return this.bmdArticle;
    }

    public void setBmdArticle(BmdArticle bmdArticle) {
        this.bmdArticle = bmdArticle;
    }

    @Column(name = "SUP_TYPE", nullable = false, length = 20)
    public String getSupType() {
        return this.supType;
    }

    public void setSupType(String supType) {
        this.supType = supType;
    }

    @Column(name = "SUP_DUREE", precision = 22, scale = 0)
    public BigDecimal getSupDuree() {
        return this.supDuree;
    }

    public void setSupDuree(BigDecimal supDuree) {
        this.supDuree = supDuree;
    }

    @Override
    public String toString() {
        return "BmdSupportmedia [supId=" + supId + ", bmdArticle=" + bmdArticle + ", supType=" + supType + ", supDuree="
                + supDuree + "]";
    }



}
