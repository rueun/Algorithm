package codingtest.ch03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253_ex08 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 수의 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A[] = new long[N];
		int goodNum = 0;
		for(int i=0; i<N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(A);
		for(int i=0; i<N; i++) {
			long find = A[i];
			int start = 0;
			int end = N-1;
			
			while(start<end) {
				if(A[start]+A[end] == find) {
					if(start!=i && end !=i) {
						goodNum++;
						break;
					} else if(start == i) {
						start++;
					} else if(end == i) {
						end--;
					}
				} else if(A[start]+A[end] >= find) {
					end--;
				} else {
					start++;
				}
			}
		}
		System.out.println(goodNum);
	}
}
