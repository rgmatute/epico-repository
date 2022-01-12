package com.github.rgmatute.repository.postgres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.rgmatute.domain.postgres.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
