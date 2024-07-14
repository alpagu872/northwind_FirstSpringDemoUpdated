package kodlamaio.northwind.DataAccess.Abstracts;

import kodlamaio.northwind.Entities.Concretes.Product;
import kodlamaio.northwind.Entities.Dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDAO extends JpaRepository<Product, Integer> {

    Product getByProductName(String productName);

    Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);

    List<Product> getByProductNameOrCategory_CategoryId(String productName,int categoryId);

    List<Product> getByCategory_CategoryIdIn(List<Integer> categories);

    List<Product> getByProductNameContains(String productName);

    List<Product> getByProductNameStartsWith(String productName);

    @Query("From Product where productName=:productName and category.categoryId=:categoryId")
    List<Product> getByNameAndCategory_CategoryId(String productName, int categoryId);

    //Select * from products where product_name = bisey and categoryId= bişey


    @Query("select new kodlamaio.northwind.Entities.Dtos.ProductWithCategoryDto(p.id, p.productName, c.categoryName) From Product p , Category c Inner Join c.products")
    List<ProductWithCategoryDto> getProductWithCategoryDetails();

    // select p.productId, p.productName, c.categoryName from Category c inner join Product p
    // on c.categoryId = p.categoryId

}
