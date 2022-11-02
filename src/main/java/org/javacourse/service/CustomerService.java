package org.javacourse.service;

import org.javacourse.dto.Customer;
import org.javacourse.repository.CustomerRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {
    private List<Customer> customers;
    private CustomerRepository repo;
    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }
    public List<Customer> getAll() {
        return this.repo.FindAll();
    }
    public Customer registerCustomer (String name, String phoneNumber, String ssn){
        Customer customer = new Customer(name, phoneNumber, ssn);
        this.repo.Create(customer);
        return customer;
    }
    public void updateCustomersPhoneNumber (String name, String phoneNumber, String ssn){
        Customer customer= new Customer(name, phoneNumber, ssn);
        customers.stream()
                 .filter(c-> name.equals(c.getName()))
                 .peek(c-> c.setPhoneNumber(phoneNumber))
                 .collect(Collectors.toList());
    }
    public void deleteCustomer (String name){
        customers.stream()
                .filter(c -> !name.equals(c.getName()))
                .collect(Collectors.toList());

    }
}
