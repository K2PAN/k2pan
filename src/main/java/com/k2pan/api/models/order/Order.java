package com.k2pan.api.models.order;

public class Order {

    private int id;
    private String customerName;
    private String customerEmail;
    private double totalPrice;
    private boolean status;

    public Order(int id, String customerName, String customerEmail, double totalPrice, boolean status) {
        this.id = id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", totalPrice=" + totalPrice +
                ", status=" + status +
                '}';
    }
}

