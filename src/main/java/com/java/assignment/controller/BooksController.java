package com.java.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.assignment.api.response.pojo.RestResponse;
import com.java.assignment.dto.BooksRequestPayload;
import com.java.assignment.service.BooksService;

@RestController
@RequestMapping(path = "/books")
public class BooksController {

	@Autowired
	private BooksService booksService;

	@PostMapping(path = "/create")
	public ResponseEntity<RestResponse> createABook(@RequestBody BooksRequestPayload booksRequestPayload) {

		return booksService.createABook(booksRequestPayload);
	}

	@GetMapping("/find/{storeId}")
	public ResponseEntity<RestResponse> findAllBooks(@PathVariable(name = "storeId")int storeId) {

		return booksService.findAllBooks(storeId);
	}
	
	@PutMapping(path = "/update/{id}")
	public ResponseEntity<RestResponse> updateABook(@PathVariable(name = "id")String bookId, @RequestBody BooksRequestPayload booksRequestPayload) {

		return booksService.updateABook(bookId, booksRequestPayload);
	}

	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<RestResponse> deleteABook(@PathVariable(name = "id")String bookId) {

		return booksService.deleteABook(bookId);
	}
}