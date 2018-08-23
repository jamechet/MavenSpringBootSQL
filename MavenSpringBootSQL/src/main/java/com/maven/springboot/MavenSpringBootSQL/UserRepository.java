package com.maven.springboot.MavenSpringBootSQL;

import org.springframework.data.repository.CrudRepository;

import com.maven.springboot.MavenSpringBootSQL.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}
