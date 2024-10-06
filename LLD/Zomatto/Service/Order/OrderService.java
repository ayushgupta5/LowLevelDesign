package Service.Order;

import Model.MenuItem.MenuItem;
import Model.Order.Order;

public class OrderService implements IOrderService {
    @Override
    public void calculateTotal(Order order) {
        System.out.println("Calculating the Total Amount of the Order : " +order.toString());
    }

    @Override
    public void addItems(MenuItem menuItem) {
        System.out.println("Adding Items to Menu : " +menuItem.toString());
    }

    @Override
    public void updateStatus(Order order) {
        System.out.println("Updating the Status of the Order : " +order.toString());
    }

    @Override
    public void createOrder(Order order) {
        System.out.println("Creating the Order : " +order.toString());
    }
}
