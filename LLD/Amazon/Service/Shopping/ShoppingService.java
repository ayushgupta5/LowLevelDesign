package Service.Shopping;

import Model.Order.Order;

public class ShoppingService implements IShoppingService {
    @Override
    public void addToCart() {
        System.out.println("Adding the Items into the Cart");
    }

    @Override
    public void checkout() {
        System.out.println("Checking Out the Items");
    }

    @Override
    public void placeOrder(Order order) {
        System.out.println("Placing the Order : " +order);
    }
}
