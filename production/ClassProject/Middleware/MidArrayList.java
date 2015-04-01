package edu.oakland.production.ClassProject;

import java.util.ArrayList;
import edu.oakland.production.ClassProject.*;

/**
*@author Toufiq Hussain
*@version version 1.3 150330
*@since version 1.0 150323
**/
public class MidArrayList {
	
	/**
	*Declared instance variables here.
	*/
	private ArrayListDatabase theArray;
	private int arraySize;
	static long startTime;
	static long endTime;
	
	/**
	*Overloaded constructor to create database. Takes in
	*a variable of type "int" to specify size.
	*/
	MidArrayList(int size){
		arraySize =size;
		theArray = new ArrayListDatabase(size);
	}
	
	/**
	*Generates a random array to fill database.
	*/
	public void generateRandomArray() {
		System.out.println("Generating random array...");
		for (int i = 0; i < arraySize; i++) {
			int j = 0;
			j = (int) ((Math.random() * 1000) + 100);
			theArray.addStudent(j);
		}
	}
	
	/**
	*Returns the size of the array as a String sentence
	*/
	public int returnArraySize(){
		return theArray.returnSize();
	}
	
	/**
	*Returns the array in its entirety. USE ONLY WHEN DEBUGGING
	*/
	public void returnArray(){
	
		for(int i = 0; i<theArray.returnSize(); i++)
		{
			System.out.println(theArray.getStudent(i));
		}
	}
	
	/**
	*Swaps values.
	*Display will not use this.
	*/
	public void swapValues(int indexOne, int indexTwo) {
		Integer temp = theArray.getStudent(indexOne);
		theArray.setStudent(indexOne,theArray.getStudent(indexTwo));
		//theArray.remove(indexTwo);
		theArray.setStudent(indexTwo,temp);
	}
	
	/**
	*Clears the array of students
	*/
	public void clearArray(){
		System.out.println("Clearing all students...");
		theArray.clearAllStudents();
	}
	
	/**
	*Bubble sorts the entire array and prints the time taken.
	*/
	public void bubbleSort(){
		System.out.println("Bubble sort initialized");
		startTime = System.currentTimeMillis();
		for (int i = arraySize - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (theArray.getStudent(j) > theArray.getStudent(j + 1)) {
					swapValues(j, j + 1);
				}
			}
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("Bubble sort took " + (endTime - startTime) + " ms");
	}
	
	/**
	*Selection sorts the entire array and prints the time taken.
	*/
	public void selectionSort(){
		System.out.println("Selection sort initialized");
		startTime = System.currentTimeMillis();
		
		int min = 0;
		for(int j=0;j < arraySize-1; j++){
			min = j;
			
			for(int i = j+1; i < arraySize;i++){
				if(theArray.getStudent(i) < theArray.getStudent(min)){
					min = i;
				}
			}
			
			if(min != j){
				swapValues(j,min);
			}
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("Selection sort took " + (endTime - startTime) + " ms");
	}
	
	/**
	*Binary searches for a value in a sorted array. 
	*This takes an int (the value to search for).
	*/
	public void binarySearch(int value) {
		
		System.out.println("Binary search initialized.");
		
		startTime = System.currentTimeMillis();

		int lowIndex = 0;
		int highIndex = arraySize - 1;

		int timesThrough = 0;

		while (lowIndex <= highIndex) {

			int middleIndex = (highIndex + lowIndex) / 2;

			if (theArray.getStudent(middleIndex) < value)
				lowIndex = middleIndex + 1;

			else if (theArray.getStudent(middleIndex) > value)
				highIndex = middleIndex - 1;

			else {

				System.out.println("Found a match for " + value + " at index " + middleIndex);

				lowIndex = highIndex + 1;

			}

			timesThrough++;

		}

		endTime = System.currentTimeMillis();

		System.out.println("Binary search took " + (endTime - startTime) + " ms");

		System.out.println("Times through: " + timesThrough);

	}
	
	/**
	*Linear searches for a value in a sorted array. 
	*This takes an int (the value to search for).
	*/
	public void linearSearch(int value) {

		boolean valueInArray = false;
		String indexsWithValue = "";
		
		System.out.println("Linear search initialized");
		startTime = System.currentTimeMillis();

		for (int i = 0; i < arraySize; i++) {

			if (theArray.getStudent(i) == value) {
				valueInArray = true;
				indexsWithValue += i + " ";
			}

		}

		//System.out.println(indexsWithValue);
		System.out.println("Value found: " + valueInArray);

		endTime = System.currentTimeMillis();

		System.out.println("Linear search took " + (endTime - startTime) + " ms");

	}
}