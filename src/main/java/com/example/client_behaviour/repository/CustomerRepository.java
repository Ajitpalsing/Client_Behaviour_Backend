package com.example.client_behaviour.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.client_behaviour.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
