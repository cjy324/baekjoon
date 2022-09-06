package sorts;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		/*
		 * https://st-lab.tistory.com/179
		 * 
		 * ���� ������ ���� ���ϰ��� �ϴ� target(Ÿ��)�� �� ������ ���ҵ�� ���ϸ� �ڸ��� ��ȯ(swap)�ϴ� ���� ���
		 */

		int[] testI = {10, 200, 30, 450, 22, 1, 324, 123123, 2344};
		
		insertion_sort(testI);
		
		System.out.println(Arrays.toString(testI));

	}
	
	public static void insertion_sort(int[] a) {
		insertion_sort(a, a.length);
	}
	
	private static void insertion_sort(int[] a, int size) {
			
		for(int i = 1; i < size; i++) {
			// Ÿ�� �ѹ�
			int target = a[i];
			
			int j = i - 1;
			
			// Ÿ���� ���� ���Һ��� ũ�� �� ���� �ݺ�
			while(j >= 0 && target < a[j]) {
				a[j + 1] = a[j];	// ���� ���Ҹ� �� ĭ�� �ڷ� �̷��.
				j--;
			}
			
			/*
			 * �� �ݺ������� Ż�� �ϴ� ��� ���� ���Ұ� Ÿ�ٺ��� �۴ٴ� �ǹ��̹Ƿ�
			 * Ÿ�� ���Ҵ� j��° ���� �ڿ� �;��Ѵ�.
			 * �׷��Ƿ� Ÿ���� j + 1 �� ��ġ�ϰ� �ȴ�.
			 */
			a[j + 1] = target;	
		}
		
	}

}
