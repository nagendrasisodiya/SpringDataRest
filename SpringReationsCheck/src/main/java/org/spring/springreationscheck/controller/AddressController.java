package org.spring.springreationscheck.controller;

import org.spring.springreationscheck.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.spring.springreationscheck.service.AddressService;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;
    @GetMapping("/")
    public List<Address> getAddress() {
        return addressService.getAllAddress();
    }
    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable int id) {
        return addressService.getAddressById(id);
    }
    @PostMapping("/")
    public void addAddress(@RequestBody List<Address>address) {
        addressService.addAddress(address);
    }
}
