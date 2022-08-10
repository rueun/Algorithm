package programmers.level1;

// 문자열 내 p와 y의 개수

/* 문제 설명
 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
 * s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
 * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 * 
 * 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다
*/

/* 제한사항
 * 문자열 s의 길이 : 50 이하의 자연수
 * 문자열 s는 알파벳으로만 이루어져 있습니다.
*/

import java.util.Arrays;
import java.util.Collections;

public class CountPY {
	public static void main(String[] args) {
		String s = "pPoooyY";
		System.out.println(solution(s));
	}
	
	static boolean solution(String s) {
        s = s.toLowerCase(); // 소문자로 변환
        
        String[] str = s.split("");
        
        int countP = Collections.frequency(Arrays.asList(str), "p");
        int countY = Collections.frequency(Arrays.asList(str), "y");
        
        /* for문으로 p,y 개수 세기
        for(int i=0; i<str.length; i++) {
        	if(str[i].equals("p")) {
        		countP++;
        	} else if(str[i].equals("y")) {
        		countY++;
        	}
        }
         */

        return countP == countY;
    }
}
