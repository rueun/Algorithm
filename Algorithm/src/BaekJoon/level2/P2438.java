package BaekJoon.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별 찍기 - 1

/* 문제
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 */

/* 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
5
 */

/* 출력
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*
**
***
****
*****
 */

public class P2438 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
