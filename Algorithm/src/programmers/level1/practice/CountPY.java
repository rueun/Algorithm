package programmers.level1.practice;

public class CountPY {
	public static void main(String[] args) {
		String s = "pPoooyY";
		System.out.println(solution(s));
	}
	
	static boolean solution(String s) {
        s = s.toLowerCase(); // 소문자로 변환
        
        String[] str = s.split("");
        
        int countP = 0;
        int countY = 0;
        
        for(int i=0; i<str.length; i++) {
        	if(str[i].equals("p")) {
        		countP++;
        	} else if(str[i].equals("y")) {
        		countY++;
        	}
        }
        
        /*
        int countP = Collections.frequency(Arrays.asList(str), "p");
        int countY = Collections.frequency(Arrays.asList(str), "y");
        */

        return countP == countY;
    }
}
