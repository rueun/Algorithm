package programmers.level1;


public class PlusYinYang {
	public static void main(String[] args) {
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		
		int answer = solution(absolutes, signs);
		
		System.out.println(answer);
	}
	
	public static int solution(int[] absolutes, boolean[] signs) {
		int sum = 0;
		
		int idx = 0;
		for(int num : absolutes) {
			if(signs[idx]) {
				sum = sum + num;
			} else {
				sum = sum - num;
			}
			
			idx++;
		}
        return sum;
    }
}
