package Service.Order;

import Model.MenuItem.MenuItem;
import Model.Order.Order;

public interface IOrderService {
    void calculateTotal(Order order);
    void addItems(MenuItem menuItem);
    void updateStatus(Order order);
    void createOrder(Order order);
}
