package Service.Shopping;

import Model.Order.Order;

public interface IShoppingService {
    void addToCart();
    void checkout();
    void placeOrder(Order order);
}
