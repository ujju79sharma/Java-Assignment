package com.java.assignment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.java.assignment.model.Users;

public interface UsersRepository extends MongoRepository<Users, Integer>{

	@Query(value = "{$and:[{'email':?0},{'password':?1}]}")
	Users findByEmailAndPassword(String email, String password);

}