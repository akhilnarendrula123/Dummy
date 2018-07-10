package com.cg.library.dao;

import com.cg.library.dto.Customer;
import com.cg.library.exception.ValidateImpl;

public interface ILibraryDao {
public Customer viewDetails(String memberId) throws ValidateImpl;
public boolean payAmount(String memberId, double amount) throws ValidateImpl;
}
