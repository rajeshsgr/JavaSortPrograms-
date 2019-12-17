package com.rajnola.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] dataArray = { 10, -20, 20, 5, 80, 30, -10, 75, 2 };

		System.out.println("Before Insertion Sort :- " + Arrays.toString(dataArray));

		int temp;

		for (int i = 1; i < dataArray.length; i++) {

			for (int j = i; j > 0; j--) {

				if (dataArray[j] < dataArray[j - 1]) {

					temp = dataArray[j];
					dataArray[j] = dataArray[j - 1];
					dataArray[j - 1] = temp;

				}

			}

		}

		System.out.println("After Insertion Sort :- " + Arrays.toString(dataArray));

	}

}
