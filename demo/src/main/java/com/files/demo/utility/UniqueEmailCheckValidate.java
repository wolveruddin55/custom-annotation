package com.files.demo.utility;

import java.util.List;
import java.util.Optional;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.files.demo.entity.EmployeeEntity;
import com.files.demo.repository.EmployeeRepository;

public class UniqueEmailCheckValidate implements ConstraintValidator<UniqueEmailCheck, String>{
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value.matches(Utility.EMAIL_REGEX)) {
			Optional<EmployeeEntity> employeeEntity = employeeRepository.findEmployeeByEmailID(value);
			if (employeeEntity.isEmpty() ) {
					return true;
			}else {
				return false;
			}
		}
		else {
			return false;
		}
	}

}
