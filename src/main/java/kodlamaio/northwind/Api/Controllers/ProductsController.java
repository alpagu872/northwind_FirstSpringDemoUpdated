package kodlamaio.northwind.Api.Controllers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.northwind.Business.Abstracts.ProductService;
import kodlamaio.northwind.Core.utilities.results.DataResult;

import kodlamaio.northwind.Core.utilities.results.Result;
import kodlamaio.northwind.Entities.Concretes.Product;
import kodlamaio.northwind.Entities.Dtos.ProductWithCategoryDto;
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

    @GetMapping("/getAllSorted")
    public DataResult<List<Product>> getAllSorted() {
        return this.productService.getAllSorted();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product) {
        return this.productService.add(product);
    }

    @GetMapping("/getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName) {

        return this.productService.getByProductName(productName);
    }

    @GetMapping("/getByProductNameAndCategory")
    public DataResult<Product> getByProductNameAndCategory(@RequestParam String productName, @RequestParam int category) {

        return this.productService.getByProductNameAndCategory(productName, category);

    }

    @GetMapping("/getByProductNameOrCategory_CategoryId")
    public DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int category) {
        return this.productService.getByProductNameOrCategory(productName, category);
    }

    @GetMapping("/getByCategoryIn")
    public DataResult<List<Product>> getByCategoryIn(@RequestParam List<Integer> categories) {
        return this.productService.getByCategoryIn(categories);
    }

    @GetMapping("/getByProductNameContains")
    public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName) {
        return this.productService.getByProductNameContains(productName);
    }

    @GetMapping("getByProductNameStartsWith")
    public DataResult<List<Product>> getByProductNameStartsWith(@RequestParam String str) {
        return this.productService.getByProductNameStartsWith(str);
    }

    @GetMapping("/getAllByPage")
    public DataResult<List<Product>> getAll(@RequestParam int pageNo, @RequestParam int pageSize) {

        return this.productService.getAll(pageNo, pageSize);
    }


    @GetMapping("/getProductWithCategoryDetails")
    public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
        return this.productService.getProductWithCategoryDetails();

    }
}