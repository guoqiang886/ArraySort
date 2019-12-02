package com.ygq_1;

/*
 * �鲢����
 */
public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 2, 0, 7, 9, 3 };
		System.out.print("����ǰ��");
		printArray(arr);

		mergeSort(arr, 0, arr.length - 1);

		System.out.print("�����");
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
		
		// ������whileѭ��ֻ��ִ��һ��
		while (i <= mid)
			temp[count++] = arr[i++];
		while (j <= right)
			temp[count++] = arr[j++];

		// ��temp�����ֵ����arr����
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
