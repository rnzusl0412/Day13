package com.test03;

public class OPTest05 {
	public static void main(String[] args) {
		int a = 2, b=5, res=0;
		res = a++ + --b + ++a + ++a + ++b + b++;
			//	2 	4	4	5	5	5
		System.out.println(a + ", "+ b+ ", "+res);
	}
}
