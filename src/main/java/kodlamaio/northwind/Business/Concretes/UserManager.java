package kodlamaio.northwind.Business.Concretes;

import kodlamaio.northwind.Business.Abstracts.UserService;
import kodlamaio.northwind.Core.DataAccess.UserDAO;
import kodlamaio.northwind.Core.Entities.User;
import kodlamaio.northwind.Core.utilities.results.DataResult;
import kodlamaio.northwind.Core.utilities.results.Result;
import kodlamaio.northwind.Core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.Core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserManager implements UserService {

    private UserDAO userDAO;


    @Autowired
    public UserManager(UserDAO userDAO) {
        super();
        this.userDAO = userDAO;
    }

    @Override
    public Result add(User user) {


        this.userDAO.save(user);

        return new SuccessResult("Kullanıcı eklendi.");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<>(this.userDAO.findByEmail(email),
                "Kullanıcı Bulundu.");
    }
}
