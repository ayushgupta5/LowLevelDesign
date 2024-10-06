package Service.Order;

import Model.Order.Order;

public interface IOrderService {
    void placeOrder(Order order);
    void cancelOrder(Order order);
    void trackOrder(Order order);
}
