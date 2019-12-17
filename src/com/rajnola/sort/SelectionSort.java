package com.rajnola.sort;

import java.util.Arrays;

public class SelectionSort {
	

	public static void main(String[] args) {
		
		int[] dataArray = { 10, -20, 20, 5, 80, 30, -10, 75, 2 };

		System.out.println("Before Selection Sort :- "+Arrays.toString(dataArray));
		
		 
		for(int lastUnsortedIndex=dataArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--) {
			 
			int largestElementindex=0;
			
			
			 for (int i = 1; i <= lastUnsortedIndex; i++) {
				 
				 if(dataArray[i]>dataArray[largestElementindex]) {
					 
					 largestElementindex=i;
				 }
			 }
			 
			 int temp = dataArray[largestElementindex];
			 dataArray[largestElementindex] = dataArray[lastUnsortedIndex];
			 dataArray[lastUnsortedIndex] = temp;
			 
		 }
		
		System.out.println("\nAfter Selection Sort :- " +Arrays.toString(dataArray));

		
	}
	


}
