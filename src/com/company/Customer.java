package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    //Class Level Variables - Protect the data
    private int customerId;
    private String customerName;
    private String customerPhone;
    int cCount = 1;

    //Constructor Method
    public Customer(int _customerId) {this.customerId = _customerId; }

    public Customer () {}

    //Setters and Getters
    public int getCustomerId() { return customerId; }
    public void setCustomerId(int _customerId) {this.customerId = _customerId;}

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String _customerName) {this.customerName = _customerName;}

    public String getCustomerPhone() { return customerPhone; }
    public void setCustomerPhone(String _customerPhone) {this.customerPhone = _customerPhone;}

    public Customer addCustomer(){
        Customer cust = new Customer(cCount);
        Scanner scnr = new Scanner(System.in);
        System.out.print("What is the Customer's name? ");
        cust.setCustomerName(scnr.nextLine());
        System.out.print("What is the Customer's phone number? ");
        cust.setCustomerPhone(scnr.nextLine());
        cust.setCustomerId(cCount++);

        return cust;
    }

    public static void listCustomers(ArrayList<Customer> cList) {
        for (Customer cust : cList) {
            System.out.println("Customer Id: " + cust.getCustomerId());
            System.out.println("Customer Name: " + cust.getCustomerName());
            System.out.println("Customer Phone: " + cust.getCustomerPhone());
        }
    }


}

