
/**
*@author Eldari Gogiashvili
*@version version 1.0.0 date 150331
*since version 1.0.0
*/

/**
*This class represents the middleware
*/

public class MockDisplay {
	
	int ListSize
	
	/**
	*Constructor for Middleware.
	*/
	LinkedListMiddleware mw = new MidArrayList(ListSize);
	mw.selectSort();
	mw.linearSearch();
	mw.binarySearch();
	
	LinkedListMiddleware mw1 = new MidArrayList(ListSize);
	mw1.bubbleSort();
	mw1.linearSearch();
	mw1.binarySearch();
}