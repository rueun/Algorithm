package codingtest.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_ex03 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 데이터의 개수, 질의 개수 입력 받기
	
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		
		long[] S = new long[suNo+1]; // 인덱스 1부터 저장할 것이기 때문에 +1 해줌
		stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 구간 합을 구할 대상 배열 입력 받기
		for(int i=1; i<=suNo; i++) { // 합 배열 구하기
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		for(int q=0; q<quizNo; q++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int start = Integer.parseInt(stringTokenizer.nextToken()); // 시작
			int end = Integer.parseInt(stringTokenizer.nextToken()); // 끝
			
			System.out.println(S[end]-S[start-1]);
		}
	}
}
