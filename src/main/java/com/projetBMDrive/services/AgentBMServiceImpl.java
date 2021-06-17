package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.BmdAgentbm;
import com.projetBMDrive.repositories.AgentBMRepository;
import com.projetBMDrive.repositories.IdentiteRepository;


@Service
@Transactional
public class AgentBMServiceImpl implements AgentBMService {

	@Autowired
	private AgentBMRepository agentBMRepo;
	
	@Autowired
	private IdentiteRepository ideRepo;
	
	@Override
	public void add(BmdAgentbm abm) {
		ideRepo.save(abm.getBmdIdentite());
		agentBMRepo.save(abm);
	}

	@Override
	public List<BmdAgentbm> findAll() {
		return agentBMRepo.findAll();
	}

	@Override
	public void update(BmdAgentbm abm) {
		ideRepo.save(abm.getBmdIdentite());
		agentBMRepo.save(abm);
	}

	@Override
	public void delete(BmdAgentbm abm) {
		agentBMRepo.delete(abm);
	}

	@Override
	public BmdAgentbm findById(BigDecimal abmId) {
		return agentBMRepo.findById(abmId).get();
	}

	

}
