package Sorting;

import java.util.Arrays;

// 삽입 정렬은 앞의 요소들이 정렬되어 있다고 생각하기
public class InsertionSort {
	public static void main(String[] args) {
		int[] num = {45, 5, 84, 2, 94, 71, 19};
		int i, j, key;
		
		
		// 삽입 정렬 오름차순
		for(i=1; i<num.length; i++) {
			key = num[i];
			for(j=i-1; j>=0 && num[j]>key; j--) {
				num[j+1] = num[j];
			}
			
			num[j+1] = key; 
		}
		
		System.out.println(Arrays.toString(num));
		
		
		
		// 삽입 정렬 내림차순
		for(i=1; i<num.length; i++) {
			key = num[i];
			for(j=i-1; j>=0 && num[j]<key; j--) {
				num[j+1] = num[j];
			}
			num[j+1] = key; 
		}
		
		System.out.println(Arrays.toString(num));
	}
}
