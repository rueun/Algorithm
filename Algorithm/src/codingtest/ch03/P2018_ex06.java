package codingtest.ch03;

import java.util.Scanner;
// 연속된 자연수의 합 구하기
public class P2018_ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 자연수 입력 받기
		sc.close();
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while(end_index != N) {
			if(sum == N) {
				count++;
				end_index++;
				sum = sum+end_index;
			} else if(sum > N) {
				sum = sum-start_index;
				start_index++;
			} else if(sum < N) {
				end_index++;
				sum = sum + end_index;
			}
		}
		System.out.println(count);
	}
}
