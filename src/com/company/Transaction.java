package com.company;
import java.util.ArrayList;

enum PaymentType {cash, credit}

public class Transaction {

    //Class Level Variables - Protect the data
    private int transactionId;
    private Order order;
    private PaymentType payType;

    //Constructor Method
    public Transaction(int _transactionId, Order _order, PaymentType _payType){
        this.transactionId = _transactionId;
        this.order = _order;
        this.payType = _payType;
    }

    //Setters and Getters
    public int getTransactionId() { return transactionId; }
    public void setTransactionId(int _transactionId) {this.transactionId = _transactionId;}

    public Order getOrder() { return order; }
    public void setOrder(Order _order) {this.order = _order;}

    public PaymentType getPaymentType() { return payType;}
    public void setPaymentType(PaymentType _payType) {this.payType = _payType;}

//add an addTransaction method

    public static void listTransactions(ArrayList<Transaction> tList) {
        for (Transaction trans: tList){
            System.out.println("Transaction ID: " + trans.getTransactionId());
            //System.out.println("Order: " + trans.getOrder());
            System.out.println("Payment Type: " + trans.getPaymentType());
        }
    }

    //ask customer to choose how to pay for the order
    //get order details(orderId, order Items, and total price)
}
