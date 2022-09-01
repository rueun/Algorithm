package muhau;

import java.util.ArrayList;
import java.util.List;

public class ex3 {
	public static void main(String[] args) {
		System.out.println(Solution.solution(1112));
	}
	
	// Q3. 입력받은 숫자 영어로 나타내기
	static class Solution {
	    public static String solution(int num) {
	    	String[] s = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	    	StringBuilder sb = new StringBuilder();
	    	List<Integer> list = new ArrayList<>();
	    	while(num!=0) { // 리스트에 각 자리 수 마다 끊어서 담기
	    		list.add(num%10);
	    		num /= 10;
	    	}
	    	
	    	for(int i=list.size()-1; i>=0; i--) { // 리스트의 뒷 부분부터
	    		// 만약 숫자1 이면 s 배열의 인덱스0에 해당하므로 s[숫자-1] sb에 추가
	    		sb.append(s[list.get(i)-1]); 
	    	}
	    	return sb.toString();
	    }
	}
}
