package br.com.xavier.algorithms.sort.impl;

import br.com.xavier.algorithms.sort.abstractions.BucketSortAbstractTest;

public class BucketSortCopyArrayTest extends BucketSortAbstractTest{
	
	private static final int NUMBER_OF_ELEMENTS = 50;
	private static final int MAXIMUM_ELEMENT_VALUE = 100;
	private static final boolean COPY_ARRAY = true;
	
	public BucketSortCopyArrayTest() {
		super(NUMBER_OF_ELEMENTS, MAXIMUM_ELEMENT_VALUE, COPY_ARRAY);
	}

}
