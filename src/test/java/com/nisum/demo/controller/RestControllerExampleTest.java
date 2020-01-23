package com.nisum.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.nisum.demo.service.EmpService;

@RunWith(MockitoJUnitRunner.class)
public class RestControllerExampleTest {

	// Create mock and inject into test class
	// i.e create mock of the class, on which test class is going to execute
	@InjectMocks
	RestControllerExample controller;

	// create mock object of the dependency
	@Mock
	EmpService service;

	@Before
	public void init() {
		// initialize all the mocks
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void sumTestsPositive() {
		Integer a = 6;
		Integer b = 3;
		when(service.check(a)).thenReturn(true);
		int sum = controller.sum(a, b);
		assertEquals(9, sum);
	}

	@Test
	public void sumTestsNegative() {
		Integer a = 4;
		Integer b = 3;
		when(service.check(a)).thenReturn(false);
		int sum = controller.sum(a, b);
		assertEquals(1, sum);
	}
}
