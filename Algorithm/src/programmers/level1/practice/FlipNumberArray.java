package programmers.level1.practice;

// 자연수 뒤집어 배열로 넣기

/* 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
 * 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 */

/* 제한조건
 * n은 10,000,000,000이하인 자연수입니다.
 */
public class FlipNumberArray {
	
	public static void main(String[] args) {
		long n = 12345;
		System.out.println(solution(n));
	}
	
	public static int[] solution(long n) {
        int[] answer = {};
        
        String str = String.valueOf(n);
        
        answer = new int[str.length()];
        
        int idx = 0;
        for(int i=str.length()-1; i>=0; i--) {
        	answer[idx] = str.charAt(i)-'0';
        	idx++;
        }
        
        /*
        while(n>0) {
        	answer[idx] = (int)(n%10);
        	n/=10;
        	idx++;
        }
        */
        
        return answer;
    }
}
