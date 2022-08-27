package programmers.level1.practice;

import java.util.ArrayList;
import java.util.Arrays;

/*
	수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
	
	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	
	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
*/

/*
	* 제한 조건
	- 시험은 최대 10,000 문제로 구성되어있습니다.
	- 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
	- 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
 */

public class MockExam {
	public static void main(String[] args) {
		int [] answer = {1,3,2,4,2};
		int [] result = solution(answer);
		
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] solution(int[] answers) {
        int[] result = {};
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        int answer1=0, answer2=0, answer3=0;
        
        int idx = 0;
        for(int answer: answers) {
        	if(p1[idx%p1.length]==answer) answer1++;
        	if(p2[idx%p2.length]==answer) answer2++;
        	if(p3[idx%p3.length]==answer) answer3++;
        	idx++;
        }
        
        int max = Math.max(answer1, Math.max(answer2, answer3)); // 세 수 중에 큰 값 구하기
        
        ArrayList<Integer> list = new ArrayList<>();
        // 순서대로 넣으면 오름차순 정렬됨
        if(answer1 == max) list.add(1);
        if(answer2 == max) list.add(2);
        if(answer3 == max) list.add(3);
        
        result = new int[list.size()];
        for(int i=0; i<result.length; i++) {
        	result[i]=list.get(i);
        }
        
        return result;
    }
}
