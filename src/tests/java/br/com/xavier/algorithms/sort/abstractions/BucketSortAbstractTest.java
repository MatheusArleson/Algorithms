package br.com.xavier.algorithms.sort.abstractions;

import br.com.xavier.algorithms.sort.impl.BucketSort;
import br.com.xavier.algorithms.sort.interfaces.SorterTest;

public abstract class BucketSortAbstractTest extends SorterTest {
	
	public BucketSortAbstractTest(int numberOfElements, int maximunElementValue, boolean copyArray) {
		super(new BucketSort(), numberOfElements, maximunElementValue, copyArray);
	}
	
}
