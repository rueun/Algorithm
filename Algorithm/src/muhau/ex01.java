package muhau;

public class ex01 {
	public static void main(String[] args) {
		System.out.println(Solution.solution("+82-10-5656-4564"));
	}
	
	
	static class Solution {
	    public static int solution(String phone_number) {
	    	String pattern1 = "010-\\d{4}-\\d{4}$";
	    	String pattern2 = "010\\d{8}$";
	    	String pattern3 = "\\+82-10-\\d{4}-\\d{4}$";
	    	
	    	if(phone_number.matches(pattern1)) {
	    		return 1;
	    	} else if(phone_number.matches(pattern2)) {
	    		return 2;
	    	} else if(phone_number.matches(pattern3)) {
	    		return 3;
	    	} else {
	    		return -1;
	    	}
	    }
	}
}
