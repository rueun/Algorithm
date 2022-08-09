package codingtest.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 두 개의 수들의 합으로 입력한 숫자 완성하기 (개수 세기)
public class P1940_ex07 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int A[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		int count = 0;
		int start = 0;
		int end = N-1;
		
		while(start<end) {
			if(A[start]+A[end] < M) {
				start++;
			} else if(A[start]+A[end] > M) {
				end--;
			} else {
				start++;
				end--;
				count++;
			}
		}
		System.out.println(count);
		br.close();
	}
}
