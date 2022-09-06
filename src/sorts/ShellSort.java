package sorts;

public class ShellSort {

	public static void main(String[] args) {
		
		/*
		 * https://st-lab.tistory.com/209
		 * 
		 *  

			�� ������ ��ü���� ������ �̷���. (���������� �������� ����)
			
			 
			
			1. ����(gap)�� �����Ѵ�.
			
			2. �� ���ݺ��� �з� �� ����(�κ�) ����Ʈ�� ���� ���������� �Ѵ�.
			
			3. �� ����(�κ�) ����Ʈ�� ������ ������ ������ ���δ�.
			
			4. ������ 1�� �� �� ���� 2�� �������� �ǵ��ư��� �ݺ��Ѵ�.
			
			���� ����??? �� ������(Gap Sequences)
			������� �˷��� gap sequence�� �� ���� ���� �����ս��� ���� Ciura �������� ���
		 */
	}
	
	private final static int[] gap = 
		{ 1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937, 	
		8858, 19930, 44842, 100894, 227011, 510774,
		1149241, 2585792, 5818032, 13090572, 29453787, 
		66271020, 149109795, 335497038, 754868335, 1698453753};	// ���� ����ִ� �迭	
 
	
	public static void shell_sort(int[] a) {
		shell_sort(a, a.length);
		
	}
 
	// �� ó�� gap�� ���� �� �ε����� ���ϴ� �޼ҵ�
	private static int getGap(int length) {
		int index = 0;
		// �ּ��� �κ� �迭�� ���Ұ� 2������ �� �ǵ��� �����ش�.
		int len = (int)(length / 2.25);	
		while (gap[index] < len) {
			index++;
		}
		return index;
	}
 
	private static void shell_sort(int[] a, int size) {
		int index = getGap(size);	// ù gap�� ����� index
 
		// gap[index] ������ gap[0] ���� �ݺ��Ѵ�.
		for (int i = index; i >= 0; i--) {
 
			for (int j = 0; j < gap[i]; j++) {	// �� �κ� ����Ʈ�� ���� ���������� �Ѵ�.
				insertion_sort(a, j, size, gap[i]);
			}
		}
	}
 
	/**
	 * 
	 * @param a		 �迭
	 * @param start	 �κ� �迭�� ù ��° ���� �ε��� 
	 * @param size	 �迭�� ��ü ũ��
	 * @param gap	 ���� gap
	 */
	private static void insertion_sort(int[] a, int start, int size, int gap) {
 
		// �κ� �迭�� �� ��° ���Һ��� size���� �ݺ��Ѵ�. (gap ���� �ǳʶ�) 
		for (int i = start + gap; i < size; i += gap) {
 
			int target = a[i];
			int j = i - gap;
 
			// Ÿ�� ���Ұ� ������ ���Һ��� ���� �� ���� �ݺ� 
			while (j >= start && target < a[j]) {
				a[j + gap] = a[j];	// ���� ���Ҹ� �� ĭ�� �ڷ� �̷��.
				j -= gap;
			}
			/*
			 * �� �ݺ������� Ż�� �ϴ� ��� ���� ���Ұ� Ÿ�ٺ��� �۴ٴ� �ǹ��̹Ƿ�
			 * Ÿ�� ���Ҵ� j��° ���� �ڿ� �;��Ѵ�.
			 * �׷��Ƿ� Ÿ���� j + gap �� ��ġ�ϰ� �ȴ�.
			 */
			a[j + gap] = target;
 
		}
	}

}
