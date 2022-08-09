package codingtest.ch04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 기수 정렬
public class P10989_ex22 {
	public static int[] A;
	public static long result; 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		A = new int[N];
		for(int i=0; i<N; i++) { // 배열에 저장
			A[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		Radix_Sort(5);
		for(int i=0; i<N; i++) {
			bw.write(A[i]+"\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	private static void Radix_Sort(int max_size) {
		int[] output = new int[A.length];
		int jarisu = 1; // 자릿수
		int count = 0;
		while(count != max_size) { // 최대 자릿 수 만큼만 반복
			int[] bucket = new int[10];
			for(int i=0; i<A.length; i++) {
				bucket[(A[i]/jarisu)%10]++; // 일의 자리부터 시작(10으로 나눈 나머지의 index 값을 증가)
			}
			for(int i=1; i<10; i++) { // 인덱스를 저장한 배열의 합 배열 구하기
				bucket[i] = bucket[i] + bucket[i-1];
			}
			
			for(int i = A.length -1; i>=0; i--) { // 현재 자릿수를 기준으로 정렬하기
				output[bucket[(A[i]/jarisu)%10]-1] = A[i];
				bucket[(A[i]/jarisu)%10]--;
			}
			
			for(int i=0; i<A.length; i++) { // output에 다시 계산하기 위해 A배열에 자릿수 정렬한 값 복사하기
				A[i] = output[i];
			}
			
			jarisu = jarisu * 10; // 자릿수 늘리기
			count++;
		}
	}
}
