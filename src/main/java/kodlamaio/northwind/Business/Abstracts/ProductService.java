package kodlamaio.northwind.Business.Abstracts;

import kodlamaio.northwind.Core.utilities.results.DataResult;
import kodlamaio.northwind.Core.utilities.results.Result;
import kodlamaio.northwind.Entities.Concretes.Product;
import kodlamaio.northwind.Entities.Dtos.ProductWithCategoryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    DataResult<List<Product>> getAll();

    DataResult<List<Product>> getAll(int pageNo, int pageSize);

    DataResult<List<Product>> getAllSorted();

    Result add(Product product);

    DataResult<Product> getByProductName(String productName);

    DataResult<Product> getByProductNameAndCategory(String productName, int categoryId);

    DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);

    DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

    DataResult<List<Product>> getByProductNameContains(String productName);

    DataResult<List<Product>> getByProductNameStartsWith(String productName);


    DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();

}
