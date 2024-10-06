package Service.Cart;

import Model.Cart.Cart;

public class CartService implements ICartService {
    @Override
    public void addToCart(Cart cart) {
        System.out.println("Adding the Item to the Cart : " +cart);
    }

    @Override
    public void removeFromCart(Cart cart) {
        System.out.println("Removing the Item to the Cart : " +cart);
    }

    @Override
    public void viewCart(Cart cart) {
        System.out.println("Viewing the Item to the Cart : " +cart);
    }
}
