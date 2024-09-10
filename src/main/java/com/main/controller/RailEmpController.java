package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.RailEmployee;
import com.main.service.RailEmployeeService;

@RestController
@RequestMapping("/rail-employee")
public class RailEmpController {

	@Autowired
	private RailEmployeeService railEmployeeService;
	
	@PostMapping("/save")
	public ResponseEntity<RailEmployee> saveEmployee(@RequestBody RailEmployee railEmployee) {
		RailEmployee railEmp = this.railEmployeeService.saveEmployee(railEmployee);
		return ResponseEntity.ok(railEmp);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<RailEmployee>> getAllEmployee() {
		List<RailEmployee> re = this.railEmployeeService.getAllEmployee();
		return ResponseEntity.ok(re);
		
	}
	
}
