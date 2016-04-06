package br.com.xavier.algorithms.sort.impl;

import br.com.xavier.algorithms.sort.interfaces.SorterTest;

public abstract class BubbleSortAbstractTest extends SorterTest {
	
	public BubbleSortAbstractTest(int numberOfElements, int maximunElementValue, boolean copyArray) {
		super(new BubbleSort(), numberOfElements, maximunElementValue, copyArray);
	}
	
}
