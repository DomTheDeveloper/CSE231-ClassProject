package edu.oakland.production.ClassProject.Database;
import java.util.*;

/**
*This is a class for ArrayList 
*Fill the following Data Structures with Random Numbers from 100 to 1000 Each Data St
*ructure shall have (1) 100K elements; (2) 200K elements; (3) 400K elements;
*1.Create an ArrayList
*@author "Arpan Rughani and Bryan Purakal"
*@version "version 1.1"
*@since "152503"
*/
public class ArrayListDatabase{
	/**
	* Declares an Integer arraylist named students.
	*/
	public ArrayList<Integer> students;
	/**
	* Overloaded constructor used to create an ArrayList object of size "size"
	* 
	* @param size Specified size of the array.
	*/
	public ArrayListDatabase(int size){
		students = new ArrayList<Integer>(size);
	}
	/**
	* Returns the element at the specified position in this list.  
	* 
	* @param i The index of the element to return.
	* @return Returns the element at the specified position in this list .
	*/
	public Integer getStudent(int i){
		return students.get(i);
	}
	/**
	* Adds a student onto the arraylist at the specified position.
	* 
	* @param i This is the index of the element to replace.
	* @param j This is the element to be stored at the specified position.
	*/
	 public void setStudent(int i, int j){
	 	 students.set(i,j);
	 }
	/**
	* Appends the specified element to the end of this list.
	* 
	* @param i This is the element to be appended to the list.
	*/
	 public  void addStudent(int i){
	 	 students.add(i);
	 } 
	/**
	* Removes the element at the specified position in this list.
	* 
	* @param i The index of the element to be removed.
	*/
	 public void removeStudent(int i){
	 	 students.remove(i);
	 }
	 /**
	  * Returns the number of elements in this list. 
	  * 
	  * @return The number of elements in this list.
	  */
	 public int returnSize(){
	 	 return students.size();
	 }
	 /**
	  * Removes all of the elements in this list.
	  */	 
	 public void clearAllStudents(){
	 	 students.clear();
	 }
	 /**
	  * Trims the capacity of this ArrayList instance to be the list's current size..
	  */
	 public void trimSize(){
	 	 students.trimToSize();
	 }
}
