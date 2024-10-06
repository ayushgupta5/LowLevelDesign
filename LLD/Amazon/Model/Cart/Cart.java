package Model.Cart;

public class Cart {
    private int cartID;
    private String item;

    public Cart(int cartID, String item) {
        this.cartID = cartID;
        this.item = item;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartID=" + cartID +
                ", item='" + item + '\'' +
                '}';
    }
}
