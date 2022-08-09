package codingtest.ch05;

import java.util.Scanner;

// 신기한 소수 찾기 (DFS)
public class P2023_ex24 {
	static int N;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		DFS(2,1); // 일의 자리 소수는 2,3,4,5이므로 4개 수에서만 시작
		DFS(3,1);
		DFS(5,1);
		DFS(7,1);
		
		sc.close();
	}

	private static void DFS(int number, int jarisu) {
		if(jarisu == N) {
			if(isPrime(number)) { // 만약 소수라면
				System.out.println(number); // 숫자 출력
			}
			return;
		}
		
		for(int i=1; i<10; i++) {
			if(i%2==0) { // 짝수라면 더 이상 탐색할 필요 없음
				continue;
			}
			
			if(isPrime(number*10+i)) { // 소수라면 
				DFS(number*10+i, jarisu+1); // 재귀 함수로 자릿수를 늘림
			}
		}
	}

	private static boolean isPrime(int number) { // 소수인지 아닌지 판별
		for(int i=2; i<=number/2; i++) {
			if(number%i == 0) {
				return false;
			}
		}
		return true;
	}
}
