package kodlamaio.northwind.Business.Abstracts;

import kodlamaio.northwind.Core.utilities.results.DataResult;
import kodlamaio.northwind.Core.utilities.results.Result;
import kodlamaio.northwind.Entities.Concretes.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);



}
