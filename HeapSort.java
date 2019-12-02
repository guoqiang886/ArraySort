package com.ygq_1;

/*
 * ������
 */
public class HeapSort {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 2, 0, 7, 9, 3 };
		System.out.println("��������ԣ�");
		System.out.print("����ǰ��");
		printArray(arr);

		heapSort(arr);
		System.out.print("�����");
		printArray(arr);
	}

	private static void heapSort(int[] arr) {
		// ������
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			// ��������
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
			// �ݹ�������ѣ���һ������Ҫ
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