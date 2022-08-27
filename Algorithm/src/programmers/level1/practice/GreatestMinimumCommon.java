package programmers.level1.practice;

import java.util.Arrays;

// 최대공약수와 최소공배수

/* 문제 설명
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
 *  예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 */

/* 제한 조건
 * 두 수는 1이상 1000000이하의 자연수입니다.
 */
public class GreatestMinimumCommon {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3, 12)));
	}
	
	public static int[] solution(int n, int m) {
		if(m > n) {
			int temp = n;
			n = m;
			m = temp;
		}
		
		int gcd = gcd(n, m); // 최대 공약수
		
		int lcm = n * m / gcd; // 두개 수 곱하고 최대 공약수로 나누면 최소 공배수가 된다.
		
		int[] answer = {gcd, lcm}; // 최대 공약수, 최소 공배수
		
		return answer;
    }

	public static int gcd(int n, int m) { // 최대 공약수 구하는 함수
		if(m == 0) return n;
		
		return gcd(m, n%m);
	}
}
