package Service.Admin;

import Model.Admin.Admin;
import Model.Product.Product;

public class AdminService implements IAdminService{
    @Override
    public void addProduct(Admin admin, Product product) {
        System.out.println("Adding the Product : " +product.toString() + " by Admin : " +admin.toString());
    }

    @Override
    public void manageInventory(Admin admin) {
        System.out.println("Managing the Inventory by Admin : " +admin.toString());
    }
}
