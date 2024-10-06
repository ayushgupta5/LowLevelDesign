package Service.Product;

import Model.Product.Product;

public class ProductService implements IProductService {
    @Override
    public void updateStock(Product product) {
        System.out.println("Updating the Stocks of the Product : " +product);
    }
}
