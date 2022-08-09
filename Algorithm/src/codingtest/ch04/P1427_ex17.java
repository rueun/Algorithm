package codingtest.ch04;

import java.util.Scanner;

// 선택 정렬(내림차순)
public class P1427_ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // 정렬할 수
		int A[] = new int[str.length()];
		for(int i=0; i<str.length(); i++) { // A배열에 저장. substring 함수를 사용해 숫자를 각 자릿수 별로 나눈 후 배열에 저장
			A[i] = Integer.parseInt(str.substring(i, i+1));
		}
		
		for(int i=0; i<str.length(); i++) {
			int max = i;
			for(int j=i+1; j<str.length(); j++) {
				if(A[max]<A[j]) {
					max = j;
				}
			}
			
			if(A[i]<A[max]) {
				int temp = A[i];
				A[i]=A[max];
				A[max]=temp;
			}
		}
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(A[i]);
		}
		sc.close();
	}
}
