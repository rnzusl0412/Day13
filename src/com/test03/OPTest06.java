package com.test03;

public class OPTest06 {
	public static void main(String[] args) {
		// || 0 1 1 1 ; ���� ������ true�� �ڿ� ���� ���ϰ� true ����
		// && 0 0 0 1 ; ���� ������ false�� �ڿ� ���� ���ϰ� false ����
		int a = 3;
		int b = 2;
		System.out.println((a > b++) || (b++ < a));
		System.out.println(a + ", " + b);
		
		System.out.println((a > b++) && (b++ < a));
		System.out.println(a + ", " + b);

	}
}
