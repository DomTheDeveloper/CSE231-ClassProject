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
public class ArrayListDatabase{
	
	/** Declare arraylist 
	*/
	private ArrayList<Integer> students;
	
	/**Overloaded constructor to create ArrayList object of size "size"
	*/
	ArrayListDatabase(int size){
		students = new ArrayList<Integer>(size);
	}
	
	/**Get Student Method
	* 
	* @param index of student from array
	* @return student from selected index
	*/
	public Integer getStudent(int i){
		return students.get(i);
	}

	/**set Student Method
	* @param index of student from array
	*/
	 public void setStudent(int i, int j){
	 	 students.add(i,j);
	 }
	 
	/**Add student method
	*/
	 public  void addStudent(int i){
	 	 students.add(i);
	 } 

	/**remove Student Method
	* @param index of student from array
	*/
	 public void removeStudent(int i){
	 	 students.remove(i);
	 }
	 
	 
	 public int returnSize(){
	 	 return students.size();
	 }
	 
	 public void clearAllStudents(){
	 	 students.clear();
	 }
}
