package com.java.assignment.service;

import org.springframework.http.ResponseEntity;

import com.java.assignment.api.response.pojo.RestResponse;
import com.java.assignment.dto.StoreRequestPayload;

public interface StoreService {

	ResponseEntity<RestResponse> createAStore(StoreRequestPayload storeRequestPayload);

	ResponseEntity<RestResponse> findAllStores();
}
