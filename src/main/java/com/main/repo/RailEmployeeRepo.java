package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.RailEmployee;

@Repository
public interface RailEmployeeRepo extends JpaRepository<RailEmployee, String>{

}
