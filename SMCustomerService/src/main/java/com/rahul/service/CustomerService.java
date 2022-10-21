package com.rahul.service;

import java.util.List;

import com.rahul.entity.Customer;

public interface CustomerService {
	
	Long saveCustomer(Customer cust);
	Customer getOneCustomer(Long id);
	Customer getOneCustomerByEmail(String email);
	Customer getOneCustomerByPanCard(String panCard);
	Customer getOneCustomerByMobile(String mobile);
	Customer getOneCustomerByAadhar(String aadhar);
	
	List<Customer> getAllCustomers();


}
