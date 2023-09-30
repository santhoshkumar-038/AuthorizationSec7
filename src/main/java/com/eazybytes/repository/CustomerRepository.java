package com.eazybytes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eazybytes.Entity.*;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	List<Customer> findByEmail(String email);
}
