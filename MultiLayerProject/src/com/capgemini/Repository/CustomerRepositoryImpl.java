package com.capgemini.Repository;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.capgemini.Repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers=new ArrayList();
		
		Customer customer=new Customer();
		customer.setFirstName("RAJESH");
		customer.setLastName("JUVVALAPATI");
		customers.add(customer);
		return customers;
	}
}