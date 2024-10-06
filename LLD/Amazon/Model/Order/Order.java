package Model.Order;

import Model.User.User;

public class Order {
    private int orderID;
    private User user;
    private String orderItem;
    private double totalAmount;

    public Order(int orderID, User user, String orderItem, double totalAmount) {
        this.orderID = orderID;
        this.user = user;
        this.orderItem = orderItem;
        this.totalAmount = totalAmount;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(String orderItem) {
        this.orderItem = orderItem;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", user=" + user +
                ", orderItem='" + orderItem + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
