package com.example.Animanga.Service;

import com.example.Animanga.Entity.Customer;
import com.example.Animanga.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository  customerRepository;

    public List<Customer> getAllCustomersFromService() {
        return (List<Customer>) customerRepository.findAll();
    }

    public void saveCustomerService(Customer customer) {
        customerRepository.save(customer);
    }

    public Customer findCustomerById(Long id) {
        return customerRepository.findOne(id);
    }

    public void deleteCustomerById(Long id) {
        customerRepository.delete(id);
    }

    public void deleteAllCustomers() {
        customerRepository.deleteAll();
    }

}
