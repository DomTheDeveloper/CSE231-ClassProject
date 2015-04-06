package edu.oakland.production.ClassProject.Middleware;

//Import java util framework
import java.util.*;

//Import BinaryTreeDB.java & Node.java
import edu.oakland.production.ClassProject.Database.*;


/*
 * BinaryTreeMW.
 * 
 * @author Joshua Herkness, Trevor Luebbert Middleware
 * @version version 2.0
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
	
	/*
	 * Default constructor for the BinaryTreeMW Class.
	 * 
	 * @returns BinaryTreeMW
	 */
	public BinaryTreeMW(){
		
		this.binaryTreeDatabase = new BinaryTreeDB<String>();
	}
	
	/*
	 * Overloaded constructor for the BinaryTreeMW Class.  Popluates the binaryTreeDatabase given a size.
	 * 
	 * @param size Integer value corresponding to the desired size of the BinaryTreeDB object.
	 * 
	 * @returns BinaryTreeMW
	 */
	public BinaryTreeMW(int size){
		
		this.binaryTreeDatabase = new BinaryTreeDB<String>();
		
		// Populates the BinaryTreeDB object
		populateBinaryTreeDB(size);
	}
	
	/*
	 * Populates a private global BinaryTreeDB object with a given amount of nodes.  Creates a non-duplicate random key and name for each node.
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
		nonDuplicateRandomNumberKeys = createNonDuplicateRandomNumbers(minimumKeyValue, maximumKeyValue, size);
		nonDuplicateRandomNumberNames = createNonDuplicateRandomNumbers(minimumNameValue, maximumNameValue, size);
		
		for (int i = 0; i < size; i++){
			
			// Reference key integer from a given index.
			int key = nonDuplicateRandomNumberKeys.get(i);
			// Reference name integer from a given index, then convert to a string.
			String name = String.valueOf(nonDuplicateRandomNumberNames.get(i));
			
			// Add a node to the BinaryTreeDB, given the key and name.
			this.binaryTreeDatabase.addNode(key, name);	
			
		}
	}
	
	/*
	 * Searches for three integer key values, providing a record of the amount of nodes searched durring a preorder search.
	 * 
	 * @param key1 Integer value corresponding to a key value.
	 * @param key2 Integer value corresponding to a key value.
	 * @param key3 Integer value corresponding to a key value.
	 * 
	 * @returns nodesSearched String value corresponding to the number of nodes searched respectively.
	 */
	public String calculatePreorderNodesSearched(int key1, int key2, int key3){
		
		String nodesSearched = "";
		
		Node focusNode = this.binaryTreeDatabase.getRootNode();
		
		nodesSearched += String.valueOf(calculatePreorderNodesSearched(this.binaryTreeDatabase, focusNode, key1));
		nodesSearched += " ";
		
		nodesSearched += String.valueOf(calculatePreorderNodesSearched(this.binaryTreeDatabase, focusNode, key2));
		nodesSearched += " ";
		
		nodesSearched += String.valueOf(calculatePreorderNodesSearched(this.binaryTreeDatabase, focusNode, key3));
		
		return nodesSearched;
	}
	
	/*
	 * Searches for three integer key values, providing a record of the amount of nodes searched durring an in order search.
	 * 
	 * @param key1 Integer value corresponding to a key value.
	 * @param key2 Integer value corresponding to a key value.
	 * @param key3 Integer value corresponding to a key value.
	 * 
	 * @returns nodesSearched String value corresponding to the number of nodes searched respectively.
	 */
	public String calculateInOrderNodesSearched(int key1, int key2, int key3){
		
		String nodesSearched = "";
		
		Node focusNode = this.binaryTreeDatabase.getRootNode();
		
		nodesSearched += String.valueOf(calculateInOrderNodesSearched(this.binaryTreeDatabase, focusNode, key1));
		nodesSearched += " ";
		
		nodesSearched += String.valueOf(calculateInOrderNodesSearched(this.binaryTreeDatabase, focusNode, key2));
		nodesSearched += " ";
		
		nodesSearched += String.valueOf(calculateInOrderNodesSearched(this.binaryTreeDatabase, focusNode, key3));
		
		return nodesSearched;
	}
	
	/*
	 * Calculates the amount of nodes searched for locating a given key using a preorder search.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * 
	 * @returns int Integer type corresponding to the number of nodes searched through.
	 */
	private int calculatePreorderNodesSearched(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key){
		
		int nodesSearched = calculatePreorderNodesSearched(binaryTreeDatabase, focusNode, key, true);
		
		return nodesSearched;
		
	}
	
	/*
	 * Helper recursive method used to calculates the amount of nodes searched for locating a given key using a preorder search.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * @param continueSearch Boolean value corresponding to whether the node has been located.
	 * 
	 * @returns int Integer type corresponding to the number of nodes searched through.
	 */
	private int calculatePreorderNodesSearched(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key, boolean continueSearching){
		
		// Begin each recursion with zero nodes searched.
		int nodesSearched = 0;
		
		// Ignore the recursion loop if the node is already found, or if the node is non existant.
		if (!continueSearching){
			return 0;
		} else if (focusNode == null){
			return 0;
		} else {
			// Count the node.
			nodesSearched++;
		}
		
		// If the focus node has the desired key, increament the amount of nodesSearched, and skip all other recursions.
		if (focusNode.getKey() == key){
			
			continueSearching = false;
			return nodesSearched;
			
		}
		
		if (focusNode.leftChild != null){
			nodesSearched += calculatePreorderNodesSearched(binaryTreeDatabase, focusNode.leftChild, key, continueSearching);
		}
		
		if (focusNode.rightChild != null){
			nodesSearched += calculatePreorderNodesSearched(binaryTreeDatabase, focusNode.rightChild, key, continueSearching);
		}
			
		return nodesSearched;
			
	}
	
	/*
	 * Calculates the amount of nodes searched for locating a given key using an in order search.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * 
	 * @returns int Integer type corresponding to the number of nodes searched through.
	 */
	private int calculateInOrderNodesSearched(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key){
		
		int nodesSearched = calculateInOrderNodesSearched(binaryTreeDatabase, focusNode, key, true);
		
		return nodesSearched;
	}
	
	/*
	 * Helper recursive method used to calculates the amount of nodes searched for locating a given key using an in order search.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * @param continueSearch Boolean value corresponding to whether the node has been located.
	 * 
	 * @returns int Integer type corresponding to the number of nodes searched through.
	 */
	private int calculateInOrderNodesSearched(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key, boolean continueSearching){
		
		// Begin each recursion with zero nodes searched.
		int nodesSearched = 0;
		
		// Ignore the recursion loop if the node is already found, or if the node is non existant.
		if (!continueSearching){
			return 0;
		} else if (focusNode == null){
			return 0;
		} else {
			// Count the node.
			nodesSearched++;
		}
		
		if (focusNode.leftChild != null){
			nodesSearched += calculateInOrderNodesSearched(binaryTreeDatabase, focusNode.leftChild, key, continueSearching);
		}
		
		// If the focus node has the desired key, increament the amount of nodesSearched, and 
		if (focusNode.getKey() == key){
			
			continueSearching = false;
			return nodesSearched;
			
		}
		
		if (focusNode.rightChild != null){
			nodesSearched += calculateInOrderNodesSearched(binaryTreeDatabase, focusNode.rightChild, key, continueSearching);
		}
			
		return nodesSearched;
	}
	
	/*
	 * Calculates the amount of time (in milliseconds) needed to conduct a preorder search on each of the three integer keys provided.
	 * 
	 * @param key1 Integer value corresponding to a key value.
	 * @param key2 Integer value corresponding to a key value.
	 * @param key3 Integer value corresponding to a key value.
	 * 
	 * @returns duration String value corresponding to the time elapsed durring each of the searches respectively.
	 */
	public String calculatePreorderSearchDuration(int key1, int key2, int key3){
		
		String duration = "";
		
		Node focusNode = this.binaryTreeDatabase.getRootNode();
		
		duration += Double.toString(calculatePreorderSearchDuration(this.binaryTreeDatabase, focusNode, key1));
		duration += " ";
		
		duration += Double.toString(calculatePreorderSearchDuration(this.binaryTreeDatabase, focusNode, key2));
		duration += " ";
		
		duration += Double.toString(calculatePreorderSearchDuration(this.binaryTreeDatabase, focusNode, key3));
		
		return duration;
	}
	
	/*
	 * Calculates the amount of time (in milliseconds) needed to conduct an in order search on each of the three integer keys provided.
	 * 
	 * @param key1 Integer value corresponding to a key value.
	 * @param key2 Integer value corresponding to a key value.
	 * @param key3 Integer value corresponding to a key value.
	 * 
	 * @returns duration String value corresponding to the time elapsed durring each of the searches respectively.
	 */
	public String calculateInOrderSearchDuration(int key1, int key2, int key3){
		
		String duration = "";
		
		Node focusNode = this.binaryTreeDatabase.getRootNode();
		
		duration += Double.toString(calculateInOrderSearchDuration(this.binaryTreeDatabase, focusNode, key1));
		duration += " ";
		
		duration += Double.toString(calculateInOrderSearchDuration(this.binaryTreeDatabase, focusNode, key2));
		duration += " ";
		
		duration += Double.toString(calculateInOrderSearchDuration(this.binaryTreeDatabase, focusNode, key3));
		
		return duration;
	}
	
	/*
	 * Calculates the amount of time (in milliseconds) needed to conduct a preorder search on the integer key provided.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * 
	 * @returns double Double type corresponding to time taken to search the binaryTreeDatabase.
	 */
	private double calculatePreorderSearchDuration(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key){
		
		double startTime = System.currentTimeMillis();
		int temporary = calculatePreorderNodesSearched(binaryTreeDatabase, focusNode, key);
		double endTime = System.currentTimeMillis();
		
		return (endTime - startTime);
	}
	
	/*
	 * Calculates the amount of time (in milliseconds) needed to conduct an in order search on the key provided.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * 
	 * @returns double Double type corresponding to time taken to search the binaryTreeDatabase.
	 */
	private double calculateInOrderSearchDuration(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key){
		
		double startTime = System.currentTimeMillis();
		int temporary = calculateInOrderNodesSearched(binaryTreeDatabase, focusNode, key);
		double endTime = System.currentTimeMillis();
		
		return (endTime - startTime);
	}
	
	/*
 	 * Gathers data for the BigO notaion, returning a string of the duration spent searching after each recursion, as well as the description of the notation.
	 * 
 	 * @returns bigO String value corresponding to the big O notation and data set as proof.
	 */
	public String calculateBigORelationship(){
		
		Node focusNode = this.binaryTreeDatabase.getRootNode();
		
		String bigO = "";
		
		// Description of the BigO notation.
		bigO += "After each recursion, the time spent searching is halved" +
			"since you can only move down either the left or right child nodes." +
			"This halving of the data can be represented as O (log N)";
		
		// Introduction to the data set
		bigO += "\nThe time spent searching during each recursion are as follows:\n";
		
		//the key is -1 so the search method goes through the entire tree
		bigO += calculateInOrderTimeElapsed(focusNode, -1, true);
		
		return bigO; 
	}

	/*
 	 * Calculates durration of each recursion of the method.
 	 * 
 	 * @param binaryTreeDatabase BinaryTreeDB object.
 	 * @param focusNode Node object.
 	 * @param key Integer value corresponding to the key of a given node object.
 	 * @param continueSearching Boolean value that tells the method whether or not it needs to continue searching.
 	 * 
 	 * @returns time String value that returns data regarding time spent during each recursion of the method.
 	 */
	private String calculateInOrderTimeElapsed(Node focusNode, int key, boolean continueSearching){
		
		String time = "";
		
		//Capture the start time.
		double startTime = System.currentTimeMillis();
		
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
		if (focusNode.getKey == key){
			continueSearching = false;
		}
		
		if (focusNode.rightChild != null){
			time += " ";
			time += calculateInOrderTimeElapsed(focusNode.rightChild, key, continueSearching);
		}
			
		double endTime = System.currentTimeMillis();
		
		time += " ";
		time += (Double.toString(endTime-startTime));
		return time;
	}
	
	/*
	 * Generates a non-duplicate random number list, given a minimumValue, maximumValue, and size.
	 * 
	 * @param minimumValue Integer value corresponding to the minimum possible random value generated.
	 * @param maximumValue Integer value corresponding to the maximum possible random value generated.
	 * 
	 * @returns List<int> List type, shuffled to mimic non-duplicate random numbers.
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
	
	/*
	 * Retrieves the BinaryTreeDatabaseObject.
	 * 
	 * @returns BinaryTreeDB
	 */
	public BinaryTreeDB getBinaryTreeDatabase(){
		
		return this.binaryTreeDatabase;
	}
}