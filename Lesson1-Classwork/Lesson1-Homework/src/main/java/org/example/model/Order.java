package org.example.model;

import java.time.LocalDate;

public class Order {
    private String orderId;
    private String customerName;
    private double amount;
    private LocalDate date;

    public Order(String orderId, String customerName, double amount, LocalDate date) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        this.date = date;
    }

    public Order() {

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
