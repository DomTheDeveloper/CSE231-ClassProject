/**
* This class stores the data structure which stores an array of values passed to us by Middleware. 
*
* @author Chris Spencer and Mike Opiola
* @version "version-1.0" "150330"
* @since "version-1.0"
*/

package edu.oakland.production.ClassProject.Database;

import java.util.Hashtable;

public class DatabaseHashTable {
	private Hashtable<Integer, Integer> hashTable;
	private int[] hashTableElementContainer;
	private int[] hashTableArray;
	private int hashTableArraySize;

	/**
    	* Constructor for DatabaseHashTable 
    	* Generates the hash table
    	* 
    	* @param containerArray An array that contains the elements to be added. This will be specified by middleware unless changed
    	* @param hashArraySize The size of the hash table to be made. This is changeable to allow more flexibility and possible speed improvements. 
    	*/
	public DatabaseHashTable(int[] containerArray, int hashArraySize){
		generateHashTable(containerArray,  hashArraySize);
	}
	
    	/**
    	* This function generates a hash table based upon an array and hash table size specified.
    	* @param containerArray An array that contains the elements to be added. This will be specified by middleware unless changed.
    	* @param hashArraySize The size of the hash table to be made. This is changeable to allow more flexibility and 
    	* possible speed improvements. 
    	*/
	public void generateHashTable(int[] containerArray, int hashArraySize){ 
		hashTableElementContainer = containerArray;
		hashTableArraySize = hashArraySize;
		hashTableArray = new int[hashTableArraySize];
		
		hashTable = new Hashtable<Integer, Integer>();
		
		for (int i = 0; i < hashTableArray.length; i++){
			hashTableArray[i] = -1;
			hashTable.put(i, -1);
		}
		
		for (int j = 0; j < hashTableElementContainer.length; j++){
			int newElementValue = hashTableElementContainer[j];
			int hashTableArrayIndex = newElementValue % (hashTableArray.length - 1);
			
			System.out.println("Index = " + hashTableArrayIndex + ", Value = " + newElementValue);
			
			while(hashTableArray[hashTableArrayIndex] != -1){
				++hashTableArrayIndex;
				System.out.println("Collision Occurred. Try " + hashTableArrayIndex + " instead");
				hashTableArrayIndex %= hashTableArraySize;
			}
			hashTableArray[hashTableArrayIndex] = newElementValue;
			hashTable.put(hashTableArrayIndex, newElementValue);
		}
				
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
	public void insert(int key, int value){
		hashTable.put(key, value);
	}	
}
