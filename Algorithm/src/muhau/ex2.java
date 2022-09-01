package muhau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex2 {
	public static void main(String[] args) {
		int[]  n = {6,1,6,6,7,5,6,7};
		System.out.println(Solution.solution(n));
	}
	
	static class Solution {
	    public static int solution(int[] numbers) {
	    	Map<Integer, Integer> hashmap = new HashMap<>();
	    	
	    	for(int i=0; i<numbers.length; i++) {
	    		// 해당 수와 그 수의 갯수를 key, value로 넣어줌
	    		hashmap.put(numbers[i], hashmap.getOrDefault(numbers[i], 0)+1); 
	    	}
	    	
	    	// 해시맵의 키 값을 갖는 리스트 생성
	    	List<Integer> keySetList = new ArrayList<>(hashmap.keySet());
	    	
	    	// value 값에 따라 내림차순으로 키 정렬
	    	Collections.sort(keySetList, (o1, o2) -> (hashmap.get(o2).compareTo(hashmap.get(o1))));
			
	    	int majornum = keySetList.get(0); // 배열에서 가장 많은 수(해쉬 맵의 value 값이 가장 큰 key 값)
	    	
	    	if(hashmap.get(majornum) > numbers.length / 2) { // value가 가장 큰 값이 과반수를 넘으면
	    		return majornum; // key값 리턴
	    	} else {
	    		return -1;
	    	}
	    }
	}
}
