package kodlamaio.northwind.Business.Concretes;

import kodlamaio.northwind.Business.Abstracts.ProductService;
import kodlamaio.northwind.Core.utilities.results.DataResult;
import kodlamaio.northwind.Core.utilities.results.Result;
import kodlamaio.northwind.Core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.Core.utilities.results.SuccessResult;
import kodlamaio.northwind.DataAccess.Abstracts.ProductDAO;
import kodlamaio.northwind.Entities.Concretes.Product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDAO productDao;

    public ProductManager(ProductDAO productDao) { //injection
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi.");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ürün Eklendi.");
    }
}
