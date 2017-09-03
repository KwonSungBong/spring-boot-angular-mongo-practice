package com.example.demo.repository;

import com.example.demo.document.User;
import com.example.demo.repository.custom.UserRepositoryCustom;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ksb on 2017. 9. 3..
 */
public interface UserRepository extends MongoRepository<User, Long>, UserRepositoryCustom {
}
