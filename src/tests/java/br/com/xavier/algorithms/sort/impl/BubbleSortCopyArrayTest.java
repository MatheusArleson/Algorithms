package br.com.xavier.algorithms.sort.impl;

import br.com.xavier.algorithms.sort.abstractions.BubbleSortAbstractTest;

public class BubbleSortCopyArrayTest extends BubbleSortAbstractTest{
	
	private static final int NUMBER_OF_ELEMENTS = 50;
	private static final int MAXIMUM_ELEMENT_VALUE = 100;
	private static final boolean COPY_ARRAY = true;
	
	public BubbleSortCopyArrayTest() {
		super(NUMBER_OF_ELEMENTS, MAXIMUM_ELEMENT_VALUE, COPY_ARRAY);
	}

}
