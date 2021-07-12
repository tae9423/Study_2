package com.dg.s1;

public class Test5 {
	
	
	public static void main(String [] args) {
		
		System.out.println("Test5 Start");
		
		int num1 = 3;
		long num2 = 9L;
		
		System.out.println(num1);
		
		num1 = (int)num2;

		System.out.println("num1 : "+ num1);
		
		num1 = 3;
		num2 = num1;
		System.out.println(num2);
		
		char ch ='a';
		int num3 = ch;
		ch = (char)(num3+25);
		System.out.println(ch);
		
		
		
		
	}

}
