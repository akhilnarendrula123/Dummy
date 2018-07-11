package com.cg.mra.beans;

import java.math.BigDecimal;

public class Account {
private String mobileNo;
private String customerName;
private String accountBalance;
private String accountType;
public Account()
{
	
}
public Account(String mobileNo, String customerName, String accountBalance, String accountType) {
	super();
	this.mobileNo = mobileNo;
	this.customerName = customerName;
	this.accountBalance = accountBalance;
	this.accountType=accountType;
}

public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(String accountBalance) {
	this.accountBalance = accountBalance;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
@Override
public String toString() {
	return "Account [mobileNo=" + mobileNo + ", customerName=" + customerName + ", accountBalance=" + accountBalance
			+ ", accountType=" + accountType + "]";
}

}

