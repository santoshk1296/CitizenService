package com.san.microservices.citizenservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.san.microservices.citizenservice.Entity.Citizen;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Integer> {

	public List<Citizen> findAllByOrderByIdAsc();
	
	public List<Citizen> findByvactinationCenterId(Integer id);
	
}
