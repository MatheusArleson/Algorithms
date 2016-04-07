package br.com.xavier.algorithms.sort.abstractions;

import br.com.xavier.algorithms.sort.impl.QuickSort;
import br.com.xavier.algorithms.sort.interfaces.SorterTest;

public abstract class QuickSortAbstractTest extends SorterTest {
	
	public QuickSortAbstractTest(int numberOfElements, int maximunElementValue, boolean copyArray) {
		super(new QuickSort(), numberOfElements, maximunElementValue, copyArray);
	}
	
}
