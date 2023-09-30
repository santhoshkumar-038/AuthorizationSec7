package com.eazybytes.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eazybytes.Entity.Customer;
import com.eazybytes.repository.CustomerRepository;

@RestController
public class LoginController {

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@PostMapping("/registerUser") //margot robbie password 123456
	public ResponseEntity<String> saveUser(@RequestBody Customer customer){
		Customer savedCustomer = null;
		ResponseEntity response = null;
		try {
			String hashPwd = passwordEncoder.encode(customer.getPwd());
			customer.setPwd(hashPwd);
			savedCustomer = customerRepository.save(customer);
			if(savedCustomer.getId() > 0) {
				response = ResponseEntity.status(HttpStatus.CREATED)
						.body("Given User Details are successfully Registered");
			}
		}catch(Exception ex) {
			response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An Exception Occured due to: " + ex.getMessage());
		}
		return response;
	}
	
    @RequestMapping("/user")
    public Customer getUserDetailsAfterLogin(Authentication authentication) {
        List<Customer> customers = customerRepository.findByEmail(authentication.getName());
        if (customers.size() > 0) {
            return customers.get(0);
        } else {
            return null;
        }

    }
}
