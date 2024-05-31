package kodlamaio.northwind.Entities.Concretes;


import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "categories")

public class Category {

    @Id
    @GeneratedValue
    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name ="description")
    private String description;

    @Column(name = "picture")
    private String picture;

    public Category(int categoryId, String categoryName, String description, String picture) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.description = description;
        this.picture = picture;
    }

    public Category(){

    }
}
