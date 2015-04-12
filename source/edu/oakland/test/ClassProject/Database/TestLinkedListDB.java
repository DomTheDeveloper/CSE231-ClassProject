package edu.oakland.test.ClassProject.Database;

import edu.oakland.production.ClassProject.Database.*;
import junit.framework.*;
/**
* .get() method was tested in many of the assertEquals statements.
*/
public class TestLinkedListDB extends TestCase {
	
	LinkedListDB<Integer> list = new LinkedListDB<Integer>();
    
	public void testSize(){
		list.add(10);
    		list.add(22);
    		list.add(30);
    		assertEquals(list.size(), 3);
	}
	
	public void testIsEmpty(){
		assertEquals(list.isEmpty(), true);
	}
	
    	public void testAdd(){
    		list.add(10);
    		assertEquals(list.get(0).getData().intValue(), 10);
    	}
    	
    	public void testInsertFirstLink(){
    		list.insertFirstLink(20);
    		assertEquals(list.get(0).getData().intValue(), 20);
    	}
    	
    	public void testRemoveFirst(){
    		list.add(100);
    		list.add(98);
    		assertEquals(list.removeFirst().intValue(), 98);
    	}
    	
    	public void testFind(){
    		list.add(10);
    		list.add(22);
    		list.add(30);
    		list.add(44);
    		list.add(50);
    		assertEquals(list.find(30).getData().intValue(), 30);
    	}
    	
    	public void testRemoveLink(){
    		list.add(10);
    		list.add(22);
    		list.add(30);
    		list.add(44);
    		list.add(50);
    		assertEquals(list.removeLink(44).getData().intValue(), 44);
    	}
    	
    	public void testSet(){
    		list.add(10);
    		list.add(22);
    		list.add(30);
    		list.set(1, 100);
    		assertEquals(list.get(1).getData().intValue(), 100);
    	}
}
