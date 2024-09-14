package com.main.entity;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rail {

	private String railId;
	private String railName;
	private long pnr;
	private String departureStationName;
	private String arrivalStationName;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp startTime;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp endTime;
}
