package edu.oakland.production.ClassProject.Database;
/**
*@author Benjamin Dickman
*@version 1.0
*@since 1.0
*/
import java.util.*;
/**
*LinkedList class
*/
public class LinkedListBen {
	
	private LinkedList<Integer> linkList = new LinkedList<Integer>();
	private Random random = new Random();
	/**
	*Method CreateLinkedList creates linked list of size int size
	*@param int size
	*/
	public void createLinkedList(int size){
		for(int i = 0; i < size; i++){
			linkList.push(getRandom());
		}
	}
	/**
	*method getLinkList returns linkList
	*@return LinkedList<Integer>
	*/
	public LinkedList<Integer> getLinkList(){
		return linkList;
	}
	/**
	*method getRandom gets a random integer 
	*@return Integer
	*/
	public Integer getRandom(){
		int hold = random.nextInt(((1000 - 100) + 1) + 100);
		return (Integer)hold;
	}
}