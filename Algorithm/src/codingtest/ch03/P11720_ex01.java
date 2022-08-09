package codingtest.ch03;

import java.util.Scanner;

public class P11720_ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 숫자의 개수 입력 받기
			
		// 입력 값을 String형 변수 sNum에 저장한 후 char[]형 변수로 변환
		String sNum = sc.next();
		sc.close(); 
		char[] cNum = sNum.toCharArray();
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += cNum[i]-48;
		}
		System.out.print(sum);
	}
}
