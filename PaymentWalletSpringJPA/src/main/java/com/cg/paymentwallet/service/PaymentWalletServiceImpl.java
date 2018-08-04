package com.cg.paymentwallet.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.paymentwallet.beans.Customer;
import com.cg.paymentwallet.repo.IPaymentWalletRepo;

@Service
public class PaymentWalletServiceImpl implements IPaymentWalletService{

	@Autowired
	private IPaymentWalletRepo repo;

	@Override
	public void createAccount(Customer customer) {
		repo.save(customer);
		
	}

	@Override
	public BigDecimal showBalance(String number) {
		return repo.findById(number).get().getWallet().getBalance();
	
	}

	@Override
	public void deposit(String number, BigDecimal amount) {
		Customer customer = repo.findById(number).get();
		customer.getWallet().setBalance(customer.getWallet().getBalance().add(amount));
		repo.save(customer);
		
	}

	@Override
	public void withdraw(String number, BigDecimal amount) {
		Customer customer = repo.findById(number).get();
		customer.getWallet().setBalance(customer.getWallet().getBalance().subtract( amount));
		repo.save(customer);
		
	}

	@Override
	public void fundTransfer(String number1, String number2, BigDecimal amount) {
		Customer customer = repo.findById(number1).get();
		customer.getWallet().setBalance(customer.getWallet().getBalance().subtract(amount));
		repo.save(customer);
		Customer customer1 = repo.findById(number2).get();
		customer1.getWallet().setBalance(customer1.getWallet().getBalance().add(amount));
		repo.save(customer1);
		
	}

	@Override
	public String printTransaction(String number) {
		return repo.findById(number).get().getTransaction();
	
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> list = new ArrayList<>();
		repo.findAll().forEach(list::add);
		return list;
	
	}

	



}
