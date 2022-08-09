package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 나누어지는 숫자배열

/* 문제 설명
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 */

/* 제한사항
 * arr은 자연수를 담은 배열입니다.
 * 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
 * divisor는 자연수입니다.
 * array는 길이 1 이상인 배열입니다.
 */

public class DivisibleNumberArray {
	public static void main(String[] args) {
		int[] arr = {3,2,6};
		int divisor = 10;
		
		System.out.println(Arrays.toString(solution(arr, divisor)));
	}
	
	public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        for(int num : arr) {
        	if(num%divisor==0) {
        		list.add(num);
        	}
        }
        
        if(list.isEmpty()) {
        	list.add(-1);
        }
        
        int idx=0;
        
        answer = new int[list.size()];
        
        for(int num : list) {
        	answer[idx] = num;
        	idx++;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
	

}
