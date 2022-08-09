package codingtest.ch05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// DFS(깊이우선탐색)
public class P11274_ex23 {
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 노드의 갯수
		int m = sc.nextInt(); // 엣지의 갯수
		
		A = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		for(int i=1; i<=n; i++) { // 인접 리스트 초기화
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<m; i++) { // 엣지 갯수만큼 반복
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			A[u].add(v); // 양방향 엣지이므로 양쪽 모두 에지를 더하기
			A[v].add(u);
		}
		
		int count = 0; // DFS 횟수
		for(int i=1; i<=n; i++) {
			if(!visited[i]) { // 방문하지 않은 노드가 없을 때까지 반복
				count++;
				DFS(i);
			}
		}
		
		System.out.println(count);
		sc.close();
	}
	private static void DFS(int v) {
		if(visited[v]) { // 현재 노드가 방문했다면
			return; // 리턴
		}
		visited[v] = true;
		for(int i : A[v]) {
			if(!visited[i]) { // 연결 노드 중 방문하지 않은 노드만 탐색
				DFS(i);
			}
		}
	}
}
