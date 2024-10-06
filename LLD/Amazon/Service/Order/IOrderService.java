package Service.Order;

import Model.Order.Order;

public interface IOrderService {
    void createOrder(Order order);
    void trackOrder(Order order);
}
