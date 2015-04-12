package edu.oakland.production.ClassProject.Database;
/**
* Used with Binary Tree Database class.
*/

public class Node<T> {

	int key;
	T val;
	
	public Node<T> leftChild;
	public Node<T> rightChild;
	
	Node(int key, T value){
	
		this.key = key;
		
		this.val = value;
	}
	
	public T getValue(){
		return val;
	}
	
	public int getKey(){
		return key;
	}
	@Override
	public String toString(){
		return val + " has a key " + key;
	}
}
