package com.eazybytes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eazybytes.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
