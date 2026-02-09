package com.stschool.ecommerce.ui;

import com.stschool.ecommerce.model.Customer;

import java.util.Scanner;

public class CustomerMenu {
    public Customer inputCustomerSignUpData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id:");
        String id = scanner.next();
        System.out.println("Enter First Name:");
        String firstName = scanner.next();
        System.out.println("Enter Last Name:");
        String lastName = scanner.next();
        System.out.println("Enter E-mail:");
        String email = scanner.next();
        System.out.println("Enter Contact No:");
        String contactNo = scanner.next();
        System.out.println("Enter Password:");
        String password = scanner.next();

        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setContactNo(contactNo);
        customer.setPassword(password);

        scanner.close();
        return customer;

    }
}
