package br.com.xavier.algorithms.sort.impl;

import br.com.xavier.algorithms.sort.interfaces.SorterTest;

public abstract class QuickSortAbstractTest extends SorterTest {
	
	public QuickSortAbstractTest(int numberOfElements, int maximunElementValue, boolean copyArray) {
		super(new QuickSort(), numberOfElements, maximunElementValue, copyArray);
	}
	
}
