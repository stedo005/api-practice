package com.stedo.restapispring.hello;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends MongoRepository<Hello, String> {

    Hello findByName(String name);
    boolean existsByName(String name);

}
