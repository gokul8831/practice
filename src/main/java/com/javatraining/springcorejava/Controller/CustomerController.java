package com.javatraining.springcorejava.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatraining.springcorejava.bean.Customer;
import com.javatraining.springcorejava.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	/*
	 * @PostMapping("/Customers") public Customer addCustomer(@RequestBody Customer
	 * customer) {
	 * 
	 * return customerService.addCustomer(customer) ; }
	 * 
	 * @GetMapping("Gokuldetails") public List<Customer> getCustomer(){ Object
	 * customer; return customerService.getCustomer(customer);
	 */
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		System.out.println("controller");
		return customerService.addCustomer(customer);

	}

	@GetMapping("/getcustomer")
	public List<Customer> getProduct() {
		return customerService.getCustomer();
	}

	@DeleteMapping("/deletecustomer/{id}")
	public String deleteCustomer(@PathVariable int id) {
		return customerService.deleteCustomer(id);
	}

	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);

	
}
}
