package com.ygq_1;

/*
 * 堆排序
 */
public class HeapSort {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 2, 0, 7, 9, 3 };
		System.out.println("堆排序测试：");
		System.out.print("排序前：");
		printArray(arr);

		heapSort(arr);
		System.out.print("排序后：");
		printArray(arr);
	}

	private static void heapSort(int[] arr) {
		// 堆排序
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			// 建立最大堆
			heapify(arr, arr.length, i);
		}

		for (int j = arr.length - 1; j >= 0; j--) {
			swap(arr, j, 0);
			heapify(arr, j, 0);
		}
	}

	private static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	private static void heapify(int[] arr, int n, int i) {
		int largest = i;
		int left = i * 2 + 1;
		int right = i * 2 + 2;

		if (left < n && arr[largest] < arr[left])
			largest = left;
		if (right < n && arr[largest] < arr[right])
			largest = right;

		if (largest != i) {
			swap(arr, i, largest);
			// 递归调整最大堆，这一步很重要
			heapify(arr, n, largest);
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