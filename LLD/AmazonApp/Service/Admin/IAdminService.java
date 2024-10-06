package Service.Admin;

import Model.Admin.Admin;
import Model.Product.Product;

public interface IAdminService {
    void addProduct(Admin admin, Product product);
    void manageInventory(Admin admin);
}
