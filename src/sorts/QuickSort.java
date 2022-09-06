package sorts;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		/*
		 * https://st-lab.tistory.com/250
		 */
		
		int[] testQ = {10, 200, 30, 450, 22, 1, 324, 123123, 2344};
		
		quic_sort(testQ);
		
		System.out.println(Arrays.toString(testQ));
	}
	
	public static void quic_sort(int[] a) {
		l_pivot_sort(a, 0, a.length - 1);
	}
	
	/**
	 *  ���� �ǹ� ���� ���
	 * @param a		������ �迭
	 * @param lo	���� �κй迭�� ����
	 * @param hi	���� �κй迭�� ������
	 */
	private static void l_pivot_sort(int[] a, int lo, int hi) {
		
		/*
		 *  lo�� hi���� ũ�ų� ���ٸ� ���� �� ���Ұ� 
		 *  1�� �����̹Ƿ� �������� �ʰ� return�Ѵ�.
		 */
		if(lo >= hi) {
			return;
		}
		
		/*
		 * �ǹ��� �������� ��ҵ��� ���ʰ� ���������� ���ϰ� ���� �� ���·�
		 * ����� �� ��, ���������� pivot�� ��ġ�� ��´�.
		 * 
		 * �׸����� �ش� �ǹ��� �������� ���� �κи���Ʈ�� ������ �κи���Ʈ�� ������
		 * ���� ������ ���ش�.
		 * 
		 * [����]
		 * 
		 * Partitioning:
		 *
		 *   a[left]          left part              right part
		 * +---------------------------------------------------------+
		 * |  pivot  |    element <= pivot    |    element > pivot   |
		 * +---------------------------------------------------------+
		 *    
		 *    
		 *  result After Partitioning:
		 *  
		 *         left part          a[lo]          right part
		 * +---------------------------------------------------------+
		 * |   element <= pivot    |  pivot  |    element > pivot    |
		 * +---------------------------------------------------------+
		 *       
		 *       
		 *  result : pivot = lo     
		 *       
		 *
		 *  Recursion:
		 *  
		 * l_pivot_sort(a, lo, pivot - 1)     l_pivot_sort(a, pivot + 1, hi)
		 *  
		 *         left part                           right part
		 * +-----------------------+             +-----------------------+
		 * |   element <= pivot    |    pivot    |    element > pivot    |
		 * +-----------------------+             +-----------------------+
		 * lo                pivot - 1        pivot + 1                 hi
		 * 
		 */
		int pivot = partition(a, lo, hi);	
		
		l_pivot_sort(a, lo, pivot - 1);
		l_pivot_sort(a, pivot + 1, hi);
		
		
	}
	
	
	
	/**
	 * pivot�� �������� ��Ƽ���� ������ ���� ���� ���� �޼ҵ�
	 * 
	 * @param a		���� �� �迭 
	 * @param left	���� �迭�� ���� ���� �κ�
	 * @param right	���� �迭�� ���� ������ �κ�
	 * @return		���������� ��ġ�� �ǹ��� ��ġ(lo)�� ��ȯ
	 */
	private static int partition(int[] a, int left, int right) {
		
		int lo = left;
		int hi = right;
		int pivot = a[left];		// �κи���Ʈ�� ���� ��Ҹ� �ǹ����� ����
		
		// lo�� hi���� ���� �� ������ �ݺ��Ѵ�.
		while(lo < hi) {
			
			/*
			 * hi�� lo���� ũ�鼭, hi�� ��Ұ� pivot���� �۰ų� ���� ���Ҹ�
			 * ã�� �� ���� hi�� ���ҽ�Ų��.
			 */
			while(a[hi] > pivot && lo < hi) {
				hi--;
			}
			
			/*
			 * hi�� lo���� ũ�鼭, lo�� ��Ұ� pivot���� ū ���Ҹ�
			 * ã�� �� ���� lo�� ������Ų��.
			 */
			while(a[lo] <= pivot && lo < hi) {
				lo++;
			}
			
			// ��ȯ �� �� ��Ҹ� ã������ �� ��Ҹ� �ٲ۴�.
			swap(a, lo, hi);
		}
		
		
		/*
		 *  ���������� �� ó�� pivot���� �����ߴ� ��ġ(a[left])�� ���ҿ� 
		 *  lo�� ����Ű�� ���Ҹ� �ٲ۴�.
		 */
		swap(a, left, lo);
		
		// �� ��Ұ� ��ȯ�Ǿ��ٸ� �ǹ��̾��� ��Ҵ� lo�� ��ġ�ϹǷ� lo�� ��ȯ�Ѵ�.
		return lo;
	}
 
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
