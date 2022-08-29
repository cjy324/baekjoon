package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 1026�� 
		// ����
		// https://www.acmicpc.net/problem/1026
		
		// ����
		/*
			���� ������ ������ �׻� ū ��ĩ�Ÿ����� ���� �־���. �� ������ ���� �������� ������ ���� ������ ���� ū ����� �ɾ���.

			���̰� N�� ���� �迭 A�� B�� �ִ�. ������ ���� �Լ� S�� ��������.

			S = A[0] �� B[0] + ... + A[N-1] �� B[N-1]

			S�� ���� ���� �۰� ����� ���� A�� ���� ��迭����. ��, B�� �ִ� ���� ��迭�ϸ� �� �ȴ�.
			
			S�� �ּڰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		*/
		
		// �Է�
		/*
			ù° �ٿ� N�� �־�����. 
			��° �ٿ��� A�� �ִ� N���� ���� ������� �־�����, 
			��° �ٿ��� B�� �ִ� ���� ������� �־�����. 
			N�� 50���� �۰ų� ���� �ڿ����̰�, 
			A�� B�� �� ���Ҵ� 100���� �۰ų� ���� ���� �ƴ� �����̴�.
		*/
		
		// ���
		/*
		 	ù° �ٿ� S�� �ּڰ��� ����Ѵ�. 
		*/
			
		// ���� �Է�
		/* 
			5
			1 1 1 6 0
			2 7 8 3 1
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		// S = A[0] �� B[0] + ... + A[N-1] �� B[N-1]
		// S�� ���� ���� �۰� ����� ���� A�� ���� ��迭
		// S�� �ּڰ��� ���

		int n = sc.nextInt();
		
		
		// 1. �迭 ����
		// A�迭 ����
		Integer[] aArr = new Integer[n];
		for(int i = 0; i < n; i++) {
			aArr[i] = sc.nextInt();
		}
		// B�迭 ����
		Integer[] bArr = new Integer[n];
		for(int j = 0; j < n; j++) {
			bArr[j] = sc.nextInt();
		}
		
		// A�迭�� ���� ���� ������ ����
		Arrays.sort(aArr);
		// B�迭�� ���� ū ������ ����
		Arrays.sort(bArr, Collections.reverseOrder());
		
		int x = 0;
		for(int k = 0; k < n; k++) {
			x += aArr[k]*bArr[k];
		}
		
		
//		// 2. ����Ʈ ����
//		// A����Ʈ ����
//		List<Integer> aList = new ArrayList<Integer>();
//		for(int i = 0; i < n; i++) {
//			aList.add(sc.nextInt());
//		}
//		// B����Ʈ ����
//		List<Integer> bList = new ArrayList<Integer>();
//		for(int i = 0; i < n; i++) {
//			bList.add(sc.nextInt());
//		}
//		// A����Ʈ�� ���� ���� ������ ����
//		Collections.sort(aList);
//		// B����Ʈ�� ���� ū ������ ����
//		Collections.sort(bList, Collections.reverseOrder());
//		
//		int x = 0;
//		for(int k = 0; k < n; k++) {
//			x += aList.get(k)*bList.get(k);
//		}
		
		System.out.println(x);
		
		sc.close();
	}

}
