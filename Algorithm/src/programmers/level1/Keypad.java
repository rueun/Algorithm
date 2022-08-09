package programmers.level1;

public class Keypad {
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String answer = solution(numbers, "right");
		System.out.println(answer);
	}
	
	static StringBuffer sb = new StringBuffer();
	static int left = 10;
	static int right = 12;
    
	public static String solution(int[] numbers, String hand) {
		
		
	    for(int number:numbers){
	        if(number == 1 || number == 4 || number == 7) {
	        	
	        } else if(number % 3 == 0) {
	        	hand("R", number);
	        } else {
	        	if(number == 0) number = 11;
	        	int leftdist = Math.abs(number-left)/3+Math.abs(number-left)%3;
	        	int rightdist = Math.abs(number-right)/3+Math.abs(number-right)%3;
	        	
	        	if(leftdist<rightdist) {
	        		hand("L", number);
	        	} else if(leftdist>rightdist) {
	        		hand("R", number);
	        	} else {
	        		if(hand.equals("left")) {
	        			hand("L", number);
	        		} else {
	        			hand("R", number);
	        		}
	        	}
	        }
	    }
	    
	    String answer = sb.toString();
	    return answer;
	}

	private static void hand(String hand, int number) {
		sb.append(hand);
    	left = number; // 왼손 저장
		
	}
}

