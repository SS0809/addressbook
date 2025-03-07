package com.student.addressbook.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponseDTO {
    //DTO special for Response design
    private Long id;
    private String address;
    private String fullName;
    private String city;
    private String state;
    private int zipCode;
    private Long phoneNumber;
}
