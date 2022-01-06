package com.java.assignment.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.assignment.api.response.pojo.RestResponse;
import com.java.assignment.dao.CountersDAO;
import com.java.assignment.dto.StoreRequestPayload;
import com.java.assignment.model.BookInformation;
import com.java.assignment.model.Counters;
import com.java.assignment.model.StoreInformation;
import com.java.assignment.repository.BooksRepository;
import com.java.assignment.repository.StoresRepostory;
import com.java.assignment.util.BooksUtil;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private CountersDAO sequence;
	@Autowired
	private StoresRepostory storesRepostory; 
	@Autowired
	private BooksRepository booksRepository;

	@Override
	public ResponseEntity<RestResponse> createAStore(StoreRequestPayload storeRequestPayload) {

		if (storeRequestPayload.getOwnerId() > 0 && storeRequestPayload.getGenre() != null) {

			int storeId = 0;
			try {
				storeId = sequence.getNextSequenceValue("storeId");
			}catch (Exception e) {
				Counters counterObject = new Counters();

				counterObject.setName("storeId");
				counterObject.setSequence(1);

				sequence.saveCounterObject(counterObject);
				storeId = 1;
			}
			if (storeRequestPayload.getStoreName() != null) {

				StoreInformation storeInformation = new StoreInformation();

				storeInformation.setOwnerId(storeRequestPayload.getOwnerId());
				storeInformation.setStoreName(storeRequestPayload.getStoreName());
				storeInformation.setGenre(storeRequestPayload.getGenre());

				Map<String, BookInformation> books = BooksUtil.populateGoogleBooks(storeRequestPayload.getGenre(), storeId);

				storeInformation.setBooksCount(books.size()*40); // assuming the each book count is 40. 
				storeInformation.setBookIds(books.keySet());

				storeInformation.setStoreId(storeId);

				storesRepostory.save(storeInformation); // save the store information
				booksRepository.saveAll(books.values()); // save the books

				return ResponseEntity.status(HttpStatus.OK).body(new RestResponse(true, storeInformation, 
						"Store created successfully.", 200));
			}else {
				String storeName = storeRequestPayload.getStoreName() != null ? 
						storeRequestPayload.getStoreName() : "Store "+(sequence.getCurrentSequenceValue("storeId")-1);

				StoreInformation storeInformation = new StoreInformation();
				Map<String, BookInformation> books = BooksUtil.populateGoogleBooks(storeRequestPayload.getGenre(), storeId); // generate books

				storeInformation.setOwnerId(storeRequestPayload.getOwnerId());
				storeInformation.setStoreName(storeName);
				storeInformation.setGenre(storeRequestPayload.getGenre());
				storeInformation.setBookIds(books.keySet());
				storeInformation.setStoreId(storeId);


				storesRepostory.save(storeInformation);
				booksRepository.saveAll(books.values());

				return ResponseEntity.status(HttpStatus.OK).body(new RestResponse(true, storeInformation, 
						"Store created successfully.", 200));
			}
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new RestResponse(false, null, 
					"Email or password not provided.", 400));
		}
	}

	@Override
	public ResponseEntity<RestResponse> findAllStores() {
	
		List<StoreInformation> foundStores = storesRepostory.findAll();

		if (foundStores.size() > 0)
			return ResponseEntity.status(HttpStatus.OK).body(new RestResponse(true, foundStores, 
				foundStores.size()+" Store(s) found.", 200));
		else
			return ResponseEntity.status(HttpStatus.OK).body(new RestResponse(true, null, 
					"No stores available currently.", 200));
	}
}