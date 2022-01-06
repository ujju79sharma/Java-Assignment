package com.java.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.assignment.api.response.pojo.RestResponse;
import com.java.assignment.dao.CountersDAO;
import com.java.assignment.dto.UserRequestPayload;
import com.java.assignment.model.Counters;
import com.java.assignment.model.Users;
import com.java.assignment.repository.UsersRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private CountersDAO sequence;
	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public ResponseEntity<RestResponse> createAUser(UserRequestPayload userRequestPayload) {

		if (userRequestPayload.getEmail() != null && userRequestPayload.getPassword() != null) {

			int userId = 0;
			try {
				userId = sequence.getNextSequenceValue("userId");
			}catch (Exception e) {
				Counters counterObject = new Counters();

				counterObject.setName("userId");
				counterObject.setSequence(1);

				sequence.saveCounterObject(counterObject);
				userId = 1;
			}
			if (userRequestPayload.getFirstName() != null || userRequestPayload.getLastName() != null) {

				Users user = new Users();

				user.setEmail(userRequestPayload.getEmail());
				user.setFirstName(userRequestPayload.getFirstName());
				user.setLastName(userRequestPayload.getLastName());
				user.setPassword(userRequestPayload.getPassword());
				user.setStoreIds(null);
				user.setUserId(userId);

				usersRepository.save(user);

				return ResponseEntity.status(HttpStatus.OK).body(new RestResponse(true, user, 
						"User successfully signed-up.", 200));
			}else {
				String firstName = userRequestPayload.getFirstName() != null ? 
						userRequestPayload.getFirstName() : "User";
				String lastName = userRequestPayload.getLastName() != null ? 
						userRequestPayload.getLastName() : " "+(sequence.getCurrentSequenceValue("userId")-1);

				Users user = new Users();

				user.setFirstName(firstName);
				user.setLastName(lastName);
				user.setEmail(userRequestPayload.getEmail());
				user.setStoreIds(null);
				user.setPassword(userRequestPayload.getPassword());
				user.setUserId(userId);

				usersRepository.save(user);

				return ResponseEntity.status(HttpStatus.OK).body(new RestResponse(true, user, 
						"User successfully signed-up.", 200));
			}
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new RestResponse(false, null, 
					"Email or password not provided.", 400));
		}
	}

	@Override
	public ResponseEntity<RestResponse> signIn(UserRequestPayload userRequestPayload) {

		try {
			String email = userRequestPayload.getEmail();
			String password = userRequestPayload.getPassword();

			Users user = usersRepository.findByEmailAndPassword(email, password);

			return user != null ? ResponseEntity.ok(new RestResponse(true, user, "User logged in successfully", 200))
					: ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new RestResponse(false, null, "Incorrect email or password", 403));
		}catch (Exception e) {

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new RestResponse(false, null, 
					"Email or password not provided.", 400));
		}
	}
}
