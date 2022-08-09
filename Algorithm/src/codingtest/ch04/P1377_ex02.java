package codingtest.ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1377_ex02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 배열의 크기
		mData A[] = new mData[N];
		for(int i=0; i<N; i++) {
			A[i] = new mData(Integer.parseInt(br.readLine()), i);
		}
		Arrays.sort(A);
		int Max = 0;
		for(int i=0; i<N; i++) {
			if(Max < A[i].index-i) {
				Max = A[i].index-i;
			}
		}
		
		System.out.println(Max+1);
		br.close();
	}
}

class mData implements Comparable<mData>{
	int value;
	int index;
	
	public mData(int value, int index) {
		super();
		this.value = value;
		this.index = index;
	}
	
	@Override
	public int compareTo(mData o) { // value 기준 오름차순 정렬
		return this.value - o.value;
	}
}
