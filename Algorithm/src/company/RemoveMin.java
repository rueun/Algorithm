package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 정수를 저장한 배열(request)을 입력 받아, 가장 작은 수를 제거한 배열을 반환하는 함수를 완성하세요. 단, 10이상의 값이 있을 경우 다른 값을 반환하세요.
 * * 제한 조건
 * - request의 길이가 1이상 10이하이며, 정수가 들어있는 배열입니다.
 * - 배열의 값은 모두 다른 값입니다. (중복이 있는 값은 없습니다.)
 * - 배열 값에 10 이상의 숫자가 있을 경우엔 배열에 -1만 넣어 반환합니다.
 * - 결과값이 빈 배열인 경우엔 배열에 -1을 넣어 반환합니다.
 */
public class RemoveMin {
	static int[] request;
	static List<Integer> result = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		request = new int[count];
		
		for(int i=0; i<request.length; i++) {
			request[i] = sc.nextInt();
		}
		
		
		
		
		
		sc.close();
	}

	private static Object getResult() {
		int min = request[0];
		
		for(int num : request) { // 가장 작은 수 뽑아내기
			if(min > num) {
				min = num;
			}
		}
		return null;
	}

	
	
}
