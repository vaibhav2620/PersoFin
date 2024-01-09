package com.project.PersoFin.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "widgets")
public class widget {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLong;
	
	@Column
	private String name;

	@Column
	private String query;
	
	@Column
	private String visulaizationTypeString;
	
	@ManyToOne
	@JoinColumn(name="dashboard_id") 
	private Dashboard dashboard;
 
}

