package edu.oakland.production.ClassProject.Display;

import edu.oakland.production.ClassProject.Middleware.Middleware;

import java.util.*;
import junit.framework.*;

/**
 *
 * @author Eldari Gogiashvili.
 * @version 1.0
 * @since 4/5/2015
 */
public class MiddlewareTest extends TestCase {


		private boolean linkedListOn = true;

		/**
		 * boolean runnable
		 */
		private boolean runnable;

		/**
		 * first run boolean for a different prompt the first time
		 */
		private boolean isFirstRun = true;

		/**
		 * boolean to see if the arrayList is yes or no
		 */
		private boolean arrayList;

		/**
		 * binary option
		 */
		private boolean binaryOption;

		/**
		 * hash table option to check for input
		 */
		private boolean hashTableOption;
		/**
		 * Student option for students
		 */
		private boolean studentOption;

		/**
		 * Search option boolean to check if input search option is correct
		 */
		private boolean searchOption;

		/**
		 * Scanner variable for input scan
		 */
		private Scanner scan;

		/**
		 * menuString that takes the scan input
		 */
		private String menuString;

		/**
		 * Middleware object class instance
		 */
		private Middleware middleware = new Middleware();

		/**
		 * value when we get a return time to put in
		 */
		private double returnTime;

		/**
		 * String builder sb for junit test
		 */
		StringBuilder sb = new StringBuilder();

		// First, second, and third search values.

		/**
		 * search variable 1
		 */
		private int a = -1;

		/**
		 * search variable 2
		 */
		private int b;

		/**
		 * search variable 3
		 */
		private int c;

		/**
		 * final value for 100k
		 */
		private int E_100K = 100;

		/**
		 * final value for 200k
		 */
		private final int E_200K = 200000;

		/**
		 * final value for 400k
		 */
		private final int E_400K = 400000;

		/**
		 * Total Student Count
		 */
		private int totalStudentCount = 0;
		/**
		 * cut students amount
		 */
		private int cutStudentAmount = 0;

		/**
		 * amount of scholarship students
		 */
		private int scholarshipStudent = 0;

		/**
		 * Holds a temp value
		 */
		private int tempValueHold = 0;
		/**
		 * Default constructor for runnable and system.in
		 */
		public MockMiddlewhere middlewhere = new MockMiddlewhere();



		/**
		 * main method for display
		 * @return String of certain inputs, the students cut and the student on scholarship
		 */
		public String testMainMenu() {


				case "1":
					arrayList = true;
					while (arrayList) {

						int numOfElements = 100.

						middleware.setNumberOfElements(numOfElements);

						//JUNIT
						middlewhere.setNumberOfElements(numOfElements);

						middleware.createArrayList();
						middleware.llMW(numOfElements);

						//JUNIT
						middlewhere.createArrayList();
						middlewhere.llMW(numOfElements);


						returnTime = middleware.sortArrayList(true);
						AssertEquals(returnTime, middleware.sortArrayList(true));
						returnTime = middleware.sortLinkedList(true);
						AssertEquals(returnTime, middleware.sortLinkedList(true));


						returnBigO = middleware.bigOAL(true);
						AssertEquals(returnBigO, middleware.bigOAL(true));
						returnBigO = middleware.bigOLL(true)
						AssertEquals(returnBigO, middleware.bigOLL(true))


						returnTime = middleware.sortArrayList(false);
						AssertEquals(returnTime, middleware.sortArrayList(false));
						returnTime = middleware.sortLinkedList(false);
						AssertEquals(returnTime, middleware.sortLinkedList(false));

						//Show Big Oh

						returnBigO = middleware.bigOAL(false);
						AssertEquals(returnBigO, middleware.bigOAL(false));
						returnBigO = middleware.bigOLL(false);
						AssertEquals(returnBigO, middleware.bigOLL(true));

								int searchInt = 100

									//LINKED LIST
									returnTime = middleware.searchLinkedList(searchInt, true);
									AssertEquals(returnTime, middleware.searchLinkedList(searchInt, true));
									returnTime = middleware.searchLinkedList(searchInt, false);
									AssertEquals(returnTime, middleware.searchLinkedList(searchInt, false));


									//ARRAY LIST
									returnTime = middleware.searchArrayList(searchInt, false);
									AssertEquals(returnTime, middleware.searchArrayList(searchInt, false));
									returnTime = middleware.searchArrayList(searchInt, true);
									AssertEquals(returnTime, middleware.searchArrayList(searchInt, true));

						int numOfElements = 100

						middleware.binaryTreeMW(numOfElements);

						this.a = 516521;
						this.b = 767623;
						this.c = 612312;

						// PREORDER SEARCH
						returnPreorderNodesSearched = middleware.calculatePreorderNodesSearched(this.a, this.b, this.c);
						AssertEquals(returnPreorderNodesSearched, middleware.calculatePreorderNodesSearched(this.a, this.b, this.c));
						returnPreorderSearchDuration = middleware.calculatePreorderSearchDuration(this.a, this.b, this.c);
						AssertEquals(returnPreorderSearchDuration, middleware.calculatePreorderSearchDuration(this.a, this.b, this.c));

						returnInOrderNodesSearched = middleware.calculateInOrderNodesSearched(this.a, this.b, this.c);
						AssertEquals(returnInOrderNodesSearched, middleware.calculateInOrderNodesSearched(this.a, this.b, this.c));
						returnInOrderSearchDuration = middleware.calculateInOrderSearchDuration(this.a, this.b, this.c);
						AssertEquals(returnInOrderSearchDuration, middleware.calculateInOrderSearchDuration(this.a, this.b, this.c));


					 	returnBigO = middleware.calculateBigORelationship(numOfElements);
						AssertEquals(returnBigO, middleware.calculateBigORelationship(numOfElements));


						/// Store entered value as int
						int numOfElements = 100



						middleware.makeHashTable(numOfElements);

						this.a = 516521;
						this.b = 767623;
						this.c = 612312


						returnTime = middleware.searchValuesAndGetTime(a);
						AssertEquals(returnTime, middleware.searchValuesAndGetTime(a));
						returnTime = middleware.searchValuesAndGetTime(b);
						AssertEquals(returnTime, middleware.searchValuesAndGetTime(b));
						returnTime = middleware.searchValuesAndGetTime(c);
						AssertEquals(returnTime, middleware.searchValuesAndGetTime(c));
						double hold = middleware.getBigO();
						AssertEquals(hold, middleware.getBigO());







									cutStudentAmount = 0

							returnStuff = middleware.cutStudents(cutStudentAmount, true, 0);
							AssertEquals(returnStuff, middleware.cutStudents(cutStudentAmount, true, 0));

							returnStuff = middleware.cutStudents(cutStudentAmount, false, 0);
							AssertEquals(returnStuff, middleware.cutStudents(cutStudentAmount, false, 0));





									scholarshipStudent = 0




							returnStuff = (middleware.cutStudents(totalStudentCount - cutStudentAmount - scholarshipStudent, false, cutStudentAmount));
							AssertEquals(returnStuff, middleware.cutStudents(totalStudentCount - cutStudentAmount - scholarshipStudent, false, cutStudentAmount));

							returnStuff = (middleware.cutStudents(totalStudentCount - cutStudentAmount - scholarshipStudent, true, cutStudentAmount));
							AssertEquals(returnStuff, middleware.cutStudents(totalStudentCount - cutStudentAmount - scholarshipStudent, true, cutStudentAmoun);
							//sb.append(returnStuff);




							returnStuff = (middleware.getThesis());
							AssertEquals(returnStuff, middleware.getThesis());




		/*
		 * private boolean createClass2() { middleware.createStudent(1, "1", "1", 1,
		 * 1); middleware.createStudent(2, "2", "2", 2, 2);
		 * middleware.createStudent(3, "3", "3", 3, 3); middleware.createStudent(4,
		 * "4", "4", 4, 4); middleware.createStudent(5, "5", "5", 5, 5);
		 * middleware.createStudent(6, "6", "6", 6, 6); middleware.createStudent(7,
		 * "7", "7", 7, 7); middleware.createStudent(8, "8", "8", 8, 8);
		 * middleware.createStudent(9, "9", "9", 9, 9); middleware.createStudent(10,
		 * "10", "10", 10, 10); return true; }
		 */

		/**
		 * Creates class preloaded so we don't need to type it out
		 * @return true if successful
		 */
		private boolean createClass2() {
			this.totalStudentCount = 10;
			middleware.setStackSize(this.totalStudentCount);
			middleware.createStudent(677422, "1. Jones", "IT", 3.82, 95);
			middleware.createStudent(177993, "2. Smith", "IT", 3.47, 78);
			middleware.createStudent(444811, "3. Breaux", "CS", 3.95, 98);
			middleware.createStudent(113625, "4. Brady", "CS", 3.77, 92);
			middleware.createStudent(382707, "5. Rominske", "CS", 3.82, 79);
			middleware.createStudent(447447, "6. Hardy", "IT", 3.68, 99);
			middleware.createStudent(661284, "7. Kominsky", "IT", 3.23, 70);
			middleware.createStudent(855462, "8. O'Brien", "IT", 3.44, 85);
			middleware.createStudent(223344, "9. Chamberlain", "CS", 3.99, 96);
			middleware.createStudent(348689, "10. Grant", "CS", 3.88, 99);

			return true;
		}

		/**
		 * Create students, must create at least 10
		 * @return true if successful, crashes if isn't
		 */
		private boolean createClass() {

			boolean stayIn = true;
			boolean notSuccessful = true;
			int counter = 0;
			String tempToParse;
			int grizzlyID = -1;
			String name;
			String major;
			double gpa = -1;
			int thesisGrade = -1;


			this.totalStudentCount = 0

			stayIn = true;

			stacksize = middleware.setStackSize(this.totalStudentCount);
			AssertEquals(stacksize, middleware.setStackSize(this.totalStudentCount));


				grizzlyID = 0
				name = A
				major = A
				gpa = 0
				thesisGrade = 0

			student	= middleware.createStudent(grizzlyID, name, major, gpa, thesisGrade);
			AssertEquals(student, middleware.createStudent(grizzlyID, name, major, gpa, thesisGrade))


	}
