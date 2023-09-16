package com.javatraining.springcorejava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatraining.springcorejava.bean.Customer;
import com.javatraining.springcorejava.repo.Customerrepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	Customerrepo customerrepo;
	/*
	 * Customerrepo customerrepo =new Customerrepo();
	 */	

	@Override
	public Customer addCustomer(Customer customer) {

		return customerrepo.save(customer);
	}

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerrepo.findAll();
	}

	@Override
	public String deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerrepo.deleteById(id);
		return "Customer removed" + id;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer existingCustomer = customerrepo.findById(customer.getId()).orElse(null);
		existingCustomer.setCustomerName(customer.getCustomerName());
		existingCustomer.setCompany(customer.getCompany());
		existingCustomer.setSalary(customer.getSalary());
		existingCustomer.setAddress(customer.getAddress());

		return customerrepo.save(existingCustomer);
	}
}

/*
 * @Override public Customer updateCustomer(Customer customer) { // TODO return
 * customerrepo; Customer existingCustomer =
 * customerrepo.findById(customer.getId()).orElse(null);
 * existingCustomer.setCustomerName(customer.getCustomerName());
 * existingCustomer.setCompany(customer.getCompany());
 * existingCustomer.setSalary(customer.getSalary());
 * existingCustomer.setAddress(customer.getAddress());
 * 
 * return customerrepo.save(existingCustomer); }
 */
