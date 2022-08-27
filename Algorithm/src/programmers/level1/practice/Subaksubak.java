package programmers.level1.practice;

// 수박수박수박수박수박수?

/* 문제 설명
 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
 * 예를 들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴
*/

/* 제한 조건
 * n은 길이 10,000이하인 자연수입니다.
 */

public class Subaksubak {
	public static void main(String[] args) {
		System.out.println(solution(4));
	}
	
	public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        int a = n / 2;
        int b = n % 2;
        
        for(int i=0; i<a; i++) {
        	sb.append("수박");
        }
        
        if(b == 1) {
        	sb.append("수");
        }
        
        /*
        for(int i=1; i<=n; i++) {
        	sb.append(i%2==1 ? "수" : "박");
        }
        */
        
        return sb.toString();
        
        
        
        
        
        
        
    }
}
