package edu.oakland.production.ClassProject.Database;

import java.util.*;

/**
* This is a class for ArrayList 
*Fill the following Data Structures with Random Numbers from 100 to 1000 Each Data St
*ructure shall have (1) 100K elements; (2) 200K elements; (3) 400K elements;
*1.Create an ArrayList
*@author "Arpan Rughani and Bryan Purakal"
*@version "version 1.1"
*@since "152503"
*/
public class ArrayListDatabase<T>{
	
	/** Declare arraylist 
	*/

	//private static int students;
	
	private ArrayList<T> students;
	/**Overloaded constructor to create ArrayList object of size "size"
	*/
	public ArrayListDatabase(int size){
		students = new ArrayList<T>(size);
	}
	
	/**Get Student Method
	* 
	* @param index of student from array
	* @return student from selected index
	*/
	public T getStudent(int i){
		return students.get(i);
	}

	/**set Student Method
	* @param index of student from array
	*/
	
	 public void set(int i, T obj){
	 	 students.add(i,obj);
	 	 System.out.println("Student: " + obj + " has been added");
	 }// change the array list
	 
	/**Add student method
	*/
	 public  void add(T obj){
	 	 students.add(obj);
	 	 System.out.println("Student: " + obj + " has been added");
	 
	 } //This is to add to the end of the array list

	/**remove Student Method
	* @param index of student from array
	*/
	 public void remove(int i){
	 	 students.remove(i);
	 	 System.out.println("Student #" + i + " has been removed");
	 }
	 
	 public int returnSize(){
	 	 return students.size(); 
	 }
	 
	 public void clearAll(){
	 	 students.clear();
	 	 System.out.println("Cleared all students");
	 	 
	 }
}
