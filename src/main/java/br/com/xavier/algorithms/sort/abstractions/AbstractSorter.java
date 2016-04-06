package br.com.xavier.algorithms.sort.abstractions;

import br.com.xavier.algorithms.sort.interfaces.Sorter;

public abstract class AbstractSorter implements Sorter {
	
	protected int[] arrayCopy;
	protected int arraySize;
	
	@Override
	public int[] sort(int[] array, boolean makeCopy) {
		//null check
		if(array == null){
			return null;
		}
		
		//zero\one length base case
		int arraySize = array.length;
		if(arraySize == 0 || arraySize == 1){
			return array;
		}
		
		//checking copy flag
		this.arrayCopy = null;
		if(makeCopy){
			this.arrayCopy = new int[arraySize];
			System.arraycopy(array, 0, this.arrayCopy, 0, arraySize);
		} else {
			this.arrayCopy = array;
		}
		
		this.arraySize = arrayCopy.length;
		
		doInitialization();
		return doSort(this.arrayCopy);
	}
	
	public abstract void doInitialization();
	public abstract int[] doSort(int[] array);
	
}
