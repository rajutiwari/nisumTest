package com.nisum.programs;

import java.util.Arrays;
import java.util.Scanner;

public class SectionA {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the First String:");
		String str1 = scanner.nextLine();
		
		System.out.print("Enter the second String:");
        String str2 = scanner.nextLine();
        scanner.close();
        
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");
        
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        
        if(str1.length() != str2.length())
        System.out.println(str1+" and "+str2+" are NOT Anagrams");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean flag = false;
        
        for (int i = 0; i < str1.length(); i++) {
        	if(arr1[i] != arr2[i]) {
        		System.out.println(str1+" and "+str2+" are NOT Anagrams");
        		break;
        	}else {
        		flag = true;
        	}
        }
        if(flag)
        	System.out.println(str1+" and "+str2+" are Anagrams");
        
	}

}
