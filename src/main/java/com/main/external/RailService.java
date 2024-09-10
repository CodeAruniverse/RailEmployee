package com.main.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.main.entity.Rail;

@FeignClient(name="RAIL")
public interface RailService {
	
	@GetMapping("/{railId}")
	Rail getRailById(@PathVariable String railId);
}
