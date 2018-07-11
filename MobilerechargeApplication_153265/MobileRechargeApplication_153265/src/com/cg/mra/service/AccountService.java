package com.cg.mra.service;

import java.util.HashMap;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.RechargeException;


public interface AccountService {
	public Account viewDetails(String mobileNo);
	public Account payAmount(String mobileNo,String amount) throws RechargeException;
	
	public boolean validateMobileNo(String MobileNo) throws RechargeException;

	boolean validateMoney(String money) throws RechargeException;
	
	}
	
