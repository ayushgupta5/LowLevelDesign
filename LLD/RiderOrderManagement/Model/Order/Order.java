package Model.Order;

public class Order {
    private int orderID;
    private String pickupLocation;
    private String dropOffLocation;
    private String OrderStatus;

    public Order(int orderID, String pickupLocation, String dropOffLocation, String orderStatus) {
        this.orderID = orderID;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        OrderStatus = orderStatus;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        OrderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                ", OrderStatus='" + OrderStatus + '\'' +
                '}';
    }
}
