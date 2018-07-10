package com.cg.library.service;

import com.cg.library.dto.Customer;
import com.cg.library.exception.ValidateImpl;

public interface ILibraryService {
public Customer viewDetails(String id) throws ValidateImpl;
public boolean payAmount(String memberId, double amount) throws ValidateImpl;
}
