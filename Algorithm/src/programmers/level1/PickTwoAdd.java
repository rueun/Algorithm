package programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*
 * 문제 설명
 - 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 
   더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
*/

/*
 * 제한사항
 - numbers의 길이는 2 이상 100 이하입니다.
 - numbers의 모든 수는 0 이상 100 이하입니다.
*/

public class PickTwoAdd {
	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};
		
		System.out.println(Arrays.toString(solution(numbers)));
	}
	
	public static int[] solution(int[] numbers) {
		int[] answer = {};
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<numbers.length-1; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		set.add(numbers[i]+numbers[j]);
        	}
        }
        
        answer = new int[set.size()];
        
        int idx = 0;
        
        // set은 iterator 쓰는 것이 좋음
        Iterator<Integer> itor = set.iterator();
        while(itor.hasNext()){
            answer[idx] = itor.next();
            idx++;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
