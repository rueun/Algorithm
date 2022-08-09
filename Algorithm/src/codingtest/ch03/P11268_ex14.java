package codingtest.ch03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P11268_ex14 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 연산의 개수
		
		PriorityQueue<Integer> MyQueue = new PriorityQueue<Integer>((o1, o2) -> {
			// 절댓값 작은 데이터 우선
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			
			if(first_abs == second_abs) { // 절댓값이 같은 경우
				return o1 > o2 ? 1 : -1; // 첫번째 수가 더 크면 1 뒤의 수가 더 크면 -1리턴
			}
			
			return first_abs-second_abs; // 첫번째 수가 더 크면 양수를 리턴, 뒤의 수가 더 크면 음수를 리턴
		});
		
		for(int i=0; i<N; i++) {
			int request = Integer.parseInt(br.readLine());
			if(request == 0) {
				if(MyQueue.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(MyQueue.poll());
				}
			} else {
				MyQueue.add(request);
			}
		}
		br.close();
	}
}
