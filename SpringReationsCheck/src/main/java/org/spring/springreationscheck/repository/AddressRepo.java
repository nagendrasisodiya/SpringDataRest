package org.spring.springreationscheck.repository;

import org.spring.springreationscheck.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {
}
