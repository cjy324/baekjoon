package sorts;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		/*
		 * <���� ����>
		 * 
		 * https://st-lab.tistory.com/195
		 * 
		 * �� ����
		 * 
		 * ��,�� �� �� �� ���������� ������ 
		 * 
		 * �� ��, �� ���带 ���� �� ������ �ڿ������� �� ���� ���ĵǱ� ������, ���尡 ���� �� ������ �� ���� �ٸ鼭 ���ϰ� �ȴ�.
		 * 
		 * �� ����� �迭 ũ�� - 1 �� ����ǰ�,
		 * 
		 * �� ���庰 �� Ƚ���� �迭 ũ�� - ���� Ƚ�� ��ŭ ���Ѵ�.
		 */		
		
		
		int[] testB = {10, 200, 30, 450, 22, 1, 324, 123123, 2344};
		
		bubble_sort(testB);
		
		System.out.println(Arrays.toString(testB));
	}
	
	public static void bubble_sort(int[] a) {
		bubble_sort(a, a.length);
	}
	
	private static void bubble_sort(int[] a, int size) {
		
		// round�� �迭 ũ�� - 1 ��ŭ ����� 
		for(int i = 1; i < size; i++) {
			
			// �� ���庰 ��Ƚ���� �迭 ũ���� ���� ���带 �� ��ŭ ����
			for(int j = 0; j < size - i; j++) {
				
				/*
				 *  ���� ���Ұ� ���� ���Һ��� Ŭ ���
				 *  ���� ������ ��ġ�� ��ȯ�Ѵ�. 
				 */
				if(a[j] > a [j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}
		
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
