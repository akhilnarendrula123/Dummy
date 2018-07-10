package com.cg.library.service;

import com.cg.library.dao.ILibraryDao;
import com.cg.library.dao.LibraryDaoImpl;
import com.cg.library.dto.Customer;
import com.cg.library.exception.ValidateImpl;

public class LibraryServiceImpl implements ILibraryService {
	ILibraryDao dao = new LibraryDaoImpl();

	@Override
	public Customer viewDetails(String memberId) throws ValidateImpl {

		return dao.viewDetails(memberId);
	}

	@Override
	public boolean payAmount(String memberId, double amount) throws ValidateImpl {
		
		return dao.payAmount(memberId, amount);
	}

}
