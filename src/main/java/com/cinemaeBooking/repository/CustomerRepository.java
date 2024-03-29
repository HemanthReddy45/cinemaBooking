package com.cinemaeBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinemaeBooking.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
	Customer findByUserID(Integer userID);
	Customer findByUserName(String userName);
}
