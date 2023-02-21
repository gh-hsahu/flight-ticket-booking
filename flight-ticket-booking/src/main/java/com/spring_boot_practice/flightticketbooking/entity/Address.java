package com.spring_boot_practice.flightticketbooking.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Address {

    @Id
    @GeneratedValue
    private Integer id;
    private String landMark;
    private String city;
    private String district;
    private Long pinCode;
    private String country;

}