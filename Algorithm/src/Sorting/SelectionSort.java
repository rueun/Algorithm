package Sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		int minIndex = 0; // 가장 적은 원소의 인덱스

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j])
					minIndex = j;
			}

			// 스와프
			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void selectionSortMax(int[] input, int length) {
		int max;
		int tmp;
		for (int i = length - 1; i > 0; i--) {
			max = i;
			for (int j = i - 1; j >= 0; j--) {
				if (input[j] > input[max])
					max = j;
			}
			tmp = input[i];
			input[i] = input[max];
			input[max] = tmp;
		}
	}

}
