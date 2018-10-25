package com.triofoxes.project.processmonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vivek
 *
 */
@RestController
public class ApplicationController {
	@RequestMapping("/")
	public String hello() {
		return "Hello Spring Boot World! Will be deploying a Process Monitoring Application soon using you!!"; 
	}
}
