package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static Integer[][] dp;
	static int[] W; // weight
	static int[] V; // value

	public static void main(String[] args) throws IOException {
		
		// 12865�� 
		// ����� �賶
		// https://www.acmicpc.net/problem/12865
		
		// ����
		/*
			�� ������ ���� ����� �賶�� ���� �����̴�.

			�� �� �ĸ� ������ �θ��� �ް� �Ǵ� �ؼ��� ������ ������ �Ѵ�. 			
			������� ������ �����ϸ� �ִ��� ���� ���� �����̱� ������, 
			������ �ٴ� �賶 ���� �ִ��� ��ġ �ְ� �η��� �Ѵ�.

			�ؼ��� ���࿡ �ʿ��ϴٰ� �����ϴ� N���� ������ �ִ�. 
			�� ������ ���� W�� ��ġ V�� �����µ�, 
			
			�ش� ������ �賶�� �־ ���� �ؼ��� V��ŭ ��� �� �ִ�. 
			���� �౺�� �غ� ���� ���� �ؼ��� �ִ� K��ŭ�� ���Ը��� ���� �� �ִ� �賶�� ��� �ٴ� �� �ִ�. 
			�ؼ��� �ִ��� ��ſ� ������ �ϱ� ���� �賶�� ���� �� �ִ� ���ǵ��� ��ġ�� �ִ��� �˷�����.
		*/
		
		// �Է�
		/*
			ù �ٿ� ��ǰ�� �� N(1 �� N �� 100)�� 
			�ؼ��� ��ƿ �� �ִ� ���� K(1 �� K �� 100,000)�� �־�����. 
			�� ��° �ٺ��� N���� �ٿ� ���� �� ������ ���� W(1 �� W �� 100,000)�� 
			�ش� ������ ��ġ V(0 �� V �� 1,000)�� �־�����.

			�Է����� �־����� ��� ���� �����̴�.
		*/
		
		// ���
		/*
		 	�� �ٿ� �賶�� ���� �� �ִ� ���ǵ��� ��ġ���� �ִ��� ����Ѵ�.
		*/
			
		// ���� �Է�
		/* 
			4 7
			6 13
			4 8
			3 6
			5 12
		*/
		
		// ��
		/* 
		 	14
		*/
		
		
		// POINT
		// �賶�� ���� �� �ִ� �ִ��� �������� �ش� �ѵ� ������ �־� ��ġ�� ���� �ִ밡 �ǵ��� ���� ����� ã�� ���̴�. 
		// ��, ���� ����ȭ ������.
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
 
		W = new int[N];
		V = new int[N];
 
		dp = new Integer[N][K + 1];
 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}
 
		System.out.println(knapsack(N - 1, K));

	}
	
	static int knapsack(int i, int k) {
		// i�� 0�̸�, �� ���� ���� �ȴٸ�
		if (i < 0)
			return 0;
		
		// Ž������ ���� ��ġ���?
		if (dp[i][k] == null) {
			
			// ���� ����(i)�� �߰��� ����� ��� (���� i�� Ž��) 
			if(W[i] > k) {
				dp[i][k] = knapsack(i - 1, k);
			}
			// ���� ����(i)�� ���� �� �ִ� ��� 
			else {
				// ���� i���� ���� i���� ���� k-W[i]�� �� + ���� ��ġ(V[i])�� ū ���� ����  
				dp[i][k] = Math.max(knapsack(i - 1, k), knapsack(i - 1, k - W[i]) + V[i]);
			}
		}
		return dp[i][k];
	}
	
	// ����: https://st-lab.tistory.com/141

}
