package com.project.PersoFin.models;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Dashboard")
public class Dashboard {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
    @OneToOne
    @JoinColumn(name = "user_id")
    private user user;
	
	@Column
	private String name;
	
	@OneToMany(mappedBy="dashboard")
	private List<widget> widgets;

}
