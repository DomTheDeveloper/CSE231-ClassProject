package edu.oakland.production.ClassProject.Middleware;

import java.util.*;
import edu.oakland.production.ClassProject.Database.*;

/**
*@author Zack Waldrup, and everyone that was cooooool
*@version version 3.0 150412
*@since version 1.0 150323
*/
public class LinkedListMiddleware {
	
	/**
	*Instance variables needed for the constructors and methods
	*/
	int listSize;
	int iMin;
	long taskTime;
	int value;
	public static int timesThrough;
	static long startTime, endTime;
	public boolean valuePresent = false;
	public LinkedListBen db = new LinkedListBen();
	public LinkedList<Integer> linkList;
	/**
	*Overloaded constructor for the LinkedListMiddleware class.
	*Passes the requested list size to the database.
	*@param listSize of type "int"
	*/
	public LinkedListMiddleware(int listSize) {
		db.createLinkedList(listSize);
		linkList = db.getLinkList();
	}
	
	/**
	*Calculates the Big O value for a selection sort based on 3 sizes
	*of LinkedList<Integer>. Values for a, b, and c must be in increasing order.
	*@param a of type "int"
	*@param b of type "int"
	*@param c of type "int"
	*@return Big O N value of type "String"
	*/
	public static String calcSelectBigO(int a, int b, int c) {
		LinkedListMiddleware mwa, mwb, mwc;
		long taskTimeA, taskTimeB, taskTimeC;
		long diffAB, diffBC;
		long nDiffBC, n2DiffBC, lognDiffBC;
		long smallest;
		
		mwa = new LinkedListMiddleware(a);
		taskTimeA = mwa.selectSort();
		mwb = new LinkedListMiddleware(b);
		taskTimeB = mwb.selectSort();
		mwc = new LinkedListMiddleware(c);
		taskTimeC = mwc.selectSort();
		
		diffBC = taskTimeC - taskTimeB;
		
		nDiffBC = diffBC - (c-b);
		n2DiffBC = diffBC - ((c*c) - (b*b));
		lognDiffBC = diffBC - (long)(Math.log(c) - Math.log(b));
		
		if(nDiffBC<n2DiffBC && nDiffBC<lognDiffBC){
			smallest = nDiffBC;
		} else if(n2DiffBC<lognDiffBC && n2DiffBC<nDiffBC){
			smallest = n2DiffBC;
		} else {
			smallest = lognDiffBC;
		}
		
		if(nDiffBC == smallest) {
			return ("N");
		} else if(n2DiffBC == smallest){
			return ("N^2");
		} else {
			return ("log(N)");
		}
	}
	
	/**
	*Calculates the Big O value for a bubble sort based on 3 sizes
	*of LinkedList<Integer>. Values for a, b, and c must be in increasing order.
	*@param a of type "int"
	*@param b of type "int"
	*@param c of type "int"
	*@return Big O N value of type "String"
	*/
	public static String calcBubbleBigO(int a, int b, int c) {
		LinkedListMiddleware mwa, mwb, mwc;
		long taskTimeA, taskTimeB, taskTimeC;
		long diffAB, diffBC;
		long nDiffBC, n2DiffBC, lognDiffBC;
		long smallest;
		
		mwa = new LinkedListMiddleware(a);
		taskTimeA = mwa.bubbleSort();
		mwb = new LinkedListMiddleware(b);
		taskTimeB = mwb.bubbleSort();
		mwc = new LinkedListMiddleware(c);
		taskTimeC = mwc.bubbleSort();
		
		diffBC = taskTimeC - taskTimeB;
		
		nDiffBC = diffBC - (c-b);
		n2DiffBC = diffBC - ((c*c) - (b*b));
		lognDiffBC = diffBC - (long)(Math.log(c) - Math.log(b));
		
		if(nDiffBC<n2DiffBC && nDiffBC<lognDiffBC){
			smallest = nDiffBC;
		} else if(n2DiffBC<lognDiffBC && n2DiffBC<nDiffBC){
			smallest = n2DiffBC;
		} else {
			smallest = lognDiffBC;
		}
		
		if(nDiffBC == smallest) {
			return ("N");
		} else if(n2DiffBC == smallest){
			return ("N^2");
		} else {
			return ("log(N)");
		}
	}
	
	/**
	*This method performs a Selection Sort on a LinkedList
	*Big O: O(n^2)
	*@return taskTime of type "int"
	*/
	public long selectSort() {
		startTime = System.currentTimeMillis();
		
		for (int j = 0; j < listSize; j++) {
			iMin = j;
			for (int i = j+1; i < listSize; i++) {
				
       			if (linkList.get(i).intValue() < linkList.get(iMin).intValue()) {
            		iMin = i;
            		break;
            	}
            }
            if(iMin != j) {
            	swapValues(j, iMin);
            }
            
        }
		
		
        endTime = System.currentTimeMillis();
		taskTime = endTime - startTime;
		return taskTime;
	}
	
	/**
	*This method performs a Bubble Sort on a LinkedList
	*Big O: O(n^2)
	*@return taskTime of type "int"
	*/
	public long bubbleSort() {
		startTime = System.currentTimeMillis();
		
		for (int i = listSize - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if(linkList.get(j).intValue() > linkList.get(j + 1).intValue()){
					swapValues(j, j+1);
					break;
				}
			}
		}
		endTime = System.currentTimeMillis();
		taskTime = endTime - startTime;
		return taskTime;
	}
	
	/**
	*This method linearly searches a LinkedList
	*Big O: O(n)
	*@param value of type "int"
	*@return taskTime of type "int"
	*/
	public long linearSearch(int value) {
		this.value = value;
		valuePresent = false;
		String indexWithValue = "";
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < listSize; i++) {
			if(linkList.get(i).intValue() == value) {
				valuePresent = true;
				indexWithValue += i + " ";
			}
		}
		System.out.println("Value found: " + valuePresent);
		endTime = System.currentTimeMillis();
		taskTime = endTime - startTime;
		return taskTime;
	}
	
	/**
	*This method conducts a binary searche on a LinkedList
	*Big O: O(log(n))
	*@param value of type "int"
	*@return timesThrough of type "int"
	*/
	public int binarySearch(int value) {
		this.value = value;
		int lowIndex = 0;
		int highIndex = listSize - 1;
		timesThrough = 0;
		startTime = System.currentTimeMillis();
		
		while (lowIndex <= highIndex) {
			int middleIndex = (highIndex + lowIndex) / 2;
			if(linkList.get(middleIndex).intValue() < value) {
				lowIndex = middleIndex + 1;
			} else if(linkList.get(middleIndex).intValue() > value) {
				highIndex = middleIndex - 1;
			} else if(linkList.get(middleIndex).intValue() == value){
				valuePresent = true;
				System.out.println("Found " + value + "at " + middleIndex);
				lowIndex = highIndex + 1;
			} else {
				System.out.println("Value is not in this list");
			}
			timesThrough++;
		}
		
		endTime = System.currentTimeMillis();
		taskTime = endTime - startTime;
		return timesThrough;
	}
	
	/**
	*This method swaps the values of 2 elements in a LinkedList
	*@param indexOne of type "int"
	*@param indexTwo of type "int"
	*/
	public void swapValues(int indexOne, int indexTwo) {
		Integer temp = linkList.get(indexOne);
		linkList.set(indexOne,linkList.get(indexTwo));
		linkList.set(indexTwo, temp);
	}
	
	/**
	*Method for creating a LinkedList<Integer>
	*@param listSize of type "int"
	*/
	public void createLinkedList(int listSize) {
		this.listSize = listSize;
		
		for(int i = 0; i < listSize; i++) {
			linkList.add((Integer)randomInt(100, 1000));
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
	
	/**
	@return True if the previous search was successful
	*/
	public boolean wasPresent() {
		return valuePresent;
	}
	
}