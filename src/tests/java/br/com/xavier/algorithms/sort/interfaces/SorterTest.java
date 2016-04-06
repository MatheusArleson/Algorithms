package br.com.xavier.algorithms.sort.interfaces;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.xavier.algorithms.RandomNumberFactory;
import br.com.xavier.algorithms.sort.interfaces.Sorter;

public abstract class SorterTest {
	
	//XXX TEST PARAMETERS
	private int numberOfElements;
	private int maximunElementValue;
	private boolean copyArray;
	
	//XXX TEST SUBJECTS
	private Sorter sorter;
	private int[] array;
	
	//XXX TEST CONSTRUCTOR
	public SorterTest(Sorter sorter, int numberOfElements, int maximunElementValue, boolean copyArray) {
		this.numberOfElements = numberOfElements;
		this.maximunElementValue = maximunElementValue;
		this.copyArray = copyArray;
		this.sorter = sorter;
	}
	
	//XXX BEFORE TEST METHODS
	@Before
	public void setup(){ }
	
	//XXX AFTER TEST METHODS
	@After
	public void destroy(){
		array = null;
	}
	
	//XXX TEST METHODS
	
	@Test
	public void mustReturnNullOnNullArrayParameter(){
		array = null;
		
		int[] sortedArray = sorter.sort(array, copyArray);
		
		assertNull(sortedArray);
	}
	
	@Test
	public void mustReturnEmptyArrayOnEmptyArrayParameter(){
		array = new int[0];
		
		int[] sortedArray = sorter.sort(array, copyArray);
		
		assertArrayEquals(array, sortedArray);
	}
	
	@Test
	public void mustReturnSingleElementArrayOnSingleElementArrayParameter(){
		array = new int[]{0};
		
		int[] sortedArray = sorter.sort(array, copyArray);
		
		assertArrayEquals(array, sortedArray);
	}
	
	@Test
	public void mustReturnSortedArrayOnAllEqualsArrayParameter(){
		array = RandomNumberFactory.generateAllEqualsArrayOfIntegers(numberOfElements, maximunElementValue);
		
		int[] sortedArray = sorter.sort(array, copyArray);
		
		assertArrayEquals(array, sortedArray);
	}
	
	@Test
	public void mustReturnSortedArrayOnAlreadySortedArrayParameter(){
		array = new int[]{0,1,2,3,4,5,6,7,8,9};
		
		int[] sortedArray = sorter.sort(array, copyArray);
		
		assertArrayEquals(array, sortedArray);
	}
	
	@Test
	public void mustReturnSortedArrayOnPredefinedArrayParameter(){
		array = new int[]{5,4,3,2,1};
		
		int[] sortedArray = sorter.sort(array, copyArray);
		
		Arrays.sort(array);
		assertArrayEquals(array, sortedArray);
	}
	
	@Test
	public void mustReturnSortedArrayOnRandomGeneratedArrayParameter(){
		array = RandomNumberFactory.generateRandomArrayOfIntegers(numberOfElements, maximunElementValue);
		
		int[] sortedArray = sorter.sort(array, copyArray);
		
		Arrays.sort(array);
		assertArrayEquals(array, sortedArray);
	}

	@Test
	public void stressTest(){
		for (int i = 0; i < 200; i++) {
			mustReturnSortedArrayOnRandomGeneratedArrayParameter();
		}
	}
}
