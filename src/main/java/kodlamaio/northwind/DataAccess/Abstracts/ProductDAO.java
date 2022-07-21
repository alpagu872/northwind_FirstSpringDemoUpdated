package kodlamaio.northwind.DataAccess.Abstracts;

import kodlamaio.northwind.Entities.Concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<Product, Integer> {


}
