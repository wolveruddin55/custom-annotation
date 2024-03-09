package com.files.demo.requestbody;

import com.files.demo.validation.PasswordValidator;
import com.files.demo.validation.UniqueEmailCheck;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SaveEmployeeRequestBody {

	private Long employeeID;
	private String employeeName;
	private String department;
	@UniqueEmailCheck(message = "email must be unique")
	private String emailId;
	@PasswordValidator(message = "Password needs a symbol, number, uppercase letter, and must be 8 characters")
	private String password;
	private String joiningdate;
	private String dateOfBirth; 
	private String isActive;
}