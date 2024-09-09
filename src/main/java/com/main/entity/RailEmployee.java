package com.main.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RailEmployee {
	
	private String employeeId;
	private String employeeName;
	private String employeeDesignation;
	private String trainId;
	private Timestamp trainDuration;
	
	@Transient
	private Rail rail;

}
