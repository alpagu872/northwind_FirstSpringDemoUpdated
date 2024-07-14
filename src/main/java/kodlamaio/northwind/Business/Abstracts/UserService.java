package kodlamaio.northwind.Business.Abstracts;

import kodlamaio.northwind.Core.Entities.User;
import kodlamaio.northwind.Core.utilities.results.DataResult;
import kodlamaio.northwind.Core.utilities.results.Result;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Result add(User user);

    DataResult<User> findByEmail(String email);
}
