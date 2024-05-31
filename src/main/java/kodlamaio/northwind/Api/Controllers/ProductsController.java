package kodlamaio.northwind.Api.Controllers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.northwind.Business.Abstracts.ProductService;
import kodlamaio.northwind.Core.utilities.results.DataResult;

import kodlamaio.northwind.Core.utilities.results.Result;
import kodlamaio.northwind.Entities.Concretes.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public DataResult<List<Product>> getAll() {
        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return this.productService.add(product);
    }

}