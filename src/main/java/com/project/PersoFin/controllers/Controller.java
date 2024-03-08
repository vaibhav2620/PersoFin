package com.project.PersoFin.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.PersoFin.daos.TransactionDao;
import com.project.PersoFin.daos.userDao;
import com.project.PersoFin.models.Transaction;
import com.project.PersoFin.models.user;
import com.project.PersoFin.services.TransactionService;
import com.project.PersoFin.services.UserService;

@RestController
public class Controller {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TransactionService transactionService;
	
	
	@Autowired
	private TransactionDao transaction_Doo;
	

	
	
	@GetMapping("/public")
	public String home() {
		return "home page";
	}
	
	@GetMapping("/Users")
	public List<user> getuserslist(){
		return UserService.getallUsers();
	}
	
	@GetMapping("/Transactions")
	public List<Transaction> getTransactionslist(){
		return transactionService.getAllTransaction();
	}
	
	
	
	
    // User Endpoints
    @PostMapping("/register")
    public user registerUser(@RequestBody user user) {
    	System.out.print(user);
		return userService.registerUser(user);
    }
    
    // Transaction Endpoints
    @PostMapping("/addtransaction")
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.addTransaction(transaction);
    }
    
    @GetMapping("/TransactionType")
    public List<Transaction> getTransactionbyType(@RequestBody String type){
    	return transactionService.FindBYtransactionType(type);
    }
    
	
}
