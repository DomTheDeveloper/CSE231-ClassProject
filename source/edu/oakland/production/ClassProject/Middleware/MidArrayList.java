package edu.oakland.production.ClassProject.Middleware;

import edu.oakland.production.ClassProject.Database.*;
import java.util.*;
import java.lang.*;


/**
*@author Toufiq Hussain
*@version version 1.5 150406
*@since version 1.0 150323
**/
public class MidArrayList {
	
	/**
	*Declared instance variables here.
	*/
	private ArrayListDatabase theArray;
	private int arraySize;
	static double cyclesSS;
	static double cyclesBS;
	static long startTime;
	static long endTime;
	static long totalTime;
	
	
	/**
	*Overloaded constructor to create database. Takes in
	*a variable of type "int" to specify size.
	*/
	public MidArrayList(int size){
		arraySize = size;
		theArray = new ArrayListDatabase(size);
	}
	
	/**
	*Generates a random array to fill database.
	*/
	public void generateRandomArray() {
		//System.out.println("Generating random array...");
		for (int i = 0; i < arraySize; i++) {
			int j = 0;
			j = (int) ((Math.random() * 1000) + 100);
			theArray.addStudent(j);
		}
	}
	
	/**
	*@return the size of the array as an "int"
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
		theArray.setStudent(indexTwo,temp);
	}
	
	/**
	*Clears the array of students
	*/
	public void clearArray(){

		theArray.clearAllStudents();
	}
	
	/**
	*Bubble sorts the entire array and prints the time taken.
	*@return total time taken as a "long"
	*/
	public long bubbleSort(){

		
		cyclesBS = 0;
		startTime = System.currentTimeMillis();
		for (int i = arraySize - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (theArray.getStudent(j) > theArray.getStudent(j + 1)) {
					swapValues(j, j + 1);
					theArray.trimSize();
					cyclesBS++;
				}
			}
		}
		
		endTime = System.currentTimeMillis();
		
		//System.out.println("Bubble sort took " + (endTime - startTime) + " ms");
		
		totalTime = endTime - startTime;
		return totalTime;
	}
	
	/**
	*Selection sorts the entire array and prints the time taken.
	*@return total time taken as a "long"
	*/
	public long selectionSort(){
		//System.out.println("Selection sort initialized");
		cyclesSS = 0;
		startTime = System.currentTimeMillis();
		
		int i, j, minIndex;

		int n = arraySize;

		for (i = 0; i < n - 1; i++) {

			minIndex = i;

			for (j = i + 1; j < n; j++){

				if (theArray.getStudent(j) < theArray.getStudent(minIndex)){
					minIndex = j;
					theArray.trimSize();
					cyclesSS++;
				}
			}
			if (minIndex != i) {
				swapValues(minIndex,i);
			}
			
			//theArray.trimSize();
		}
		//theArray.removeStudent(0);
		endTime = System.currentTimeMillis();
		//System.out.println("Selection sort took " + (endTime - startTime) + " ms");
		totalTime = endTime - startTime;
		return totalTime;
	}
	
	/**
	*Binary searches for a value in a sorted array. 
	*This takes an int (the value to search for).
	*@return times through as a "int"
	*/
	public int binarySearch(int value) {
		
		//System.out.println("Binary search initialized.");
		
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
		
		//System.out.println("Times through: " + timesThrough);
		
		return timesThrough;

	}
	
	/**
	*Linear searches for a value in a sorted array. 
	*This takes an int (the value to search for).
	*@return total time taken as a "long"
	*/
	public long linearSearch(int value) {

		boolean valueInArray = false;
		String indexsWithValue = "";
		
		//System.out.println("Linear search initialized");
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

		//System.out.println("Linear search took " + (endTime - startTime) + " ms");
		
		totalTime = endTime - startTime;
		return totalTime;

	}
	
	/**
	*@return amount of cycles in selectSort() as a "double"
	*/
	private double returnCyclesSS(){
		return cyclesSS;
	}
	
	/**
	*@return amount of cycles in bubbleSort() as a "double"
	*/
	private double returnCyclesBS(){
		return cyclesBS;
	}

	/**
	*This approximates the big O of the select sort.
	*It requires three arrayList sizes as "int"
	*@return String with approximate BigO
	*/
	public static String selectSortBigO(int size1, int size2, int size3){
		
		long timeSS1,timeSS2,timeSS3;
		double best;
		
		MidArrayList midAList1 = new MidArrayList(size1);
		MidArrayList midAList2 = new MidArrayList(size2);
		MidArrayList midAList3 = new MidArrayList(size3);
		
		midAList1.generateRandomArray();
		timeSS1 = midAList1.selectionSort();
		double cycles1 = midAList1.returnCyclesSS();
		//System.out.println("Select Sort Cycles: " + midAList1.returnCyclesSS());
				
		midAList2.generateRandomArray();
		timeSS2 = midAList2.selectionSort();
		double cycles2 = midAList2.returnCyclesSS();
		//System.out.println("Select Sort Cycles: " + midAList2.returnCyclesSS());
		
		midAList3.generateRandomArray();
		timeSS3 = midAList3.selectionSort();
		double cycles3 = midAList3.returnCyclesSS();
		//System.out.println("Select Sort Cycles: " + midAList3.returnCyclesSS());
		
		//long tdiff12 = timeBubbleS2 - timeBubbleS1;
		//long tdiff23 = timeBubbleS3 - timeBubbleS2;
		
		double prop1 = cycles1/size1; 
		//System.out.println(cycles1);
		//System.out.println(prop1);
		
		double prop2 = cycles2/size2; 
		//System.out.println(cycles2);
		//System.out.println(prop2);
		
		double prop3 = cycles3/size3; 
		//System.out.println(cycles3);
		//System.out.println(prop3);
		
		double n = (size3-size2)-(size2-size1);
		//System.out.println("\nn: "+n);
		double n2 = ((Math.pow(size3,2))-(Math.pow(size2,2)))-((Math.pow(size2,2))-(Math.pow(size1,2)));
		//System.out.println("\nn2: "+n2);
		double logn = ((Math.log(size3))-(Math.log(size1)));
		//System.out.println("\nlogn: "+logn);
		
		if(prop1<n2 && n<logn){
			best = n;
		}else if(n2>prop1&& n2>n){
			best = n2;
		}else{
			best = logn;
		}
		
		if(n == best) {
			return ("N");
		} else if(n2 == best){
			return ("N^2");
		} else {
			return ("log(N)");
		}
	}
	
	/**
	*This approximates the big O of the bubble sort.
	*It requires three arrayList sizes as "int"
	*@return String with approximate BigO
	*/
	public static String bubbleSortBigO(int size1, int size2, int size3){
		
		long timeBubbleS1,timeBubbleS2,timeBubbleS3;
		double best;
		
		MidArrayList midAList1 = new MidArrayList(size1);
		MidArrayList midAList2 = new MidArrayList(size2);
		MidArrayList midAList3 = new MidArrayList(size3);
		
		midAList1.generateRandomArray();
		timeBubbleS1 = midAList1.bubbleSort();
		double cycles1 = midAList1.returnCyclesBS();
		//System.out.println("Bubble Sort Cycles: " + midAList1.returnCyclesBS());
				
		midAList2.generateRandomArray();
		timeBubbleS2 = midAList2.bubbleSort();
		double cycles2 = midAList2.returnCyclesBS();
		//System.out.println("Bubble Sort Cycles: " + midAList2.returnCyclesBS());
		
		midAList3.generateRandomArray();
		timeBubbleS3 = midAList3.bubbleSort();
		double cycles3 = midAList3.returnCyclesBS();
		//System.out.println("Bubble Sort Cycles: " + midAList3.returnCyclesBS());
		
		//long tdiff12 = timeBubbleS2 - timeBubbleS1;
		//long tdiff23 = timeBubbleS3 - timeBubbleS2;
		
		double prop1 = cycles1/size1; 
		//System.out.println(cycles1);
		//System.out.println(prop1);
		
		double prop2 = cycles2/size2; 
		//System.out.println(cycles2);
		//System.out.println(prop2);
		
		double prop3 = cycles3/size3; 
		//System.out.println(cycles3);
		//System.out.println(prop3);
		
		double n = (size3-size2)-(size2-size1);
		//System.out.println("\nn: "+n);
		double n2 = ((Math.pow(size3,2))-(Math.pow(size2,2)))-((Math.pow(size2,2))-(Math.pow(size1,2)));
		//System.out.println("\nn2: "+n2);
		double logn = ((Math.log(size3))-(Math.log(size1)));
		//System.out.println("\nlogn: "+logn);
		
		if(prop1<n2 && n<logn){
			best = n;
		}else if(n2>prop1 && n2>n){
			best = n2;
		}else{
			best = logn;
		}
		
		if(n == best) {
			return ("N");
		} else if(n2 == best){
			return ("N^2");
		} else {
			return ("log(N)");
		}
	}
	
}