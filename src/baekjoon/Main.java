package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 1213�� 
		// �Ӹ���� �����
		// https://www.acmicpc.net/problem/1213
		
		// ����
		/*
			���Ѽ��� �ӹ����� ���� ����ϴ� �����̴�.
			���Ѽ��� ���󿡼� �Ӹ������ ���ڿ��� �ʹ� �����ϱ� ������, ���� ������ ����ؼ� �ӹ����� �Ӹ������ �������ַ��� �Ѵ�.
			�ӹ����� ���Ѽ��� ���� �̸����� �Ӹ������ ������� �ϴµ�, ���Ѽ��� ���� �̸��� ���ĺ� ������ ������ �ٲ㼭 �Ӹ������ ������� �Ѵ�.
			
			�ӹ����� ���� ���Ѽ��� ���� �̸��� �Ӹ�������� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
		*/
		
		// �Է�
		/*
			ù° �ٿ� ���Ѽ��� ���� �̸��� �ִ�. ���ĺ� �빮�ڷθ� �� �ִ� 50�����̴�.
		*/
		
		// ���
		/*
		 	ù° �ٿ� ������ ������ ����Ѵ�. 
		 	���� �Ұ����� ���� "I'm Sorry Hansoo"�� ����Ѵ�. ������ ���� ���� ��쿡�� ���������� �ռ��� ���� ����Ѵ�.
		*/
			
		// ���� �Է�
		/* 
			AABB
			
			ABACABA
			
			ABCD
		*/
		
		// ��
		/* 
		 	ABBA
		 	
		 	AABCBAA
		 	
		 	I'm Sorry Hansoo
		*/

		Scanner sc = new Scanner(System.in);
		
		// �Ӹ����??? �������� �о ���� �� ex) eye, madam
		// ������ ���� ���� ��쿡�� ���������� �ռ��� ���� ���
		// �Ұ����� ���� "I'm Sorry Hansoo"�� ���
		
		String name = sc.nextLine();
		char[] nameArr = name.toCharArray();
		Arrays.sort(nameArr);  // ���ĺ� ������ ����
		
		if(nameArr.length%2 == 0) {		// 1. ¦���� ���  // aaaabbbbcccc
			
		} else {		// 2. Ȧ���� ���    // aaabccc
			
		}
		
		
		// ���� ����
		// https://developer-ellen.tistory.com/91
		
		
		

		
		
		
		
		sc.close();
	}

}
