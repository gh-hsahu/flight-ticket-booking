package com.spring_boot_practice.flightticketbooking.service;

import com.spring_boot_practice.flightticketbooking.dto.CustomerDto;
import com.spring_boot_practice.flightticketbooking.dto.mapper.CustomerMapper;
import com.spring_boot_practice.flightticketbooking.entity.Customer;
import com.spring_boot_practice.flightticketbooking.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.spring_boot_practice.flightticketbooking.dto.mapper.CustomerMapper.CUSTOMER_MAPPER;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerMapper customerMapper;
    private final CustomerRepository customerRepository;

    public CustomerDto getCustomer(Integer id) {
        return customerRepository.findById(id).map(customerMapper::customerToCustomerDto)
                .orElseThrow(() ->
                        new RuntimeException("Customer not available"));
    }

    public CustomerDto saveCustomer(CustomerDto customerDto) {
        Customer customer = customerMapper.customerDtoToCustomer(customerDto);
        Customer save = customerRepository.save(customer);
        return Optional.of(save)
                .map(CUSTOMER_MAPPER::customerToCustomerDto)
                .orElseThrow(() ->
                        new RuntimeException("Customer not saved"));
    }

    public void deleteCustomer(Integer id) {
        customerRepository.findById(id).ifPresentOrElse(customerRepository::delete,
                () -> {
                    throw new RuntimeException("customer not found");

                });
    }

    public List<CustomerDto> getAllCustomers() {
        return customerRepository.findAll().stream().map(customerMapper::customerToCustomerDto)
                .collect(Collectors.toList());
    }
}