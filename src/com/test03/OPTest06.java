package com.test03;

public class OPTest06 {
	public static void main(String[] args) {
		// || 0 1 1 1 ; 앞의 연산이 true면 뒤에 연산 안하고 true 리턴
		// && 0 0 0 1 ; 앞의 연산이 false면 뒤에 연산 안하고 false 리턴
		int a = 3;
		int b = 2;
		System.out.println((a > b++) || (b++ < a));
		System.out.println(a + ", " + b);
		
		System.out.println((a > b++) && (b++ < a));
		System.out.println(a + ", " + b);

	}
}
