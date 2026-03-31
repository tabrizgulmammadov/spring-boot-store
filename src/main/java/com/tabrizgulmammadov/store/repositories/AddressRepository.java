package com.tabrizgulmammadov.store.repositories;

import com.tabrizgulmammadov.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}