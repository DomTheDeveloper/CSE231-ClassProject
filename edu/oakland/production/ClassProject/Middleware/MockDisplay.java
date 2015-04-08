package edu.oakland.production.middleware;

/**
*@author Eldari Gogiashvili, Zack Waldrup
*@version version 1.0.1 date 150331
*since version 1.0.0
*/

/**
*This class represents the middleware
*/

public class MockDisplay {
	
	int ListSize = 10;
	
	/**
	*Method for testing the LinkedListMiddleware class
	*/
	public void testLL(){
		/**
		*Constructor for Middleware.
		*/
		LinkedListMiddleware mw = new LinkedListMiddleware(ListSize);
		mw.selectSort();
		mw.linearSearch(100);
		mw.binarySearch(100);
		
		LinkedListMiddleware mw1 = new LinkedListMiddleware(ListSize);
		mw1.bubbleSort();
		mw1.linearSearch(100);
		mw1.binarySearch(100);
		
	}
}