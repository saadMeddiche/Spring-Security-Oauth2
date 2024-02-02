package com.security.springsecurityoauth2.services.implementations;

import com.security.springsecurityoauth2.entities.User;
import com.security.springsecurityoauth2.repositories.UserRepository;
import com.security.springsecurityoauth2.services.UserService;
import com.security.springsecurityoauth2.services.validations.UserValidation;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    private final UserValidation validation;


    public User createUser(User user){

        validation.validateUserOnCreating(user);

        return userRepository.save(user);
    }
    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    @Override
    public User getByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    @Override
    public UserDetailsService userDetailsService(){
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                return findByUsername(username);
            }
        };
    }
}
