package edu.oakland.test.ClassProject.Database;

import edu.oakland.production.ClassProject.Database.*;
import junit.framework.*;
import java.util.*;

public class ArrayListTest extends TestCase {
	public void testCreate() {
		ArrayListDatabase db = new ArrayListDatabase(5);
	 	db.addStudent(1000);
	 	db.addStudent(2000);
	 	db.addStudent(3000);
	 	System.out.println();
	 	
		db.trimSize();
		assertEquals(db.returnSize(), 3);

	 	db.removeStudent(2); 	
	 	db.setStudent(1, 5000);
	 	//change "5000" if you want assertEquals statement to fail
	 	assertEquals((int)db.getStudent(1), 5000);
	 	System.out.println();
	 	
	 	System.out.print("Number of students: ");
	 	System.out.println(db.returnSize());	

	 	db.clearAllStudents();
	 	assertEquals(db.returnSize(), 0);
	}
}
