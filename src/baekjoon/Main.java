package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 12738�� 
		// ���� �� �����ϴ� �κ� ���� 3
		// https://www.acmicpc.net/problem/12738
		
		// ����
		/*
			���� A�� �־����� ��, ���� �� �����ϴ� �κ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

			���� ���, ���� A = {10, 20, 10, 30, 20, 50} �� ��쿡 
			���� �� �����ϴ� �κ� ������ A = {10, 20, 10, 30, 20, 50} �̰�, ���̴� 4�̴�.
		*/
		
		// �Է�
		/*
			ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000,000)�� �־�����.

			��° �ٿ��� ���� A�� �̷�� �ִ� Ai�� �־�����. 
			(-1,000,000,000 �� Ai �� 1,000,000,000)
		*/
		
		// ���
		/*
		 	ù° �ٿ� ���� A�� ���� �� �����ϴ� �κ� ������ ���̸� ����Ѵ�.
		*/
			
		// ���� �Է�
		/* 
			6
			10 20 10 30 20 50
		*/
		
		// ��
		/* 
		 	4
		*/
		
		
		// POINT
		// 1. ����Ʈ�� ������ ���� ũ�� ����
		// 2. ����Ʈ�� ������ ���� ������ ����Ʈ ���� Ž������ ������ ��ġ�� ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    ArrayList<Integer> list = new ArrayList<>();

		int n = Integer.parseInt(br.readLine());
		int val = 0;
		
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < n; i++) {
        	val = Integer.parseInt(st.nextToken());
        	
        	if(list.get(list.size() - 1) < val) {
        		list.add(val);
        	} else {
        		int left = 1;
        		int right = list.size() - 1;
        		
        		while(left < right) {
        			int mid = (left + right) / 2;
        			if(list.get(mid) < val) {
        				left = mid + 1;
        			} else {
        				right = mid;
        			}
        		}
        		list.set(right, val);
        	}
        	
        }

        bw.write((list.size() - 1) + "");
        bw.flush();
        br.close();
        bw.close();

	}
	
	// ����: https://gre-eny.tistory.com/24

}
