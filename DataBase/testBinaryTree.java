package edu.oakland.test;

import edu.oakland.production.*;
import junit.framework.*;

/** This class utilizes JUnit to test the ATM's ability to verify whether
* sufficient funds are in a bank account prior to withdrawal.
*@author "Bryan Jagielo CSE231"
*@version "1.1" dated 150329
*@since version 1.0 dated 150329
*/
public class testBinaryTree extends TestCase{
	BinaryTree tree;
	/** The testAdd() method tests whether the binary tree may add a node to
	* the existing set of nodes that it contains 
	*/
	public void testAdd(){
		initTest();
		String name = "Brett";
		int key = 4;
		tree.addNode(key,name);
		Node<String> foundNode = tree.findNode(key);
		String nodeString = foundNode.toString();
		assertTrue(nodeString.equals(name + " has a key " + key));
	}
	/** The testRemove() method tests whether the binary tree may remove a
	* node from its existing set of nodes.
	*/
	public void testRemove(){
		initTest();
		String name = "John";
		int key = 1;
		tree.remove(key);
		Node<String> foundNode = tree.findNode(key);
		assertEquals(null,foundNode);
	}
	/** The testFind() method tests whether the binary tree may find a node
	* using a key.
	*/
	public void testFind(){
		initTest();
		String name = "John";
		int key = 1;
		Node<String> foundNode = tree.findNode(key);
		String nodeString = foundNode.toString();
		assertTrue(nodeString.equals(name + " has a key " + key));
	}
	/** The initTest() method initializes a standard binary tree and
	* populates it with nodes in order to prepare the class for each test.
	*/
	public void initTest(){
		tree = new BinaryTree<String>();
		tree.addNode(0,"Tim");
		tree.addNode(1,"John");
		tree.addNode(2,"Jim");
	}
}