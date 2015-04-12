package edu.oakland.test.ClassProject.Database;

import edu.oakland.production.ClassProject.Database.*;
import junit.framework.*;
/**
 * @version "version 2.0" "20150104"
 * @author Sam Bell and Binh Ton
 */
public class TestStack extends TestCase{
	
	Student student1 = new Student(677422, "Jones", "IT", 3.82, 95);
	Student student2 = new Student(177993, "Smith", "IT", 3.47, 78);
	StackCut stackcut = new StackCut(5);
	
	public void testPush() {
		Object compare = stackcut.push(student1.getID()); 
		assertEquals(677422, compare);
	}
	
	public void testPeek() {
		stackcut.push(student2.getID());
		Object compare = stackcut.peek();
		assertEquals(177993, compare);
	}
	
	public void testDisplayStacks() {
		stackcut.push(student1.getID());
		stackcut.push(student2.getID());
		stackcut.push(340312);
		stackcut.push(843098);
		stackcut.push(954037);
		stackcut.displayStacks();
	}
	
	public void testPop() {
		stackcut.push(student1.getID());
		stackcut.push(student2.getID());
		stackcut.pop();
		Object compare = stackcut.peek();
		assertEquals(677422, compare);
	}
	
	public void testClone() {
		stackcut.push(student1.getID());
		stackcut.push(student2.getID());
		stackcut.push(340312);
		stackcut.push(843098);
		stackcut.push(954037);
		StackCut newStack = stackcut.clone();
		newStack.displayStacks();
		assertEquals(stackcut, newStack);
	}
	
	public void testGetSize() {
		stackcut.push(student1.getID());
		stackcut.push(student2.getID());
		stackcut.push(340312);
		stackcut.push(843098);
		stackcut.push(954037);
		int size = stackcut.getSize();
		assertEquals(5, size);
	}	
}
