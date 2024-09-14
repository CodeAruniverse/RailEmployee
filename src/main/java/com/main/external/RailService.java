package com.main.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.main.entity.Rail;

@FeignClient(name="RAIL")
public interface RailService {
	
	@GetMapping("/rail-service/{railId}")
	Rail getRailById(@PathVariable String railId);
	
	@PostMapping("/rail-service/save")
	Rail createRail(Rail rail);
}
