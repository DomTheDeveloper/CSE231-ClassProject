package edu.oakland.production.ClassProject.Middleware;

//Import java util framework
import java.util.*;

//Import Middleware stuff.
//import edu.oakland.production.ClassProject.Middleware.*;

//Import BinaryTree.java
import edu.oakland.production.database.*;


/*
 * Middleware Part 1B.  Purpose is to experiment with BinaryTrees'.
 * 
 * @author Joshua Herkness, Trevor Luebbert Middleware
 * @version version 1.1
 * @since version 1.0
 */
public class Middleware {
	
	/// Minimum possible key value, used with generating a random key.
	private int minimumKeyValue = 400000;
	/// Maximum possible key value, used with generating a random key.
	private int maximumKeyValue = 800000;
	
	/// Minimum possible name value, used with generating a random name.
	private int minimumNameValue = 200000;
	/// Maximum possible key value, used with generating a random name.
	private int maximumNameValue = 600000;
	
	Database database;
	
	/*
	 * Default constructor for the Middleware Class.
	 * 
	 * @param database Database object.
	 * 
	 * @returns Middleware
	 */
	public Middleware(Database database){
		
		//Link the database 
		this.database = database
	}
	
	/*
	 * Creates a binary tree inside the database given a size, then populates it with non-duplicate random integer and string values.
	 * 
	 * @param size Integer value corresponding to the size of the binary tree.
	 */
	public void createBinaryTree(int size){
		
		database.createBinaryTree(size);
		
		BinaryTree binaryTree = database.getBinaryTree();
		
		populateBinaryTree(binaryTree, size);
	}
	
	/*
	 * Populates a BinaryTree object with a given size, with a key and 
	 * name for each node with a non-duplicate random number.
	 * 
	 * @param binaryTree BinaryTree object, located within the database.
	 * @param size Integer value corresponding to the size of the binary tree.
	 * 
	 */
	private void populateBinaryTree(BinaryTree binaryTree, int size){
		
		binaryTree = new BinaryTree();
		
		// Create a non-duplicate random number list for keys.
		List<int> nonDuplicateRandomNumberKeys = new List<int>();
		// Create a non-duplicate random number list for names.
		List<int> nonDuplicateRandomNumberNames = new List<int>();
		
		// Populate both key and name lists.
		nonDuplicateRandomNumberKeys = nonDuplicateRandomNumbers(minimumKeyValue, maximumKeyValue, size);
		nonDuplicateRandomNumberNames = nonDuplicateRandomNumbers(minimumNameValue, maximumNameValue, size);
		
		for (int i = 0; i < size; i++){
			
			// Reference key integer from a given index.
			int key = nonDuplicateRandomNumberKeys.get(i);
			// Reference name integer from a given index, then convert to a string.
			String name = Integer.toString(nonDuplicateRandomNumberNames.get(i));
			
			// Add a node to the BinaryTree, given the key and name.
			binaryTree.addNode(key, name);	
			
		}
	}
	
	/*
	 * Searches for three integer key values, and provide a record of the amount of nodes searched through, durring a preorder search, for each key searched.
	 * 
	 * @param key1 Integer value corresponding to a key value.
	 * @param key2 Integer value corresponding to a key value.
	 * @param key3 Integer value corresponding to a key value.
	 * 
	 * @returns nodesSearched String value corresponding to the number of nodes searched respectively.
	 */
	public String calculatePreorderNodesSearched(int key1, int key2, int key3){
		
		String nodesSearched = "";
		
		BinaryTree binaryTree = this.database.getBinaryTree();
		Node focusNode = binaryTree.getRootNode();
		
		nodesSearched += Integer.toString(calculatePreorderNodesSearched(binaryTree, focusNode, key1));
		nodesSearched += " ";
		
		nodesSearched += Integer.toString(calculatePreorderNodesSearched(binaryTree, focusNode, key2));
		nodesSearched += " ";
		
		nodesSearched += Integer.toString(calculatePreorderNodesSearched(binaryTree, focusNode, key3));
		
		return nodesSearched;
	}
	
	/*
	 * Searches for three integer key values, and provide a record of the amount of nodes searched through, durring a in order search, for each key searched.
	 * 
	 * @param key1 Integer value corresponding to a key value.
	 * @param key2 Integer value corresponding to a key value.
	 * @param key3 Integer value corresponding to a key value.
	 * 
	 * @returns nodesSearched String value corresponding to the number of nodes searched respectively.
	 */
	public String calculateInOrderNodesSearched(int key1, int key2, int key3){
		
		String nodesSearched = "";
		
		BinaryTree binaryTree = this.database.getBinaryTree();
		Node focusNode = binaryTree.getRootNode();
		
		nodesSearched += Integer.toString(calculateInOrderNodesSearched(binaryTree, focusNode, key1));
		nodesSearched += " ";
		
		nodesSearched += Integer.toString(calculateInOrderNodesSearched(binaryTree, focusNode, key2));
		nodesSearched += " ";
		
		nodesSearched += Integer.toString(calculateInOrderNodesSearched(binaryTree, focusNode, key3));
		
		return nodesSearched;
	}
	
	/*
	 * Calculates the amount of nodes searched in a preorder search, for locating a given key.
	 * 
	 * @param binaryTree BinaryTree object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * 
	 * @returns int Integer type corresponding to the number of nodes searched through.
	 */
	private int calculatePreorderNodesSearched(BinaryTree binaryTree, Node focusNode, int key){
		
		int nodesSearched = calculatePreorderNodesSearched(binaryTree, focusNode, key, true);
		
		return nodesSearched;
		
	}
	
	/*
	 * Helper recursive method used to calculates the amount of nodes searched in a preorder search, for locating a given key.
	 * 
	 * @param binaryTree BinaryTree object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * @param continueSearch Boolean value corresponding to whether the node has been located.
	 * 
	 * @returns int Integer type corresponding to the number of nodes searched through.
	 */
	private int calculatePreorderNodesSearched(BinaryTree binaryTree, Node focusNode, int key, boolean continueSearching){
		
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
		
		// If the focus node has the desired key, increament the amount of nodesSearched, and 
		if (focusNode.getKey() == key){
			
			continueSearching = false;
			return nodesSearched;
			
		}
		
		if (focusNode.leftNode != null){
			nodesSearched += calculatePreorderNodesSearched(binaryTree, focusNode.leftNode, key, continueSearching);
		}
		
		if (focusNode.rightNode != null){
			nodesSearched += calculatePreorderNodesSearched(binaryTree, focusNode.righNode, key, continueSearching);
		}
			
		return nodesSearched;
			
	}
	
	/*
	 * Calculates the amount of nodes searched in an in order search, for locating a given key.
	 * 
	 * @param binaryTree BinaryTree object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * 
	 * @returns int Integer type corresponding to the number of nodes searched through.
	 */
	private int calculateInOrderNodesSearched(BinaryTree binaryTree, Node focusNode, String name){
		
		int nodesSearched = calculateInOrderNodesSearched(binaryTree, focusNode, key, true);
		
		return nodesSearched;
	}
	
	/*
	 * Helper recursive method used to calculates the amount of nodes searched in an in order search, for locating a given key.
	 * 
	 * @param binaryTree BinaryTree object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * @param continueSearch Boolean value corresponding to whether the node has been located.
	 * 
	 * @returns int Integer type corresponding to the number of nodes searched through.
	 */
	private int calculateInOrderNodesSearched(BinaryTree binaryTree, Node focusNode, String name, boolean continueSearching){
		
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
		
		if (focusNode.leftNode != null){
			nodesSearched += calculateInOrderNodesSearched(binaryTree, focusNode.leftNode, key, continueSearching);
		}
		
		// If the focus node has the desired key, increament the amount of nodesSearched, and 
		if (focusNode.getKey() == key){
			
			continueSearching = false;
			return nodesSearched;
			
		}
		
		if (focusNode.rightNode != null){
			nodesSearched += calculateInOrderNodesSearched(binaryTree, focusNode.righNode, key, continueSearching);
		}
			
		return nodesSearched;
	}
	
	/*
	 * Calculates the amount of time (in milliseconds) needed to conduct a preorder search on three given keys.
	 * 
	 * @param key1 Integer value corresponding to a key value.
	 * @param key2 Integer value corresponding to a key value.
	 * @param key3 Integer value corresponding to a key value.
	 * 
	 * @returns duration String value corresponding to the time elapsed durring the searches.
	 */
	public String calculatePreorderSearchDuration(int key1, int key2, int key3){
		
		String duration = "";
		
		BinaryTree binaryTree = this.database.getBinaryTree();
		Node focusNode = binaryTree.getRootNode();
		
		duration += Double.toString(calculatePreorderSearchDuration(binaryTree, focusNode, key1));
		duration += " ";
		
		duration += Double.toString(calculatePreorderSearchDuration(binaryTree, focusNode, key2));
		duration += " ";
		
		duration += Double.toString(calculatePreorderSearchDuration(binaryTree, focusNode, key3));
		
		return duration;
	}
	
	/*
	 * Calculates the amount of time (in milliseconds) needed to conduct a preorder search on three given keys.
	 * 
	 * @param key1 Integer value corresponding to a key value.
	 * @param key2 Integer value corresponding to a key value.
	 * @param key3 Integer value corresponding to a key value.
	 * 
	 * @returns duration String value corresponding to the time elapsed durring the searches.
	 */
	public String calculateInOrderSearchDuration(int key1, int key2, int key3){
		
		String duration = "";
		
		BinaryTree binaryTree = this.database.getBinaryTree();
		Node focusNode = binaryTree.getRootNode();
		
		duration += Double.toString(calculateInOrderSearchDuration(binaryTree, focusNode, key1));
		duration += " ";
		
		duration += Double.toString(calculateInOrderSearchDuration(binaryTree, focusNode, key2));
		duration += " ";
		
		duration += Double.toString(calculateInOrderSearchDuration(binaryTree, focusNode, key3));
		
		return duration;
	}
	
	/*
	 * Calculates the amount of time (in milliseconds) needed to conduct a preorder search on a given key.
	 * 
	 * @param binaryTree BinaryTree object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * 
	 * @returns double Double type corresponding to time taken to search the binaryTree.
	 */
	private double calculatePreorderSearchDuration(BinaryTree binaryTree, Node focusNode, int key){
		
		double startTime = System.currentTimeMillis();
		int temporary = calculatePreorderNodesSearched(binaryTree, focusNode, key);
		double endTime = System.currentTimeMillis();
		
		return (endTime - startTime);
	}
	
	/*
	 * Calculates the amount of time (in milliseconds) needed to conduct an in order search on a given key.
	 * 
	 * @param binaryTree BinaryTree object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param name String value corresponding with desired search value.
	 * 
	 * @returns double Double type corresponding to time taken to search the binaryTree.
	 */
	private double calculateInOrderSearchDuration(BinaryTree binaryTree, Node focusNode, String name){
		
		double startTime = System.currentTimeMillis();
		int temporary = calculateInOrderNodesSearched(binaryTree, focusNode, key);
		double endTime = System.currentTimeMillis();
		
		return (endTime - startTime);
	}
	
	/*
	 * Description.  Not working just yet.
	 * 
	 * @param binaryTree BinaryTree object.
	 * 
	 * @returns String String corresponding to the big O relationship for the binary tree.
	 */
	public String calculateBigORelationship(BinaryTree binaryTree){
		
	}
	
	/*
	 * Generates a non-duplicate random number list, given a minimumValue, maximumValue, and size.
	 * 
	 * @param minimumValue Integer value corresponding to the minimum possible random value generated.
	 * @param maximumValue Integer value corresponding to the maximum possible random value generated.
	 * 
	 * @returns List<int> List type, shuffled to mimic non-duplicate random numbers.
	 */
	private List<int> createNonDuplicateRandomNumbers(int minimumValue, int maximumValue, int size){
		
		// Create an instance of ArrayList, with type int.
		ArrayList<int> nonDuplicateRandomNumbers = new ArrayList<int>();
		
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
	 * Retrieves the database object.
	 * 
	 * @returns database Database object.
	 */
	public Database getDatabase(){
		return this.database;
	}
	
	/*
	 * Modifies the database object stored in Middleware.
	 * 
	 * @param database Database object corresponding to the new database.
	 */
	public void setDatabase(Database database){
		this.database = database;
	}
}