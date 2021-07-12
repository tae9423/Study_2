package com.dg.s1;

import java.util.Scanner;

public class Test10 {
	
	public static void main(String [] args) { 
		
		System.out.println("Test10 Start");
		// 941223-1234567
		
		// 1     -     1
		// 2     -     2
		// 4     -     10
		// 7     -     13
		// 8     -     20
		
		//실행 중에 데이터를 키보드로부터 입력 받을 준비
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		int result=0;
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();		
		result = (num/4)*10+num%4;		
		System.out.println(result);
	
				
		
	}

}
