package com.pls.repository;

import java.util.List;

import com.pls.model.Customer;

public interface HibernateCustomerRepository {

	List<Customer> findAll();

}