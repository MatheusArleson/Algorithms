package br.com.xavier.algorithms.sort.impl;

import br.com.xavier.algorithms.sort.abstractions.AbstractSorter;

public class QuickSort extends AbstractSorter {
	
	@Override
	public void doInitialization() { }

	@Override
	public int[] doSort(int[] array) {
		doQuickSort(0, arraySize - 1);
		return arrayCopy;
	}

	private void doQuickSort(int lowIndex, int highIndex) {
		int lowestIndexCursor = lowIndex;
		int highestIndexCursor = highIndex;
		
		// Get the pivot element from the middle of the list
		int pivot = arrayCopy[lowIndex + (highIndex - lowIndex) / 2];

		// Divide into two lists
		while (lowestIndexCursor <= highestIndexCursor) {
			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (arrayCopy[lowestIndexCursor] < pivot) {
				lowestIndexCursor++;
			}
			
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			while (arrayCopy[highestIndexCursor] > pivot) {
				highestIndexCursor--;
			}

			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (lowestIndexCursor <= highestIndexCursor) {
				swap(arrayCopy, lowestIndexCursor, highestIndexCursor);
				lowestIndexCursor++;
				highestIndexCursor--;
			}
		}
		
		// Recursion
		if (lowIndex < highestIndexCursor) {
			doQuickSort(lowIndex, highestIndexCursor);
		}
		
		if (lowestIndexCursor < highIndex) {
			doQuickSort(lowestIndexCursor, highIndex);
		}
	}

	
}
