package com.java.assignment.service;

import org.springframework.http.ResponseEntity;

import com.java.assignment.api.response.pojo.RestResponse;
import com.java.assignment.dto.UserRequestPayload;

public interface UserService {

	ResponseEntity<RestResponse> createAUser(UserRequestPayload userRequestPayload);

	ResponseEntity<RestResponse> signIn(UserRequestPayload userRequestPayload);

}
