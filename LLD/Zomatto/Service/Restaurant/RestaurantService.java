package Service.Restaurant;

import Model.Order.Order;

public class RestaurantService implements IRestaurantService {
    @Override
    public void acceptOrder(Order order) {
        System.out.println("Accepting the Order : " +order.toString());
    }

    @Override
    public void updateOrderStatus(Order order) {
        System.out.println("Updating the Order Status : " +order.toString());
    }
}
