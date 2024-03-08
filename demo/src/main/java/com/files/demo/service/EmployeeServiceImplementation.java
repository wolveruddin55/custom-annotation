package com.files.demo.service;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.files.demo.entity.EmployeeEntity;
import com.files.demo.repository.EmployeeRepository;
import com.files.demo.requestbody.SaveEmployeeRequestBody;
import com.files.demo.utility.CustomException;
import com.files.demo.utility.Result;
import com.files.demo.utility.Utility;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Result saveEmployee(SaveEmployeeRequestBody employeeRequestBody) {
		EmployeeEntity employeeEntitiesRtrn = new EmployeeEntity();
		Result result= new Result();
		try {
				EmployeeEntity entity= new EmployeeEntity();
			    BeanUtils.copyProperties(employeeRequestBody, entity);
				entity.setPassword(Utility.encode(employeeRequestBody.getPassword()));
			employeeEntitiesRtrn= employeeRepository.save(entity);
			result= Utility.successResult(employeeEntitiesRtrn);
		} catch (Exception e) {
			log.error(Utility.ERROR_MESSAGE);
			throw new CustomException(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
		}
		return result;
	}

}
