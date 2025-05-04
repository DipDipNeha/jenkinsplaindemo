/**
 * 
 */
package com.jenkins.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

/**
 * 
 */

@RestController
@RequestMapping("/api")
public class WelComeController {

	@PostConstruct
	public void loadData() {
		
		System.out.println("Loading data ");
		
	}
	@GetMapping("/hello")
	public ResponseEntity<String> say(){
		
		return new ResponseEntity<String>("Welcome to Jenkins !",HttpStatus.OK);
		
	}
}
