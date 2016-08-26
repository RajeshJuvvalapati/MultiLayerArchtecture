package com.capgemini.Repository;

import java.util.List;

import com.capgemini.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}