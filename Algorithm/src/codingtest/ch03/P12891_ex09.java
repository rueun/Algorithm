package codingtest.ch03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891_ex09 {
	static int currentArr[]; // 현재
	static int checkArr[];
	static int checkCount;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken()); // 문자열의 길이
		int P = Integer.parseInt(st.nextToken()); // 부분 문자열의 길이
		
		char A[] = new char[S]; // DNA 문자열 저장 배열
		currentArr = new int[4];
		checkArr = new int[4]; // 부분 문자열에 포함돼야 할 A, C, G, T의 최소 개수
		checkCount = 0;
		
		int result = 0;
		
		A = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if(checkArr[i]==0) {
				checkCount++;
			}
		}
		
		for(int i=0; i<P; i++) {// 첫 배열
			Add(A[i]);
		}
		
		if(checkCount==4) {
			result++;
		}
		
		for(int end=P; end<S; end++) {
			int start = end-P;
			Add(A[end]);
			Remove(A[start]);
			
			if(checkCount==4) {
				result++;
			}
		}
		
		System.out.println(result);
		br.close();
	}
	
	private static void Add(char c) {
		switch (c) {
		case 'A':
			currentArr[0]++;
			if(currentArr[0]==checkArr[0]) {
				checkCount++;
			}
			break;
		case 'C':
			currentArr[1]++;
			if(currentArr[1]==checkArr[1]) {
				checkCount++;
			}
			break;
			
		case 'G':
			currentArr[2]++;
			if(currentArr[2]==checkArr[2]) {
				checkCount++;
			}
			break;
		case 'T':
			currentArr[3]++;
			if(currentArr[3]==checkArr[3]) {
				checkCount++;
			}
			break;
		}
	}
	
	private static void Remove(char c) {
		switch (c) {
		case 'A':
			if(currentArr[0]==checkArr[0]) {
				checkCount--;
			}
			currentArr[0]--;
			break;
		case 'C':
			if(currentArr[1]==checkArr[1]) {
				checkCount--;
			}
			currentArr[1]--;
			break;
			
		case 'G':
			if(currentArr[2]==checkArr[2]) {
				checkCount--;
			}
			currentArr[2]--;
			break;
		case 'T':
			if(currentArr[3]==checkArr[3]) {
				checkCount--;
			}
			currentArr[3]--;
			break;
		}
	}
}
