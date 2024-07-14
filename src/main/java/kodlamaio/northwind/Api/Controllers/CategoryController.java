package kodlamaio.northwind.Api.Controllers;

import kodlamaio.northwind.Business.Abstracts.CategoryService;
import kodlamaio.northwind.Entities.Concretes.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/getall")
    public List<Category> getAll(){
        return this.categoryService.getAll();
    }
}
