package edu.oakland.production.ClassProject.Middleware;

import java.util.*;
import edu.oakland.production.ClassProject.Database.*;
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
	private DatabaseHashTable hashTable;
	/**
	 * Creates an instance of the Middleware HashDataFinder class, located in the
	 * edu.oakland.production.GroupProject.Middleware package. -Dean
	 */
	private HashFinder hashFinder;
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
	public String bigONotation() {
		String bigO = "The Big O notation for HashTable is O(1)";
		return bigO;
	}	
	public void createHashTable(int n) {
		hashTable = new DatabaseHashTable(n);
		hashTableArray = hashTable.containerArray;
	}
	/**
	 * Method for searching the hashTable. -Dean
	 */
	public int findHashTableValue(int value) {
		hashFinder = new HashFinder();
		
		hashValue = value;
		System.out.println("The hash value to be retrieved is: " + hashValue);
		int valueIndex = hashFinder.findHashValue(hashValue, hashTableArraySize, hashTableArray);
		return valueIndex;
	}
	
	public static void main(String[] args) {
		
	}
}










