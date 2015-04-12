package edu.oakland.production.ClassProject.Middleware;

	import java.util.*;
	import edu.oakland.production.ClassProject.Database.LinkedListDB;

	/**
	*@author Zack Waldrup
	*@version version 2.7 150407
	*@since version 1.0 150323
	*/
	public class LinkedListMiddleware {

		/**
		*Instance variables needed for the constructors and methods
		*/
		int listSize;
		int iMin;
		long taskTime;
		int value;
		public static int timesThrough;
		static long startTime, endTime;
		public boolean valuePresent = false;
		public LinkedListDB<Integer> db;

		/**
		*Overloaded constructor for the LinkedListMiddleware class.
		*Passes the requested list size to the database.
		*@param listSize of type "int"
		*/
		public LinkedListMiddleware(int listSize) {
			this.listSize = listSize;
			db = new LinkedListDB<Integer>();
			this.createLinkedList(listSize);
		}

		/**
		*Calculates the Big O value for a selection sort based on 3 sizes
		*of LinkedList<Integer>. Values for a, b, and c must be in increasing order.
		*@param a of type "int"
		*@param b of type "int"
		*@param c of type "int"
		*@return Big O N value of type "String"
		*/
		public static String calcSelectBigO(int a, int b, int c) {
			LinkedListMiddleware mwa, mwb, mwc;
			long taskTimeA, taskTimeB, taskTimeC;
			long diffAB, diffBC;
			long nDiffBC, n2DiffBC, lognDiffBC;
			long smallest;

			mwa = new LinkedListMiddleware(a);
			taskTimeA = mwa.selectSort();
			mwb = new LinkedListMiddleware(b);
			taskTimeB = mwb.selectSort();
			mwc = new LinkedListMiddleware(c);
			taskTimeC = mwc.selectSort();

			diffBC = taskTimeC - taskTimeB;

			nDiffBC = diffBC - (c-b);
			n2DiffBC = diffBC - ((c*c) - (b*b));
			lognDiffBC = diffBC - (long)(Math.log(c) - Math.log(b));

			if(nDiffBC<n2DiffBC && nDiffBC<lognDiffBC){
				smallest = nDiffBC;
			} else if(n2DiffBC<lognDiffBC && n2DiffBC<nDiffBC){
				smallest = n2DiffBC;
			} else {
				smallest = lognDiffBC;
			}

			if(nDiffBC == smallest) {
				return ("N");
			} else if(n2DiffBC == smallest){
				return ("N^2");
			} else {
				return ("log(N)");
			}
		}

		/**
		*Calculates the Big O value for a bubble sort based on 3 sizes
		*of LinkedList<Integer>. Values for a, b, and c must be in increasing order.
		*@param a of type "int"
		*@param b of type "int"
		*@param c of type "int"
		*@return Big O N value of type "String"
		*/
		public static String calcBubbleBigO(int a, int b, int c) {
			LinkedListMiddleware mwa, mwb, mwc;
			long taskTimeA, taskTimeB, taskTimeC;
			long diffAB, diffBC;
			long nDiffBC, n2DiffBC, lognDiffBC;
			long smallest;

			mwa = new LinkedListMiddleware(a);
			taskTimeA = mwa.bubbleSort();
			mwb = new LinkedListMiddleware(b);
			taskTimeB = mwb.bubbleSort();
			mwc = new LinkedListMiddleware(c);
			taskTimeC = mwc.bubbleSort();

			diffBC = taskTimeC - taskTimeB;

			nDiffBC = diffBC - (c-b);
			n2DiffBC = diffBC - ((c*c) - (b*b));
			lognDiffBC = diffBC - (long)(Math.log(c) - Math.log(b));

			if(nDiffBC<n2DiffBC && nDiffBC<lognDiffBC){
				smallest = nDiffBC;
			} else if(n2DiffBC<lognDiffBC && n2DiffBC<nDiffBC){
				smallest = n2DiffBC;
			} else {
				smallest = lognDiffBC;
			}

			if(nDiffBC == smallest) {
				return ("N");
			} else if(n2DiffBC == smallest){
				return ("N^2");
			} else {
				return ("log(N)");
			}
		}

		/**
		*This method performs a Selection Sort on a LinkedList
		*Big O: O(n^2)
		*@return taskTime of type "int"
		*/
		public long selectSort() {
			startTime = System.currentTimeMillis();

			for (int j = 0; j < listSize; j++) {
				iMin = j;
				for (int i = j + 1; i < listSize; i++) {
					if (db.get(i).getData().intValue() < db.get(iMin).getData().intValue()) {
						iMin = i;
					}
				}
				if(iMin != j) {
					swapValues(j, iMin);
				}
			}
			endTime = System.currentTimeMillis();
			taskTime = endTime - startTime;
			return taskTime;
		}

		/**
		*This method performs a Bubble Sort on a LinkedList
		*Big O: O(n^2)
		*@return taskTime of type "int"
		*/
		public long bubbleSort() {
			startTime = System.currentTimeMillis();

			for (int i = listSize - 1; i > 1; i--) {
				for (int j = 0; j < i; j++) {
					if(db.get(j).getData().intValue() > db.get(j + 1).getData().intValue()){
						//System.out.println("Swap values");
						swapValues(j, j+1);
					}
				}
			}
			endTime = System.currentTimeMillis();
			taskTime = endTime - startTime;
			return taskTime;
		}

		/**
		*This method linearly searches a LinkedList
		*Big O: O(n)
		*@param value of type "int"
		*@return taskTime of type "int"
		*/
		public long linearSearch(int value) {
			this.value = value;
			valuePresent = false;
			String indexWithValue = "";
			startTime = System.currentTimeMillis();

			for (int i = 0; i < listSize; i++) {
				if(db.get(i).getData().intValue() == value) {
					valuePresent = true;
					indexWithValue += i + " ";
				}
			}
			System.out.println("Value found: " + valuePresent);
			endTime = System.currentTimeMillis();
			taskTime = endTime - startTime;
			return taskTime;
		}

		/**
		*This method conducts a binary searche on a LinkedList
		*Big O: O(log(n))
		*@param value of type "int"
		*@return timesThrough of type "int"
		*/
		public int binarySearch(int value) {
			this.value = value;
			int lowIndex = 0;
			int highIndex = listSize - 1;
			timesThrough = 0;
			startTime = System.currentTimeMillis();

			while (lowIndex <= highIndex) {
				int middleIndex = (highIndex + lowIndex) / 2;
				if(db.get(middleIndex).getData().intValue() < value) {
					lowIndex = middleIndex + 1;
				} else if(db.get(middleIndex).getData().intValue() > value) {
					highIndex = middleIndex - 1;
				} else if(db.get(middleIndex).getData().intValue() == value){
					valuePresent = true;
					System.out.println("Found " + value + "at " + middleIndex);
					lowIndex = highIndex + 1;
				} else {
					System.out.println("Value is not in this list");
				}
				timesThrough++;
			}

			endTime = System.currentTimeMillis();
			taskTime = endTime - startTime;
			return timesThrough;
		}

		/**
		*This method swaps the values of 2 elements in a LinkedList
		*@param indexOne of type "int"
		*@param indexTwo of type "int"
		*/
		public void swapValues(int indexOne, int indexTwo) {
			Integer temp = db.get(indexOne).getData();
			db.set(indexOne,db.get(indexTwo).getData());
			db.set(indexTwo, temp);
			//System.out.println("Values swapped");
		}

		/**
		*Method for creating a LinkedList<Integer>
		*@param listSize of type "int"
		*/
		public void createLinkedList(int listSize) {
			this.listSize = listSize;

			for(int i = 0; i < listSize; i++) {
				db.add((Integer)randomInt(100, 1000));
				//System.out.println(i);
			}
		}

		/**
		*This method gives a random number based on a maximum and
		*minimum range of selection
		*@param min of type "int"
		*@param max of type "int"
		*@return randomNumber of type "int"
		*/
		public static int randomInt(int min, int max) {
			Random rand = new Random();
			int randomNumber = rand.nextInt((max - min) + 1) + min;
			return randomNumber;
		}

		/**
		@return True if the previous search was successful
		*/
		public boolean wasPresent() {
			return valuePresent;
		}

	}