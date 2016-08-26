package com.capgemini.service;

import java.util.List;

import com.capgemini.Repository.CustomerRepository;
import com.capgemini.Repository.CustomerRepositoryImpl;
import com.capgemini.model.Customer;

public class CustomerserviceImpl implements CustomerService {
	
	
	/* (non-Javadoc)
	 * @see com.capgemini.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		CustomerRepository customerRepository=new CustomerRepositoryImpl();
		
		return customerRepository.findAll();
		
	}
}
