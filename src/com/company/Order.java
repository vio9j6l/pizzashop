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
    public int getOrderId() { return orderId; }
    public void setOrderId(int _orderId) {this.orderId = _orderId;}

    public String getOrderItemsName() { return orderItemsName; }
    public void setOrderItemsName(String _orderItemsName) {this.orderItemsName = _orderItemsName; }

    public int getOrderQuantity() { return orderQuantity; }
    public void setOrderQuantity(int _orderQuantity) {this.orderQuantity = _orderQuantity; }

    public float getOrderTotal() { return orderTotal; }
    public void setOrderTotal(float _orderTotal) {this.orderTotal = _orderTotal;}

    //add orders
    public static Order addOrder(ArrayList<Menu> mList) {
        String again;

        Order order = new Order(Main.countItems());
        Scanner scnr = new Scanner(System.in);

        while (true) {
            //Order order = new Order(Main.countItems());
            //Scanner scnr = new Scanner(System.in);
            Menu.listMenu(mList);
            System.out.println("\nEnter Item Name: ");
            order.setOrderItemsName(scnr.nextLine());
            System.out.println("Enter Quantity");
            order.setOrderQuantity(scnr.nextInt());

            System.out.println("Another Order? (Y/N): ");
            again = scnr.nextLine();
            if (again.equalsIgnoreCase("N")) { break; }
        }
        return order;
    }

    public float orderTotal() {
        int i = 1;
        float total = 0;

        do {
            total = getOrderQuantity() * getPrice();
        }
        while (i == getOrderId());

        return total;
    }

    public float getPrice(ArrayList<Menu> listMenu) {
        float price = 0;
        //for(Menu menu : listMenu) {price = menu.getMenuPrice(); }
        price = Menu.getMenuPrice();
        return price;
    }

    //printout orders

    public static void printOrder(ArrayList<Order> oList){
        for (Order orderItem : oList) {
            System.out.println("Order ID: " + orderItem.getOrderId());
            System.out.print("Order Items: " + orderItem.getOrderItemsName());
            System.out.println("Order Quantity: " + orderItem.getOrderQuantity());
            //System.out.println("Order Total: ");
        }
    }
    //printout menu items for selection
}