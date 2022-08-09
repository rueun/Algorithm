package codingtest.ch03;

import java.util.Scanner;
import java.util.Stack;

public class P1874_ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 수열의 개수
		
		int A[] = new int[N];
		for(int i=0; i<N; i++) {
			A[i]=sc.nextInt(); // 수열 배열 채우기
		}
		Stack<Integer> stack = new Stack<Integer>();
		StringBuffer bf = new StringBuffer();
		int num=1;
		boolean result = true;
		
		for(int i=0; i<N; i++) {
			int su = A[i];
			if(su>=num) {
				while(su>=num) { // 같아질 때까지 push() 수행
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop(); // 해당 수 출력
				bf.append("-\n");
			} else {
				int top = stack.pop(); // 가장 상단의 수 뽑아오기
				if(top>su) { // 스택의 가장 상단의 수가 뽑으려는 수보다 크면 출력할 수 없음
					System.out.println("NO");
					result = false;
					break;
				} else {
					bf.append("-\n");
				}
			}
		}
		
		if(result) System.out.println(bf.toString()); // result 가 true일 때만 출력
		sc.close();
	}
}
