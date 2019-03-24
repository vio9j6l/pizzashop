package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    //try
    //Class Level Variables - Protect the data
    private int orderId;
    private String orderItemsName;
    private int orderQuantity;
    private float orderTotal;
    private ArrayList<Menu> orderItem;

    //Constructor Method
    public Order(int _orderId){
        this.orderId = _orderId;
    }

    //Setters and Getters
    public int getorderId() { return orderId; }
    public void setorderId(int _orderId) {this.orderId = _orderId;}

    public String getOrderItemsName() { return orderItemsName; }
    public void setOrderItemsName(String _orderItemsName) {this.orderItemsName = _orderItemsName; }

    public int getOrderQuantity() { return orderQuantity; }
    public void setOrderQuantity(int _orderQuantity) {this.orderQuantity = _orderQuantity; }

    public float getOrderTotal() { return orderTotal; }
    public void setOrderTotal(float _orderTotal) {this.orderTotal = _orderTotal;}

    //add orders
    public static Order addOrder(){
        Order oItems = new Order(Main.countItems());
        Scanner scnr = new Scanner(System.in);
        System.out.println("What would you like to order ?");
        oItems.setOrderItemsName(scnr.nextLine());
        System.out.println("How many would you like ?");
        oItems.setOrderQuantity(scnr.nextInt());
        return oItems;
    }
    //printout orders

    public static void printOrder(ArrayList<Order> oList){
        for (Order orderItem : oList) {
            System.out.println("Order ID: " + orderItem.getorderId());
            System.out.println("Order Items: " + orderItem.getOrderItemsName());
            System.out.println("Order Total: ");
        }
    }
    //printout menu items for selection
}