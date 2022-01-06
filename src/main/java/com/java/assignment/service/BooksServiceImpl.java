package com.java.assignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.assignment.api.response.pojo.RestResponse;
import com.java.assignment.dto.BooksRequestPayload;
import com.java.assignment.model.BookInformation;
import com.java.assignment.repository.BooksRepository;

@Service
public class BooksServiceImpl implements BooksService {

	@Autowired
	private BooksRepository booksRepository;
	
	@Override
	public ResponseEntity<RestResponse> createABook(BooksRequestPayload booksRequestPayload) {

		if(booksRequestPayload.getBookId() != null && booksRequestPayload.getBookId().length() > 0) {

			BookInformation bookInformation = new BookInformation();

			bookInformation.setBookId(booksRequestPayload.getBookId());
			bookInformation.setStoreId(booksRequestPayload.getStoreId());
			bookInformation.setTitle(booksRequestPayload.getTitle());
			bookInformation.setSubtitle(booksRequestPayload.getSubtitle());
			bookInformation.setAuthors(booksRequestPayload.getAuthors());
			bookInformation.setCategories(booksRequestPayload.getCategories());
			bookInformation.setPrice(booksRequestPayload.getPrice());
			bookInformation.setPublisher(booksRequestPayload.getPublisher());
			bookInformation.setPublishedDate(booksRequestPayload.getPublishedDate());
			bookInformation.setDescription(booksRequestPayload.getDescription());
			bookInformation.setPageCount(booksRequestPayload.getPageCount());
			bookInformation.setThumbnail(booksRequestPayload.getThumbnail());
			bookInformation.setPreviewLink(booksRequestPayload.getPreviewLink());
			bookInformation.setBuyLink(booksRequestPayload.getBuyLink());

			if(booksRequestPayload.getBookCount() > 0)
				bookInformation.setBookCount(booksRequestPayload.getBookCount());
			else
				bookInformation.setBookCount(40);

			booksRepository.save(bookInformation);

			return ResponseEntity.status(HttpStatus.OK).body(new RestResponse(true, booksRequestPayload, "book inserted successfully.", 200));

		}else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new RestResponse(false, booksRequestPayload, "bookId not provided", 400));
		
	}

	@Override
	public ResponseEntity<RestResponse> findAllBooks(int storeId) {
		
		if (storeId > 0) {
			List<BookInformation> books = booksRepository.findByStoreId(storeId);

			if (books != null && books.size() > 0) {

				return ResponseEntity.status(HttpStatus.OK).body(new RestResponse(true, books, books.size()+" book(s) found.", 200));
			}else
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new RestResponse(false, storeId, "book not found.", 404));
		}else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new RestResponse(false, null, "storeid not provided", 400));
	}

	@Override
	public ResponseEntity<RestResponse> updateABook(String bookId, BooksRequestPayload booksRequestPayload) {

		if(booksRequestPayload.getBookId() != null && booksRequestPayload.getBookId().length() > 0) {

			Optional<BookInformation> bookInformationObj = booksRepository.findById(bookId);

			if (bookInformationObj.isPresent()) {

				BookInformation bookInformation = bookInformationObj.get();

				if (booksRequestPayload.getBookId() != null)
					bookInformation.setBookId(booksRequestPayload.getBookId());
				if (booksRequestPayload.getStoreId() > 0)
					bookInformation.setStoreId(booksRequestPayload.getStoreId());
				if (booksRequestPayload.getTitle() != null)
					bookInformation.setTitle(booksRequestPayload.getTitle());
				if (booksRequestPayload.getSubtitle() != null)
					bookInformation.setSubtitle(booksRequestPayload.getSubtitle());
				if (booksRequestPayload.getAuthors() != null)
					bookInformation.setAuthors(booksRequestPayload.getAuthors());
				if (booksRequestPayload.getCategories() != null)
					bookInformation.setCategories(booksRequestPayload.getCategories());
				if (booksRequestPayload.getPrice() > 0)
					bookInformation.setPrice(booksRequestPayload.getPrice());
				if (booksRequestPayload.getPublisher() != null)
					bookInformation.setPublisher(booksRequestPayload.getPublisher());
				if (booksRequestPayload.getPublishedDate() != null)
					bookInformation.setPublishedDate(booksRequestPayload.getPublishedDate());
				if (booksRequestPayload.getDescription() != null)
					bookInformation.setDescription(booksRequestPayload.getDescription());
				if (booksRequestPayload.getPageCount() > 0)
					bookInformation.setPageCount(booksRequestPayload.getPageCount());
				if (booksRequestPayload.getThumbnail() != null)
					bookInformation.setThumbnail(booksRequestPayload.getThumbnail());
				if (booksRequestPayload.getPreviewLink() != null)
					bookInformation.setPreviewLink(booksRequestPayload.getPreviewLink());
				if (booksRequestPayload.getBuyLink() != null)
					bookInformation.setBuyLink(booksRequestPayload.getBuyLink());
				if (booksRequestPayload.getBookCount() > 0)
					bookInformation.setBookCount(booksRequestPayload.getBookCount());

				booksRepository.save(bookInformation);

				return ResponseEntity.status(HttpStatus.OK).body(new RestResponse(true, booksRequestPayload, "book inserted successfully.", 200));
			}else
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new RestResponse(false, booksRequestPayload, "bookId not provided", 404));

		}else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new RestResponse(false, booksRequestPayload, "bookId not provided", 400));
	}

	@Override
	public ResponseEntity<RestResponse> deleteABook(String bookId) {

		if (bookId != null && bookId.length() > 0) {
			Optional<BookInformation> bookInformation = booksRepository.findById(bookId);

			if (bookInformation.isPresent()) {
				booksRepository.delete(bookInformation.get());
				return ResponseEntity.status(HttpStatus.OK).body(new RestResponse(true, bookInformation.get(), "book deleted successfully.", 200));
			}else
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new RestResponse(false, bookId, "book not found.", 404));
		}else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new RestResponse(false, null, "bookId not provided", 400));
	}
}
