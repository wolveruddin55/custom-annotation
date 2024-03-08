package com.files.demo.utility;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/*
 *  @Target({ ElementType.FIELD, ElementType.METHOD, ElementType.TYPE }) 
 *  specifies that we can mention this annotation on field,method and type
 *  
 */
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.TYPE })
/*
 * annotation is invoked during run time
 */
@Retention(RetentionPolicy.RUNTIME)
/*
 * used to validate the field  this annotation needs an external dependency  javax.validation 2.02
 */
@Constraint(validatedBy = { UniqueEmailCheckValidate.class })
public @interface UniqueEmailCheck {

	// display error message
	public String message();
	
}
