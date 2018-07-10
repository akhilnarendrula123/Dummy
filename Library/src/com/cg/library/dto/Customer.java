package com.cg.library.dto;

public class Customer {
	private String memberId;
	private String memberName;
	private double amount;

	public Customer() {
	}

	public Customer(String memberId, String memberName, double amount) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.amount = amount;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Customer [memberId=" + memberId + ", memberName=" + memberName + ", amount=" + amount + "]";
	}

}
