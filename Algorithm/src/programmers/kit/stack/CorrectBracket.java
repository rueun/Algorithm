package programmers.kit.stack;

import java.util.Stack;

// 올바른 괄호

public class CorrectBracket {
	public static void main(String[] args) {
		System.out.println(solution("()()"));
	}
	
	static boolean solution(String s) {

        Stack<Character> mystack = new Stack<>();
        	
        if(s.charAt(0) == ')') return false;

        
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i)=='(') {
        		mystack.add('(');
        	} else {
        		if(mystack.isEmpty()) {
        			return false;
        		}
        		
        		mystack.pop();
        	}
        }
        
        if(mystack.size()!=0) {
        	return false;
        }
        

        return true;
    }
}
