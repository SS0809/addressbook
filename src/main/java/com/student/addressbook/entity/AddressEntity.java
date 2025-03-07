package com.student.addressbook.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "addresses")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Address is required")
    private String address;

    @NotEmpty(message = "Name is required and cannot be empty")
    private String fullName;

    @NotEmpty(message = "City cannot be empty")
    private String city;

    @NotEmpty(message = "State cannot be empty")
    private String state;

    @NotBlank(message = "Zip Code is required")
    @Pattern(regexp = "^[0-9]{6}$", message = "Zip Code must be exactly 6 digits")
    private String zipCode;

    @NotEmpty(message = "Phone number is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits")
    private String phoneNumber;
}
