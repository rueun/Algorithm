package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

// 정수 내림차순으로 정렬하기

/* 문제 설명
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */

/* 제한 조건
 * n은 1이상 8000000000 이하인 자연수입니다.
 */
public class SortDescendingOrder {
	public static void main(String[] args) {
		System.out.println(solution(118372));
	}
	
	public static long solution(long n) {
        long answer = 0;
        
        ArrayList<Long> arr = new ArrayList<>();
        
        while(n>0) {
        	arr.add((n%10));
        	n /= 10;
        }
        
        Collections.sort(arr);
        
        int digit = 1;
        
        for(long num : arr) {
        	answer += digit * num;
        	digit *= 10;
        }
        
        return answer;
        
        /*
       	String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
        */
    }
}
