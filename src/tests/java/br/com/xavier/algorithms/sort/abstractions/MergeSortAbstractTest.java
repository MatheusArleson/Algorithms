package br.com.xavier.algorithms.sort.abstractions;

import br.com.xavier.algorithms.sort.impl.MergeSort;
import br.com.xavier.algorithms.sort.interfaces.SorterTest;

public abstract class MergeSortAbstractTest extends SorterTest {
	
	public MergeSortAbstractTest(int numberOfElements, int maximunElementValue, boolean copyArray) {
		super(new MergeSort(), numberOfElements, maximunElementValue, copyArray);
	}
	
}
