package com.security.springsecurityoauth2.repositories;

import com.security.springsecurityoauth2.entities.User;

import java.util.Optional;

public interface UserRepository extends BaseRepository<User>{

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
