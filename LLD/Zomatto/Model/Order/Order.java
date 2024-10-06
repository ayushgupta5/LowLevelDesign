package Model.Order;

import Model.Restaurant.Restaurant;
import Model.User.User;

public class Order {
    private int orderID;
    private User user;
    private Restaurant restaurant;
    private double totalPrice;
    private String deliveryAddress;

    public Order(int orderID, User user, Restaurant restaurant, double totalPrice, String deliveryAddress) {
        this.orderID = orderID;
        this.user = user;
        this.restaurant = restaurant;
        this.totalPrice = totalPrice;
        this.deliveryAddress = deliveryAddress;
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

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", user=" + user +
                ", restaurant=" + restaurant +
                ", totalPrice=" + totalPrice +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }
}
