/**
* This class stores the data structure which stores an array of values passed to us by Middleware. 
*
* @author Chris Spencer, Mike Opiola, Ben Dickman(DS), and Jesse Rominske(MW)
* @version "version-1.0" "150330"
* @since "version-1.0"
*/

package edu.oakland.production.ClassProject.Database;

import java.util.*;

public class DatabaseHashTable {
	private Hashtable<Integer, Integer> hashTable;
	private int[] hashArray;
	private int arraySize;

	/**
    	* Constructor for DatabaseHashTable 
    	* Generates the hash table
    	* * @param hashArraySize The size of the hash table to be made. This is changeable to allow more flexibility and possible speed improvements. 
    	*/
	public DatabaseHashTable(int hashArraySize){
//		generateHashTable(hashArraySize);
		arraySize = hashArraySize;
		hashTable = new Hashtable<Integer,Integer>(hashArraySize);
		//generateHashTable(hashArraySize);
	}
	
    	/**
    	* This function generates a hash table based upon an array and hash table size specified.
    	* @param containerArray An array that contains the elements to be added. This will be specified by middleware unless changed.
    	* @param hashArraySize The size of the hash table to be made. This is changeable to allow more flexibility and 
    	* possible speed improvements. 
    	*/
    	public int[] generateHashTable(int sizeOfArray) {
    		arraySize = sizeOfArray;
    		hashArray = new int[arraySize];
    		for (int i = 0; i < hashArray.length; i++) {
    			hashArray[i] = (int)(Math.random()*arraySize) + (i + 1) + arraySize;
			//hashTable.put(i, -1);
    		}
    		/*for (int j = 0; j < hashArray.length; j++){
			int newElementValue = hashArray[j];
			int hashIndex = newElementValue % (hashArray.length - 1);
			while(hashArray[hashIndex] != -1){
				++hashIndex;
				hashIndex %= arraySize;
			}
			hashArray[hashIndex] = newElementValue;
			hashTable.put(hashIndex, newElementValue);
		}*/
		return hashArray;
    	}
	/**
     	* Takes a key and returns the integer value of what is stored at said key.
     	* 
    	* @param key Where the hashtable will look to find the value that it will return.
    	* @return int Value found at key.
    	*/
	public int select(int key){
		return(hashTable.get(key));
	}

	/** This Method returns -1 if not found
	* and anything else if it is in the array
	* @param value the value to find
	*/
	public int getLocation(int value) {
		if(hashTable.contains(value))
			return value % arraySize;
		else
			return -1;
	}
	
    	/**
    	* Resets the value of the element with the specified key to -1.
    	* 
    	* @param key Where the hashtable will look to find the value that is to be reset to -1.
    	*/
	public void remove(int key){
		hashTable.put(key, -1);
	}

    	/**
    	* Takes a value and inserts it into the hash table at the specified key.
    	* 
    	* @param key Where the hashtable will look to set the value.
    	* @param value The value that will be put into the hashtable at the specified key location.
    	*/
	public void insert(int value){
		hashTable.put(value % arraySize, value);
	}	
	public int[] getHashArray(){
		return hashArray;
	}
}
