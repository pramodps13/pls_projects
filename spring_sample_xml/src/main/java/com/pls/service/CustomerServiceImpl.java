package com.pls.service;

import java.util.List;

import com.pls.model.Customer;
import com.pls.repository.HibernateCustomerRepository;
import com.pls.repository.HibernateCustomerRepostioryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	/*Uses a hardcoded reference to the Customer Repository which is what Spring tries to avoid*/
	private HibernateCustomerRepository repository=new HibernateCustomerRepostioryImpl();
	
	@Override
	public List<Customer> findAll(){
		return repository.findAll();
	}

}
