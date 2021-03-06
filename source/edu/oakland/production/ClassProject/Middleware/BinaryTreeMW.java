package edu.oakland.production.ClassProject.Middleware;
import java.util.*;

import edu.oakland.production.ClassProject.Database.BinaryTreeDB;
import edu.oakland.production.ClassProject.Database.Node;


/**
 * BinaryTreeMW.  
 * This class is used to complete part 1B in the CSE231 class project.  
 * It allows a programmer to generate and mainipulate a binary tree, 
 * collecting data along the way.
 * 
 * @author Joshua Herkness, Middleware
 * @author Trevor Luebbert, Middleware
 * @version Version 2.4
 * @since version 1.0
 */
public class BinaryTreeMW {
	
	/// Minimum possible key value, used with generating a random key.
	private int minimumKeyValue = 400000;
	/// Maximum possible key value, used with generating a random key.
	private int maximumKeyValue = 800000;
	
	/// Minimum possible name value, used with generating a random name.
	private int minimumNameValue = 200000;
	/// Maximum possible key value, used with generating a random name.
	private int maximumNameValue = 600000;
	
	private BinaryTreeDB<String> binaryTreeDatabase;
	
	static boolean continueSearching;
	
	/**
	 * Default constructor for the BinaryTreeMW Class.
	 * 
	 * @return BinaryTreeMW
	 */
	public BinaryTreeMW(){
		
		this.binaryTreeDatabase = new BinaryTreeDB<String>();
	}
	
	/**
	 * Overloaded constructor for the BinaryTreeMW Class.
	 * Accepts a BinaryTreeDB parameter.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB object.
	 * @return BinaryTreeMW
	 */
	@SuppressWarnings("unchecked")
	public BinaryTreeMW(BinaryTreeDB<String> binaryTreeDatabase){
		
		this.binaryTreeDatabase = binaryTreeDatabase;
	}
	
	/**
	 * Overloaded constructor for the BinaryTreeMW Class.  
	 * Popluates the binaryTreeDatabase given a size.
	 * 
	 * @param size Integer value corresponding to the desired size of the BinaryTreeDB object.
	 * 
	 * @return BinaryTreeMW
	 */
	public BinaryTreeMW(int size){
		
		this.binaryTreeDatabase = new BinaryTreeDB<String>();
		
		// Populates the BinaryTreeDB object
		populateBinaryTreeDB(size);
	}
	
	/**
	 * Populates a private global BinaryTreeDB object with a given amount of nodes.  
	 * Creates a non-duplicate random key and name for each node.
	 * 
	 * @param size Integer value corresponding to the size of the binary tree.
	 * 
	 */
	public void populateBinaryTreeDB(int size){
		
		// Refresh the BinaryTreeDB object.
		this.binaryTreeDatabase = new BinaryTreeDB<String>();
		
		// Create a non-duplicate random number list for keys.
		List<Integer> nonDuplicateRandomNumberKeys = new ArrayList<Integer>();
		// Create a non-duplicate random number list for names.
		List<Integer> nonDuplicateRandomNumberNames = new ArrayList<Integer>();
		
		// Populate both key and name lists.
		nonDuplicateRandomNumberKeys = createNonDuplicateRandomNumbers(minimumKeyValue, 
																	   maximumKeyValue+1, 
																	   size + 1);
		nonDuplicateRandomNumberNames = createNonDuplicateRandomNumbers(minimumNameValue, 
																		maximumNameValue+1, 
																		size + 1);
		
		for (int i = 0; i < size; i++){
			
			// Reference key integer from a given index.
			int key = nonDuplicateRandomNumberKeys.get(i);
			// Reference name integer from a given index, then convert to a string.
			String name = String.valueOf(nonDuplicateRandomNumberNames.get(i));
			
			// Add a node to the BinaryTreeDB, given the key and name.
			this.binaryTreeDatabase.addNode(key, name);	
			
		}
	}
	
	/**
	 * Searches for three integer key values, providing a record of the 
	 * amount of nodes searched durring a preorder search.
	 * 
	 * @param key1 Integer value corresponding to a key value.
	 * @param key2 Integer value corresponding to a key value.
	 * @param key3 Integer value corresponding to a key value.
	 * 
	 * @return nodesSearched String value corresponding to the number of nodes searched respectively.
	 */
	public String calculatePreorderNodesSearched(int key1, int key2, int key3){
		String nodesSearched = "";
		
		Node focusNode = this.binaryTreeDatabase.getRootNode();
		
		
		continueSearching = true;
		long startTime = System.nanoTime();
		nodesSearched += String.valueOf(calculatePreorderNodesSearched(this.binaryTreeDatabase, focusNode, key1));
		long endTime = System.nanoTime();
		nodesSearched += " (" + String.valueOf(endTime-startTime) + "ns) ";
		
		
		continueSearching = true;
		startTime = System.nanoTime();
		nodesSearched += String.valueOf(calculatePreorderNodesSearched(this.binaryTreeDatabase, focusNode, key2));
		endTime = System.nanoTime();
		nodesSearched += " (" + String.valueOf(endTime-startTime) + "ns) ";
		
		continueSearching = true;
		startTime = System.nanoTime();
		nodesSearched += String.valueOf(calculatePreorderNodesSearched(this.binaryTreeDatabase, focusNode, key3));
		endTime = System.nanoTime();
		nodesSearched += " (" + String.valueOf(endTime-startTime) + "ns) ";
		
		return nodesSearched;
	}
	
	/**
	 * Searches for three integer key values, 
	 * providing a record of the amount of nodes searched durring an in order search.
	 * 
	 * @param key1 Integer value corresponding to a key value.
	 * @param key2 Integer value corresponding to a key value.
	 * @param key3 Integer value corresponding to a key value.
	 * 
	 * @return nodesSearched String value corresponding to the number of nodes searched respectively.
	 */
	public String calculateInOrderNodesSearched(int key1, int key2, int key3){
		
		String nodesSearched = "";
		
		Node focusNode = this.binaryTreeDatabase.getRootNode();
		
		
		continueSearching = true;
		long startTime = System.nanoTime();
		nodesSearched += String.valueOf(calculateInOrderNodesSearched(this.binaryTreeDatabase, focusNode, key1));
		long endTime = System.nanoTime();
		nodesSearched += " (" + String.valueOf(endTime-startTime) + "ns) ";
		
		
		continueSearching = true;
		startTime = System.nanoTime();
		nodesSearched += String.valueOf(calculateInOrderNodesSearched(this.binaryTreeDatabase, focusNode, key2));
		endTime = System.nanoTime();
		nodesSearched += " (" + String.valueOf(endTime-startTime) + "ns) ";
		
		continueSearching = true;
		startTime = System.nanoTime();
		nodesSearched += String.valueOf(calculateInOrderNodesSearched(this.binaryTreeDatabase, focusNode, key3));
		endTime = System.nanoTime();
		nodesSearched += " (" + String.valueOf(endTime-startTime) + "ns) ";
		
		return nodesSearched;
		
		
		
	}
	
	/**
	 * Calculates the amount of nodes searched for locating a given key using a preorder search.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * 
	 * @return int Integer type corresponding to the number of nodes searched through.
	 */
	private int calculatePreorderNodesSearched(BinaryTreeDB<String> binaryTreeDatabase, Node focusNode, int key){
		
		int nodesSearched = calculatePreorderNodesSearched(binaryTreeDatabase, focusNode, key, true);
		
		return nodesSearched;
		
	}
	
	/**
	 * Helper recursive method used to calculates the amount of nodes searched 
	 * for locating a given key using a preorder search.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * @param continueSearch Boolean value corresponding to whether the node has been located.
	 * 
	 * @return int Integer type corresponding to the number of nodes searched through.
	 */
	
	
	private int calculatePreorderNodesSearched(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key, boolean nothing){
		
		// Begin each recursion with zero nodes searched.
		int nodesSearched = 0;
		
		// Ignore the recursion loop if the node is already found, or if the node is non existent.
		if (!this.continueSearching){
			return 0;
		} else if (focusNode == null){
			return 0;
		} else {
			// Count the node.
			nodesSearched++;
		}
		
		// If the focus node has the desired key, increment the amount of nodesSearched, 
		// and skip all other recursions.
		if (focusNode.getKey() == key){
			this.continueSearching = false;
			return nodesSearched;
		}
		
		if (focusNode.leftChild != null){
			
			// Call the recursive method again, 
			// sending it the reference to continueSearching.
			nodesSearched += calculatePreorderNodesSearched(binaryTreeDatabase, 
															focusNode.leftChild, 
															key, 
															continueSearching);
		}
		
		if (focusNode.rightChild != null){
			
			// Call the recursive method again, 
			// sending it the reference to continueSearching.
			nodesSearched += calculatePreorderNodesSearched(binaryTreeDatabase, 
															focusNode.rightChild, 
															key, 
															continueSearching);
		}
		
		// Return the amount of nodes searched for each recursion.
		return nodesSearched;
			
	}
	
	/**
	 * Calculates the amount of nodes searched for locating a given key using an in order search.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * 
	 * @return int Integer type corresponding to the number of nodes searched through.
	 */
	private int calculateInOrderNodesSearched(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key){
		
		// Call a recursive method, notifying it to continue searching initially (true)
		int nodesSearched = calculateInOrderNodesSearched(binaryTreeDatabase, 
														  focusNode, 
														  key, 
														  true);
		
		return nodesSearched;
	}
	
	/**
	 * Helper recursive method used to calculates the amount 
	 * of nodes searched for locating a given key using an in order search.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * @param continueSearch Boolean value corresponding to whether the node has been located.
	 * 
	 * @return int Integer type corresponding to the number of nodes searched through.
	 */
	private int calculateInOrderNodesSearched(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key, boolean continueSearching){
		
		// Begin each recursion with zero nodes searched.
		int nodesSearched = 0;
		
		// Ignore the recursion loop if the node is already found, or if the node is non existant.
		if (!this.continueSearching){
			return 0;
		} else if (focusNode == null){
			return 0;
		} else {
			// Count the node.
			nodesSearched++;
		}
		
		if (focusNode.leftChild != null){
			
			// Call the recursive method again, 
			// sending it the reference to continueSearching.
			nodesSearched += calculateInOrderNodesSearched(binaryTreeDatabase, 
														   focusNode.leftChild, 
														   key, 
														   this.continueSearching);
		}
		
		// If the focus node has the desired key, increament the amount of nodesSearched,
		// and notify all other recursions to break.
		if (focusNode.getKey() == key){
			
			this.continueSearching = false;
			return nodesSearched;
			
		}
		
		if (focusNode.rightChild != null){
			
			// Call the recursive method again, 
			// sending it the reference to continueSearching.
			nodesSearched += calculateInOrderNodesSearched(binaryTreeDatabase, 
														   focusNode.rightChild, 
														   key, 
														   this.continueSearching);
		}
		
		// Return the amount of nodes searched for each recursion.
		return nodesSearched;
	}
	
	/**
	 * Calculates the amount of time (in milliseconds) needed to conduct a preorder 
	 * search on each of the three integer keys provided.
	 * 
	 * @param key1 Integer value corresponding to a key value.
	 * @param key2 Integer value corresponding to a key value.
	 * @param key3 Integer value corresponding to a key value.
	 * 
	 * @return duration String value corresponding to the time elapsed durring each of the searches respectively.
	 */
	public String calculatePreorderSearchDuration(int key1, int key2, int key3){
		
		String duration = "";
		
		Node focusNode = this.binaryTreeDatabase.getRootNode();
		
		duration += Long.toString(calculatePreorderSearchDuration(this.binaryTreeDatabase, 
																	focusNode, 
																	key1));
		duration += " ns ";
		
		duration += Long.toString(calculatePreorderSearchDuration(this.binaryTreeDatabase, 
																	focusNode, 
																	key2));
		duration += " ns ";
		
		duration += Long.toString(calculatePreorderSearchDuration(this.binaryTreeDatabase, 
																	focusNode, 
																	key3));
		duration += " ns";
		
		return duration;
	}
	
	/**
	 * Calculates the amount of time (in milliseconds) needed to conduct 
	 * an in order search on each of the three integer keys provided.
	 * 
	 * @param key1 Integer value corresponding to a key value.
	 * @param key2 Integer value corresponding to a key value.
	 * @param key3 Integer value corresponding to a key value.
	 * 
	 * @return duration String value corresponding to the time elapsed durring each of the searches respectively.
	 */
	public String calculateInOrderSearchDuration(int key1, int key2, int key3){
		
		String duration = "";
		
		Node focusNode = this.binaryTreeDatabase.getRootNode();
		
		duration += Long.toString(calculateInOrderSearchDuration(this.binaryTreeDatabase, 
																   focusNode, 
																   key1));
		duration += " ns ";
		
		duration += Long.toString(calculateInOrderSearchDuration(this.binaryTreeDatabase, 
																   focusNode, 
																   key2));
		duration += " ns ";
		
		duration += Long.toString(calculateInOrderSearchDuration(this.binaryTreeDatabase, 
																   focusNode, 
																   key3));
		duration += " ns";
		
		return duration;
	}
	
	/**
	 * Calculates the amount of time (in milliseconds) needed to conduct a preorder search on the integer key provided.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * 
	 * @return long Long type corresponding to time taken to search the binaryTreeDatabase.
	 */
	@SuppressWarnings("unchecked")
	private long calculatePreorderSearchDuration(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key){
		
		long startTime = System.nanoTime();
		int temporary = calculatePreorderNodesSearched(binaryTreeDatabase, focusNode, key);
		long endTime = System.nanoTime();
		
		return (endTime - startTime);
	}
	
	/**
	 * Calculates the amount of time (in milliseconds) needed to conduct an in order search on the key provided.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * 
	 * @return long Long type corresponding to time taken to search the binaryTreeDatabase.
	 */
	private long calculateInOrderSearchDuration(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key){
		
		long startTime = System.nanoTime();
		int temporary = calculateInOrderNodesSearched(binaryTreeDatabase, focusNode, key);
		long endTime = System.nanoTime();
		
		return (endTime - startTime);
	}
	
	/**
 	 * Gathers data for the BigO notaion, returning a string of the duration 
 	 * spent searching after each recursion, as well as the description of the notation.
	 * 
 	 * @return bigO String value corresponding to the big O notation and data set as proof.
	 */
	public String calculateBigORelationship(int size){
		
		String bigO = new String();
		double n = size;
		double n2 = Math.pow(size,2);
		double logn = Math.log(size)/Math.log(2);
		double nodes = findNodeNumber(412321);;
		
		double prop1 = Math.abs(n - nodes);
		double prop2 = Math.abs(n2 - nodes);
		double prop3 = Math.abs(logn - nodes);
		double[] small = {prop1, prop2, prop3};
		double smallest = size + 1;
		
		for(int i = 0; i < 3; i++) {
			if(smallest > small[i]) {
				smallest = small[i];
			}	
		}
		
		
		bigO += "The expected approximated big O notation for this binary tree: O(log(n))" + "\n";
		bigO += "The number of nodes traversed: " + String.valueOf(nodes);
		
		bigO += "\n";
		
		if(smallest == prop1) {
			bigO += "The approximated big O notation for this binary tree: O(n)" + "\n";
			bigO += "The big O notation for this binary tree: " + String.format("O(%4.3f)", n);
		}
		else if(smallest == prop2) {
			bigO += "The approximated big O notation for this binary tree: O(n^2)" + "\n";
			bigO += "The big O notation for this binary tree: " + String.format("O(%4.3f)", n2);
		}
		else if(smallest == prop3) {
			bigO += "The actual approximated big O notation for this binary tree: O(log(n))" + "\n";
			bigO += "The theoretical big O notation for this binary tree: " + String.format("O(%4.3f)", logn);
		}
		

		return bigO; 
	}

	/**
 	 * Helper method for calculating the Big O relationship.
 	 * Calculates duration of each recursion of the method.
 	 * 
 	 * @param binaryTreeDatabase BinaryTreeDB object.
 	 * @param focusNode Node object.
 	 * @param key Integer value corresponding to the key of a given node object.
 	 * @param continueSearching Boolean value that tells the method whether or not it needs to continue searching.
 	 * 
 	 * @return time String value that returns data regarding time spent during each recursion of the method.
 	 */
	private String calculateInOrderTimeElapsed(Node focusNode, int key, boolean continueSearching){
		
		String time = "";
		
		//Capture the start time.
		long startTime = System.nanoTime();
		
		// Ignore the recursion loop if the node is already found, or if the node is non existant.
		if (!continueSearching){
			return "";
		} else if (focusNode == null){
			return "";
		}
		
		if (focusNode.leftChild != null){
			time += " ";
			time += calculateInOrderTimeElapsed(focusNode.leftChild, key, continueSearching);
		}
		
		// If the focus node has the desired key, stop searching
		if (focusNode.getKey() == key){
			continueSearching = false;
		}
		
		if (focusNode.rightChild != null){
			time += " ";
			time += calculateInOrderTimeElapsed(focusNode.rightChild, key, continueSearching);
		}
			
		long endTime = System.nanoTime();
		
		time += " ";
		time += (Long.toString(endTime-startTime));
		return time;
	}
	
	/**
	 * Generates a non-duplicate random number list, given a minimumValue, maximumValue, and size.
	 * 
	 * @param minimumValue Integer value corresponding to the minimum possible random value generated.
	 * @param maximumValue Integer value corresponding to the maximum possible random value generated.
	 * 
	 * @return List<int> List type, shuffled to mimic non-duplicate random numbers.
	 */
	private List<Integer> createNonDuplicateRandomNumbers(int minimumValue, int maximumValue, int size){
		
		// Create an instance of ArrayList, with type int.
		ArrayList<Integer> nonDuplicateRandomNumbers = new ArrayList<Integer>();
		
		//Test for errors with provided data.  If there arent enough possible numbers, return null.
		if ((maximumValue - minimumValue) < size){
			
			//There has been an error.
			return null;
			
		}
		
		// For the range of numbers provided.
		// Creates an ArrayList of integers from minimumValue to maximumValue.
		for (int i = minimumValue; i <= maximumValue; i++){
			
			// Add that number to the ArrayList.
			nonDuplicateRandomNumbers.add(i);
		}
		
		// Shuffle the ArrayList, randomizing the numbers.
		Collections.shuffle(nonDuplicateRandomNumbers);
		
		// Return a immutable List object, created from the ArrayList, trimming off unnecessary values.
		return nonDuplicateRandomNumbers.subList(0, size - 1);
	}
	
	/**
	 * Assigns the BinaryTreeDB object.
	 * 
	 * @param binaryTreeDatabaseBinaryTreeDB object.
	 */
	@SuppressWarnings("unchecked")
	public void setBinaryTreeDatabase(BinaryTreeDB binaryTreeDatabase){
		
		this.binaryTreeDatabase = binaryTreeDatabase;
	}
	
	/**
	 * Retrieves the BinaryTreeDB object.
	 * 
	 * @return BinaryTreeDB
	 */
	public BinaryTreeDB getBinaryTreeDatabase(){
		
		return this.binaryTreeDatabase;
	}
	/**
	*finds the node number at given int key
	*@param int key
	*@return int
	*/
	public int findNodeNumber(int key) {
		Node focusNode = this.binaryTreeDatabase.getRootNode();
		int nodeCount = 0;
		
		while(focusNode.getKey() != key) {
		
			if(key < focusNode.getKey()) {
				focusNode = focusNode.leftChild;
			} else {
				focusNode = focusNode.rightChild;
			}	
			if (focusNode == null)
				return nodeCount++; // Maximum nodes.
			nodeCount++;
		}
		return nodeCount++;	
	}
}