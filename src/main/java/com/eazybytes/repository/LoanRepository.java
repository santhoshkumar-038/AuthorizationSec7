package com.eazybytes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eazybytes.Entity.Loans;

@Repository
public interface LoanRepository extends JpaRepository<Loans, Integer> {
	
	List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);

}
