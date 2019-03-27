package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private String orderItemsName;
    private int orderQuantity;
    private float orderTotal;
    int oCount = 1;
    //private ArrayList<Menu> orderItem;

    //Constructor Method
    public Order(int _orderId){
        this.orderId = _orderId;
    }
    public Order() {}

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
    public Order addOrder(ArrayList<Menu> mList) {
        String again;

        Order order = new Order(Main.countItems());
        Scanner scnr = new Scanner(System.in);


/* try to loop it by the number of the order
        int orderNum;
        Menu.listMenu(mList);
        System.out.println("How many item would you like to Order? ");
        orderNum = scnr.nextInt();

        for(int i = 1; i <= orderNum; i++) {
            System.out.printf("\nEnter Item#%d Name: ", i);
            order.setOrderItemsName(scnr.nextLine());
            System.out.print("\nEnter Quantity: ");
            order.setOrderQuantity(scnr.nextInt());
            System.out.println();
        }
        return order;
*/

        while (true) {
            Menu.listMenu(mList);
            System.out.println("\nEnter Item Name: ");
            order.setOrderItemsName(scnr.nextLine());
            System.out.println("Enter Quantity");
            order.setOrderQuantity(scnr.nextInt());
            System.out.println("Another Order? (Y/N): ");
            //order.setOrderId(oCount++);

            again = scnr.nextLine();
            if (again.equalsIgnoreCase("N")) { break; }
        }
        return order;
    }


    public float orderTotal() {
        int i = 1;
        float total = 0;

        do {
            //total = getOrderQuantity() * getPrice();
        }
        while (i == getOrderId());

        return total;
    }
/*
    public float getPrice(ArrayList<Menu> listMenu) {
        float price = 0;
        //for(Menu menu : listMenu) {price = menu.getMenuPrice(); }
        price = Menu.getMenuPrice();
        return price;
    }
*/
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