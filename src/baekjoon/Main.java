package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 1712번 
		// 손익분기점
		// https://www.acmicpc.net/problem/1712
		
		// 문제
		/*
			월드전자는 노트북을 제조하고 판매하는 회사이다. 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며, 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.

			예를 들어 A=1,000, B=70이라고 하자. 이 경우 노트북을 한 대 생산하는 데는 총 1,070만원이 들며, 열 대 생산하는 데는 총 1,700만원이 든다.

			노트북 가격이 C만원으로 책정되었다고 한다. 일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총 비용(=고정비용+가변비용)보다 많아지게 된다. 
			
			최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK-EVEN POINT)이라고 한다.

			A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.
		*/
		
		// 입력
		/*
			첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다. A, B, C는 21억 이하의 자연수이다.
		*/
		
		// 출력
		/*
		 	첫 번째 줄에 손익분기점 즉 최초로 이익이 발생하는 판매량을 출력한다. 손익분기점이 존재하지 않으면 -1을 출력한다. 
		*/
			
		// 예제 입력
		/* 
			1000 70 170 
			
			3 2 1
			
			2100000000 9 10
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		//A = 고정비
		//B = 가변비
		//C = 노트북판매가
		//손익분기점: 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점     
		// xC = (A + xB)
		// x(C-B) = A
		// x = A/(C-B)
		// 이익이 나는 지점이라 하면 x 에 1 이 더해진 값
		// 중요한 것은, x 은 총 비용과 총 수익이 같아지는 지점일 뿐, 이익이 나는 지점이 아니다!!!!!!!!!
		
		
		// 실패: 시간 초과
//		long a = sc.nextInt();
//		long b = sc.nextInt();
//		long c = sc.nextInt();
//		long x = 0;  // 이익이 발생하는 지점
//		
//		while (true) {
//			x++;
//			long totalIncome = x * c;
//			long variableCost = x * b;
//			if(c <= b) {
//				System.out.println("-1");
//				break;
//			} else if(totalIncome > (a + variableCost)) {
//				System.out.println(x);
//				break;
//			} 
//		}
		
		// 정답
		int A = sc.nextInt();	// 불변 비용
		int B = sc.nextInt();	// 가변 비용
		int C = sc.nextInt(); 	// 상품 가격
        
		if (C <= B) {
			System.out.println("-1");
		} 
		else {
			System.out.println((A/(C-B))+1);
		}
		
		sc.close();
	}

}
