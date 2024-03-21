package com.project.PersoFin.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.project.PersoFin.models.Reminder;
import com.project.PersoFin.models.Transaction;
import com.project.PersoFin.models.user;
import com.project.PersoFin.services.ReminderService;
import com.project.PersoFin.services.TransactionService;
import com.project.PersoFin.services.UserService;

@RestController
public class Controller {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	private ReminderService reminderService;

	
	
	@GetMapping("/public")
	public String home() {
		return "home page";
	}
	
	@GetMapping("/Users")
	public List<user> getuserslist(){
		return userService.getallUsers();
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
    
    @GetMapping("/UserReminders")
    public List<Reminder> getReminderforUser(@RequestBody int id){
    	return reminderService.getreminderbyUserID(id);
    }
	
}
