package edu.oakland.production.ClassProject.Middleware;
import java.util.*;
import edu.oakland.production.ClassProject.Database.*;

/**
 * @author Eldari Gogiashvili
 * @version version 2.0.0 date 150405
 * since version 1.0.0 date 150331
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
	private String bigO;
	private double totalTime = 0;
	
	private LinkedListMiddleware mwLL = new LinkedListMiddleware(10);
	private MidArrayList mwAL = new MidArrayList(10);
	private BinaryTreeMW mwBT = new BinaryTreeMW();
	private HashClient mwHC = new HashClient();
	private HashFinder mwHF = new HashFinder();
	private StackCut stack = new StackCut(10);
	private BinaryTree tree = new BinaryTree();

	/**
	*@param ListSize Takes an integer and passes it to the LinkedListMiddleware instance.
	*Calls the LinkedListMiddleware, selectSort, bubbleSort,linearSearch, and binarySearch methods.
	*/
	public void llMW(int listSize){
		mwLL.createLinkedList(listSize);
	}

	public long selectSortLL(){
		mwLL.selectSort();
		return mwLL.taskTime;
	}

	public long bubbleSortLL(){
		mwLL.bubbleSort();
		return mwLL.taskTime;
	}

	public long linearSearchLL(int value){
		mwLL.linearSearch(value);
		return mwLL.taskTime;
	}

	public String binarySearchLL(int value){
		mwLL.binarySearch(value);
		String stuff = " " + mwLL.taskTime + " " + mwLL.timesThrough;
		return stuff;
	}


	/**
	*@param Size Takes an integer and passes it to the MidArrayList instance.
	*Calls the MidArrayList, bubbleSort, selectionSort, linearSearch, and binarySearch methods.
	*/
	/*public void alMW(int size){
		mwAL.MidArrayList(size);
	}*/
	/*
	public long bubbleSortAL(){
		mwAL.bubbleSort();
		return mwAL.taskTime;
	}

	public long selectionSortAL(){
		mwAL.selectionSort();
		return mwAL.taskTime;
	}

	public long linearSearchAL(int a){
		mwAL.linearSearch(a);
		return mwAL.taskTime;
	}
	*/



	/*
	public String binarySearchAL(int b){
		String returnString;
		mwAL.binarySearch(b);
		returnString = Long.toString(mwAL.taskTime);
		returnString += mwAL.timesThrough;
	}*/

	/**
	*@param size Takes an integer and passes it to the BinaryTree instance.
	*@param key1 Passes random String value to the BinaryTree instance.
	*@param key2 Passes random String value to the BniaryTree instance.
	*@param key3 Passes random String value to the BinaryTree instance.
	*Calls the createBinaryTree, calculatePreorderNodesSearched, calculateInOrderNodesSearched, calculatePreorderSearchDuration, calculateInOrderSearchDuration, calculateBigORelationship, getDatabase, and setDatabase methods.
	*/
	public void BinaryTreeMW(){
		mwBT.populateBinaryTreeDB(size);
	}

	public String calculatePreorderNodesSearched() {
		return mwBT.calculatePreorderNodesSearched(key1, key2, key3);
	}

	public String calculateInOrderNodesSearched() {
		return mwBT.calculateInOrderNodesSearched(key1, key2, key3);

	}

	public String calculatePreorderSearchDuration() {
		return mwBT.calculatePreorderSearchDuration(key1, key2, key3);
	}

	public String calculateInOrderSearchDuration() {
		return mwBT.calculateInOrderSearchDuration(key1, key2, key3);
	}

	public String calculateBigORelationship() {
		return mwBT.calculateBigORelationship();
	}

	/**
	*@param n Takes an integer and passes it to the HashClient instance.
	*Calls the createHashTable, findHashTableValue, and BigONotation methods.
	*/
	public void createHashTable(){
		mwHC.createHashTable(n);
	}

	public int findHashTableValue(int value){
		return mwHC.findHashTableValue(value);
	}

	public String bigONotation() {
		return mwHC.bigONotation();
	}

	/**
	*@param input Passes integer to the HashFinder instance.
	*@param size  Passes integer to the HashFinder instance.
	*@param array Passes array to the HashFinder instance.
	*@return the location of the value
	*/
	/*
	public int findHashValue(){
		mwHF.findHashValue(input, size, array);
	}*/

	/**
	*@param param Passes a parameter to the StackCut instance.
	*/
	/*public void StackCut() {
		stack.StackCut(param);
	}

	public String displayStacks(){
		return stack.displayStacks();
	}

	public String peek(){
		return stack.peek().toString();
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
	public void createStudent(int ID, String Name, String Major, double GPA, int TG) {
		Student newStudent = new Student(ID, Name, Major, GPA, TG);
		stack.push(newStudent);
	}
	
	public void setStackSize(int newStackSize){
		stack.setSize(newStackSize);
	}
	

	public void setNumberOfElements(int n) {
		mwLL = new LinkedListMiddleware(n);
		mwAL = new MidArrayList(n);
	}

	/**
	* Populate the List.
	*/
	public void createArrayList() {
		mwAL.generateRandomArray();
	}

	public void createLinkedList() {
		
	}

	public long sortArrayList(boolean selectionSort) {
		if(selectionSort)
		{
			return mwAL.selectionSort();
		}
		else
		{
			return mwAL.bubbleSort();
		}
	}


	public long sortLinkedList(boolean selectionSort) {
		if(selectionSort)
		{
			return mwLL.selectSort();
		}
		else
		{
			return mwLL.bubbleSort();
		}
	}

	public long searchLinkedList(int val, boolean binary) {
		long time = System.currentTimeMillis();
		if(binary)
		{
			 mwLL.binarySearch(val);
		}
		else
		{
			 mwLL.linearSearch(val);
		}
		return System.currentTimeMillis() - time;
	}

	public long searchArrayList(int val, boolean binary) {
		long time = System.currentTimeMillis();
		if(binary)
		{
			mwAL.binarySearch(val);
		}
		else
		{
			mwAL.linearSearch(val);
		}
		return System.currentTimeMillis() - time;
	}

	public String bigOAL(boolean selectSort) {
		if(selectSort)
		{
			return mwAL.selectSortBigO(100,500,1000);
		}
		else
		{
			return mwAL.bubbleSortBigO(100,500,1000);
		}

	}

	public String bigOLL(boolean selectSort) {
		if(selectSort)
		{
			return mwLL.calcSelectBigO(100,500,1000);
		}
		else
		{
			return mwLL.calcBubbleBigO(100,500,1000);
		}
	}

	public void makeHashTable(int n) {
		mwHC.createHashTable(n);
	}

	public double searchValuesAndGetTime(int a) {
		double start = System.nanoTime();
		mwHC.findHashTableValue(a);
		double hold = System.nanoTime() - start; 
		totalTime += hold; 
		return hold;
	}
	
	/**
	* This method cuts the list of s down to size
	*/
	public String cutStudents(int count, boolean cut, int alreadyCutStudents) {
		String out = new String();
		
		StackCut stack = this.stack.clone();
		int stackSize = stack.getSize();
		
		Student[] studentsCut = new Student[stack.getSize()];
		Student[] studentsNotCut = new Student[stack.getSize()];
		
		for(int i = 0; i < alreadyCutStudents; i++){
			stack.pop();
		}
		
		for(int i = 0; i < count; i++){
				studentsCut[i] = (Student) stack.peek();
				stack.pop();
		}
		
		for(int i = 0; i < stackSize - count; i++){
			studentsNotCut[i] = (Student) stack.peek();
			stack.pop();
		}
		
		Student[] students = cut ? studentsCut : studentsNotCut;
		
		for (int i = 0; i < students.length; i++){
			Student student = students[i];
			if (student != null){
				if ( ((i == count-1) && cut) && alreadyCutStudents == 0)
					out += student.getEverything();
				else
					out += student.getBasicInfo();
				
				out += "\n";
		}
		
	}
		return out;	
	}

	/**
	* This method will return an array of who didn't get a scholarship.
	*/
	public Student[] getNoScholarships() {
		StackCut stack = this.stack.clone();
		Student[] out = new Student[stack.getSize() - 3];
		for(int i = 0; stack.getSize() > 3; i++)
		{
			//out[i] = stack.pop();
		}
		return out;
	}

	/**
	* This method will return an array of students stored in the binary tree,
	*and an array of students whose thesis grades are below 90 and GPA is below 3.60.
	*/
	
	public String getThesis(){

		String out = new String();	
		
		StackCut stack = this.stack.clone();
		int stackSize = stack.getSize();
		
		Student[] students = new Student[stack.getSize()];
		
		for(int i = 0; i < stackSize; i++){
				students[i] = (Student) stack.peek();
				stack.pop();
		}
		
		for (Student student : students)
			tree.addNode(student.getTG(),student);
		
		out += "Traversed:" + "\n";
		out += tree.preorderTraverseTree(tree.getRootNode()).toString();	

		ArrayList<Node> ltNodes = tree.getLess(90,3.60);
		ArrayList<Student> ltStuds = new ArrayList<Student>();

		for(int i = 0; i < ltNodes.size(); i++)
		{
			ltStuds.add((Student)ltNodes.get(i).getValue());
		}
		
		out += "\n" + "The following students failed out:";
		for(Student student : ltStuds)
			out += "\n" + student.getEverything();
		
		return out;
	}
	
	public double getBigO(){
		return totalTime / 3;
	}
}
