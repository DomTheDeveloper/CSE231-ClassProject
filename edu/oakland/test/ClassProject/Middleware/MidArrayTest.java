package edu.oakland.production.ClassProject.Middleware;

import java.util.*;
import edu.oakland.production.*;
import junit.framework.*;

public class MidArrayListTest extends TestCase{

	int listSize = 10;
	int searchInt = 200;
	int timesThrough;
	long taskTime;
	MidArrayList mw2;

	public  void setUp(){
		mw2 = new MidArrayList(listSize);

	}

	/**
	*This method tests whether the elements in the list are in order
	*/
	public void testSelectSort() {
		boolean goodSort = true;
		taskTime = mw2.selectionSort();
		for(int i = 1; i < arraySize; i++){
			if(mw2.db.get(i) > mw2.db.get(i+1)) {
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
		taskTime = mw2.bubbleSort();
		for(int i = 1; i < arraySize; i++){
			if(mw2.db.get(i) > mw2.db.get(i+1)) {
				goodsort = false;
			}
		}
		assertTrue(goodsort);
	}

	/**
	*This method tests whether the linear search finds the given integer
	*/
	public void testLinearSearch() {
		mw2.db.add(searchInt);
		taskTime = mw2.selectSort();
		taskTime = mw2.linearSearch(searchInt);
		assertTrue(valuePresent);
	}

	/**
	*This method tests whether the binary search finds the given integer
	*/
	public void testBinarySearch() {
		mw2.db.add(searchInt);
		taskTime = mw2.selectSort();
		timesThrough = mw2.binarySearch(searchInt);
		assertTrue(valuePresent);
	}

}
