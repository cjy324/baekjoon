package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 2908번 
		// 상수
		// https://www.acmicpc.net/problem/2908
		
		// 문제
		/*
			상근이의 동생 상수는 수학을 정말 못한다. 
			상수는 숫자를 읽는데 문제가 있다. 
			이렇게 수학을 못하는 상수를 위해서 상근이는 
			
			수의 크기를 비교하는 문제를 내주었다. 
			상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.

			상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 
			예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 
			따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
			
			두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
		*/
		
		// 입력
		/*
			첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 
			두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
		*/
		
		// 출력
		/*
		 	첫째 줄에 상수의 대답을 출력한다.
		*/
			
		// 예제 입력
		/* 
			734 893
		*/
		
		// 답
		/* 
		 	437 
		*/

		Scanner sc = new Scanner(System.in);
		
		// 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 
		// 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
		// 숫자를 거꾸로 바꾸고 비교해서 큰 수 출력!!!!!!!!!

		
		// 1. 내 정답
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 1. String 형태로 변환
		String aStr = String.valueOf(a);
		String bStr = String.valueOf(b);
		// 2. char 배열로 담기
		char[] aCharArr = aStr.toCharArray();
		char[] bCharArr = bStr.toCharArray();
		aStr = "";
		bStr = "";
		// 3. 역순으로 정렬
		for(int i = 2; i >= 0; i--) {
			aStr += aCharArr[i];
		}
		for(int i = 2; i >= 0; i--) {
			bStr += bCharArr[i];
		}
		a = Integer.parseInt(aStr);
		b = Integer.parseInt(bStr);
		
		System.out.println(Math.max(a, b));
		
		
		// 2. 더 나은 정답
//		// StringBuilder의 reverse 매서드를 이용하는 방법
//		
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//        
//		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
//		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
//		
//		System.out.print(A > B ? A : B);  // Math 유틸을 이용하지 않고 삼항연산자로 처리

		sc.close();
	}

}
