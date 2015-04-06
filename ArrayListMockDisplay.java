package edu.oakland.production.ClassProject;

import edu.oakland.production.ClassProject.*;
/**
*@author Eldari Gogiashvili
*@version version 1.0.1 date 150331
*since version 1.0.0
*/

/**
*This class represents the middleware
*/

public class ArrayListMockDisplay {
	public void main(String[] args){
		
		int ListSize = 100;
		int searchKey = 100;
	
		/**
		*Constructor for Middleware.
		*/
		MidArrayList mw = new MidArrayList(ListSize);
		mw.selectionSort();
		mw.linearSearch(searchKey);
		mw.binarySearch(searchKey);
	
		MidArrayList mw1 = new MidArrayList(ListSize);
		mw1.bubbleSort();
		mw1.linearSearch(searchKey);
		mw1.binarySearch(searchKey);
	}	
}