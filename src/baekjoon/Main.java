package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 1300�� 
		// K��° ��
		// https://www.acmicpc.net/problem/1300
		
		// ����
		/*
			�����̴� ũ�Ⱑ N��N�� �迭 A�� �������. 
			�迭�� ����ִ� �� A[i][j] = i��j �̴�. 
			�� ���� ������ �迭 B�� ������ B�� ũ��� N��N�� �ȴ�. 
			B�� �������� �������� ��, B[k]�� ���غ���.

			�迭 A�� B�� �ε����� 1���� �����Ѵ�.
		*/
		
		// �Է�
		/*
			ù° �ٿ� �迭�� ũ�� N�� �־�����. 
			N�� 105���� �۰ų� ���� �ڿ����̴�. 
			��° �ٿ� k�� �־�����. 
			k�� min(109, N2)���� �۰ų� ���� �ڿ����̴�.
		*/
		
		// ���
		/*
		 	B[k]�� ����Ѵ�.
		*/
			
		// ���� �Է�
		/* 
			3
			7
		*/
		
		// ��
		/* 
		 	6
		*/
		
		
		
		// POINT
		// ũ�Ⱑ N��N�� �迭 A�� �������. 
		// �迭�� ����ִ� �� A[i][j] = i��j �̴�. 
		// �� ���� ������ �迭 B�� ������ B�� ũ��� N��N�� �ȴ�. 
		// B�� �������� �������� ��, B[k]�� ���غ���????????????
		
		// ù° �ٿ� �迭�� ũ�� N 
		// N�� 105���� �۰ų� ���� �ڿ����̴�. 
		// ��° �ٿ� k 
		// k�� min(109, N2)���� �۰ų� ���� �ڿ���

		
		// ������ ������ ������ ����. A[i][j] = i * j �� �̷�����ִ� ��ĵ��� 
		// 1���� �迭 B�� ���� �� B[k]�� ���� ���������� ã�� ������.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		// x�� lo <= x <= hi �� ������ ���´�.
		long lo = 1;
		long hi = K;
		
		// lower-bound
		while(lo < hi) {
			
			long mid = (lo + hi) / 2;	// ������ x(mid)�� �߰� ������ ��´�.
			long count = 0;
			
			/*
			 *  ������ x�� ���� i�� ° ���� �������ν� x���� �۰ų� ���� ������ ����
			 *  ���� ���� ���Ѵ�.
			 *  �� �� �� ���� ������ ������ N(�� ����)�� �ʰ����� �ʴ� ������ �����־�� �Ѵ�.   
			 */
			for(int i = 1; i <= N; i++) {
				count += Math.min(mid / i, N);
			}
			
			// count�� ���ٴ� ���� ������ x(mid)���� ���� ���� B[K]���� ���ٴ� ��
			if(K <= count) {
				hi = mid;
			}
			else {
				lo = mid + 1;
			}
		}
		
		System.out.println(lo);

	}
	
	// ����: https://st-lab.tistory.com/281

}
