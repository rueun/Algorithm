package codingtest.ch03;

import java.util.Scanner;

public class P1546_ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 과목 개수
		int A[] = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		long sum = 0;
		long max = 0;
		for(int i=0; i<N; i++) {
			if(A[i]>max)max = A[i];
			sum += A[i];
		}
		System.out.println(sum * 100.0 / max / N); // 실수로 나타내기 위해 100.0을 먼저 곱해주기
	}
}
