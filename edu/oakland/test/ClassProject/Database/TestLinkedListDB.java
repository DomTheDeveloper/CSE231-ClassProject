package edu.oakland.test.ClassProject.Database;

import edu.oakland.production.ClassProject.Database.*;
import junit.framework.*;

public class TestLinkedListDB extends TestCase {
	public void testCreate() {
		LinkedListDB list = new LinkedListDB();
		
        // add elements to LinkedList
        list.add(10);
        list.add(22);
        list.add(30);
        list.add(44);
        list.add(50);
 
        //checks if 5th element = 50 - then it was added properly
        assertEquals(list.get(5), 50);
        
        System.out.println("LinkedList size: " + list.size());
        System.out.println("Get 3rd element: " + list.get(3));
        System.out.println("Remove 4nd element: " + list.remove(4));
        System.out.println("LinkedList size: " + list.size());
        
        list.set(2, 100);
        //checks if 2nd element = 100 - then it was set properly
        assertEquals(list.get(2), 100);
        
        System.out.println("LinkedList size: " + list.size());
    }
}