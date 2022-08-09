package codingtest.ch05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// DFS(깊이우선탐색)
public class P13023_ex25 {
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	static boolean arrived;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 노드의 갯수
		int M = sc.nextInt(); // 엣지의 갯수
		arrived = false;
		
		A = new ArrayList[N];
		visited = new boolean[N];
		
		for(int i=0; i<N; i++) { // 인접 리스트 초기화
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<M; i++) { // 엣지 갯수만큼 반복
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			A[a].add(b); // 양방향 엣지이므로 양쪽 모두 에지를 더하기
			A[b].add(a);
		}
		
		for(int i=0; i<N; i++) {
			DFS(i, 1); // 깊이 1부터 시작
			if (arrived) {
				break;
			}
		}
		
		if(arrived) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		sc.close();
	}
	private static void DFS(int now, int depth) {
		if(depth==5 || arrived) {
			arrived = true;
			return; // 리턴
		}
		visited[now] = true;
		for(int i : A[now]) {
			if(!visited[i]) { // 연결 노드 중 방문하지 않은 노드만 탐색
				DFS(i, depth+1); // 깊이 증가 시키고 다시 탐색
			}
		}
		visited[now] = false; // 일직선이 아닐 경우, 방문한 지점은 모두 false 처리.
	}
}
