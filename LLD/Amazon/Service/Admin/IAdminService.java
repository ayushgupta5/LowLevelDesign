package Service.Admin;

import Model.Order.Order;
import Model.Product.Product;

public interface IAdminService {
    void manageProduct(Product product);
    void viewOrders(Order order);
}
