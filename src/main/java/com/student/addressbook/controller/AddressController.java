package com.student.addressbook.controller;

import com.student.addressbook.dto.*;
import com.student.addressbook.dto.AddressRequestDTO;
import com.student.addressbook.dto.AddressResponseDTO;
import com.student.addressbook.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
@Slf4j
public class AddressController {

    @Autowired
    AddressService addressService;
    //Dependency Injection is used to produce Objects without new key word

    @GetMapping(value = "/getAddresses" ,produces = "application/json")
    public ResponseEntity<List<AddressResponseDTO>> getAll(){
        return ResponseEntity.ok(addressService.getall());
    }
    @PostMapping(value = "/createAddress",produces = "application/json")
    public ResponseEntity<AddressResponseDTO> createAddress(@RequestBody AddressResponseDTO address){
        return ResponseEntity.ok(addressService.addOne(address));
    }
    @PutMapping(value = "/updateAddress",produces = "application/json")
    public ResponseEntity<AddressResponseDTO> updateAddress(@RequestBody AddressResponseDTO addressResponseDTO){
        return ResponseEntity.ok(addressService.updateOne(addressResponseDTO.getId(),addressResponseDTO));
    }
    @DeleteMapping(value = "/deleteAddress",produces = "application/json")
    public ResponseEntity<Boolean> deleteAddress(@RequestBody AddressRequestDTO id){
        return ResponseEntity.ok(addressService.deleteOne(id.getId()));
    }
}
