package com.dg.s1;

public class Test7 {
	
	public static void main(String [] args) {
	
		System.out.println("Test7 Start");
		
		int kor = 56;
		int eng = 65;
		int math = 49;
		
		int total = kor + eng + math;
		double avg;
		avg = total / 3.0;
		
		System.out.println("Total : "+total);
		System.out.println("Avg : "+avg); // 56.666**4
		
		
		avg = (float)total / 3.0;
		avg = (int)(avg*100)/100.0;
		System.out.println("Avg : "+avg); // 56.66
		
	}

}
