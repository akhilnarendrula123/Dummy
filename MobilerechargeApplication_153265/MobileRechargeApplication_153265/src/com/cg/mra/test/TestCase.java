package com.cg.mra.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.RechargeException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;
public class TestCase {



	private static AccountService library = null;
	@BeforeClass
	public static void setUpBeforeClass() throws RechargeException {
		library  = new AccountServiceImpl();
	}

	@org.junit.Test
	public void testIdWhenInput() {
		Account dto=library.viewDetails("1234");
		assertNotNull(dto);
	}
	@org.junit.Test
	public void testIdWhenInputWrong() {
		Account dto=library.viewDetails("dasa");
		assertNull(dto);
	}
	@org.junit.Test
	public void testIdWhenNoInput() {
		Account dto=library.viewDetails(" ");
		assertNull(dto);
	}
	@org.junit.Test(expected=RechargeException.class)
	public void testAddPaymentWhenNoInputs() throws RechargeException {
		Account dto=library.payAmount("","");
		assertNull(dto);
	}
	@org.junit.Test(expected=RechargeException.class)
	public void testAddPaymentWhenSpaceInput() throws RechargeException{
		Account dto=library.payAmount(" ", "2000");
		assertNull(dto);
	}
	@org.junit.Test(expected=RechargeException.class)
	public void testAddPaymentWhenNoInput() throws RechargeException {
		Account dto=library.payAmount("", "2000");
		assertNull(dto);
	}
	@Test
	public void testAddPaymentWhenCorrectInput() throws RechargeException {
		Account dto=library.payAmount("1234", "2000");
		assertNotNull(dto);
	}

}
