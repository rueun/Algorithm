package codingtest.ch04;

import java.util.Scanner;

// 삽입 정렬
public class P11399_ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 사람의 수
		int A[] = new int[N];
		int S[] = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i]= sc.nextInt();
		}
		
		// 삽입 정렬
		for(int i = 1; i < N; i++) {
			int target = A[i]; // 정렬할 값
			int j = i - 1; // 비교할 인덱스
			
			// 타겟이 이전 원소보다 크기 전 까지 반복
			while(j >= 0 && target < A[j]) {
				A[j + 1] = A[j];	// 이전 원소를 한 칸씩 뒤로 미룬다.
				j--;
			}
			
			/*
			 * 위 반복문에서 탈출 하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
			 * 타겟 원소는 j번째 원소 뒤에 와야한다.
			 * 그러므로 타겟은 j + 1 에 위치하게 된다.
			 */
			A[j + 1] = target;	
		}
		
		S[0]=A[0]; // 첫번째 요소 지정
		for(int i=1; i<N; i++) {
			S[i] = S[i-1]+A[i];
		}
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum = sum+S[i];
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
