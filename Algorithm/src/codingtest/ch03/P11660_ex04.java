package codingtest.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660_ex04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); // 2차원 배열 크기, 구간 합 질의 개수
		int N = Integer.parseInt(st.nextToken()); // 배열 크기
		int M = Integer.parseInt(st.nextToken()); // 질의 개수
		
		int A[][] = new int[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) { // 원본 배열 저장
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int sumA[][] = new int[N+1][N+1]; // 합 배열 저장
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				sumA[i][j] = sumA[i][j-1] + sumA[i-1][j] - sumA[i-1][j-1] + A[i][j]; // 합 배열 구하기
			}
		}
		
		for(int q=0; q<M; q++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int result = sumA[x2][y2] - sumA[x1-1][y2] - sumA[x2][y1-1] + sumA[x1-1][y1-1]; // 구간 합 구하기
			System.out.println(result);
		}
	}
}
