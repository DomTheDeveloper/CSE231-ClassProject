package edu.oakland.production.middleware;
import java.util.*;
/**
*@author Eldari Gogiashvili
*@version version 2.0.0 date 150405
*since version 1.0.0 date 150331
*/

/**
*This class represents the middleware.
*/

public class Middleware {

	/**
	*Instance variables used in subsequent methods.
	*/
	private int ListSize;
	private int Size;
	private int size;
	private int key1;
	private int key2;
	private int key3;
	private int n;
	private int input;
	private int[] array;
	private int param;
	private int ID;
	private String Name;
	private String Major;
	private double GPA;
	private double TG;

	private LinkedListMiddleware mw = new LinkedListMiddleware(10);
	private MidArrayList mw1 = new MidArrayList(10);
	private BinaryTreeMW mw2 = new BinaryTreeMW();
	private HashClient mw3 = new HashClient();
	private HashFinder mw4 = new HashFinder();
	private StackCut mw5 = new StackCut(5);
	private Stack<Integer> stack = new Stack<Integer>();
	
	
	/**
	*@param ListSize Takes an integer and passes it to the LinkedListMiddleware instance.
	*Calls the LinkedListMiddleware, selectSort, bubbleSort,linearSearch, and binarySearch methods.
	*/
	public void llMW(int listSize){
		mw.createLinkedList(listSize);
	}
	
	public long selectSortLL(){
		mw.selectSort();
		return mw.taskTime;
	}
	
	public long bubbleSortLL(){
		mw.bubbleSort();
		return mw.taskTime;
	}
	
	public long linearSearchLL(int value){
		mw.linearSearch(value);
		return mw.taskTime;
	}
	
	public String binarySearchLL(int value){
		mw.binarySearch(value);
		String stuff = " " + mw.taskTime + " " + mw.timesThrough;
		return stuff;
	}
	
	
	/**
	*@param Size Takes an integer and passes it to the MidArrayList instance.
	*Calls the MidArrayList, bubbleSort, selectionSort, linearSearch, and binarySearch methods.
	*/	
	/*public void alMW(int size){
		mw1.MidArrayList(size);
	}*/
	
	public long bubbleSortAL(){
		mw1.bubbleSort();
		return mw1.taskTime;
	}
	
	public long selectionSortAL(){
		mw1.selectionSort();
		return mw1.taskTime;
	}
	
	public long linearSearchAL(int a){
		mw1.linearSearch(a);
		return mw1.taskTime;
	}
	
	public String bigO() {
	}
	
	
	
	public String binarySearchAL(int b){
		String returnString;
		mw1.binarySearch(b);
		returnString = Long.toString(mw1.taskTime);
		returnString += mw1.timesThrough;
	}

	/**
	*@param size Takes an integer and passes it to the BinaryTree instance.
	*@param key1 Passes random String value to the BinaryTree instance.
	*@param key2 Passes random String value to the BniaryTree instance.
	*@param key3 Passes random String value to the BinaryTree instance.
	*Calls the createBinaryTree, calculatePreorderNodesSearched, calculateInOrderNodesSearched, calculatePreorderSearchDuration, calculateInOrderSearchDuration, calculateBigORelationship, getDatabase, and setDatabase methods.
	*/
	public void BinaryTreeMW(){
		mw2.populateBinaryTreeDB(size);
	}
	
	public String calculatePreorderNodesSearched() {	
		return mw2.calculatePreorderNodesSearched(key1, key2, key3);
	}
	
	public String calculateInOrderNodesSearched() {
		return mw2.calculateInOrderNodesSearched(key1, key2, key3);
	
	}
	
	public String calculatePreorderSearchDuration() {
		return mw2.calculatePreorderSearchDuration(key1, key2, key3);
	}
	
	public String calculateInOrderSearchDuration() {
		return mw2.calculateInOrderSearchDuration(key1, key2, key3);
	}
	
	public String calculateBigORelationship() {
		return mw2.calculateBigORelationship();
	}

	/**
	*@param n Takes an integer and passes it to the HashClient instance.
	*Calls the createHashTable, findHashTableValue, and BigONotation methods.
	*/
	public void createHashTable(){
		mw3.createHashTable(n);
	}
	
	public int findHashTableValue(int value){
		return mw3.findHashTableValue(value);
	}
	
	public String bigONotation() {
		return mw3.bigONotation();
	}
	
	/**
	*@param input Passes integer to the HashFinder instance.
	*@param size  Passes integer to the HashFinder instance.
	*@param array Passes array to the HashFinder instance.
	*@return the location of the value
	*/
	public int findHashValue(){
		mw4.findHashValue(input, size, array);
	}
	
	/**
	*@param param Passes a parameter to the StackCut instance.
	*/
	/*public void StackCut() {
		mw5.StackCut(param);
	}
	
	public String displayStacks(){
		return mw5.displayStacks();
	}
	
	public String peek(){
		return mw5.peek().toString();
	}
	*/
	/**
	*Method for creating a Student.
	*@param ID
	*@param Name
	*@param Major
	*@param GPA
	*@param TG
	*Creates a Student Object and pushes it to the stack.
	*/
	public void createStudent(int ID, String Name, String Major, double GPA, double TG) {
		Student newStudent = new Student(ID, Name, Major, GPA, TG);
		stack.push(newStudent);
	}
	
	/**
	* This method cuts the list of s down to size
	*/
	public String[] cutStudents(int count) {
		String[] out = new String[count];
		for(int i = 0; i < count; i++)
			out[i] = stack.pop().toString();
	}
	
	/**
	* This method will return an array of Who got Scholarships
	*/
	public String[] getScholarships() {
		
	}
}