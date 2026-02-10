package com.stschool.ecommerce.controller;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.service.CustomerService;

public class CustomerController {
    public Customer handleSignupData(Customer customer){
        System.out.println("Handling Customer :"+ customer);
        CustomerService customerService = new CustomerService();
        return customerService.handleSignupData(customer);
    }
}
