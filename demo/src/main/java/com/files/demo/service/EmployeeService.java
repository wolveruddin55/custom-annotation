package com.files.demo.service;

import com.files.demo.requestbody.SaveEmployeeRequestBody;
import com.files.demo.utility.Result;

public interface EmployeeService {
	public Result saveEmployee(SaveEmployeeRequestBody employeeRequestBody)   ;
}
