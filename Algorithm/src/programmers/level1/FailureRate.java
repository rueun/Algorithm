package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays; // toString

public class FailureRate {
	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		int[] answer = solution(N, stages);
		System.out.println(Arrays.toString(answer));
	}
	
	public static int[] solution(int N, int[] stages) {
        
        int[] answer = new int[N];
        int[] level = new int[N+1]; // 각 스테이지마다 머물러 있는 사용자 수를 담을 배열
        
        for(int stage : stages) {
        	if(stage == N+1) { // 만약 스테이지를 모두 완료한 사용자라면
        		continue;
        	}
        	level[stage-1]++;
        }
        
        // 실패율을 계산해 담을 list
        ArrayList<Double> failRate = new ArrayList<Double>();
        
        double userCnt = stages.length; // 스테이지에 도전한 명수
        
        // 실패율을 구한 후 level 배열에 담기
        int idx = 1;
        int count = 0;
        
        for(int i : level) {
        	if(i == 0) {
        		failRate.add((double) 0);
        	} else {

        				
        	}
        	idx++;
        }
        
        return level;
    }
}
