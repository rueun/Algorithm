package programmers.level1;

// 제곱근 판별

/* 문제 설명
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 */

/* 제한 조건
 * n은 1이상, 50000000000000 이하인 양의 정수입니다.
 */
public class SquareRootDiscrimination {
	public static void main(String[] args) {
		long n = 121;
		System.out.println(solution(n));
	}
	// sqrt() : 제곱근, pow() : 거듭제곱
	public static long solution(long n) {
        if(Math.sqrt(n)%1 == 0) {
        	return (long) Math.pow((Math.sqrt(n) + 1), 2);
        }
        return -1;
	}
}
