package BaekJoon.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 한수

/* 문제
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 */

/* 입력
 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
 * 110
 */

/* 출력
 * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 * 99
 */

public class P1065 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		br.close();
		
		int count = 0;
		
		if(N<100) {
			count = N;
		} else {
			count = 99;
			for(int i=100; i<=N; i++) {
				if(isTrue(i)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static boolean isTrue(int n) {
		int currentdif;
		int beforedif = n%100/10 - n%100%10;
		
		while(n>=10) {
			currentdif = n%100/10 - n%100%10;
			if(beforedif != currentdif) {
				return false;
			}
			n = n/10;
			beforedif = currentdif;
		}
		return true;
	}
}
