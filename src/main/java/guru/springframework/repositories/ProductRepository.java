package guru.springframework.repositories;

import guru.springframework.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dmitri on 2021-10-06.
 */
public interface ProductRepository extends CrudRepository<Product, String> {
}
