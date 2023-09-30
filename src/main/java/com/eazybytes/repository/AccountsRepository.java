package com.eazybytes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eazybytes.Entity.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Integer> {
	Accounts findByCustomerId(int customerId);
}
