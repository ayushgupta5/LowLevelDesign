package Service.User;

import Model.Order.Order;
import Model.Restaurant.Restaurant;

public interface IUserService {
    void searchRestaurants(Restaurant restaurant);
    void placeOrder(Order order);
    void trackOrder(Order order);
}
