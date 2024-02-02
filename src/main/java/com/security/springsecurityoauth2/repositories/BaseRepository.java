package com.security.springsecurityoauth2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<O> extends JpaRepository<O, Long> {
}
