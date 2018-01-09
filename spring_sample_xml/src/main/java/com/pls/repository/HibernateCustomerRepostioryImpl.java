package com.pls.repository;

import java.util.ArrayList;
import java.util.List;

import com.pls.model.Customer;

public class HibernateCustomerRepostioryImpl implements HibernateCustomerRepository {
	

	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers=new ArrayList<>();
		
		Customer customer=new Customer();
		customer.setFirstName("Pramod");
		customer.setLastName("PS");
		
		customers.add(customer);
		
		return customers;
	}

}
