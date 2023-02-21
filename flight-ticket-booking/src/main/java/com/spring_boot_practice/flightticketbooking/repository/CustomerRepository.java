package com.spring_boot_practice.flightticketbooking.repository;

import com.spring_boot_practice.flightticketbooking.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
