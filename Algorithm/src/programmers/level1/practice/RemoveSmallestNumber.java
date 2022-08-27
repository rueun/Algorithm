package programmers.level1.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 제일 작은 수 제거하기

/* 문제 설명
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 */

/* 제한 조건
 * arr은 길이 1 이상인 배열입니다.
 * 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
 */
public class RemoveSmallestNumber {
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		
		System.out.println(Arrays.toString(solution(arr)));
		
	}
	
	public static int[] solution(int[] arr) {
		if(arr.length == 1) {
			int[] answer = {-1};
			return answer;
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i : arr) {
			list.add(i);
		}
		
		Integer min = Collections.min(list); // 리스트에서 가장 작은 값 구하기
		list.remove(min); // 가장 작은 값 제거
		
		int[] answer = new int[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = list.get(i);
		}
		
        return answer;
    }
}
