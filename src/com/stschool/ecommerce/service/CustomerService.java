package com.stschool.ecommerce.service;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;

public class CustomerService {
    public Customer handleSignupData(Customer customer){
        System.out.println("Passing Customer Details to Repository Layer");
        System.out.println("Customer Details :"+ customer);
        CustomerRepository customerRepository = new CustomerRepository();
        return customerRepository.addNewCustomer(customer);
    }

    public void displayNewCustomer(Customer customer){
        System.out.println("Id : "+customer.getId());
        System.out.println("First Name :"+ customer.getFirstName());
        System.out.println("Last Name :"+ customer.getLastName());
        System.out.println("E-Mail :"+ customer.getEmail());
    }
}
