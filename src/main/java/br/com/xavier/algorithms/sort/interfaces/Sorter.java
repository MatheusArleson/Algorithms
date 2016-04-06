package br.com.xavier.algorithms.sort.interfaces;

public interface Sorter {
	
	public int[] sort(int[] array, boolean makeCopy);
	
	default void swap(int[] array, int fromIndex, int toIndex) {
		// temporary container for the swap
		int temp = 0;
		
		//swap elements
		temp = array[fromIndex];
		array[fromIndex] = array[toIndex];
		array[toIndex] = temp;
	}
}
