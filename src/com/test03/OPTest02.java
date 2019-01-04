package com.test03;

public class OPTest02 {
	public static void main(String[] args) {
		System.out.println("3. 대입 연산자  +=  -=  *=  /=  %=  ");
		int a = 100;
		a += 200; 
		System.out.println(a);
		
		System.out.println("4. 논리 연산자 & 비트 연산자 ");
		a=10;
		int b=2;
		System.out.println(a|b);
		System.out.println(a&b);
		System.out.println(a^b);
		System.out.println(~b);
	}
}
