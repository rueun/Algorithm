package codingtest.ch06;

import java.util.Scanner;

// 동전 개수의 최솟값 구하기
public class P11047_ex32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 동전 종류
		int K = sc.nextInt(); // 목표 금액
		
		int[] coins = new int[N];
		
		for(int i=0; i<N; i++) {
			coins[i] = sc.nextInt();
		}
		
		int count = 0;
		
		for(int i=N-1; i>=0; i--) {
			if(coins[i]<=K) {
				count = count + K/coins[i];
				K = K%coins[i];
			}
		}
		
		System.out.println(count);
		sc.close();
	}
}
