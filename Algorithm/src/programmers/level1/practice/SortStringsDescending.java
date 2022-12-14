package programmers.level1.practice;

import java.util.Arrays;
import java.util.Collections;

// 문자열 내림차순 배치

/* 문제 설명
 * 문자열 s에 나타나는 문자를 큰 것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주
 * 
 */

public class SortStringsDescending {
	public static void main(String[] args) {
		String s = "Zbcdefg";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		
		String str = String.valueOf(c);
		
		return new StringBuffer(str).reverse().toString();
    }
}
