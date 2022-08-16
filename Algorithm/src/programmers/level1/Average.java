package programmers.level1;

// 평균 구하기

/* 문제 설명
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 */

/* 제한 사항
 * arr은 길이 1 이상, 100 이하인 배열입니다.
 * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 */
public class Average {
	
	public static void main(String[] args) {
		int[] arr = {5,5};
		
		System.out.println(solution(arr));
	}
	
	public static double solution(int[] arr) {
		
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		
        return 1.0 * sum / arr.length;
    }
}
