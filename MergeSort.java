package com.ygq_1;

/*
 * 归并排序
 */
public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 2, 0, 7, 9, 3 };
		System.out.print("排序前：");
		printArray(arr);

		mergeSort(arr, 0, arr.length - 1);

		System.out.print("排序后：");
		printArray(arr);
	}

	private static void mergeSort(int[] arr, int left, int right) {
		if (left == right)
			return;

		int mid = (left + right) / 2;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);
		merge(arr, left, mid, right);
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		int[] temp = new int[right - left + 1];
		int i = left, j = mid + 1, count = 0;
		while (i <= mid && j <= right) {
			temp[count++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
		}
		
		// 这两个while循环只会执行一个
		while (i <= mid)
			temp[count++] = arr[i++];
		while (j <= right)
			temp[count++] = arr[j++];

		// 将temp数组的值赋给arr数组
		for (int k = 0; k < temp.length; k++) {
			arr[left + k] = temp[k];
		}
	}

	private static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.println(array[i] + "]");
			} else {
				System.out.print(array[i] + " ");
			}
		}
	}
}
