package com.ygq_1;

/*
 * 直接插入排序
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] arr = {1, 5, 4, 2, 0, 7, 9, 3};
		System.out.print("排序前：");
		printArray(arr);
		
		insertSort(arr);
		
		System.out.print("排序后：");
		printArray(arr);
	}
	
	private static void insertSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			for (int j = i; j >= 0; j--) {
				if (j > 0 && temp < array[j-1]) {
					array[j] = array[j-1];
				} else {
					array[j] = temp;
					break;
				}
			}
//			printArray(array);
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
