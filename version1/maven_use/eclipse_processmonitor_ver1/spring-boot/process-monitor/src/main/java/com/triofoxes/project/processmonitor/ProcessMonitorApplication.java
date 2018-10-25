package com.triofoxes.project.processmonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Vivek
 * 
 * Main Starting point for the Process Monitor Application
 *
 */
@SpringBootApplication
@ComponentScan
public class ProcessMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessMonitorApplication.class, args);
	}
}
