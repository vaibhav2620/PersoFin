package com.project.PersoFin.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.PersoFin.models.Transaction;

public interface TransactionDao extends JpaRepository<Transaction, Long>{

}
