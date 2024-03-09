package com.files.demo.utility;

import java.util.Base64;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class Utility {

	public static final String SAVE_MESSAGE = "Record saved successfully";
	public static final String ERROR_MESSAGE = "Something went wrong while saving employee details";
	public static final String EMAIL_REGEX="\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
	public static final String PASSWORD_REGEX= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).{8,}$";

	public static  Result successResult(Object data) {
		Result result = new Result();
		result.setMessage(SAVE_MESSAGE);
		result.setStatusCode(HttpStatus.OK.value());
		result.setData(data);
		return result;
	}

	public static Result failResult() {
		Result result = new Result();
		result.setMessage(ERROR_MESSAGE);
		result.setStatusCode(HttpStatus.NOT_FOUND.value());
		return result;
	}
	
	public static String encode(String password) {
		return new String(Base64.getEncoder().encode(password.getBytes()));
	}


}
