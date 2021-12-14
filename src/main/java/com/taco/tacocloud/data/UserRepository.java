package com.taco.tacocloud.data;

import com.taco.tacocloud.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
