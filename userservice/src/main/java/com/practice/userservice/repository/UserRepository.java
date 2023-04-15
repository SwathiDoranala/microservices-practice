package com.practice.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.userservice.entity.Customer;

@Repository
public interface UserRepository extends JpaRepository<Customer, Long> {

}
