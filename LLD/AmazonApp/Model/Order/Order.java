package Model.Order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    //orderId, userId, orderItems, totalPrice
    private int orderID;
    private int userID;
    private List<String> orderItems;
    private double totalPrice;

    public Order(int orderID, int userID, double totalPrice) {
        this.orderID = orderID;
        this.userID = userID;
        this.orderItems = new ArrayList<>();
        this.totalPrice = totalPrice;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public List<String> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<String> orderItems) {
        this.orderItems = orderItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", userID=" + userID +
                ", orderItems=" + orderItems +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
