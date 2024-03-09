package com.files.demo.validation;

import java.lang.annotation.*;

import javax.validation.Constraint;

@Target({ElementType.FIELD,ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = PasswordCheck.class)
public @interface PasswordValidator {
	public String message();
}
