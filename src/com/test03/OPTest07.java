package com.test03;

public class OPTest07 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// �񱳽� ? true��� : false���
		System.out.println(10 < 3 ? "ũ��" : "�۴�");
		
		String res = 10<3 ? "ũ��":"�۴�";
		System.out.println(res);
		
		System.out.println();
		
		// ���� 10�� 2���� ũ�� r���� 10�� ���ϰ� �׷��� ������ r���� 10�� ����.
		int r = 10;
		
		System.out.println(10>2 ? r+10 : r-10);
		
		int result = 10>2 ? r+10 : r-10;
		System.out.println(result);
	}
}
