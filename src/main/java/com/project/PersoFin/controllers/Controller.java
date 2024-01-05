package com.project.PersoFin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.PersoFin.daos.userDao;
import com.project.PersoFin.models.user;

@RestController
@RequestMapping("/persoFin/v1")
public class Controller {

	@Autowired
	private userDao user_Dao;
	
	@RequestMapping("")
	public String home() {
		return "home page";
	}
	@GetMapping("/Users")
	public List<user> getuserslist(){
		
		List<user> l1 = user_Dao.findAll();
		return l1;
		
	}
	
}
