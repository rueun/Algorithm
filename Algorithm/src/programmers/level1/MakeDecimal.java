package programmers.level1;

public class MakeDecimal {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int answer = 0;
		answer = solution(nums);
		
		System.out.println("sksk");
		System.out.println(answer);
	}
	
	public static int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length-2; i++) { // 인덱스가 겹치지 않게 초깃값 구성
        	for(int j=i+1; j<nums.length-1; j++) {
        		for(int k=j+1; k<nums.length; k++) {
                	if(isPrime(nums[i]+nums[j]+nums[k])) {
                		answer++;
                	}
                }
            }
        }
        return answer;
    }
	
	private static boolean isPrime(int number) { // 소수인지 아닌지 판별
		for(int i=2; i<=Math.sqrt(number); i++) {
			if(number%i == 0) { // 나누어 떨어질 경우 소수가 아님
				return false;
			}
		}
		return true;
	}
}
