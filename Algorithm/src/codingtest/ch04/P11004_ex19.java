package codingtest.ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 퀵 정렬
public class P11004_ex19 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int A[] = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		quickSort(A, 0, N-1, K-1);
		System.out.println(A[K-1]);
	}
	
	private static void quickSort(int[] A, int left, int right, int K) {
		if(left<right) {
			int pivotIdx = partition(A, left, right);
			if(pivotIdx == K) { // K번째 수가 pivot이면 더 이상 구할 필요 없음
				return;
			} else if(K < pivotIdx) {
				quickSort(A, left, pivotIdx-1, K); // K가 pivot보다 작으면 왼쪽 그룹만 정렬 수행
			} else {
				quickSort(A, pivotIdx+1, right, K); // K가 pivot보다 크면 오른쪽 그룹만 정렬 수행
			}
		}
	}
	
	// pivot의 위치 : 맨 처음, 맨 마지막, 중간. 이 문제는 중간값을 이용한 pivot 필요
	// pivot의 초기 위치를 왼쪽에 놓고 시작해야 pass
	private static int partition(int[] A, int left, int right) {
		// 1. pivot의 값과 위치를 결정
		int mid = (left+right)/2;
		swap(A, mid, left); // 중앙 값을 첫 번째 요소로 이동
		
		int pivot = A[left];
		
		int i = left;
		int j = right;
		
		while(i < j) {
			// 뒤에서부터 pivot보다 작거나 같은 수의 위치 찾기
			while(A[j]>pivot) { // A[j]의 값이 pivot보다 큰 경우에만 반복. 작거나 같으면 빠져나감
				j--;
			}
			// 앞에서부터 pivot 보다 큰 수의 위치를 찾기
			while(A[i]<=pivot && i<j) { // A[i]의 값이 pivot보다 작은 경우에만 반복. 더 크면 빠져나감
				i++;
			}
			swap(A, i, j); // 찾은 i와 j 교환
		}
		
		// 피벗의 값을 양쪽으로 분리한 가운데에 오도록 설정(left와 right가 만나는 지점에 피벗 넣기)
		A[left] = A[i];
		A[i] = pivot;

		return i; // pivot의 index
	}
	
	private static void swap(int [] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
