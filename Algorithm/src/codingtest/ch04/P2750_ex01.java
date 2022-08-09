package codingtest.ch04;

import java.util.Scanner;

// 버블 정렬
public class P2750_ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 수의 개수
		int A[] = new int[N];
		
		for(int i=0; i<N; i++) { // 배열에 값 저장
			A[i] = sc.nextInt(); 
		}
		
		for(int i=0; i<N-1; i++) { // 전체 루프
			for(int j=0; j<N-1-i; j++) { // 처음에 N-1까지만 수행. 마지막 요소는 할 필요X
				if(A[j]>A[j+1]) {
					int swap = A[j];
					A[j] = A[j+1];
					A[j+1]=swap;
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(A[i]);
		}
		
		sc.close();
	}
}
