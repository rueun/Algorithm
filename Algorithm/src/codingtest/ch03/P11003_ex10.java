package codingtest.ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P11003_ex10 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력을 버퍼에 넣고 한 번에 출력하기 위해 BufferedWriter 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 숫자의 개수
		int L = Integer.parseInt(st.nextToken()); // 슬라이딩 윈도우 크기
		
		st = new StringTokenizer(br.readLine());
		Deque<Node> A = new LinkedList<>();
		for(int i=0; i<N; i++) {
			int currentValue = Integer.parseInt(st.nextToken()); // 현재 값
			
			// 새로운 값이 들어올때마다 정렬 대신 현재 수보다 큰 값을 덱에서 제거하여 시간 복잡도를 줄임
			while(!A.isEmpty() && A.getLast().value > currentValue) {
				A.removeLast();
			}
			
			A.addLast(new Node(currentValue, i)); // 현재 값과 인덱스 넣기
			
			// 범위에서 벗어난 값은 덱에서 제거
			if(A.getFirst().index<=i-L) {
				A.removeFirst();
			}
			
			bw.write(A.getFirst().value+" "); // 첫 번째 값 넣기(제일 최소 값)
		}
		
		bw.flush(); // 출력
		bw.close(); // 닫기
		
		br.close();
		
	}
	
	static class Node {
		public int value;
		public int index;
		
		Node(int value, int index) {
			this.value = value;
			this.index = index;
		}
	}
}
