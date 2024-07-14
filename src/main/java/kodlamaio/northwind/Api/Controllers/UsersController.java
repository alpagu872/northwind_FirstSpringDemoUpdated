package kodlamaio.northwind.Api.Controllers;

import jakarta.validation.Valid;
import kodlamaio.northwind.Business.Abstracts.UserService;
import kodlamaio.northwind.Core.Entities.User;
import kodlamaio.northwind.Core.utilities.results.DataResult;
import kodlamaio.northwind.Core.utilities.results.ErrorDataResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody User user) {

        return ResponseEntity.ok(this.userService.add(user));
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions) {

        Map<String, String> validationErrors = new HashMap<String, String>();

        for (FieldError FieldError : exceptions.getBindingResult().getFieldErrors()) {

            validationErrors.put(FieldError.getField(), FieldError.getDefaultMessage());

        }

        ErrorDataResult<Object> errors = new ErrorDataResult<>(validationErrors, "Doğrulama hataları.");

        return errors;
    }


    @GetMapping("/findByEmail")
    public DataResult<User> finByEmail(@RequestParam String mail) {
        return this.userService.findByEmail(mail);
    }
}
