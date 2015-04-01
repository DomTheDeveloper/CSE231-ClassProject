package edu.oakland.production.ClassProject.Database;

public class Node<T> {

	int key;
	T val;
	
	Node<T> leftChild;
	Node<T> rightChild;
	
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
	
	public String toString(){
	
		return val + " has a key " + key;
	}
}
