package com.capgemini.mainapp;

import com.capgemini.service.CustomerService;
import com.capgemini.service.CustomerserviceImpl;

public class MainApp {

	public static void main(String[] args) {

		CustomerService customerService=new CustomerserviceImpl();
		
		System.out.println(customerService.findAll().get(0).getFirstName()+"  "+customerService.findAll().get(0).getLastName());
		
	}

}
