package com.test03;

public class OPTest04 {
	public static void main(String[] args) {
		// 증감 증가 연산자 ++ -- 연산자 : 변수 앞뒤에 선언된다.
		// 연산 순서에 따라서 전위연산자, 후위연산자
		// ex)전위연산자 : 연산을 먼저하고 변수가 가진 값을 리턴한다.
		//	후위연산자 : 값을 먼저 리턴하고 연산을 한다.
		int a= 10;
		a++; // a가 가진값 10ㅇ을 리턴하고 ㅁ+1dmf gkseksysoA++
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(a);
		
		int b=5;
		System.out.println(b--);
		System.out.println(--b);
		System.out.println(b--);
		System.out.println(--b);
		
		
		
	}
}
