package com.cg.mra.dao;


import java.util.HashMap;

import com.cg.mra.beans.Account;


public class AccountDaoImpl implements AccountDao{
	private static HashMap<String,Account> recharge=null;
	static{
		recharge=new HashMap<>();
		Account ac=new Account();
		ac.setMobileNo("9951610705");
		ac.setCustomerName("Akhil");
		ac.setAccountBalance("400");
		ac.setAccountType("Idea");
		Account ac1=new Account();
		ac.setMobileNo("8466919330");
		ac.setCustomerName("Vishnu");
		ac.setAccountBalance("500");
		ac.setAccountType("Jio");
		Account ac2=new Account();
		ac.setMobileNo("9912335407");
		ac.setCustomerName("Sowmya");
		ac.setAccountBalance("100");
		ac.setAccountType("Airtel");
		recharge.put(ac.getMobileNo(),ac);
		recharge.put(ac1.getMobileNo(),ac1);
		recharge.put(ac2.getMobileNo(),ac2);
	}
	
	//------------------------    <Name> Application --------------------------
	/*******************************************************************************************************
	 - Method Name		:	<view details>
	 - Input Parameters	:	<String> <string>
	 - Return Type		:	<String> <string>
	 - Throws		:  	<recharge>Exception
	 - Author		:	<Sagarla Akhil>
	 - Creation Date	:	11/07/2018

	 ********************************************************************************************************/
	@Override
	public Account viewDetails(String mobileNo) {
		// TODO Auto-generated method stub
		Account dto=recharge.get(mobileNo);
		
		return dto;
	}
	//------------------------    <Name> Application --------------------------
	/*******************************************************************************************************
	 - Method Name		:	<payAmount>
	 - Input Parameters	:	<String> <string>
	 - Return Type		:	<String> <string>
	 - Throws		:  	<Recharge >Exception
	 - Author		:	<Sagarla Akhil>
	 - Creation Date	:	11/07/2018
	 -
	 ********************************************************************************************************/
	@Override
	public Account payAmount(String mobileNo, String accountBalace) {
		// TODO Auto-generated method stub
		Account dto=recharge.get(mobileNo);
		
		
		if(dto!=null)
		{
			double updateBal=Double.parseDouble(dto.getAccountBalance())+Double.parseDouble(accountBalace);
			String bal=String.valueOf(updateBal);
			dto.setAccountBalance(bal);
			return dto;
		}
		return null;
	
	}




	}

