package com.san.microservices.citizenservice.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.san.microservices.citizenservice.Entity.Citizen;
import com.san.microservices.citizenservice.repository.CitizenRepository;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
	
	@Autowired
	private CitizenRepository citizenrepo;

	@GetMapping("/id/{id}")
	public ResponseEntity<List<Citizen>> getCitizenById(@PathVariable Integer id) {
		
		List<Citizen> citizens =  citizenrepo.findByvactinationCenterId(id);
				//.orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with id: "+id));
		return ResponseEntity.ok(citizens);
		
	}
	
	@PostMapping("/add")
	public Citizen createCitizen(@RequestBody Citizen citizen) {
		
		Citizen savedUser = citizenrepo.save(citizen);

		return savedUser;
	}
}
