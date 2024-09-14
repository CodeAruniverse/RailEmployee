package com.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.main.entity.Rail;
import com.main.external.RailService;

@SpringBootTest
class RailEmployeeApplicationTests {
	
	@Autowired
	private RailService railService;

	@Test
	void contextLoads() {
	}

	@Test
	void createRail() {
		Rail rail = Rail.builder().railId(null).railName(null)
				.arrivalStationName(null).departureStationName(null)
				.endTime(null).pnr(120021).startTime(null).build();
		this.railService.createRail(rail);
	}
}
