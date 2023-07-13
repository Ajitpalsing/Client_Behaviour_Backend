package com.example.client_behaviour.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.client_behaviour.model.Customer;
import com.example.client_behaviour.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

}
