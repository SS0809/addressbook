package com.student.addressbook.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
//@Entity Annotation tells Hibernate to create a
//table out of the Employee Payroll Class
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "addresses")
//creates table of name addresses
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
}