package com.spring_boot_practice.flightticketbooking.dto.mapper;

import com.spring_boot_practice.flightticketbooking.dto.AddressDto;
import com.spring_boot_practice.flightticketbooking.entity.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressDto toDto(Address address);

    Address toEntity(AddressDto addressDto);


}
