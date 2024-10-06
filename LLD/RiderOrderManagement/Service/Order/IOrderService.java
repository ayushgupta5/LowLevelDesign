package Service.Order;

import Model.Order.Order;

public interface IOrderService {
    void updateStatus(Order order);
    void assignOrder(Order order);
    void updateOrderStatus(Order order);
}
