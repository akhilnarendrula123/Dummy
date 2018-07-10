package com.cg.library.dao;

import java.util.HashMap;

import com.cg.library.dto.Customer;
import com.cg.library.exception.IValidateException;
import com.cg.library.exception.ValidateImpl;

public class LibraryDaoImpl implements ILibraryDao {
	private static HashMap<String, Customer> hashMap = null;
	static {
		hashMap = new HashMap<>();
		Customer customer1 = new Customer("101", "ranjith", -200.00);
		Customer customer2 = new Customer("102", "ajith", -100.00);
		Customer customer3 = new Customer("103", "ramki", 100.00);
		Customer customer4 = new Customer("104", "praveen", 300.00);
		Customer customer5 = new Customer("105", "manoj", 200.00);

		hashMap.put("101", customer1);
		hashMap.put("102", customer2);
		hashMap.put("103", customer3);
		hashMap.put("104", customer4);
		hashMap.put("105", customer5);

	}

	@Override
	public Customer viewDetails(String memberId) throws ValidateImpl {
		if (hashMap.containsKey(memberId)) {
			return hashMap.get(memberId);
		} else
			throw new ValidateImpl(IValidateException.ERROR1);

	}

	@Override
	public boolean payAmount(String memberId, double amount) throws ValidateImpl {
		boolean result = false;
		if (hashMap.containsKey(memberId) && amount!=0) {
			Customer customer = new Customer();
			String memberName = hashMap.get(memberId).getMemberName();
			double balance = hashMap.get(memberId).getAmount();

			customer.setMemberId(memberId);
			customer.setMemberName(memberName);
			customer.setAmount(balance + amount);

			hashMap.remove(memberId);
			hashMap.put(memberId, customer);

			result = true;
		} else
			throw new ValidateImpl(IValidateException.ERROR1);
		return result;
	}

}
