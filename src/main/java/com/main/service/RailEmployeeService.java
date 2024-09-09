package com.main.service;

import java.util.List;

import com.main.entity.RailEmployee;

public interface RailEmployeeService {

	//saving one employee
	public RailEmployee saveEmployee(RailEmployee re);
	
	
	//saving list of employee
	public List<RailEmployee> saveAllEmployee(List<RailEmployee> re);
	
	//get all employee
	public List<RailEmployee> getAllEmployee();
	
	//get employee by employeeId
	public RailEmployee getEmployeeById(String employeeId);
	
	
}
