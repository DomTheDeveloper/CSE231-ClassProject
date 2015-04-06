package edu.oakland.production.ClassProject.middleware;
import edu.oakland.production.ClassProject.middleware.*;
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
	int ListSize;
	int Size;
	int size;
	int key1;
	int key2;
	int key3;
	int n;
	int input;
	int size;
	int array;
	int param;
	int ID;
	string Name;
	string Major;
	double GPA;
	double TG;

	LinkedListMiddleware mw = new LinkedListMiddleware();
	MidArrayList mw1 = new MidArrayList();
	BinaryTreeMW mw2 = new BinaryTreeMW();
	HashClient mw3 = new HashClient();
	HashFinder mw4 = new HashFinder();
	StackCut mw5 = new StackCut();
	StudentStack studentStack = new StudentStack(10);
	/**
	*Constructor for LinkedListMiddleware.
	*@param ListSize Takes an integer and passes it to the LinkedListMiddleware instance.
	*Calls the LinkedListMiddleware, selectSort, bubbleSort,linearSearch, and binarySearch methods.
	*/
	public void llMW(){
	mw.LinkedListMiddleware(int ListSize);
	}
	public void selectSortLL(){
	mw.selectSort();
	return int TaskTime
	}
	public void bubbleSortLL(){
	mw.bubbleSort();
	return int TaskTime
	}
	public void linearSearchLL(){
	mw.linearSearch();
	return int TaskTime
	}
	public String binarySearchLL(){
	mw.binarySearch();
	return int TaskTime +" "+ int TimesThrough
	}
	
	/**
	*Constructor for MidArrayList.
	*@param Size Takes an integer and passes it to the MidArrayList instance.
	*Calls the MidArrayList, bubbleSort, selectionSort, linearSearch, and binarySearch methods.
	*/	
	public void alMW(){
	mw1.MidArrayList(int Size);
	}
	public void bubbleSortAL(){
	mw1.bubbleSort();
	return int TaskTime
	}
	public void selectionSortAL(){
	mw1.selectionSort();
	return int TaskTime
	}
	public void linearSearchAL(){
	mw1.linearSearch();
	return int TaskTime
	}
	public String binarySearchAL(){
	mw1.binarySearch();
	return int TaskTime +" "+ int TimesThrough
	}

	/**
	*Constructor for BinaryTree.
	*@param size Takes an integer and passes it to the BinaryTree instance.
	*@param key1 Passes random string value to the BinaryTree instance.
	*@param key2 Passes random string value to the BniaryTree instance.
	*@param key3 Passes random string value to the BinaryTree instance.
	*Calls the createBinaryTree, calculatePreorderNodesSearched, calculateInOrderNodesSearched, calculatePreorderSearchDuration, calculateInOrderSearchDuration, calculateBigORelationship, getDatabase, and setDatabase methods.
	*/
	public void BinaryTreeMW(){
		mw2.BinaryTreeMW(int size);
	}
	public String calculatePreorderNodesSearched() {	
		return mw2.calculatePreorderNodesSearched(int key1, int key2, int key3);
	}
	public String calculateInOrderNodesSearched() {
		return mw2.calculateInOrderNodesSearched(int key1, int key2, int key3);
	
	}
	public String calculatePreorderSearchDuration() {
		return mw2.calculatePreorderSearchDuration(int key1, int key2, int key3);
	}
	public String calculateInOrderSearchDuration() {
		return mw2.calculateInOrderSearchDuration(int key1, int key2, int key3);
	}
	
	public String calculateBigORelationship() {
		return mw2.calculateBigORelationship();
	}

	/**
	*Constructor for HashClient.
	*@param n Takes an integer and passes it to the HashClient instance.
	*Calls the createHashTable, findHashTableValue, and BigONotation methods.
	*/
	public void createHashTable(){
		mw3.createHashTable(int n);
	}
	public int findHashTableValue(int value){
		return mw3.findHashTableValue(int value);
	}
	public String bigONotation() {
		return mw3.bigONotation();
	}
	/**
	*Constructor for HashFinder.
	*@param input Passes integer to the HashFinder instance.
	*@param size  Passes integer to the HashFinder instance.
	*@param array Passes array to the HashFinder instance.
	*@return the location of the value
	*/
	public int findHashValue(){
		return mw4.findHashValue(int input, int size, int array);
	}
	
	/**
	*Constructor for StackCut.
	*@param param Passes a parameter to the StackCut instance.
	*/
	public void StackCut() {
		mw5.StackCut(int param);
	}
	public String displayStacks(){
		return mw5.displayStacks();
	}
	public String peek(){
		return mw5.peek().toString();
	}
	
	/**
	*Method for creating a Student.
	*@param ID
	*@param Name
	*@param Major
	*@param GPA
	*@param TG
	*Creates a Student Object and pushes it to the stack.
	*/
	public void createStudent(int ID, string Name, string Major, double GPA, double TG) {
		Student newStudent = new Student(ID, Name, Major, GPA, TG);
		studentStack.push(newStudent);
	}
	
	/**
	* This method cuts the list of students down to size
	*/
	public String[] cutStudents() {
		studentStack.cut(5);
	}
	
	/**
	* This method will return an array of Who got Scholarships
	*/
	public String[] getScholarships() {
	}
}
/**
*This class was created for Middleware.
*/
