package Service.Admin;

import Model.Order.Order;
import Model.Product.Product;

public class AdminService implements IAdminService {
    @Override
    public void manageProduct(Product product) {
        System.out.println("Managing the Product : " +product);
    }

    @Override
    public void viewOrders(Order order) {
        System.out.println("View the Orders : " +order);
    }
}
