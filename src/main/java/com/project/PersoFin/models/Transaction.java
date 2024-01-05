package com.project.PersoFin.models;

import java.time.LocalDateTime;

import com.project.PersoFin.enums.TransactionType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Transactions")
public class Transaction {

	@Id
	private long transaction_id;
	@Column
	private user user;
	@Enumerated(EnumType.STRING)
	@Column	
	private TransactionType transactionType;
	@Column
	private String title;
	@Column
	private Double amount;
	@Column
	private String discription;
	@Column
	private String category;
	@Column
	private LocalDateTime dateTime;
	
	public Transaction() {

	}
	
	public Transaction(long transaction_id, com.project.PersoFin.models.user user, TransactionType transactionType,
			String title, Double amount, String discription, String category, LocalDateTime dateTime) {
		super();
		this.transaction_id = transaction_id;
		this.user = user;
		this.transactionType = transactionType;
		this.title = title;
		this.amount = amount;
		this.discription = discription;
		this.category = category;
		this.dateTime = dateTime;
	}
	/**
	 * @return the transaction_id
	 */
	public long getTransaction_id() {
		return transaction_id;
	}
	/**
	 * @param transaction_id the transaction_id to set
	 */
	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}
	/**
	 * @return the user
	 */
	public user getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(user user) {
		this.user = user;
	}
	/**
	 * @return the transactionType
	 */
	public TransactionType getTransactionType() {
		return transactionType;
	}
	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	/**
	 * @return the discription
	 */
	public String getDiscription() {
		return discription;
	}
	/**
	 * @param discription the discription to set
	 */
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the dateTime
	 */
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	
	
}
