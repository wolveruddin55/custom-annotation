package com.files.demo.utility;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordCheck implements ConstraintValidator<PasswordValidator, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(Utility.EMAIL_REGEX.matches(value))
			return true;
		return false;
	}

}
