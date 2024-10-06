package Service.Cart;

public class CartService implements ICartService {
    @Override
    public void addItem() {
        System.out.println("Adding the Items");
    }

    @Override
    public void removeItem() {
        System.out.println("Removing the Items");
    }

    @Override
    public void calculateTotal() {
        System.out.println("Calculating the Total Amount");
    }
}
