package programmers.level1.practice;

/* 최소 직사각형
 * 명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다. 
 * 다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서, 작아서 들고 다니기 편한 지갑을 만들어야 합니다. 
 * 이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.
 * 아래 표는 4가지 명함의 가로 길이와 세로 길이를 나타냅니다.
 * 
 * 명함번호 가로길이  세로길이
	 1		60		50
	 2		30		70
	 3		60		30
	 4		80		40
 * 
 */
public class LeastRectangle {
	public static void main(String[] args) {
		int[][] sizes  = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		System.out.println(solution(sizes));
	}
	
	public static int solution(int[][] sizes) {
        
        for(int i=0; i<sizes.length; i++) {
        	if(sizes[i][0]<sizes[i][1]) {
        		int tmp = sizes[i][0];
        		sizes[i][0] = sizes[i][1];
        		sizes[i][1] = tmp;
        	}
        }
        
        int wmax = sizes[0][0];
        int hmax = sizes[0][1];
        
        for(int i=1; i<sizes.length; i++) {
        	if(sizes[i][0] > wmax) {
        		wmax = sizes[i][0];
        	}
        	
        	if(sizes[i][1] > hmax) {
        		hmax = sizes[i][1];
        	}
        }

        return wmax * hmax;
    }
}
