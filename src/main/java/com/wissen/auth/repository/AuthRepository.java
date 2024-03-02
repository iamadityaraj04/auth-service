package com.wissen.auth.repository;

import com.wissen.auth.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthRepository extends MongoRepository<User, Long> {
}
