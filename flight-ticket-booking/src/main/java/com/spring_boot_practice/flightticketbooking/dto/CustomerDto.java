package com.spring_boot_practice.flightticketbooking.dto;

import com.spring_boot_practice.flightticketbooking.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDto {

    private Integer id;
    private String name;
    private String email;
    private Address address;
}

