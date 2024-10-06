package Model.Cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int cartID;
    private int userID;
    private List<String> cartItems;

    public Cart(int cartID, int userID) {
        this.cartID = cartID;
        this.userID = userID;
        this.cartItems = new ArrayList<>();
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public List<String> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<String> cartItems) {
        this.cartItems = cartItems;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartID=" + cartID +
                ", userID=" + userID +
                ", cartItems=" + cartItems +
                '}';
    }
}
