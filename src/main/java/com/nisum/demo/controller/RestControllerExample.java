package com.nisum.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.demo.domain.Employee;
import com.nisum.demo.service.EmpService;

@RestController
public class RestControllerExample {

	@GetMapping(value = "/getRecord/{id}", produces = "application/json")
	public ResponseEntity getRecord(@PathVariable("id") String id) {
		if (id != null && !id.isEmpty()) {
			return new ResponseEntity<>(new Employee(101, "Raju", "Tiwari"), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping(value = "/createRecord", consumes = "application/json", produces = "application/json")
	public ResponseEntity createRecord(@RequestBody Employee employee) {
		if (employee != null) {
			// assumed that data validated and received response from service
			return new ResponseEntity<>(employee, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(new Object(), HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping(value = "/updateRecord", consumes = "application/json", produces = "application/json")
	public ResponseEntity updateRecord(@RequestBody Employee employee) {
		if (employee != null) {
			// assumed that data validated and received response from service
			return new ResponseEntity<>(new Object(), HttpStatus.ACCEPTED);
		} else {
			return new ResponseEntity<>(new Object(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/deleteRecord", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public ResponseEntity deleteRecord(@RequestBody Employee employee) {
		if (employee != null && employee.getId() != null) {
			// assumed that data validated and received response from service
			return new ResponseEntity<>(employee, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(new Object(), HttpStatus.BAD_REQUEST);
		}
	}

	@Autowired
	EmpService service;
	public int sum(Integer a, Integer b) {
		if (service.check(a)) {
			return a + b;
		}
		return a - b;
	}

}