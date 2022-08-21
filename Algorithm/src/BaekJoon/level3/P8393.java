package BaekJoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 합

/* 문제
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 */

/* 입력
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 3
 */

/* 출력
 * 1부터 n까지 합을 출력한다.
 6
 */

public class P8393 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(n*(n+1)/2);
		
		br.close();
	}
}
