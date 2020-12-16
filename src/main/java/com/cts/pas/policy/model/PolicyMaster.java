package com.cts.pas.policy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


import lombok.Data;

@Data
@Entity
public class PolicyMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int policyId;

	@NotBlank
	private String propertyType;
	
	@NotBlank
	private String consumerType;
	
	@NotBlank
	private String assuredSum;
	
	@NotBlank
	private String tenure;
	
	@Min(value = 0)
	private int businessValue;
	
	@Min(value = 0)
	private int propertyValue;
	
	@NotBlank
	private String baseLocation;
	
	@NotBlank
	private String type;
}
