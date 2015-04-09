package edu.oakland.production.ClassProject.Middleware;

import java.util.*;


/**
*@author Eldari Gogiashvili
*@version version 1.0.1 date 150331
*since version 1.0.0
*/

/**
*This class represents the middleware
*/

public class ArrayListDatabase{
	
	ArrayList<Integer> students;
	
	ArrayListDatabase(int size){
		students = new ArrayList<Integer>(size);
	}
	

	public Integer getStudent(int i){
		return students.get(i);
	}


	 public void setStudent(int i, int j){
	 	 students.add(i,j);
	 }
	 

	 public  void addStudent(int i){
	 	 students.add(i);
	 } 


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
/**
*This class was created for Middleware.
*/