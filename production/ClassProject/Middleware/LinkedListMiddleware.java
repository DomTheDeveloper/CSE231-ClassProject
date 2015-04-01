package edu.oakland.production;

import java.util.*;
import edu.oakland.helper.*;

/**
*@author Zack Waldrup
*@version version 2.1 150325
*@since version 1.0 150323
*/
public class LinkedListMiddleware {
	
	/**
	*Instance variables needed for the constructors and methods
	*/
	int listSize;
	int iMin;
	int taskTime;
	int value;
	static long startTime, endTime;
	LinkedListDB db;
	
	/**
	*Overloaded constructor for the LinkedListMiddleware class.
	*Passes the requested list size to the database.
	*@param listSize of type "int"
	*/
	public LinkedListMiddleware(int listSize) {
		this.listSize = listSize;
		db = new /*Databaseclassname*/();
		this.createLinkedList(listSize);
	}	
	
	/**
	*This method performs a Selection Sort on a LinkedList
	*/
	public void selectSort() {
		startTime = System.currentTimeMillis();
		
		for (int j = 0; j < listSize; j++) {
			iMin = j;
			for (int i = j + 1; i < listSize; i++) {
       			if (db.get(i) < db.get(iMin)) {
            		iMin = i;
            	}
            }
            if(iMin != j) {
            	swapValues(j, iMin);
            }
        }
        endTime = System.currentTimeMillis();
		taskTime = endTime - startTime;
		System.out.println("Selection Sort time taken: " + tasktime);
	}
	
	/**
	*This method performs a Bubble Sort on a LinkedList
	*/
	public void bubbleSort() {
		startTime = System.currentTimeMillis();
		
		for (int i = listSize - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if(db.get(j) > db.get(j + 1)){
					swapValues(j, j+1);
				}
			}
		}
		endTime = System.currentTimeMillis();
		taskTime = endTime - startTime;
		System.out.println("Bubble Sort time taken: " + tasktime);
	}
	
	/**
	*This method linearly searches a LinkedList
	*@param value of type "int"
	*/
	public void linearSearch(int value) {
		this.value = value;
		boolean valuePresent = false;
		String indexWithValue = "";
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < listSize; i++) {
			if(db.get(i) == value) {
				valuePresent = true;
				indexWithValue += i + " ";
			}
		}
		System.out.println("Value found: " + valuePresent);
		endTime = System.currentTimeMillis();
		taskTime = endTime - startTime;
		System.out.println("Linear Search time taken: " + tasktime);
	}
	
	/**
	*This method conducts a binary searche on a LinkedList
	*@param value of type "int"
	*/
	public void binarySearch(int value) {
		this.value = value;
		int lowIndex = 0;
		int highIndex = listSize - 1;
		int timesThrough = 0;
		startTime = System.currentTimeMillis();
		
		while (lowIndex <= highIndex) {
			int middleIndex = (highIndex + lowIndex) / 2;
			if(db.get(middleIndex) < value) {
				lowIndex = middleIndex + 1;
			} else if(db.get(middleIndex) > value) {
				highIndex = middleIndex - 1;
			} else {
				System.out.println("Found " + value + "at " + middleIndex);
				lowIndex = highIndex + 1;
			}
			timesThrough++;
		}
		
		endTime = System.currentTimeMillis();
		taskTime = endTime - startTime;
		System.out.println("Binary Search time taken: " + tasktime);
		System.out.println("Binary Search times through: " + timesThrough);
	}
	
	/**
	*This method swaps the values of 2 elements in a LinkedList
	*@param indexOne of type "int"
	*@param indexTwo of type "int"
	*/
	public void swapValues(int indexOne, int indexTwo) {
		int temp = db.get(indexOne);
		db.set(indexOne,db.get(indexTwo));
		db.set(indexTwo, temp);
	}
	
	/**
	*Method for creating a LinkedList<Integer>
	*@param listSize of type "int"
	*@return list1 of type "LinkedList<Integer>"
	*/
	public void createLinkedList(int listSize) {
		this.listSize = listSize;
		
		for(int i = 0; i < listSize; i++) {
			db.add(i, randomInt(100, 1000));
		}
	}
	
	/**
	*This method gives a random number based on a maximum and
	*minimum range of selection
	*@param min of type "int"
	*@param max of type "int"
	*@return randomNumber of type "int"
	*/
	public static int randomInt(int min, int max) {
		Random rand = new Random();
		int randomNumber = rand.nextInt((max - min) + 1) + min;
		return randomNumber;
	}
	
}