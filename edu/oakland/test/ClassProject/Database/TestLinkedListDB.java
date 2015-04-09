package edu.oakland.test.ClassProject.Database;

import edu.oakland.production.ClassProject.Database.*;
import junit.framework.*;

public class TestLinkedListDB extends TestCase {
	public void testCreate() {
		LinkedListDB<Integer> list = new LinkedListDB<Integer>();
		
        // add elements to LinkedList
        list.add(10);
        list.add(22);
        list.add(30);
        list.add(44);
        list.add(50);
 
        //checks if 5th element = 10 - then it was added properly
        assertEquals(list.get(4).getData().intValue(), 10);
        
        System.out.println("LinkedList size: " + list.size());
        System.out.println("Get 3rd element: " + list.get(2));
        System.out.println("Remove First element: " + list.removeFirst());
        System.out.println("LinkedList size: " + list.size());
        
        list.set(1, 100);
        //checks if 2nd element = 100 - then it was set properly
        assertEquals(list.get(1).getData().intValue(), 100);
        
        System.out.println("LinkedList size: " + list.size());
    }
}