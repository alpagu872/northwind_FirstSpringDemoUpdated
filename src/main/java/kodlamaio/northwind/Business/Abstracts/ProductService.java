package kodlamaio.northwind.Business.Abstracts;

import kodlamaio.northwind.Entities.Concretes.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    List<Product> getAll();



}
