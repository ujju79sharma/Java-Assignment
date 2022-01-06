package com.java.assignment.service;

import org.springframework.http.ResponseEntity;

import com.java.assignment.api.response.pojo.RestResponse;
import com.java.assignment.dto.BooksRequestPayload;

public interface BooksService {

	ResponseEntity<RestResponse> createABook(BooksRequestPayload booksRequestPayload);

	ResponseEntity<RestResponse> findAllBooks(int storeId);

	ResponseEntity<RestResponse> updateABook(String bookId, BooksRequestPayload booksRequestPayload);

	ResponseEntity<RestResponse> deleteABook(String bookId);
}