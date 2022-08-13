package programmers.level1;

// 약수의 합

/* 문제 설명
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 */

/* 제한 사항
 * n은 0 이상 3000이하인 정수입니다.
 */

public class AddDivisior {
	public static void main(String[] args) {
		int n = 12;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		int answer = 0;
		
		for(int i=1; i<=n/2; i++) { // n/2까지만 해도 된다. 소수 중 2가 가장 작으므로
			if(n%i == 0) {
				answer += i;
			}
		}
		
		/*
		for(int i=1; i<=Math.sqrt(n); i++) { // Math.sqrt를 이용한 약수 구하기
			if(n % i == 0) {
				answer += i;
				if(n/i != i) {
					answer += n/i;
				}
			}
		}
        */
        return answer + n;
    }
}
