
package com.vim.test.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.vim.test.entity.User;


public interface UserRepository extends MongoRepository<User, String> {

	User findByEmailId(String emailId);

	List<User> findByDesignation(String string);


}
