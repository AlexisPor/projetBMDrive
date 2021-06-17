package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.BmdIdentite;

public interface IdentiteRepository extends JpaRepository<BmdIdentite, BigDecimal> {

}
