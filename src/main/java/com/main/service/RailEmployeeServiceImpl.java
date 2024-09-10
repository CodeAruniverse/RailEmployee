package com.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.RailEmployee;
import com.main.repo.RailEmployeeRepo;

@Service
public class RailEmployeeServiceImpl implements RailEmployeeService {
	
	@Autowired
	private RailEmployeeRepo railEmployeeRepo;

	@Override
	public RailEmployee saveEmployee(RailEmployee re) {
		String randomUUID = UUID.randomUUID().toString();
		re.setEmployeeId(randomUUID);
		return this.railEmployeeRepo.save(re);
	}

	@Override
	public List<RailEmployee> saveAllEmployee(List<RailEmployee> res) {
		ArrayList<RailEmployee> savingEmployee = new ArrayList<RailEmployee>();
		for(RailEmployee r : res) {
			String randomUUID = UUID.randomUUID().toString();
			r.setEmployeeId(randomUUID);
		}
		savingEmployee = (ArrayList<RailEmployee>) this.railEmployeeRepo.saveAll(res);
		return savingEmployee;
	}

	@Override
	public List<RailEmployee> getAllEmployee() {
		return this.railEmployeeRepo.findAll();
	}

	@Override
	public RailEmployee getEmployeeById(String employeeId) {
		return this.railEmployeeRepo.findById(employeeId).orElse(null);
	}

}
