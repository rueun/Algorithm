package muhau;

import java.util.ArrayList;
import java.util.List;

public class ex4 {
	static int count = 0;
	public static void main(String[] args) {
		int num[] = {5,3,9,13};
		System.out.println(Solution.solution(num, 7));
	}
	
	
	// 배열에서 2개를 더했을 때 n을 만들 수 있으면 true, 없으면 false 리턴
	static class Solution {
	    public static boolean solution(int num[], int n) {
	    	
	    	List<Integer> list = new ArrayList<>();
	    	for(int i : num) { 
	    		if(i<n) { // n 보다 작은 배열의 원소만 리스트에 넣어줌
	    			list.add(i);
	    		}
	    	}
	    	
	    	for(int i=0; i<list.size()-1; i++) { // 차례대로 조합    	
	    		for(int j=i+1; j<list.size(); j++) { 
	    			if(list.get(i)+list.get(j)==n) {
	    				return true;
	    			}
	    		}
	    	}
	    	return false;
	    }
	}
	
}
