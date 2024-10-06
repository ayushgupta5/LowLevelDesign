package Service.User;

import Model.Order.Order;
import Model.Restaurant.Restaurant;

public class UserService implements IUserService {
    @Override
    public void searchRestaurants(Restaurant restaurant) {
        System.out.println("Searching the Restaurants by User : " +restaurant.toString());
    }

    @Override
    public void placeOrder(Order order) {
        System.out.println("Placing the Order : " +order.toString());
    }

    @Override
    public void trackOrder(Order order) {
        System.out.println("Tracking the Order : " +order.toString());
    }
}
