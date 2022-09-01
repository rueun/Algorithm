package muhau;

public class ex5 {
	public static void main(String[] args) {
		System.out.println(solution(9));
	}
	
	// Q5. n을 이진수로 변환했을 때의 1의 개수와, 
	// n보다 작은 수 중 이진 수로 변환했을 때의 1의 개수가 같은 숫자의 개수를 구하세요.
	static int solution (int n) {
		int numCnt = Integer.bitCount(n);
		int answer = 0;
	    for(int i=1; i<n; i++) {
	    	int oneCnt = 0; // 1의 개수를 세기 위한 변수
	    	int num = i; // i의 값은 변하기 안되기 때문에 변수 선언
	    	
			while(num>0) {
	    		if(num%2==1) oneCnt++; // 이진법으로 바꿀 때 1의 개수 세기
	    		if(oneCnt>numCnt) break; // 만약 1의 개수가 n의 1개 수를 넘어간다면
	    		num /= 2;
	    	}

			if(oneCnt == numCnt) answer++; // 이진법의 1의 개수가 같은 경우 answer 증가
	    }
	    return answer;
	 }

	 
	 
	 
	 
	 /*
		// bitCount를 쓴 방식
	    int numCnt = Integer.bitCount(n);
	    int cnt = 0;
	      
	    while(n>0) {
	        n--;
	        if(numCnt == Integer.bitCount(n)) {
	           cnt++;
	        }
	    }
	    */
}
