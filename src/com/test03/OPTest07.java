package com.test03;

public class OPTest07 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 비교식 ? true명령 : false명령
		System.out.println(10 < 3 ? "크다" : "작다");
		
		String res = 10<3 ? "크다":"작다";
		System.out.println(res);
		
		System.out.println();
		
		// 만일 10이 2보다 크면 r에다 10을 더하고 그렇지 않으면 r에다 10을 뺀다.
		int r = 10;
		
		System.out.println(10>2 ? r+10 : r-10);
		
		int result = 10>2 ? r+10 : r-10;
		System.out.println(result);
	}
}
