package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int n;
    static int check[]; // �湮 �Ϸ�
    static int bridge[]; // ���ٸ�
    static int dir[] = {1, -1}; // ���� ����, ������ ����
    static int cnt = 1; // ���� ������ �湮�� ���̴� 1�� �ʱ�ȭ

	public static void main(String[] args) throws IOException {
		
		// 14248�� 
		// ���� ����
		// https://www.acmicpc.net/problem/14248
		
		// ����
		/*
			����� �������� ������������

			����� ���� n���� ���� �Ϸķ� �����ִ� ���ٸ��� �ִ�. 
			�׸��� ���ٸ��� ������ ���ڰ� �ϳ��� �����ִ�. 
			����� �� ���ڰ� �����ִ� ��ŭ �����̳� ���������� ������ �� �ִµ�, �̶� ���ٸ� ������ ���� ���� ����.
			
			����� �� ���ٸ����� �ڱⰡ �湮 ������ ������ ������ �˰� �;��Ѵ�. 
			�湮 �����ϴٴ� ���� ������ġ���� �ٸ� ���� ������ ��� �ش��ϴ� ��ġ�� �̵��� �����ϴٴ� ���̴�.
			
			���� ��ġ�� �־����� ��, ���찡 �湮 ������ ������ ������ ����Ͻÿ�.
		*/
		
		// �Է�
		/*
			ù ��° �ٿ��� ���ٸ��� �� ���� n�� �־�����.(1��n��100,000) 
			���� ��ȣ�� ���ʺ��� 1������ n���̴�. 
			���� �ٿ��� �� ��ġ���� ������ �� �ִ� �Ÿ� Ai�� �־�����.(1��Ai��100,000)

			���� �ٿ��� ����� s�� �־�����.(1��s��n)
		*/
		
		// ���
		/*
		 	���찡 �湮 ������ ������ ������ ����Ͻÿ�.
		*/
			
		// ���� �Է�
		/* 
			5
			1 4 2 2 1
			3
		*/
		
		// ��
		/* 
		 	5
		*/
		
		
		
		// POINT
		// ���ڰ� �����ִ� ��ŭ �����̳� ���������� ������ �� �ִµ�, �̶� ���ٸ� ������ ���� ���� ����.
		// �ڱⰡ �湮 ������ ������ ����???
		
		// ���� ��ȣ�� ���ʺ��� 1������ n��
		// ���� �ٿ��� �� ��ġ���� ������ �� �ִ� �Ÿ� Ai
		// ���� �ٿ��� ����� s
		
		// ���� ��ġ�� �־����� ��, ���찡 �湮 ������ ������ ������ ���
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        bridge = new int[n]; 
        check = new int[n]; 
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // ���ٸ� ���
        for (int i = 0; i < n; i++) {
            bridge[i] = Integer.parseInt(st.nextToken());
        }

        int s = Integer.parseInt(br.readLine()); // ��������
        System.out.println(bfs(s-1)); // �迭 �ε����� s-1

	}
	
	public static int bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        check[node] = 1; // �湮�� �� üũ
        
        while (!queue.isEmpty()) {
            node = queue.poll();
            int jump = bridge[node];
            for (int d : dir) {
                int direction = (d * jump) + node;
                if (direction >= 0 && direction < n && check[direction] == 0) {
                    check[direction] = 1;
                    queue.offer(direction);
                    cnt++;
                }
            }
        }
        return cnt;
    }
	
	
	// ����: https://connie.tistory.com/m/16

}
