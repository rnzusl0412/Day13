package com.test03;

public class OPTest03 {
	public static void main(String[] args) {
		System.out.println(true | false);
		System.out.println(false | false);
		System.out.println("bit�� >> >>> << �� ���ڸ�ŭ �̵�");
		System.out.println("10��  >> 2 �̵�");
		System.out.println(Integer.toBinaryString(8023));
		// 1010 >>2 ���������� 2ĭ ��Ʈ �̵��� ��ȣ��Ʈ�� ä���.
		System.out.println(Integer.toBinaryString(8023 >> 2));
		// 1010 <<30 �������� 30ĭ ��Ʈ �̵��� ��ȣ��Ʈ�� ä���
		System.out.println(Integer.toBinaryString(8023 << 3));
		
		System.out.println(Integer.toBinaryString(-8023));
		// 1010 >>2 ���������� 2ĭ ��Ʈ �̵��� ��ȣ��Ʈ�� ä���.
		System.out.println(Integer.toBinaryString(-8023 >> 2));
		//>>> �����ڴ� ���������� 3ĭ ��Ʈ�̵��� ������ 0���� ä���.
	}
}
