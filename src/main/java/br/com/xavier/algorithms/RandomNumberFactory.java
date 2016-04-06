package br.com.xavier.algorithms;

import java.util.Random;

public class RandomNumberFactory {
	
	private RandomNumberFactory() { }
	
	public static int[] generateRandomArrayOfIntegers(int size, int maximunValue){
		int[] array = null;
		
		//negative\zero base case
		if(size < 1){
			array = new int[0];
			return array;
		}
		
		//TODO check if memory can hold @param size 
		
		array = new int[size];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(maximunValue);
		}
		
		return array;
	}
	
	public static int[] generateAllEqualsArrayOfIntegers(int size, int maximunValue){
		int[] array = null;
		
		//negative\zero base case
		if(size < 1){
			array = new int[0];
			return array;
		}
		
		//TODO check if memory can hold @param size 
		
		array = new int[size];
		Random random = new Random();
		int value = random.nextInt(maximunValue);
		for (int i = 0; i < array.length; i++) {
			array[i] = value;
		}
		
		return array;
	}
	
}
