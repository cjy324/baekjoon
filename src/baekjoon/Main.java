package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 2908�� 
		// ���
		// https://www.acmicpc.net/problem/2908
		
		// ����
		/*
			������� ���� ����� ������ ���� ���Ѵ�. 
			����� ���ڸ� �дµ� ������ �ִ�. 
			�̷��� ������ ���ϴ� ����� ���ؼ� ����̴� 
			
			���� ũ�⸦ ���ϴ� ������ ���־���. 
			����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.

			����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. 
			���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�. 
			����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
			
			�� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		*/
		
		// �Է�
		/*
			ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. 
			�� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�.
		*/
		
		// ���
		/*
		 	ù° �ٿ� ����� ����� ����Ѵ�.
		*/
			
		// ���� �Է�
		/* 
			734 893
		*/
		
		// ��
		/* 
		 	437 
		*/

		Scanner sc = new Scanner(System.in);
		
		// 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�. 
		// ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
		// ���ڸ� �Ųٷ� �ٲٰ� ���ؼ� ū �� ���!!!!!!!!!

		
		// 1. �� ����
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 1. String ���·� ��ȯ
		String aStr = String.valueOf(a);
		String bStr = String.valueOf(b);
		// 2. char �迭�� ���
		char[] aCharArr = aStr.toCharArray();
		char[] bCharArr = bStr.toCharArray();
		aStr = "";
		bStr = "";
		// 3. �������� ����
		for(int i = 2; i >= 0; i--) {
			aStr += aCharArr[i];
		}
		for(int i = 2; i >= 0; i--) {
			bStr += bCharArr[i];
		}
		a = Integer.parseInt(aStr);
		b = Integer.parseInt(bStr);
		
		System.out.println(Math.max(a, b));
		
		
		// 2. �� ���� ����
//		// StringBuilder�� reverse �ż��带 �̿��ϴ� ���
//		
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//        
//		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
//		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
//		
//		System.out.print(A > B ? A : B);  // Math ��ƿ�� �̿����� �ʰ� ���׿����ڷ� ó��

		sc.close();
	}

}
