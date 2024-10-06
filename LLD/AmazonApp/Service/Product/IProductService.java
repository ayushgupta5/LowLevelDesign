package Service.Product;

import Model.Product.Product;

public interface IProductService {
    void addProduct(Product product);
    void updateProduct(Product product);
    void removeProduct(Product product);
}
