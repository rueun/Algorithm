package codingtest.ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class P17298_ex12 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 수열의 크기
		int A[] = new int[n]; // 수열 배열 생성
		int result[] = new int[n]; // 정답 배열 생성
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) { // 수열 넣기
			A[i]=Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(0); // 처음에는 항상 스택이 비어있으므로 최초 값을 push해 초기화
		for(int i=1; i<n; i++) {
			// 스택이 비어있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
			while(!myStack.isEmpty() && A[myStack.peek()]<A[i]) { // 스택 안 인덱스의 값이 더 클 때까지 반복
				result[myStack.pop()] = A[i];
			}
			myStack.push(i);
		}
		
		while(!myStack.empty()) { // 반복문을 다 돌고 나왔는데 스택이 비어있지 않다면 빌 때까지
			result[myStack.pop()] = -1; // 스택에 쌓인 인덱스에 -1 값 넣기
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<n; i++) {
			bw.write(result[i]+ " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
