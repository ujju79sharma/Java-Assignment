package com.java.assignment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.java.assignment.model.StoreInformation;

public interface StoresRepostory extends MongoRepository<StoreInformation, Integer> {

}
