package com.grosser.sort;

import com.grosser.array.IntArray;

public class SelectionSort {
	
	/**
	 * Static selection sort method. Pass in an array of integers to be sorted,
	 * and the method will sort the integers in O(N2) time, and then return
	 * the sorted array, where N is the number of items in the array.
	 * 
	 * @param arrayToSort
	 * @return The sorted array.
	 */
	public static IntArray sort(IntArray arrayToSort){
		
		// Have three indices to keep track of - outer, inner, and smallest.
		// Values to the left of the outer index have been sorted already.
		// The inner index is the inner loop, which loops through the remaining
		// unsorted values and compares the value at "smallest" with the current
		// value in the loop. If a smaller value is found, that index becomes
		// the new "smallest" index. After reaching the end of the inner loop,
		// the value at "smallest" is swapped with the value at "outer", and the
		// "outer" index is incremented by 1.
		
		int smallest = 0;
		
		// n is the size of the array
		int n = arrayToSort.size();
		
		// Outer loop
		for(int outer = 0; outer < n; outer++){
			
			// Inner loop finding smallest value to swap with "outer"
			for(int inner = outer; inner < n; inner++){
				
				if(arrayToSort.get(inner) < arrayToSort.get(smallest)){
					smallest = inner;
				}
			}
			
			// Swap the value at "outer" with the value at "smallest"
			swap(arrayToSort, outer, smallest);
		}
		
		return arrayToSort;
	}
	
	/**
	 * Swaps the values in the array at indices firstIndex and secondIndex.
	 * @param array The array whose values are being swapped.
	 * @param firstIndex The index of the first value to swap.
	 * @param secondIndex The index of the second value to swap.
	 * @return The array with the selected values swapped.
	 */
	protected static IntArray swap(IntArray array, int firstIndex, int secondIndex){
		int tempVal = array.get(firstIndex);
		array.set(firstIndex, array.get(secondIndex));
		array.set(secondIndex, tempVal);
		return array;
	}
}