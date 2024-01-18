package com.project.PersoFin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.PersoFin.daos.TransactionDao;
import com.project.PersoFin.daos.userDao;
import com.project.PersoFin.models.Transaction;
import com.project.PersoFin.models.user;


@RestController
public class Controller {

	@Autowired
	private userDao user_Dao;
	
	@Autowired
	private TransactionDao transaction_Doo;
	
	@GetMapping("/public")
	public String home() {
		return "home page";
	}
	
	@GetMapping("/Users")
	public List<user> getuserslist(){
		
		List<user> l1 = user_Dao.findAll();
		return l1;
		
	}
	
	@GetMapping("/Transactions")
	public List<Transaction> getTransactionslist(){
		
		List<Transaction> l1 = transaction_Doo.findAll();
		return l1;
		
	}
	
}
