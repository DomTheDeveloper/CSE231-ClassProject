package edu.oakland.test.ClassProject.Database;

import edu.oakland.production.ClassProject.Database.*;
import junit.framework.*;
/**
 * .push() tested within initTest()
 * 
 * @version "version 2.0" "20150104"
 * @author Sam Bell and Binh Ton
 */
public class TestStack extends TestCase{
	
	Student student1;
	Student student2;
	StackCut stackcut;

	
	public void testPeek() {
		initTest();
		assertEquals(954037, stackcut.peek());
	}
	
	public void testDisplayStacks() {
		initTest();
		stackcut.displayStacks();
	}
	
	public void testPop() {
		initTest();
		stackcut.pop();
		assertEquals(843098, stackcut.peek());
	}
	
	public void testClone() {
		initTest();
		StackCut newStack = stackcut.clone();
		newStack.displayStacks();
		assertEquals(stackcut, newStack);
	}
	
	public void testGetSize() {
		initTest();
		int size = stackcut.getSize();
		assertEquals(5, size);
	}	
	
	public void initTest(){
		student1 = new Student(677422, "Jones", "IT", 3.82, 95);
		student2 = new Student(177993, "Smith", "IT", 3.47, 78);
		stackcut = new StackCut(5);
		
		stackcut.push(student1.getID());
		stackcut.push(student2.getID());
		stackcut.push(340312);
		stackcut.push(843098);
		stackcut.push(954037);
	}
}
