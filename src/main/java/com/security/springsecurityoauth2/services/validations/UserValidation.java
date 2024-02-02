package com.security.springsecurityoauth2.services.validations;

import com.security.springsecurityoauth2.entities.User;
import com.security.springsecurityoauth2.handlingExceptions.costumExceptions.AlreadyExistsException;
import com.security.springsecurityoauth2.repositories.UserRepository;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

@Component
public class UserValidation extends BaseValidation{
    private UserRepository userRepository;

    public UserValidation(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void validateUserOnCreating(User user) {

        validateObject(user);

        throwExceptionIf(EMAIL_ALREADY_EXISTS, user, AlreadyExistsException::new, "Email Already Exists");

        throwExceptionIf(USERNAME_ALREADY_EXISTS, user, AlreadyExistsException::new, "Username Already Exists");

    }

    private final Predicate<User> EMAIL_ALREADY_EXISTS = user -> userRepository.existsByEmail(user.getEmail());

    private final Predicate<User> USERNAME_ALREADY_EXISTS = user -> userRepository.existsByUsername(user.getUsername());
}
