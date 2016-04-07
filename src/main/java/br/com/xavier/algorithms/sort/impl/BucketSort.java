package br.com.xavier.algorithms.sort.impl;

import java.util.LinkedHashMap;

import br.com.xavier.algorithms.sort.abstractions.AbstractSorter;

public class BucketSort extends AbstractSorter {
	
	private LinkedHashMap<Integer, Integer> map;
	
	public BucketSort() { }

	@Override
	public void doInitialization() {
		map = new LinkedHashMap<>();
	}

	@Override
	public int[] doSort(int[] array) {
		//trasverse the array
		//each value is a bucket index 
		//so, for each increment by one when a value is found
		for (int i = 0; i < array.length; i++) {
			int number = array[i];
			if(map.containsKey(number)){
				map.put(number, map.get(number) + 1);
			} else {
				map.put(number, 1);
			}
		}
		
		int pos = 0;
		// for each bucket
		// get the count and add the number times the count
		for (Integer number : map.keySet()) {
			for (int i = 0; i < map.get(number); i++) {
				array[pos++] = i;
			}
		}
		
		return array;
	}
	
}
