package com.files.demo.validation;

import java.lang.annotation.*;

import javax.validation.Constraint;

/*
 *  @Target({ ElementType.FIELD, ElementType.METHOD, ElementType.TYPE }) 
 *  specifies that we can mention this annotation on field,method and type
 *  
 */
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
/*
 * annotation is invoked during run time
 */
@Retention(RetentionPolicy.RUNTIME)
/*
 * used to validate the field  this annotation needs an external dependency  javax.validation 2.02
 */
@Constraint(validatedBy = { UniqueEmailCheckValidate.class })
@Documented
public @interface UniqueEmailCheck {

	// display error message
	public String message();
	
}
