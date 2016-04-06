package br.com.xavier.algorithms.sort.impl;

import br.com.xavier.algorithms.sort.abstractions.AbstractSorter;

public class BubbleSort extends AbstractSorter {
	
	public BubbleSort() {}
	
	@Override
	public void doInitialization() { }

	@Override
	public int[] doSort(int[] array) {
		for(int i = 0; i < this.arraySize; i++){
			for(int cursor = 0; cursor < (this.arraySize - 1); cursor++){
				int indexToLookup = cursor + 1;
				if(arrayCopy[cursor] > arrayCopy[indexToLookup]){
					swap(arrayCopy, cursor, indexToLookup);
				}
			}
		}
		
		return arrayCopy;
	}
}
