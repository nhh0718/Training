package rikkei.restfulapidemo.Service;import rikkei.restfulapidemo.Entity.Product;import java.util.List;import java.util.Optional;public interface ProductService {    List<Product> getAllProduct();    void save(Product product);    void deleteProduct(int id);    Optional<Product> findById(int id);}