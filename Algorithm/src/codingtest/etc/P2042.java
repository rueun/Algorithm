package codingtest.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2042 {
	public static long[] A, S;
	public static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); // 데이터의 개수, 질의 개수 입력 받기
	
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		A = new long[N+1]; // 인덱스 1부터 저장할 것이기 때문에 +1 해줌
		S = new long[N+1]; // 인덱스 1부터 저장할 것이기 때문에 +1 해줌
		
		for(int i=1; i<=N; i++) { // 배열 저장
			A[i] = Integer.parseInt(br.readLine());
		}
		
		sumArray(); // 합 배열 구하기
		
		for(int i=0; i<M+K; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == 1) {
				A[b] = (long)c;
				sumArray();
			} else if(a == 2) {
				System.out.println(S[c]-S[b-1]);
			}
		}
	}

	private static void sumArray() {
		for(int i=1; i<=N; i++) { // 합 배열 구하기
			S[i] = S[i-1] + A[i];
		}
	}
}

