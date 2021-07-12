package com.dg.s1;

public class Test8 {
	
	public static void main(String [] args) {
		
		System.out.println("Test8 Start");
		
		// 물건의 합계
		int price;
		// 손님이 낸돈
		int money;
		// 거스름 돈
		int don;
		
		//물건값의 합계보다 손님이 낸 돈이 많다라는 가정
		// 물건값의 합계, 손님이 낸돈, 거스름돈 출력
		
		price = 57860;
		money = 100000;
		don = money - price;
		System.out.println("Price : "+price);
		System.out.println("Money : "+money);
		System.out.println("Don : "+don);
		
		// 만원짜리 갯수를 담을 변수
		int man;
		// 천원짜리 갯수를 담을 변수
		int cheon;
		// 백원짜리 갯수를 담을 변수
		int back;
		// 십원짜리 갯수를 담을 변수
		int sip;
		
		man = don / 10000;
		System.out.println("만원 : "+man+"장");
		cheon = (don - 10000*man) / 1000;
		System.out.println("천원 : "+cheon+"장");
		back = (don - 10000*man - 1000*cheon) / 100;
		System.out.println("백원 : "+back+"장");
		sip = (don - 10000*man - 1000*cheon - 100*back) / 10;
		System.out.println("십원 : "+sip+"개");
		
		
		man = don/ 10000;
		System.out.println("만원 : "+man+"장");
		cheon = don % 10000 / 1000;
		System.out.println("천원 : "+cheon+"장");
		back = don % 1000 / 100;
		System.out.println("백원 : "+back+"장");
		sip = don % 100 / 10;
		System.out.println("십원 : "+sip+"개");
		
		
		
		
		

	}

}
