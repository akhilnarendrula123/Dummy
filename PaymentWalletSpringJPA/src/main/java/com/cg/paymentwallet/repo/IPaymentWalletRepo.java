package com.cg.paymentwallet.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.paymentwallet.beans.Customer;

@Repository("paymentwallet")
public interface IPaymentWalletRepo extends CrudRepository<Customer, String> {

}
