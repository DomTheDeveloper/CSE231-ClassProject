package edu.oakland.test.ClassProject.Database;

import edu.oakland.production.ClassProject.Database.*;
import junit.framework.*;
import java.util.*;

public class ArrayListTest extends TestCase {
	
	ArrayListDatabase db;
	
	public void testGetStudent(){
		initTest();
		assertEquals((int)db.getStudent(2), 3000);
	}
	
	public void testSetStudent(){
		initTest();
		db.setStudent(1, 5000);
	 	assertEquals((int)db.getStudent(1), 5000);
	}
	
	public void testRemoveStudent(){
		initTest();
		db.removeStudent(0);
		assertEquals((int)db.getStudent(0), 2000);
	}
	
	public void testReturnSize(){
		initTest();
		assertEquals(db.returnSize(), 3);
	}
	
	public void testTrimSize(){
		initTest();
		db.trimSize();
		assertEquals(db.returnSize(), 3);
	}
	
	public void testClearAllStudents(){
		initTest();
		db.clearAllStudents();
		assertEquals(db.returnSize(), 0);
	}
	
	/**
	* .addStudent() tested within initTest() - no separate test needed
	*/
	public void initTest(){
		db = new ArrayListDatabase(5);
	 	db.addStudent(1000);
	 	db.addStudent(2000);
	 	db.addStudent(3000);
	}
}
