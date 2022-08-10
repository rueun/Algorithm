package programmers.level1;

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
		System.out.println(solution(1));
	}
	
	public static String solution(int n) {
        StringBuffer sb = new StringBuffer();
        
        int share = n / 2;
        int rest = n % 2;
        
        for(int i=0; i<share; i++) {
        	sb.append("수박");
        }
        
        if(rest != 0) {
        	sb.append("수");
        }
        
        /*
        StringBuffer sf = new StringBuffer();
        for (int i=1; i<=n; i++) {
            sf.append(i%2==1?"수":"박");
        }
        return sf.toString();
        */
        
        return sb.toString();
    }
}
