package programmers.level1;

// 핸드폰 번호 가리기

/* 문제 설명
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때,
 * 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 */

/* 제한 사항
 * phone_number는 길이 4 이상, 20이하인 문자열입니다.
 */

public class CoveringPhoneNumber {
	public static void main(String[] args) {
		String phone_number = "01033334444";
		System.out.println(solution(phone_number));
	}
	
	public static String solution(String phone_number) {
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<phone_number.length()-4; i++) {
			sb.append("*");
		}
		
		sb.append(phone_number.substring(phone_number.length()-4));
		
        return sb.toString();
        
        /* 
        char[] ch = phone_number.toCharArray();
	    for(int i = 0; i < ch.length - 4; i ++){
	        ch[i] = '*';
	    }
	    return String.valueOf(ch);
        */
    }
}
