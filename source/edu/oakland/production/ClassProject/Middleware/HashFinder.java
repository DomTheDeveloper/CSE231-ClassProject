package edu.oakland.production.ClassProject.Middleware;
/**
*@author Jared Okoniewski, Jesse Rominske, Dean DeHart
*@version version 3.0 150401
*@since version 1.0 152403
*/
public class HashFinder {
	/**
	*The input variable that will be located within the Hash Table.
	*/
	private int hashInput;
	private long startTime;
	private long endTime;
	private long totalTime;
	/**
	*The size of the Hash Table being searched.
	*/
	private int hashSize;
	/**
	*The reference to the Hash Table itself.
	*/
	private int[] table;
	/**
	*The index of wherever the search found the element.
	*Used in Display package for index return.
	*/
	private int hashOutput;
	/**
	*Finds a value within the Hash Table.
	*Accepts an input value, an array size, and an array as arguments.
	*@param input The input value, assigned to hashInput. Order needs to be changed? -Dean
	*@param size The size value, assigned to hashSize. Order needs to be changed? -Dean
	*@param array The array, assigned to table. Order needs to be changed? -Dean
	*/
	public int findHashIndex(int input, int[] array) {
		
		System.out.println("The method findValue was called."); //announce method
		//assigning arguments to variables
		hashInput = input;
		hashSize = array.length;
		table = array;
		int items = 0;
		
		int arrayIndex = input % (hashSize - 1); //find the original hash key
		startTime = System.currentTimeMillis();                               
		while(table[arrayIndex] != -1) { //as long as the slot has something in it
			if(table[arrayIndex] == input) { //if we found it
				System.out.println(input + "was found at index " + arrayIndex); //tell user
				hashOutput = input; //set the output to the value of the input
				break; //end the loop
			}
			++arrayIndex; //increment the index at each attempt
			++items; //Increment the number of items searched
			arrayIndex %= hashSize; //return to table[0] if we can't find it
			break; //end the loop
		}
		endTime = System.currentTimeMillis();
		totalTime = endTime - startTime;
		if(hashOutput != input) { //if there is a mismatch between input and output
			System.out.println("Value not found in hash table."); //tell user
		}
		
		System.out.println(items + " items were searched"); //spit out the number of items searched
		
		return arrayIndex;//spit out the index of the value found
	}
	public long getTime(){
		return totalTime;
	}
}
/**
*This class is that which finds a value in a Hash Table.
*/
