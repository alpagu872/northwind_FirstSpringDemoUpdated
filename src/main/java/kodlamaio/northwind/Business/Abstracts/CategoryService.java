package kodlamaio.northwind.Business.Abstracts;

import kodlamaio.northwind.Entities.Concretes.Category;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategoryService {
    List<Category> getAll();
}
