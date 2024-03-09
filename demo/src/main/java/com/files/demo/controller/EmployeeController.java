package com.files.demo.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.files.demo.requestbody.SaveEmployeeRequestBody;
import com.files.demo.service.EmployeeServiceImplementation;
import com.files.demo.utility.Result;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImplementation serviceImplementation;
	
	
	@PostMapping("/save-employee")
	public Result saveEmployee(@RequestBody @Valid  SaveEmployeeRequestBody employeeRequestBody)    {
		return serviceImplementation.saveEmployee(employeeRequestBody);
	}
	
}
