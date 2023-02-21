package com.spring_boot_practice.flightticketbooking.dto.mapper;


import com.spring_boot_practice.flightticketbooking.dto.CustomerDto;
import com.spring_boot_practice.flightticketbooking.entity.Customer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

CustomerMapper CUSTOMER_MAPPER = Mappers.getMapper(CustomerMapper.class);

/*@Mapping(target = "customerAddress", source = "address")*/
    CustomerDto customerToCustomerDto (Customer customer);

@InheritInverseConfiguration
Customer customerDtoToCustomer (CustomerDto customerDto);
List<CustomerDto> customerToCustomerDto(List<Customer> customers);
List<Customer> customerDtoToCustomers (List<CustomerDto> customersDto);

}
