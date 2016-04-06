package br.com.xavier.algorithms.sort.impl;

public class BubbleSortNoCopyArrayTest extends BubbleSortAbstractTest{
	
	private static final int NUMBER_OF_ELEMENTS = 10;
	private static final int MAXIMUM_ELEMENT_VALUE = 100;
	private static final boolean COPY_ARRAY = false;
	
	public BubbleSortNoCopyArrayTest() {
		super(NUMBER_OF_ELEMENTS, MAXIMUM_ELEMENT_VALUE, COPY_ARRAY);
	}

}
