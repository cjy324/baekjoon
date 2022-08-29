package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 1026번 
		// 보물
		// https://www.acmicpc.net/problem/1026
		
		// 문제
		/*
			옛날 옛적에 수학이 항상 큰 골칫거리였던 나라가 있었다. 이 나라의 국왕 김지민은 다음과 같은 문제를 내고 큰 상금을 걸었다.

			길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.

			S = A[0] × B[0] + ... + A[N-1] × B[N-1]

			S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안 된다.
			
			S의 최솟값을 출력하는 프로그램을 작성하시오.
		*/
		
		// 입력
		/*
			첫째 줄에 N이 주어진다. 
			둘째 줄에는 A에 있는 N개의 수가 순서대로 주어지고, 
			셋째 줄에는 B에 있는 수가 순서대로 주어진다. 
			N은 50보다 작거나 같은 자연수이고, 
			A와 B의 각 원소는 100보다 작거나 같은 음이 아닌 정수이다.
		*/
		
		// 출력
		/*
		 	첫째 줄에 S의 최솟값을 출력한다. 
		*/
			
		// 예제 입력
		/* 
			5
			1 1 1 6 0
			2 7 8 3 1
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		// S = A[0] × B[0] + ... + A[N-1] × B[N-1]
		// S의 값을 가장 작게 만들기 위해 A의 수를 재배열
		// S의 최솟값을 출력

		int n = sc.nextInt();
		
		
		// 1. 배열 버전
		// A배열 생성
		Integer[] aArr = new Integer[n];
		for(int i = 0; i < n; i++) {
			aArr[i] = sc.nextInt();
		}
		// B배열 생성
		Integer[] bArr = new Integer[n];
		for(int j = 0; j < n; j++) {
			bArr[j] = sc.nextInt();
		}
		
		// A배열은 가장 작은 순으로 정렬
		Arrays.sort(aArr);
		// B배열은 가장 큰 순으로 정렬
		Arrays.sort(bArr, Collections.reverseOrder());
		
		int x = 0;
		for(int k = 0; k < n; k++) {
			x += aArr[k]*bArr[k];
		}
		
		
//		// 2. 리스트 버전
//		// A리스트 생성
//		List<Integer> aList = new ArrayList<Integer>();
//		for(int i = 0; i < n; i++) {
//			aList.add(sc.nextInt());
//		}
//		// B리스트 생성
//		List<Integer> bList = new ArrayList<Integer>();
//		for(int i = 0; i < n; i++) {
//			bList.add(sc.nextInt());
//		}
//		// A리스트는 가장 작은 순으로 정렬
//		Collections.sort(aList);
//		// B리스트는 가장 큰 순으로 정렬
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
