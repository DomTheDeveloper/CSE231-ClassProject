
/**
*@author Eldari Gogiashvili
*@version version 1.0.0 date 150331
*since version 1.0.0
*/

/**
*This class represents the middleware
*/

public class Middleware {
	
	/**
	*Instance variables.
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
	
	int param
	
	/**
	*Constructor for LinkedListMiddleware.
	*@param ListSize Takes an integer and passes it to the LinkedListMiddleware instance.
	*/
	LinkedListMiddleware mw = new LinkedListMiddleware();
	mw.LinkedListMiddleware(int ListSize);
	mw.selectSort();
	mw.bubbleSort();
	mw.linearSearch();
	mw.binarySearch();
	
	
	/**
	*Constructor for MidArrayList.
	*@param ListSize Takes an integer and passes it to the MidArrayList instance.
	*/
	MidArrayList mw1 = new MidArrayList();
	mw1.MidArrayList(int Size);
	mw1.bubbleSort();
	mw1.selectionSort();
	mw1.linearSearch();
	mw1.binarySearch();
	
	/**
	*Constructor for Middleware1.
	*@param ListSize Takes an integer and passes it to the Middleware1 instance.
	*/
	Middleware1 mw2 = new Middleware1();
	mw2.createBinaryTree(int size);
	mw2.calculatePreorderNodesSearched(int key1, int key2, int key3);
	mw2.calculateInOrderNodesSearched(int key1, int key2, int key3);
	mw2.calculatePreorderSearchDuration(int key1, int key2, int key3);
	mw2.calculateInOrderSearchDuration(int key1, int key2, int key3);
	mw2.calculateBigORelationship();
	mw2.getDatabase();
	mw2.setDatabase(Database database);
	
	/**
	*Constructor for HashClient.
	*@param ListSize Takes an integer and passes it to the HashClient instance.
	*/
	HashClient mw3 = new HashClient();
	mw3.createHashTable(int n);
	mw3.findHashTableValue();
	mw3.bigONotation();
	
	/**
	*Constructor for HashFinder.
	*@param ListSize Takes an integer and passes it to the HashClient instance.
	*/
	HashFinder mw4 = new HashFinder();
	mw4.findHashValue(int input, int size, int array);
	
	/**
	*Constructor for StackCut.
	*@param ListSize Takes an integer and passes it to the HashClient instance.
	*/
	StackCut mw5 = new StackCut();
	mw5.StackCut(int param);
	mw5.push(Object param);
	mw5.pop(Object param);
	mw5.displayStacks();
	mw5.peek();
	
	/**
	*Constructor for Student.
	*@param ListSize Takes an integer and passes it to the HashClient instance.
	*/
	Student mw6 = new Student();
	mw6.getID();
	mw6.getName();
	mw6.getMajor();
	mw6.getGPA();
	mw6.getTG();
	
/**
*This class was created for Middleware.
*/