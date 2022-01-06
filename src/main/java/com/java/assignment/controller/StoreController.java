package com.java.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.assignment.api.response.pojo.RestResponse;
import com.java.assignment.dto.StoreRequestPayload;
import com.java.assignment.service.StoreService;

@RestController
@RequestMapping(path = "/store")
public class StoreController {

	@Autowired
	private StoreService storeService;

	@PostMapping(path = "/create")
	public ResponseEntity<RestResponse> createAStore(@RequestBody StoreRequestPayload storeRequestPayload) {

		return storeService.createAStore(storeRequestPayload);
	}

	@GetMapping(path = "/find-all")
	public ResponseEntity<RestResponse> findAllStores() {

		return storeService.findAllStores();
	}
}
