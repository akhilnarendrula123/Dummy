package com.cg.mra.ui;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.RechargeException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;




public class MainUi {

	

	public static void main(String[] args) throws RechargeException {
		// TODO Auto-generated method stub
		AccountService service = new AccountServiceImpl();
		int choice = 0;

		boolean error = false;
		String money;
		String ch;
		do {
			System.out.println("1.view member details");
			System.out.println("2. pay amount");
			
			System.out.println("3.Exit");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("selected to view member details");

				System.out.println("enter the mobileno:");
				String mobileNo = sc.next();
				try {
					error = service.validateMobileNo(mobileNo);
				} catch (RechargeException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}

				if (error) {
					
					Account details = service.viewDetails(mobileNo);
					if (details != null) {
						System.out.println("no of customer is: " + details.getMobileNo());
						System.out.println("Name of customer is: " + details.getCustomerName());
						System.out.println("balance of customer is: " + details.getAccountBalance());
					} else {
						System.out.println("enter correct no and try again");
					}

				}
				break;
			case 2:
				System.out.println("enter mobile no:");
				String ac1 = sc.next();
				try {
					error = service.validateMobileNo(ac1);
				
				if (error) {
					System.out.println("enter the amount to pay:");
					money = sc.next();
					
						error = service.validateMoney(money);
					

					if (error) {
						
							Account details1 = service.payAmount(ac1, money);
							
								System.out.println("mobileno of customer is: " + details1.getMobileNo());
								System.out.println("Name of customer is: " + details1.getCustomerName());
								System.out.println("balance of customer is: " + details1.getAccountBalance());
							
			

						
					}
				}
				 else {
					System.out.println("customer id Not Found ......");
				}
					
				}
				catch(RechargeException l)
				{
					System.out.println(l.getMessage());
				}
			
		
				break;
			

			case 3:
				System.out.println("thankyou for using");
				System.exit(0);
				break;
			default:
				System.out.println("enter correct value");

			}
			System.out.println("enter y or yes to continue and n or no to exit");
			ch = sc.next();
		} while ((ch.equalsIgnoreCase("y")) || ch.equalsIgnoreCase("yes"));

	}

}
