package com.ygq_1;

/*
 * Ï£¶ûÅÅĞò
 */
public class ShellSort {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 2, 0, 7, 9, 3 };
		System.out.print("ÅÅĞòÇ°£º");
		printArray(arr);

		shellSort(arr);
		System.out.println("ÅÅĞòºó£º");
		printArray(arr);

	}

	private static void shellSort(int[] arr) {
		// Ï£¶ûÅÅĞò£¬²åÈëÅÅĞòµÄ¸Ä½ø
		for (int gap = arr.length / 2; gap >= 1; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				int temp = arr[i];
				for (int j = i; j >= 0; j -= gap) {
					if (j >= gap && temp < arr[j - gap]) {
						arr[j] = arr[j - gap];
					} else {
						arr[j] = temp;
						break;
					}
				}
			}
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
