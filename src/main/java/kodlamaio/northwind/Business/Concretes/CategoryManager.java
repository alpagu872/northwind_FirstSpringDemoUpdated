package kodlamaio.northwind.Business.Concretes;

import kodlamaio.northwind.Business.Abstracts.CategoryService;
import kodlamaio.northwind.DataAccess.Abstracts.CategoryDAO;
import kodlamaio.northwind.Entities.Concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager implements CategoryService {
    private CategoryDAO categoryDAO;

    @Autowired
    public CategoryManager(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    @Override
    public List<Category> getAll() {
        return this.categoryDAO.findAll();
    }
}
