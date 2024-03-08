package com.project.PersoFin.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.PersoFin.models.Transaction;


public interface TransactionDao extends JpaRepository<Transaction, Long>{

	List<Transaction> findBytransactionType(String type);
	
}
