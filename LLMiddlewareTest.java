package edu.oakland.test.ClassProject;

import java.util.*;
import junit.framework.*;
import edu.oakland.production.ClassProject.*;

/**
*@author Zack Waldrup
*@version version 1.1 150403
*@since version 1.0 150401
*/
public class LLMiddlewareTest extends TestCase {
	
	/**
	*Instance variables needed for test classes
	*/
	int listSize = 10;
	int searchInt = 200;
	LinkedListMiddleware mw1;
	
	/**
	*setUp method to ensure a new LinkedListMiddleware class on each test
	*/
	public void setUp() {
		mw1 = new LinkedListMiddleware(listSize);
	}
	
	/**
	*This method tests whether the elements in the list are in order
	*/
	public void testSelectSort() {
		boolean goodSort = true;
		mw1.selectSort();
		for(int i = 1; i < listSize; i++){
			if(mw1.db.get(i) > mw1.db.get(i+1)) {
				goodsort = false;
			}
		}
		assertTrue(goodsort);
	}
	
	/**
	*This method tests whether the elements in the list are in order
	*/
	public void testBubbleSort() {
		boolean goodSort = true;
		mw1.bubbleSort();
		for(int i = 1; i < listSize; i++){
			if(mw1.db.get(i) > mw1.db.get(i+1)) {
				goodsort = false;
			}
		}
		assertTrue(goodsort);
	}
	
	/**
	*This method tests whether the linear search finds the given integer
	*/
	public void testLinearSearch() {
		mw1.db.add(searchInt);
		mw1.selectSort();
		mw1.linearSearch(searchInt);
		assertTrue(valuePresent);
	}
	
	/**
	*This method tests whether the binary search finds the given integer
	*/
	public void testBinarySearch() {
		mw1.db.add(searchInt);
		mw1.selectSort();
		mw1.binarySearch(searchInt);
		assertTrue(valuePresent);
	}
	
}