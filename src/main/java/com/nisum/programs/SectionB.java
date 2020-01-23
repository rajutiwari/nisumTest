package com.nisum.programs;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SectionB {

	public static void main(String[] args) {

		Map<String, Date> map = new HashMap<>();

		// using java.util.Date; since no specific date format provided
		map.put("a", new Date(2019 - 1900, 8, 20));
		map.put("b", new Date(2019 - 1900, 6, 20));
		map.put("c", new Date(2018 - 1900, 8, 21));
		map.put("d", new Date(2017 - 1900, 3, 15));
		map.put("e", new Date(2020 - 1900, 0, 10));

		String str1 = map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
		String str2 = map.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();

		System.out.println("max Date is:" + map.get(str1) + " : Key is :" + str1);
		System.out.println("min Date is:" + map.get(str2) + " : Key is :" + str2);
	}

}
