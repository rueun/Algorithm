package programmers.level1;

public class AddNotExist {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		int answer = solution(numbers);
		System.out.println(answer);
	}
	
	public static int solution(int[] numbers) {
		int answer = 0;
		boolean contain;
		
		for(int i=0; i<10; i++) {
			contain = false;
			for(int number:numbers) {
				if(i == number) {
					contain = true;
					break;
				}
			}
			
			if(!contain) {
				answer = answer + i;
			}
		}
        return answer;
        
        /* 다른 사람이 짠 코드 중 대단한 코드
        int sum = 45;
		
		for(int number : numbers) {
			sum = sum-number;
		}
		
        return sum;
        */
    }
}
