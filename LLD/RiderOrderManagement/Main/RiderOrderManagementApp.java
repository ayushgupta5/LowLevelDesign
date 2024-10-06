package Main;

import Model.Order.Order;
import Model.Rider.Rider;
import Service.Order.IOrderService;
import Service.Order.OrderService;
import Service.Rider.IRiderService;
import Service.Rider.RiderService;

public class RiderOrderManagementApp {
    public static void main(String[] args) {
        Order order = new Order(1, "pickupLocation", "dropOffLocation", "Processing");
        Rider rider = new Rider(1, "RiderName", "Processing", "BLR");
        IOrderService orderService = new OrderService();
        orderService.assignOrder(order);
        orderService.updateStatus(order);
        orderService.updateOrderStatus(order);

        IRiderService riderService = new RiderService();
        riderService.setStatus(rider);
    }
}
