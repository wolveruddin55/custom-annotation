package com.files.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.files.demo.utility.Utility;

public class PasswordCheck implements ConstraintValidator<PasswordValidator, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(Utility.EMAIL_REGEX.matches(value))
			return true;
		return false;
	}

}
