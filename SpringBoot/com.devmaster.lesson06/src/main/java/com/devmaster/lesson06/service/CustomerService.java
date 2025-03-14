package com.devmaster.lesson06.service;

import com.devmaster.lesson06.dto.CustomerDTO;
import com.devmaster.lesson06.enity.Customer;
import com.devmaster.lesson06.repository.CustomerRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Optional<CustomerDTO> findById(Long id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer == null) {
            return Optional.empty();
        }
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setId(customer.getId());
        customerDTO.setUsername(customer.getUsername());
        customerDTO.setFullName(customer.getFullName());
        customerDTO.setAddress(customer.getAddress());
        customerDTO.setPhone(customer.getPhone());
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setBirthday(customer.getBirthday());
        customerDTO.setActive(customer.isActive());
        return Optional.of(customerDTO);
    }

    public boolean save(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setUsername(customerDTO.getUsername());
        customer.setFullName(customerDTO.getFullName());
        customer.setAddress(customerDTO.getAddress());
        customer.setPassword(customerDTO.getPassword());
        customer.setPhone(customerDTO.getPhone());
        customer.setEmail(customerDTO.getEmail());
        customer.setBirthday(customerDTO.getBirthday());
        customer.setActive(customerDTO.isActive());


        try {
            customerRepository.save(customer);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public Customer updateCustomerById(Long id, CustomerDTO updatedCustomer) {
        return customerRepository.findById(id).map(customer -> {
            customer.setUsername(updatedCustomer.getUsername());
            customer.setFullName(updatedCustomer.getFullName());
            customer.setAddress(updatedCustomer.getAddress());
            customer.setPhone(updatedCustomer.getPhone());
            customer.setEmail(updatedCustomer.getEmail());
            customer.setBirthday(updatedCustomer.getBirthday());
            customer.setActive(updatedCustomer.isActive());
            return customerRepository.save(customer);
        }).orElseThrow(() -> new IllegalStateException("Invalid Customer ID: " + id));
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
