package com.java.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.assignment.api.response.pojo.RestResponse;
import com.java.assignment.dto.UserRequestPayload;
import com.java.assignment.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(path = "/signup")
	public ResponseEntity<RestResponse> userSignup(@RequestBody UserRequestPayload userRequestPayload) {

		return userService.createAUser(userRequestPayload);
	}

	@PostMapping(path = "/sign-in")
	public ResponseEntity<RestResponse> userSignin(@RequestBody UserRequestPayload userRequestPayload) {

		return userService.signIn(userRequestPayload);
	}
}
