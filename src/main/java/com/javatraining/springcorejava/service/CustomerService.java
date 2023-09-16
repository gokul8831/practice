package com.javatraining.springcorejava.service;

import java.util.List;

import com.javatraining.springcorejava.bean.Customer;

public interface CustomerService {
	public Customer addCustomer(Customer customer);

	public List<Customer> getCustomer();

	public String deleteCustomer(int id);

	public Customer updateCustomer(Customer customer);

}
