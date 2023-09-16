package com.javatraining.springcorejava.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatraining.springcorejava.bean.Customer;

public interface Customerrepo extends JpaRepository<Customer, Integer> {

}
