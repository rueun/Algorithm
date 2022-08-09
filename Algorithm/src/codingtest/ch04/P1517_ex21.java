package codingtest.ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1517_ex21 {
	public static int [] A;
	public static int [] tmp;
	
	public static long result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 정렬할 수 계산
		A = new int[N+1];
		tmp = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		result = 0;
		merge_sort(0, N-1); // 정렬하기
		
		System.out.println(result);
	}

	private static void merge_sort(int start, int end) {
		if(start < end) {
			int mid = (start+end) / 2;
			
			merge_sort(start, mid); // 첫 번째 섹션 정렬
			merge_sort(mid+1, end); // 두 번째 섹션 정렬
			
			for(int i=start; i<=end; i++) {
				tmp[i]=A[i];
			}
			
			int part1 = start; // 첫 번째 섹션의 첫번째 인덱스
			int part2 = mid + 1; // 두 번째 섹션의 첫번째 인덱스
			int index = start; // 하나씩 복사해서 저장할 때 결과 배열방 어떤 위치에 저장할 지 지정(다음에 저장할 위치 기억)
			
			while(part1<=mid && part2<=end) {		
				if(tmp[part1]<=tmp[part2]) {
					A[index] = tmp[part1];
					part1++;
				} else {
					A[index] = tmp[part2];
					result = result + part2 - index;
					part2++;
				}
				index++;
			}
			for(int i=0; i <= mid-part1; i++) { // 왼쪽 섹션의 데이터가 남아 있을 경우 정리. 오른쪽은 뒷 쪽에 있으므로 정리해줄 필요 없음
				A[index+i] = tmp[part1 + i];
			}
			
		}
		
	}	
}


