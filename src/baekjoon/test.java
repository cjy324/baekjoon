package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		/*
		 �迭 A�� �־����� ��, N��° ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 �迭 A�� ũ��� �׻� 10�̰�, �ڿ����� ������ �ִ�. N�� �׻� 3�̴�.
		*/
		
		/*
		 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, �迭 A�� ����
		 * 10���� �������� ���еǾ� �־�����. �� ���Ҵ� 1���� ũ�ų� ����, 1,000���� �۰ų� ���� �ڿ����̴�.
		 */
		
		/* �� �׽�Ʈ ���̽��� ���� �� �ٿ� �ϳ��� �迭 A���� 3��° ū ���� ����Ѵ�. */
				
		
//		4
//		1 2 3 4 5 6 7 8 9 1000
//		338 304 619 95 343 496 489 116 98 127
//		931 240 986 894 826 640 965 833 136 138
//		940 955 364 188 133 254 501 122 768 408
		
		Scanner sc = new Scanner(System.in);
		
		int caseNum = sc.nextInt();
		List<Integer> numList = new ArrayList<Integer>();
		String[] numStrArr = sc.next().split(" ");
		
		System.out.println(numStrArr);

	}

}
