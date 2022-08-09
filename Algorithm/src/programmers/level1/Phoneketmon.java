package programmers.level1;

import java.util.HashSet;

public class Phoneketmon {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		
		int result = solution(nums);
		System.out.println(result);
	}
	
	public static int solution(int[] nums) {
		int count = nums.length / 2; // 결과값으로 얻을 수 있는 최댓값
		
		// hashset을 이용한 중복 제거
		HashSet<Integer> numsSet = new HashSet<>();
		for(int num : nums) {
			numsSet.add(num);
		}
		
		if(count > numsSet.size()) { // 최댓값이 중복을 제거한 set의 길이보다 클 경우에만 set의 길이를 리턴
			return numsSet.size();
		} else {
			return count;
		}

	}
}