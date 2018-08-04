package com.cg.paymentwallet.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.paymentwallet.beans.Customer;
import com.cg.paymentwallet.service.PaymentWalletServiceImpl;

@RestController
public class PaymentWalletController {
	@Autowired
	PaymentWalletServiceImpl service;

	@RequestMapping("/customer")
	public List<Customer> Customers() {
		return service.getAllCustomers();
	}

	@RequestMapping("/customer/{mobileNumber}")
	public BigDecimal showBalance(@PathVariable String mobileNumber) {
		return service.showBalance(mobileNumber);
	}

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public void addCustomer(@RequestBody Customer customer) {
		service.createAccount(customer);
	}

	@RequestMapping(value = "/customer/{mobileNumber}/d/{depositableAmount}", method = RequestMethod.PUT)
	public void depositMoney(@PathVariable String mobileNumber, @PathVariable BigDecimal depositableAmount) {
		service.deposit(mobileNumber, depositableAmount);
	}

	@RequestMapping(value = "/customer/{mobileNumber}/w/{withdrawableAmount}", method = RequestMethod.PUT)
	public void withdrawMoney(@PathVariable String mobileNumber, @PathVariable BigDecimal withdrawableAmount) {
			service.withdraw(mobileNumber, withdrawableAmount);;
		
	}

	@RequestMapping(value = "/customer/{mobileNumber}/print")
	public String printTransaction(@PathVariable String mobileNumber) {
		return service.printTransaction(mobileNumber);

	}

	@RequestMapping(value = "/customer/{SmobileNumber}/{RecmobileNumber}/{transferableAmount}", method = RequestMethod.PUT)
	public void fundTransfer(@PathVariable String SmobileNumber, @PathVariable String RecmobileNumber,
			@PathVariable BigDecimal transferableAmount) {
			service.fundTransfer(SmobileNumber, RecmobileNumber, transferableAmount);
		
	}

}
