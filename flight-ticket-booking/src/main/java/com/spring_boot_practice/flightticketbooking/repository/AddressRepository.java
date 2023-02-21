package com.spring_boot_practice.flightticketbooking.repository;

import com.spring_boot_practice.flightticketbooking.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
