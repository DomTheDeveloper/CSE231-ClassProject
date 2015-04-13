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

	//PART 2, BECAUSE MELDARI
	private BinaryTree tree = new BinaryTree();

	/**
	*Takes an integer and passes it to the MidArrayList instance.
	*@param listSize
	*/
	public void llMW(int listSize){
		mwLL.createLinkedList(listSize);
	}

	/**
	*Takes an integer and passes it to the binaryTreeMW instance.
	*@param size
	*/
	public void binaryTreeMW(int size){
	mwBT.populateBinaryTreeDB(size);
	}

	/**
	*Calculates BigO relationship.
	*@param size
	*/
	public String calculateBigORelationship(int size) {
		return mwBT.calculateBigORelationship(size);
	}

	/**
	*Calculates Preorder Nodes Searched.
	*@param key1
	*@param key2
	*@param key3
	*/
	public String calculatePreorderNodesSearched(int key1, int key2, int key3) {
		return mwBT.calculatePreorderNodesSearched(key1, key2, key3);
	}

	/**
	*Calculates Inorder Nodes Searched.
	*@param key1
	*@param key2
	*@param key3
	*/
	public String calculateInOrderNodesSearched(int key1, int key2, int key3) {
		return mwBT.calculateInOrderNodesSearched(key1, key2, key3);
	}

	/**
	*Calculates Preorder Search Duration.
	*@param key1
	*@param key2
	*@param key3
	*/
	public String calculatePreorderSearchDuration(int key1, int key2, int key3) {
		return mwBT.calculatePreorderSearchDuration(key1, key2, key3);
	}

	/**
	*Calculates Inorder Search Duration.
	*@param key1
	*@param key2
	*@param key3
	*/
	public String calculateInOrderSearchDuration(int key1, int key2, int key3) {
		return mwBT.calculateInOrderSearchDuration(key1, key2, key3);
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

	public void createStudent(int ID, String Name, String Major, double GPA, int TG) {
		Student newStudent = new Student(ID, Name, Major, GPA, TG);
		stack.push(newStudent);
	}

	/**
	*Sets the stackSize.
	*@param newStackSize
	*/
	public void setStackSize(int newStackSize){
		stack.setSize(newStackSize);
	}

	/**
	*Clears the stack.
	*/
	public void clearTheStack(){
		stack = new StackCut(10);
	}

	/**
	*Sets the number of elements.
	*@param n
	*/
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

	/**
	*Sort the arrayList.
	*@param selectionSort
	*/
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

	/**
	*Sorts the LinkedList.
	*@param selectionSort
	*/
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

	/**
	*Searches the LinkedList.
	*@param val
	*@param binary
	*/
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

	/**
	*Searches the ArrayList.
	*@param val
	*@param binary
	*/
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

	/**
	*Returns the BigO.
	*@param selectSort
	*/
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

	/**
	*Returns the BigO.
	*@param selectSort
	*/
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

	/**
	*Makes the HashTable.
	@param n
	*/
	public void makeHashTable(int n) {
		mwHC.createHashTable(n);
	}

	/**
	*Searches values and gets the time.
	@param a
	*/
	public double searchValuesAndGetTime(int a) {
		double start = System.nanoTime();
		mwHC.findHashTableValue(a);
		double hold = System.nanoTime() - start;
		totalTime += hold;
		return hold;
	}

	/**
	* This method cuts the list of s down to size.
	*@param count
	*@param cut
	*@param alreadyCutStudents
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
