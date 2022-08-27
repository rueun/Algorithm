package programmers.level1.practice;

// 자릿수 더하기

/* 문제 설명
* 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
* 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
*/

public class AddDigits {
	public static void main(String[] args) {
		int n = 123;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
        int sum = 0;
        while(n!=0) {
        	sum += n%10;
        	n /= 10;
        }
        return sum;
	}
}
