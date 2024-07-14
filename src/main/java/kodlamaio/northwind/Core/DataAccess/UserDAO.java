package kodlamaio.northwind.Core.DataAccess;

import kodlamaio.northwind.Core.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Integer> {

    User findByEmail(String email);

}
