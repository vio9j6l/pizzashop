package com.company;

public class Order {
    //Class Level Variables - Protect the data
    int oCount = 1;
    private int orderId;
    private String orderItemsName;
    private int quantity;
    private double price, unitTotal, unitTotalPrice;
    private double totalPrice;
    private Menu menuItem;

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

    public int getQuantity() { return quantity; }
    public void setQuantity(int _quantity) {this.quantity = _quantity; }

    //public float getOrderTotal() { return orderTotal; }
    //public void setOrderTotal(float _orderTotal) {this.orderTotal = _orderTotal;}

    //get unitTotal
    public Double getTotalprice(double _unitTotal) {
        totalPrice = 0;
        totalPrice += _unitTotal;
        return totalPrice;
    }

    public double getUnitTotal(double _price, int _quantity) {
        unitTotal = _price * _quantity;
        unitTotalPrice += unitTotal;
        return unitTotal;
    }

    //printout orders
    public void printOrder(String _menuItem, double _unitTotal) {
        System.out.println(menuItem + "Total: " + unitTotal);
    }

    /*
    public static void printOrder(ArrayList<Order> oList){
        for (Order orderItem : oList) {
            System.out.println("Order ID: " + orderItem.getOrderId());
            System.out.print("Order Items: " + orderItem.getOrderItemsName());
            System.out.println("Order Quantity: " + orderItem.getQuantity());
        }
    }
    */
}