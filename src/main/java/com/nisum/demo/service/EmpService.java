package com.nisum.demo.service;

@org.springframework.stereotype.Service
public class EmpService {
	
	public boolean check(int a) {
		if(a > 5) {
			return true;
		}else {
			return false;
		}
	}

}
