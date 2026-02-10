package com.stschool.ecommerce.main;

import com.stschool.ecommerce.controller.CustomerController;
import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.service.CustomerService;
import com.stschool.ecommerce.ui.CustomerMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. SignUp");
        System.out.println("Enter your Choice: ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                CustomerMenu customerMenu = new CustomerMenu();
                Customer customer = customerMenu.inputCustomerSignUpData();
                CustomerController customerController = new CustomerController();
                Customer newCustomer = customerController.handleSignupData(customer);
                System.out.println("New Customer Details: ");
                CustomerService customerService = new CustomerService();
                customerService.displayNewCustomer(newCustomer);
                break;
        }
    }
}
