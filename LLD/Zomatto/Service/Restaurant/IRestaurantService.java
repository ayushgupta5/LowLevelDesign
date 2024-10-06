package Service.Restaurant;

import Model.Order.Order;

public interface IRestaurantService {
    void acceptOrder(Order order);
    void updateOrderStatus(Order order);
}
