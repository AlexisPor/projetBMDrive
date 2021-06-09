package com.projetBMDrive.Repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetBMDrive.entities.TAgentbm;

@Repository
public interface AgentBMRepository extends JpaRepository<TAgentbm, BigDecimal> {

}
