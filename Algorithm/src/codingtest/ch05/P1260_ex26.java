package codingtest.ch05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1260_ex26 {
	static boolean visited[];
	static ArrayList<Integer>[] A;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 노드 개수
		int M = sc.nextInt(); // 에지 개수
		int V = sc.nextInt(); // 시작점
		A = new ArrayList[N+1];
		for(int i=1; i<=N; i++) {
			A[i] = new ArrayList<Integer>(); // 인접 리스트 생성
		}
		
		for(int i=0; i<M; i++) {
			int S = sc.nextInt();
			int E = sc.nextInt();
			A[S].add(E); 
			A[E].add(S); 
		}
		
		// 번호가 작은 것을 먼저 방문하기 위해 정렬
		for(int i=1; i<=N; i++) {
			Collections.sort(A[i]);
		}
		
		visited = new boolean[N+1]; // 방문 배열 초기화
		DFS(V);
		System.out.println();
		visited = new boolean[N+1]; // 방문 배열 초기화
		BFS(V);
		
		sc.close();
	}

	private static void DFS(int Node) { // DFS 구현
		System.out.print(Node + " ");
		visited[Node] = true;
		for(int i : A[Node]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
	}
	
	private static void BFS(int startNode) { // BFS 구현
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(startNode);
		visited[startNode] = true;
		
		while(!queue.isEmpty()) { // 비어있지 않을 때까지
			int now_Node = queue.poll();
			System.out.print(now_Node+ " ");
			for(int i : A[now_Node]) {
				if(!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}

}
