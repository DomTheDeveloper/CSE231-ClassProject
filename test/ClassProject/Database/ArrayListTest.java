package edu.oakland.test.ClassProject.Database;

import edu.oakland.production.ClassProject.Database.*;
import junit.framework.*;
import java.util.*;

public class ArrayListTest extends TestCase {
	public void testCreate() {
		ArrayListDatabase<String> db = new ArrayListDatabase<String>(5);
	 	db.add("Arpan");
	 	db.add("Alexa");
	 	db.add("Nick");
	 	System.out.println();
	 	
	 	db.remove(2); 	
	 	db.set(1, "Bryan");
	 	//change "Bryan" if you want assertEquals statement to fail
	 	assertEquals("Bryan", db.getStudent(1));
	 	System.out.println();
	 	
	 	System.out.print("Number of students:");
	 	System.out.println(db.returnSize());	

	 	db.clearAll();
	 	assertEquals(db.returnSize(), 0);
	}
}