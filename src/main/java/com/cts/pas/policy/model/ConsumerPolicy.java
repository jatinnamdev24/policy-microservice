package com.cts.pas.policy.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;


import lombok.Data;

@Data
@Entity
public class ConsumerPolicy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Min(value = 0)
	private int consumerId;
	
	@Min(value = 0)
	private int policyId;
	
	@Min(value = 0)
	private int businessId;
	
	private String acceptanceStatus;
	
	private String policyStatus;
	
	private String acceptedQuotes;
	
	private Date effectiveDate;
	
	private String duration;

}
