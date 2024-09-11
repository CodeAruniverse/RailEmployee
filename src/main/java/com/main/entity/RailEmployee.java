package com.main.entity;

import java.sql.Timestamp;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
	
	@Id
	private String employeeId;
	private String employeeName;
	private String employeeDesignation;
	private String trainId;
	@JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss")
	private Timestamp trainDuration;
	
	@Transient
	private Rail rail;

}
