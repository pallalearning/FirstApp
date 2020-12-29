package com.palla.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstApp")
public class Controller {

	@GetMapping(value = "/hello/{name}", produces = { "application/json" })
	public ResponseEntity<String> sayHello(@PathVariable(value = "name") String name){
		return new ResponseEntity<>("Hello- welcome :-"+name, HttpStatus.OK);
		
	}
}
