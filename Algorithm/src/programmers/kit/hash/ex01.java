package programmers.kit.hash;

import java.util.HashSet;
import java.util.Set;

public class ex01 {
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,2};
		System.out.println(solution(nums));
	}
	
	public static int solution(int[] nums) {
		int N = nums.length/2;
		Set<Integer> hashset = new HashSet<>();
		
		// 해시 셋은 중복을 허용하지 않음
		for(int n : nums) {
			hashset.add(n);
		}
		
		if(hashset.size() < N) {
			return hashset.size();
		} 

        return N;
    }
}
