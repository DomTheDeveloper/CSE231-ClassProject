package edu.oakland.test.ClassProject.Database;

import edu.oakland.production.ClassProject.Database.*;
import junit.framework.*;
import java.util.*;
/**
* This is the JUnit test class Hash Table Database class. It makes instances
* of the  Hash Table class and fills it with some test values
* through a test array. It then uses assert equals
* statements to test and see if the values in the correct elements after
* remove and insert methods.
*@author "Michael Opiola"
*@version "1.0" 150211
*@since version 1.0
*/
public class HashTest extends TestCase {
	
	public void testCreate() {
		int[] testArray = {1,2,3,4,5,6,7,8,9,10};
		
		DatabaseHashTable hash1 = new DatabaseHashTable(testArray, 20);
		
		System.out.println();
		for (int i = 1; i <= testArray.length; i++){
			System.out.print(hash1.select(i) + " ");
		}
		
		System.out.println();
		//insert for testing
		hash1.insert(1,101);
		
		System.out.println();

		for (int i = 1; i <= testArray.length; i++){
			System.out.print(hash1.select(i) + " ");
		}

		System.out.println();
		//assert statement that checks if the proper value is in place after insertment
		assertEquals(101, hash1.select(1)); 
		
		//remove for testing
		hash1.remove(1);
		
		//assert to test if the value at element 1 was properly removed
		assertEquals(hash1.select(1), -1);
		
		System.out.println();
		for (int i = 1; i <= testArray.length; i++){
			System.out.print(hash1.select(i) + " ");
		}
	}
}