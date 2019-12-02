package com.ygq_1;

/*
 * 快速排序
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 2, 0, 7, 9, 3 };
		System.out.print("排序前：");
		printArray(arr);

		quickSort(arr, 0, arr.length - 1);

		System.out.print("排序后：");
		printArray(arr);
	}

	private static void quickSort(int[] arr, int left, int right) {
		int i = left;
		int j = right;

		// 支点
		int pivot = arr[(left + right) / 2];
//		int pivot = arr[left];
		while (i <= j) {
			// 左右两端进行扫描

			// 找到比支点大的数
			while (arr[i] < pivot)
				i++;

			// 找到比支点小的数
			while (arr[j] > pivot)
				j--;

			// 交换找到的这两个数
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}

			// 递归调用,递归的出口条件
			if (left < j + 1)
				quickSort(arr, left, j);
			if (right > i - 1)
				quickSort(arr, i, right);
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
