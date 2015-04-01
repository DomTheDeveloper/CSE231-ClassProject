package edu.oakland.test;

import edu.oakland.production.*;
import junit.framework.*;
/**
 * @version "version 2.0" "20150104"
 * @author Sam Bell and Binh Ton
 */
public class TestStack extends TestCase{
	/*private int getID;*/
	private Object firstStudent = 677422;
	private Object lastStudent = 177993;
	
	public void testStack(){
		Student student1 = new Student(677422, "Jones", "IT", 3.82, 95);
		Student student2 = new Student(177993, "Smith", "IT", 3.47, 78);
		StackCut stackcut = new StackCut(5);
		stackcut.push(student1.getID());
		Object compares2 = stackcut.peek();
		assertEquals(firstStudent, compares2);
		stackcut.push(student2.getID());
		System.out.println(stackcut.peek());
		stackcut.displayStacks();
		Object compares = stackcut.pop();
		//assertEquals(lastStudent, compares); //this is meant to fail
	}
	/*
	public int getID(){
		return getID;
	}*/
	
}