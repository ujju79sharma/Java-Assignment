package com.java.assignment.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.java.assignment.model.BookInformation;

public interface BooksRepository extends MongoRepository<BookInformation, String>{

	List<BookInformation> findByStoreId(int storeId);

}
