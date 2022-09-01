package Sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] num = {45, 5, 84, 2, 94, 71, 19};
		int i, j, temp;
		
		// 버블정렬 오름차순 정렬
		for(i=0; i<num.length-1; i++) {
			for(j=0; j<num.length-1-i; j++) {
				if(num[j] > num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
		
		// 버블정렬 내림차순 정렬
		for(i=0; i<num.length-1; i++) {
			for(j=0; j<num.length-1-i; j++) {
				if(num[j] < num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(num));
	}
}
