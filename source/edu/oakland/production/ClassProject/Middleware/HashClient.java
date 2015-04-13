package edu.oakland.production.ClassProject.Middleware;

import java.util.*;
import edu.oakland.production.ClassProject.Database.*;
/**
 * @author Jesse, Dean, Middleware
 * @version 2.0 150401
 * @since 1.0 150328
 */
public class HashClient {
	/**
	 * Creates an instance of the Database HashTable class.
	 * Error is currently caused by missing import statement for this class. -Dean
	 */
	private DatabaseHashTable hashTable;
	/**
	 * Creates an instance of the Middleware HashDataFinder class, located in the
	 * edu.oakland.production.GroupProject.Middleware package. -Dean
	 */
	private HashFinder hashFinder;
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
	public String bigONotation() {
		long hold = hashFinder.getTime();
		long holdLong = hold / hashTableArraySize;
		String bigO = Long.toString(holdLong);
		return bigO;
	}	

	/**
	*Creates a HashTable.
	*@param size
	*/
	public void createHashTable(int size) {
		hashTable = new DatabaseHashTable(size);
		hashTable.generateHashTable(size);
	}
	/**
	 * Method for searching the hashTable. -Dean
	 */
	public int findHashTableValue(int value) {
		hashFinder = new HashFinder();
		
		//hashValue = value;
		//System.out.println("The hash value to be retrieved is: " + hashValue);
		int valueIndex = hashFinder.findHashIndex(value, hashTable.getHashArray());//hashFinder.findHashValue(hashValue, hashTableArraySize, hashTableArray);
		return valueIndex;
	}
}
