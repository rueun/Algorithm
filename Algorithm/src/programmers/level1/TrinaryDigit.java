package programmers.level1;

import java.util.ArrayList;

/*
	자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 
	이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
*/

public class TrinaryDigit {
	public static void main(String[] args) {
		System.out.println(solution(125));
	}
	
	
	public static int solution(int n) {
        int answer = 0;
        
        ArrayList<Integer> remain = new ArrayList<>();
        
        while(n>0) {
        	remain.add(n%3);
        	n = n/3;
        }
        
	    for(int i = 0; i < remain.size(); i++) { // 0-4
			answer += remain.get(i) * Math.pow(3, (remain.size()-1-i));
		}
	    System.out.println(remain.toString());
        
        return answer;
    }
}
