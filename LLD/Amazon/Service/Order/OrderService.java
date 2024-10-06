package Service.Order;

import Model.Order.Order;

public class OrderService implements IOrderService {
    @Override
    public void createOrder(Order order) {
        System.out.println("Creating the Order : " + order);
    }

    @Override
    public void trackOrder(Order order) {
        System.out.println("Tracking the Order : " + order);
    }
}
