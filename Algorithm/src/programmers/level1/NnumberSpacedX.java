package programmers.level1;

import java.util.Arrays;

// x만큼 간격이 있는 n개의 숫자

/* 문제 설명
 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
 * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 */

/* 제한 사항
 * x는 -10000000 이상, 10000000 이하인 정수입니다.
 * n은 1000 이하인 자연수입니다.
 */

public class NnumberSpacedX {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(-4, 3)));
	}
	
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = x;
        for(int i=0; i<n; i++) {
        	answer[i] = sum;
        	sum += x;
        }
        return answer;
        
        /*
        long[] answer = new long[n];
        
        answer[0] = x;
        for(int i=1; i<n; i++) {
        	answer[i] = answer[i-1] + x;
        }
        return answer;
        */
    }
}
