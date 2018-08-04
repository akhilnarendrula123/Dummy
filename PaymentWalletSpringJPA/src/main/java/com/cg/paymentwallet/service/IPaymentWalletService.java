package com.cg.paymentwallet.service;

import java.math.BigDecimal;
import java.util.List;

import com.cg.paymentwallet.beans.Customer;

public interface IPaymentWalletService {
	public void createAccount(Customer customer);

	public BigDecimal showBalance(String number);

	public void deposit(String number, BigDecimal amount);

	public void withdraw(String number, BigDecimal amount);

	public void fundTransfer(String number1, String number2, BigDecimal amount);

	public String printTransaction(String number);

	public List<Customer> getAllCustomers();

}

