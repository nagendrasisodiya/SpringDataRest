package org.spring.springreationscheck.service;

import org.spring.springreationscheck.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.spring.springreationscheck.repository.AddressRepo;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepo addressRepo;
    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }
    public void addAddress(List<Address>address) {
        addressRepo.saveAll(address);
    }
    public Address getAddressById(int id) {
        return addressRepo.findById(id).get();
    }
}
