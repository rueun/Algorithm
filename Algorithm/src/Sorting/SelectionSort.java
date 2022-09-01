package Sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] num = {45, 5, 84, 2, 94, 71, 19};
		int i, j, temp;
		int min, max, idx;
		
		// 선택 정렬 오름차순
		for(i=0; i<num.length-1; i++) {
			min = num[i];
			idx = i;
			for(j=i+1; j<num.length; j++) {
				if(min>num[j]) {
					min = num[j];
					idx = j;
				}
			}
			temp = num[i];
			num[i] = min;
			num[idx] = temp;
			
		}
		
		System.out.println(Arrays.toString(num));
		
		
		
		// 선택 정렬 내림차순
		for(i=0; i<num.length-1; i++) {
			max = num[i];
			idx = i;
			for(j=i+1; j<num.length; j++) {
				if(max < num[j]) {
					max = num[j];
					idx = j;
				}
			}
			
			temp = num[i];
			num[i] = max;
			num[idx] = temp;
		}
		System.out.println(Arrays.toString(num));
		
		
	}
}
