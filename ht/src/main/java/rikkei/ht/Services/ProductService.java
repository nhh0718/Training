package rikkei.ht.Services;

import rikkei.ht.Entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProduct();

    void saveProduct(Product product);

    void deleteProduct(int id);

    Optional<Product> getProductById(int id);
}
