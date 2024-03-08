package com.files.demo.requestbody;

import javax.validation.constraints.Email;

import com.files.demo.utility.PasswordValidator;
import com.files.demo.utility.UniqueEmailCheck;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SaveEmployeeRequestBody {

	private Long employeeID;
	private String employeeName;
	private String department;
	@Email
	@UniqueEmailCheck(message = "email must be unique")
	private String emailId;
	@PasswordValidator(message = "Password needs a symbol, number, uppercase letter, and must be 8 characters")
	private String password;
	private String joiningdate;
	private String dateOfBirth; 
	private String isActive;
}