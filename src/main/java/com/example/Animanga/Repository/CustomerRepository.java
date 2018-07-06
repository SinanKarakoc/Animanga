package com.example.Animanga.Repository;

import com.example.Animanga.Entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
//    Customer findCustomerById(@Param("id") Long id);
}
