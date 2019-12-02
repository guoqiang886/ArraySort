package com.ygq_1;

/*
 * ��������
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 2, 0, 7, 9, 3 };
		System.out.print("����ǰ��");
		printArray(arr);

		quickSort(arr, 0, arr.length - 1);

		System.out.print("�����");
		printArray(arr);
	}

	private static void quickSort(int[] arr, int left, int right) {
		int i = left;
		int j = right;

		// ֧��
		int pivot = arr[(left + right) / 2];
//		int pivot = arr[left];
		while (i <= j) {
			// �������˽���ɨ��

			// �ҵ���֧������
			while (arr[i] < pivot)
				i++;

			// �ҵ���֧��С����
			while (arr[j] > pivot)
				j--;

			// �����ҵ�����������
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}

			// �ݹ����,�ݹ�ĳ�������
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
