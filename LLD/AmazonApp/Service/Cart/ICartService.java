package Service.Cart;

import Model.Cart.Cart;

public interface ICartService {
    void addToCart(Cart cart);
    void removeFromCart(Cart cart);
    void viewCart(Cart cart);
}
