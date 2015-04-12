package edu.oakland.test.ClassProject.Middleware;

// Import Java Util
import java.util.*

// Import BinaryTreeMW.java
import edu.oakland.production.ClassProject.Middleware.BinarTreeMW;

// Import BinaryTreeDB.java & Node.java
import edu.oakland.production.ClassProject.Database.BinarTreeDB;
import edu.oakland.production.ClassProject.Database.Node;

// Import JUnit
import junit.framework.*

/*
 * BinaryTreeMWTest.java
 *
 * @author Joshua Herkness, Middleware
 * @author Trevor Luebbert, Middleware
 * @version Version 1.2
 * @since Version 1.0
 */
public class BinaryTreeMWTest extends TestCase {

	/// Instance variable for a small BinaryTreeDB size.
	private int size = 5;

	/// Integer value of a key to be searchd for.
	private int key1 = 1;

	/// Integer value of a key to be searchd for.
	private int key2 = 3;

	/// Integer value of a key to be searchd for.
	private int key3 = 5;

	/// The correct output for the amount of nodes searched for each key.
	private String nodesSearched = "1 3 5";

	/// Instance of node.
	private Node nodeA;

	/// Instance of node.
	private Node nodeB;

	/// Instance of node.
	private Node nodeC;

	/// Instance of node.
	private Node nodeD;

	/// Instance of node.
	private Node nodeE;

	/// Instanciate a BinaryTreeDB<T> of value type String.
	private BinaryTreeDB<String> binaryTreeDatabase;

	/// Instanciate a BinaryTreeMW object.
	private BinaryTreeMW binaryTreeMiddleware;

	/*
	 * Set up method for the test class.
	 * Runs before each test.
	 */
	public void setUp(){

		// Create nodes
		nodeA = new Node(1, "A");
		nodeB = new Node(2, "B");
		nodeC = new Node(3, "C");
		nodeD = new Node(4, "D");
		nodeE = new Node(5, "E");

		// Create binaryTreeDatabase, with value type String
		binaryTreeDatabase = new BinaryTreeDB<String>();

		// Add nodes to binaryTreeDatabase
		binaryTreeDatabase.addNode(nodeA);
		binaryTreeDatabase.addNode(nodeB);
		binaryTreeDatabase.addNode(nodeC);
		binaryTreeDatabase.addNode(nodeD);
		binaryTreeDatabase.addNode(nodeE);

		// Cunstruct the binaryTreeMiddleware with the binaryTreeDatabase.
		binaryTreeMiddleware = new BinaryTreeMW(binaryTreeDatabase);
	}

	/*
	 * Tests that the BinaryTreeMW class can calulate the correct amount of nodes searched in preorder for three keys.
	 */
	public void testPreorderNodesSearched(){

		// String value of the calculated amount of nodes searched.
		String nodesSearched = binarTreeMiddleware.calculatePreorderNodesSearched(this.key1, this.key2, this.key3);

		// Compare the correct and calculated value of the amount of nodes searched for three keys.
		assertEqauls(this.nodesSearched, nodesSearched);
	}

	/*
	 * Tests that the BinaryTreeMW class can calulate the correct amount of nodes searched in order for three keys.
	 */
	public void testInOrderNodesSearched(){

		// String value of the calculated amount of nodes searched.
		String nodesSearched = binarTreeMiddleware.calculateInOrderNodesSearched(this.key1, this.key2, this.key3);

		// Compare the correct and calculated value of the amount of nodes searched for three keys.
		assertEqauls(this.nodesSearched, nodesSearched);
	}

	/*
	 * Tests that the BinaryTreeMW class can calculate the durration taken to search for three keys in order.
	 */
	public void testInOrderSearchDuration() {

		// Calcualte the search durration for three keys, and store them in a string
		String searchDuration = binaryTreeMiddleware.calculateInOrderSearchDuration(this.key1, this.key2, this.key3);

		// If the string contains something, the calculation is a success.
		boolean pass = false;
		if (searchDuration != "") {
			pass = true;
		}

		// If the calculation was a success, the test is a success.
		assertTrue(pass);
	}

	/*
	 * Tests that the BinaryTreeMW class can calculate the durration taken to search for three keys in preorder.
	 */
	public void testPreorderSearchDuration() {

		// Calcualte the search durration for three keys, and store them in a string
		String searchDuration = binaryTreeMiddleware.calculatePreOrderSearchDuration(this.key1, this.key2, this.key3);

		// If the string contains something, the calculation is a success.
		boolean pass = false;
		if (searchDuration != "") {
			pass = true;
		}

		// If the calculation was a success, the test is a success.
		assertTrue(pass);
	}

	/*
	 * Tests that the BinaryTreeMW class can gather data of the Big O relationship in a binaryTree.
	 */
	public void testCalculateBigORelationship() {

		// Calculate the Big O relationship of the binaryTree.
		String BigO = binaryTreeMiddleware.calculateBigORelationship();

		// If the string contains something, the calculation is a success.
		boolean pass = false;
		if (BigO != "") {
			pass = true;
		}

		// If the calculation was a success, the test is a success.
		assertTrue(pass);
	}
}
