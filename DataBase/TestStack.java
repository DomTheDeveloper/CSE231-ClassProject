package edu.oakland.test;

import edu.oakland.production.*;
import edu.oakland.helper.*;
import junit.framework.*;

public class TestStack extends TestCase{
	/*private int getID;*/
	private int firstStudent = 677422;
	private int lastStudent = 177993;
	public void testStack(){
		Student student1 = new Student(677422, "Jones", "IT", 3.82, 95);
		Student student2 = new Student(177993, "Smith", "IT", 3.47, 78);
		StackCut someStack = new StackCut(5);
		stackcut.push(student1.getID());
		int compares2 = stackcut.peek();
		assertEquals(firstStudent, compares2);
		stackcut.push(student2.getID());
		System.out.println(stackcut.peek());
		stackcut.displayStacks();
		int compares = stackcut.pop();
		assertEquals(lastStudent, compares);
	}
	/*
	public int getID(){
		return getID;
	}*/
	
}