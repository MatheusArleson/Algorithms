package br.com.xavier.algorithms.sort.impl;

import br.com.xavier.algorithms.sort.abstractions.AbstractSorter;

public class MergeSort extends AbstractSorter {
	
	private int[] buffer;
	
	public MergeSort() { }
	
	@Override
	public void doInitialization() {
		//container for the partitions
		this.buffer = new int[arraySize];
	}

	@Override
	public int[] doSort(int[] array) {
		doMergeSort(0, arraySize - 1);
		return arrayCopy;
	}
	
	private void doMergeSort(int low, int high) {
		// check if low is smaller then high, if not then the array is sorted
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = low + (high - low) / 2;
			// Sort the left side of the array
			doMergeSort(low, middle);
			// Sort the right side of the array
			doMergeSort(middle + 1, high);
			// Combine them both
			merge(low, middle, high);
		}
	}

	private void merge(int low, int middle, int high) {
		// Copy both parts into the helper array
		for (int cursor = low; cursor <= high; cursor++) {
			this.buffer[cursor] = this.arrayCopy[cursor];
		}

		int bufferLowestIndexCursor = low;
		int bufferMiddleIndexCursor = middle + 1;
		int copyArrayLowestCursor = low;
		
		// Copy the smallest values from either the left 
		// or the right side back to the original array
		//dont let cursors overflow
		while (bufferLowestIndexCursor <= middle && bufferMiddleIndexCursor <= high) {
			//is value on one side is lower than the other side?
			if (this.buffer[bufferLowestIndexCursor] <= this.buffer[bufferMiddleIndexCursor]) {
				//copy from right side partition
				this.arrayCopy[copyArrayLowestCursor] = this.buffer[bufferLowestIndexCursor];
				bufferLowestIndexCursor++;
			} else {
				//copy from left side partition
				this.arrayCopy[copyArrayLowestCursor] = this.buffer[bufferMiddleIndexCursor];
				bufferMiddleIndexCursor++;
			}
			copyArrayLowestCursor++;
		}
		
		// Copy the rest of the left side of the array into the target array
		while (bufferLowestIndexCursor <= middle) {
			this.arrayCopy[copyArrayLowestCursor] = this.buffer[bufferLowestIndexCursor];
			copyArrayLowestCursor++;
			bufferLowestIndexCursor++;
		}
	}

	
}
