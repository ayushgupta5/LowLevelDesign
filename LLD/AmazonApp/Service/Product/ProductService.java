package Service.Product;

import Model.Product.Product;

public class ProductService implements IProductService {
    @Override
    public void addProduct(Product product) {
        System.out.println("Adding the Product : " +product);
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("Updating the Product : " +product);
    }

    @Override
    public void removeProduct(Product product) {
        System.out.println("Removing the Product : " +product);
    }
}
