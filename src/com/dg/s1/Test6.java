package com.dg.s1;

public class Test6 {
	
	public static void main(String [] args) {
		
		System.out.println("Test6 Start");
		int num = 5;
		double num2 = 3.12;
		
		num= (int)(num+num2);
		System.out.println("Num : "+num);
		
		//국영수 - 0 ~ 100점
		
		int kor = 63;
		int eng = 35;
		int math = 53;
		// 총점을 계산해서 총점을 출력해주세요
		
		int total;
		total = kor + eng + math;
		System.out.println("Total : "+total);
		
		//평균을 계산해서 출력해주세요
		//50.0의 이유 : total / 3이 int로 계산되어서 50.0이 나왔습니다 따라서 total을 형변환을 시킨 후에 계산을 진행하여서 50.33**값을 얻어냈습니다.
		double avg;
		avg = total / 3.0;
		System.out.println("Avg : "+avg);
		
		
		double num3 = 5.124;
		int result = (int)num3;
		System.out.println("Result : "+result);
	
		
	}
	

}
