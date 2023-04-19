package com.san.microservices.citizenservice.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Citizen {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int vactinationCenterId;

	
	public Citizen() {
		super();
	}


	public Citizen(int id, String name, int vactinationCenterId) {
		super();
		this.id = id;
		this.name = name;
		this.vactinationCenterId = vactinationCenterId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getVactinationCenterId() {
		return vactinationCenterId;
	}


	public void setVactinationCenterId(int vactinationCenterId) {
		this.vactinationCenterId = vactinationCenterId;
	}
	
	
	
}
