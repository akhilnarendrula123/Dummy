package com.cg.library.dao.test;

import static org.junit.Assert.*;

import com.cg.library.dao.ILibraryDao;
import com.cg.library.dao.LibraryDaoImpl;
import com.cg.library.exception.ValidateImpl;

public class Test {

	@org.junit.Test
	public void checkForValidMemberIdTest() throws ValidateImpl {
		ILibraryDao dao = new LibraryDaoImpl();
		assertNotNull(dao.viewDetails("101"));
	}

	@org.junit.Test(expected = ValidateImpl.class)
	public void checkForInvalidMemberIdTest() throws ValidateImpl {
		ILibraryDao dao = new LibraryDaoImpl();
		dao.viewDetails("111");
	}

	@org.junit.Test
	public void checkForValidMemberIdInPaymentTest() throws ValidateImpl {
		ILibraryDao dao = new LibraryDaoImpl();
		assertTrue(dao.payAmount("101", 200));
	}
	
	@org.junit.Test(expected = ValidateImpl.class)
	public void checkForInvalidMemberIdInPaymentTest() throws ValidateImpl {
		ILibraryDao dao = new LibraryDaoImpl();
		dao.payAmount("111", 200);
	}
	
	@org.junit.Test
	public void checkForValidAmount() throws ValidateImpl {
		ILibraryDao dao=new LibraryDaoImpl();
		assertTrue(dao.payAmount("101", 200));
	}
	
	@org.junit.Test
	public void checkForInValidAmount() throws ValidateImpl {
		ILibraryDao dao=new LibraryDaoImpl();
		assertFalse(dao.payAmount("101", 0));
	}
	
}