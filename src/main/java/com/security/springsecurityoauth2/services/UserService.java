package com.security.springsecurityoauth2.services;


import com.security.springsecurityoauth2.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    UserDetailsService userDetailsService();

    User findByUsername(String username);

    User getByEmail(String email);

    User createUser(User user);
}
