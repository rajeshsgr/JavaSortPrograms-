package com.rajnola.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] dataArray = { 10, -20, 20, 5, 80, 30, -10, 75, 2 };

		System.out.println("Before Bubble Sort :- "+Arrays.toString(dataArray));
		

		for (int i = 0; i < dataArray.length; i++) {

			for (int j = 1; j < (dataArray.length); j++) {

				if (dataArray[j - 1] > dataArray[j]) {

					int temp = dataArray[j - 1];
					dataArray[j - 1] = dataArray[j];
					dataArray[j] = temp;
				}
			}
		}

		System.out.println("\nAfter Bubble Sort :- " +Arrays.toString(dataArray));

	}

}
