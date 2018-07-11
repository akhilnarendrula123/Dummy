package com.cg.mra.service;

import java.util.HashMap;
import java.math.BigDecimal;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exception.RechargeException;

public class AccountServiceImpl implements AccountService{
		AccountDao dao=new AccountDaoImpl();
		 public boolean validateMobileNo(String MobileNo) throws RechargeException
		{
			if(!(MobileNo.matches("[a-zA-z0-9]+")))
			{
				throw new RechargeException("please enter correct mobileno");
			}
			return true;
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
			
			public Account viewDetails(String MobileNo) {
				// TODO Auto-generated method stub
				return dao.viewDetails(MobileNo);
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
			public Account payAmount(String MobileNo, String accountBalance) throws RechargeException {
				// TODO 
				Account dto=dao.payAmount(MobileNo, accountBalance);
				if(dto==null)
				{
					throw new RechargeException("cannot rechrge as given mobile no does not exist");
				}
				return dto;
			}
	
			@Override
			public boolean validateMoney(String money) throws RechargeException {
				// TODO Auto-generated method stub
				if(!(money.matches("\\d+")))
				{
					throw new RechargeException("please enter correct amount to add");
				}
				return true;
			}
			/*@Override
			public void viewDetails(String MobileNo) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public Account payAmount(String id, String amount) throws RechargeException {
				// TODO Auto-generated method stub
				return null;
			}*/
			
			}
		