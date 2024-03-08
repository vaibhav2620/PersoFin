package com.project.PersoFin.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.project.PersoFin.daos.TransactionDao;
import com.project.PersoFin.models.Transaction;

@Service
public class TransactionService {

	
    private final TransactionDao transactionDao;

    @Autowired
    public TransactionService(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

	
	public List<Transaction> getAllTransaction(){
		return transactionDao.findAll();
	}
	
	public Transaction addTransaction(Transaction t) {
		return transactionDao.save(t);
	}
	
	public Optional<Transaction> FindTransaction(int id) {
		return transactionDao.findById((long) id);
	}
	
	public List<Transaction> FindBYtransactionType(String type) {
		return transactionDao.findBytransactionType(type);
	}
	
	
	
}
