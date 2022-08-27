package programmers.level1.practice;

// 짝수와 홀수

/* 문제 설명
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 */

/* 제한 조건
 * num은 int 범위의 정수입니다. 0은 짝수입니다.
 */
public class IsEvenOdd {
	public static void main(String[] args) {
		int num = 0;
		
		System.out.println(solution(num));
	}
	
	public static  String solution(int num) {
        return num%2 == 0 ? "Even" : "Odd";
    }
}
