//package edu.psu.ist;
package com.company;
/*
Project: Lab 9
Purpose Details: Pizza ordering application
Course: IST 242
Author: JiaJia Liu
Date Developed: 3.17.19
Last Date Changed: 3.14.19
Rev: 3
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    int oCount = 0;
    public static void main(String[] args) {

        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char CUST_PRNT = 'P';
        final char MENU_CODE = 'M';
        final char ORDE_CODE = 'O';
        //final char ORDE_PRINT = 'A';
        final char TRAN_CODE = 'T';
        final char HELP_CODE = '?';
        char userAction;
        final String PROMPT_ACTION = "Add 'C'ustomer, 'P'rint Customer, List 'M'enu, Add 'O'rder, List 'T'ransaction or 'E'xit: ";

        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Menu> mList = new ArrayList<>();
        ArrayList<Order> oList = new ArrayList<>();
        ArrayList<Transaction> tList = new ArrayList<>();


        Order order1 = new Order(1);
        Transaction trans1 = new Transaction(1);

        Menu menu1 = new Menu(1, "Plain", 4.99f);
        Menu menu2 = new Menu(2, "Meat", 6.99f);
        Menu menu3 = new Menu(3, "Extra", 7.99f);
        Menu menu4 = new Menu(4, "Veg", 5.99f);

        mList.add(menu1);
        mList.add(menu2);
        mList.add(menu3);
        mList.add(menu4);

        oList.add(order1);
        tList.add(trans1);


        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch(userAction) {
                case CUST_CODE : cList.add(cust.addCustomer());//addCustomer();
                    break;
                case CUST_PRNT : Customer.listCustomers(cList);
                    break;
                case MENU_CODE : Menu.listMenu(mList);
                    break;
                case ORDE_CODE : oList.add(Order.addOrder(mList));//addOrders();
                    break;
                case TRAN_CODE : //listTransactions();
                    break;
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }

    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }


    public static int countItems() {
        int oCount = 1;
        return oCount++;
    }


/*
    public static int countCustomer() {
        int cCount = 0;
        return cCount++;
    }

    public float getPrice(ArrayList<Menu> listMenu) {
        float price = 0;
        for(Menu menu : listMenu) {price = menu.getMenuPrice(); }
        return price;
    }
    */
}
