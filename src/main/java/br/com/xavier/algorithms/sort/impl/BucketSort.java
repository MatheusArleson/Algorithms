package br.com.xavier.algorithms.sort.impl;

import br.com.xavier.algorithms.sort.abstractions.AbstractSorter;

public class BucketSort extends AbstractSorter {
	
	private int maxValue;
	private int[] bucket;
	private int[] sorted;
	
	public BucketSort() { }

	@Override
	public void doInitialization() {
		// Determine minimum and maximum values
        int minValue = arrayCopy[0];
        this.maxValue = arrayCopy[0];
        for (int i = 1; i < arraySize; i++) {
            if (arrayCopy[i] < minValue) {
            	minValue = arrayCopy[i];
            } else if (arrayCopy[i] > this.maxValue) {
            	this.maxValue = arrayCopy[i];
            }
        }

        // Initialise bucket
        this.bucket = new int[maxValue + 1];
        this.sorted = new int[arraySize];
	}

	@Override
	public int[] doSort(int[] array) {
		//we are working with primitives, default is already zero
		// init with zero count
//		for (int i = 0; i < this.bucket.length; i++) {
//			this.bucket[i] = 0;
//		}

		//
		for (int i = 0; i < array.length; i++) {
			this.bucket[array[i]]++;
		}

		int pos = 0;
		// pull out from bucket and put it
		for (int i = 0; i < this.bucket.length; i++) {
			for (int j = 0; j < this.bucket[i]; j++) {
				this.sorted[pos++] = i;
			}
		}
		
		return this.sorted;
	}
	
}
