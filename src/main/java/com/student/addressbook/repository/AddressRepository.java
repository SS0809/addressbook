package com.student.addressbook.repository;

import com.student.addressbook.entity.AddressEntity;
import com.student.addressbook.service.AddressService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface AddressRepository extends JpaRepository<AddressEntity,Long> {
}
