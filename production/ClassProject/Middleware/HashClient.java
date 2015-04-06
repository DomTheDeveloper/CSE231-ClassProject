package edu.oakland.production.GroupProject.Middleware;

import java.util.*;
import edu.oakland.production.GroupProject.Middleware.*;

/**
 * @author Dean DeHart, Middleware
 * @version 2.0 150401
 * @since 1.0 150328
 */
public class HashClient {
	/**
	 * Creates an instance of the Database HashTable class.
	 * Error is currently caused by missing import statement for this class. -Dean
	 */
	private HashTable hashTable;
	/**
	 * Creates an instance of the Middleware HashArrayCreator class, located in the
	 * edu.oakland.production.GroupProject.Middleware package. -Dean
	 */
	private HashArrayCreator hashArrayCreator;
	/**
	 * Creates an instance of the Middleware HashDataFinder class, located in the
	 * edu.oakland.production.GroupProject.Middleware package. -Dean
	 */
	private HashFinder hashFinder;
	/**
	 * Creates an instance of the Middleware HashClient class, located in the
	 * edu.oakland.production.GroupProject.Middleware package. -Dean
	 */
	private HashClient hashClient = new HashClient();
	/**
	 *See findHashTableValue(); -Dean
	 */
	private int[] hashTableArray;	
	/**
	 *See findHashTableValue(); -Dean
	 */
	private int hashTableArraySize;
	/**
	 *See findHashTableValue(); -Dean
	 */
	private int hashValue;
	/**
	 *Returns the Big O notation for the HashTable.
	 *@return String
	 */
	private String bigONotation() {
		String bigO = "The Big O notation for HashTable is O(1)";
		return bigO;
	}	
	private void createHashTable(int n) {
		hashTable = new HashTable(n);
		hashTableArray = hashTable.containerArray;
	}
	/**
	 * Method for searching the hashTable. -Dean
	 */
	private int findHashTableValue() {
		hashFinder = new HashFinder();
		
		hashValue = hashTableArray[10];
		System.out.println("The hash value to be retrieved is: " + hashValue);
		int valueIndex = hashFinder.findHashValue(hashValue, hashTableArraySize, hashTableArray);
		return valueindex;
	}
}
