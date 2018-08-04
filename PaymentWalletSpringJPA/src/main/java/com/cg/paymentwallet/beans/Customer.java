package com.cg.paymentwallet.beans;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Table(name="Paymentwallet")
 public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String number;
	private String name;
	private String transaction;
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	@Embedded
	private Wallet wallet;
	public String getPhoneNumber() {
		return number;
	}
	public Customer() {
		super();
	}
	public Customer(String number, String name, String transaction, Wallet wallet) {
		super();
		this.number = number;
		this.name = name;
		this.transaction = transaction;
		this.wallet = wallet;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTransaction() {
		return transaction;
	}
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}


	
}
