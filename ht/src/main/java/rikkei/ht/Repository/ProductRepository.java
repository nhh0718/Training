package rikkei.ht.Repository;

import org.springframework.data.repository.CrudRepository;
import rikkei.ht.Entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
