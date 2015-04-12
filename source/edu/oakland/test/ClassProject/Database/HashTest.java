package edu.oakland.test.ClassProject.Database;

import edu.oakland.production.ClassProject.Database.*;
import junit.framework.*;
import java.util.*;
/**
* .insert() is tested within initTest()
*
*@author "Michael Opiola"
*@version "1.0" 150211
*@since version 1.0
*/
public class HashTest extends TestCase {
	
	DatabaseHashTable hash;
	
	public void testSelect(){
		initTest();
		assertEquals(hash.select(5), 5); 
	}
	
	public void testGetLocation(){
		initTest();
		assertEquals(hash.getLocation(18), 18);
	}
	
	public void testRemove(){
		initTest();
		hash.remove(10);
		assertEquals(hash.select(10), -1);
	}
	
	public void initTest(){
		hash = new DatabaseHashTable(20);
		for (int i = 0; i < 20; i++) {
			hash.insert(i+1);
		}
	}
}
