package com.cg.mra.dao;

import java.util.HashMap;

import com.cg.mra.beans.Account;

public interface AccountDao {

	public Account viewDetails(String mobileNo);
	public Account payAmount(String mobileNo,String amount);
	
	
}
