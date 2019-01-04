package com.test03;

public class OPTest03 {
	public static void main(String[] args) {
		System.out.println(true | false);
		System.out.println(false | false);
		System.out.println("bit를 >> >>> << 로 숫자만큼 이동");
		System.out.println("10을  >> 2 이동");
		System.out.println(Integer.toBinaryString(8023));
		// 1010 >>2 오른족으로 2칸 비트 이동후 부호비트로 채운다.
		System.out.println(Integer.toBinaryString(8023 >> 2));
		// 1010 <<30 왼쪽으로 30칸 비트 이동후 부호비트로 채운다
		System.out.println(Integer.toBinaryString(8023 << 3));
		
		System.out.println(Integer.toBinaryString(-8023));
		// 1010 >>2 오른족으로 2칸 비트 이동후 부호비트로 채운다.
		System.out.println(Integer.toBinaryString(-8023 >> 2));
		//>>> 연산자는 오른쪽으로 3칸 비트이동후 왼쪽을 0으로 채운다.
	}
}
