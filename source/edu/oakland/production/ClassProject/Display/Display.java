package edu.oakland.production.ClassProject.Display;

import edu.oakland.production.ClassProject.Middleware.Middleware;

import java.util.*;

/**
 * 
 * @author Display Group Mel Chi Ben Dickman and the whole group.
 * @version 5.0 Half of part 1A works, part 1B no go, part 1C no go, part 2 done.
 * @since 4/11/2015
 */
public class Display {
	
	
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
	private int E_100K = 1000;
	/**
	 * final value for 200k
	 */
	private final int E_200K = 2000;
	
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
	

	
	public String middlewhereString;
	public StringBuilder middlewhereStringBuilder = new StringBuilder();
	public MockMiddlewhere middlewhere = new MockMiddlewhere();
	
	public Display() {
		this.runnable = true;
		this.scan = new Scanner(System.in);
	}
	
	
	/**
	 * Constructor that takes in a string instead of system.in
	 * @param jUnitTesting
	 */
	public Display(String jUnitTesting) {
		this.runnable = true;
		this.scan = new Scanner(jUnitTesting);
	}
	
	/**
	 * Sets the 100k value in case of testing because 100k is way too high for LinkedList
	 * @param value the value
	 */
	public void set100kValueForTest(int value){
		this.E_100K = value;
	}



	/**
	 * Menu option for number of elements
	 * @param menuString the scan.next value
	 * @return returns num of elements
	 */
	private int getNumOfElements(String menuString) {
		int numOfElements;

		switch (menuString) {
		case "1":
			numOfElements = E_100K;
			break;
		case "2":
			numOfElements = E_200K;
			break;
		case "3":
			numOfElements = E_400K;
			break;
		default:
			System.out.println("That was not a valid input. Please try again!");
			numOfElements = -1;
			break;
		}

		return numOfElements;
	}

	/**
	 * Method just prints print element choices
	 */
	private void printElementChoices() {
		System.out.println("1. " + String.format("%,d", E_100K) + " elements.");
		System.out.println("2. " + String.format("%,d", E_200K) + " elements.");
		System.out.println("3. " + String.format("%,d", E_400K) + " elements.");
	}


	/**
	 * main method for display
	 * @return String of certain inputs, the students cut and the student on scholarship
	 */
	public String runMainMenu() {
		sb = new StringBuilder();
		while (runnable) {
			if (isFirstRun) {
				System.out
						.println("Herro. Please press the corresponding key to enter the JCF container: ");
				this.isFirstRun = false;
			} else {
				System.out
						.println("\nHerro again! Please press the corresponding key to enter the JCF container: ");

			}

			System.out.println("1. ArrayList and Linked List"); // Part 1: A
			System.out.println("2. BinaryTree"); // Part 1: B
			System.out.println("3. Hash Table"); // Part 1: C
			System.out.println("4. Enter Students."); // Part 2
			System.out.println("5. Exit.");

			System.out.print(">> ");
			menuString = scan.next();
			switch (menuString) {
			case "1": /// Part 1: A
				arrayList = true;
				while (arrayList) {
					System.out.println("You have selected ArrayList and LinkedList. Please select the number of elements: ");
					
					/// How many elements does the user want?
					printElementChoices();
					System.out.print(">> ");
					
					/// Store entered value as int
					int numOfElements = getNumOfElements( scan.next() );
					
					/// If invalid input, try again
					if (numOfElements == -1)
						continue;
					
					System.out.println("You have selected " + String.format("%,d", numOfElements) + " elements.");
					
					middleware.setNumberOfElements(numOfElements);
					
					//JUNIT
					middlewhere.setNumberOfElements(numOfElements);
					
					middleware.createArrayList();
					middleware.llMW(numOfElements);
					
					//JUNIT
					middlewhere.createArrayList();
					middlewhere.llMW(numOfElements);
															
					
					returnTime = middleware.sortArrayList(true);
					System.out.println("The search time for arrayList selection sort was: " + returnTime + " ms");
					returnTime = middleware.sortLinkedList(true);
					System.out.println("The time for LinkedList selection sort was: " + returnTime + " ms");
			
										
					///Show Big Oh
					System.out.println("The big o data is: \n\t ArrayList: " + middleware.bigOAL(true) + "\n\t Linked List: " + middleware.bigOLL(true));
						
					
					//JUNIT
					middlewhereStringBuilder.append(middlewhere.sortArrayList(true));
					middlewhereStringBuilder.append(middlewhere.sortLinkedList(true));
					middlewhereStringBuilder.append(middlewhere.bigOAL(true));
					middlewhereStringBuilder.append(middlewhere.bigOLL(true));
					
					returnTime = middleware.sortArrayList(false);
					System.out.println("The search time for arrayList bubble sort was: " + returnTime + " ms");
					returnTime = middleware.sortLinkedList(false);
					System.out.println("The time for LinkedList bubble sort was: " + returnTime + " ms");
										
					//Show Big Oh
					System.out.println("The big O data is:\n\t ArrayList: " + middleware.bigOAL(false) + "\n\t Linked List: " + middleware.bigOLL(false));
					
					//JUNIT
					middlewhereStringBuilder.append(middlewhere.sortArrayList(false));
					middlewhereStringBuilder.append(middlewhere.sortLinkedList(false));
					middlewhereStringBuilder.append(middlewhere.bigOAL(false));
					middlewhereStringBuilder.append(middlewhere.bigOLL(false));
					
					
					
					
					searchOption = true;
					while (searchOption){
						System.out.println("What is the value you want to search for? [100,1000]");
						System.out.print(">> ");
						menuString = scan.next();
						try
						{
							int searchInt = Integer.parseInt(menuString);
							if (searchInt >= 100 && searchInt <= 1000){
								//LINKED LIST
								String timeString = middleware.searchLinkedList(searchInt, true);
								System.out.println("The time for LinkedList Binary search was: " + timeString);
								timeString = middleware.searchLinkedList(searchInt, false);
								System.out.println("The time for LinkedList Linear search was: " + timeString );
								

								//ARRAY LIST
								timeString = middleware.searchArrayList(searchInt, false);
								System.out.println("The time for ArrayList Linear search was: " + timeString);
								timeString = middleware.searchArrayList(searchInt, true);
								System.out.println("The time for ArrayList Binary search was: " + timeString);
								
								//JUNIT
								middlewhereStringBuilder.append(middlewhere.searchLinkedList(searchInt, true));
								middlewhereStringBuilder.append(middlewhere.searchLinkedList(searchInt, false));
								middlewhereStringBuilder.append(middlewhere.searchArrayList(searchInt, true));
								middlewhereStringBuilder.append(middlewhere.searchArrayList(searchInt, false));
								
								searchOption = false;
							}
							else{
								System.out.println("Not a valid value.");
							}
						}
						catch (Exception e){
							System.out.println("Not a numerical value.");
						}
					}

					arrayList = false;
					break;
					
				}
				break;

			case "2": // Part 1: B
				binaryOption = true;
				while (binaryOption) {
					System.out.println("You have selected a Binary Tree. Please select the number of elements: ");

					// / How many elements does the user want?
					printElementChoices();
					System.out.print(">> ");

					// / Store entered value as int
					int numOfElements = getNumOfElements(scan.next());

					// / If invalid input, try again
					if (numOfElements == -1)
						continue;

					System.out.println("You have selected "
							+ String.format("%,d", numOfElements)
							+ " elements.");
					
					middleware.binaryTreeMW(numOfElements);
					
					//JUNIT TEST
					middlewhere.binaryTreeMW(numOfElements);
					
					if (a == -1){
						searchOption = true;
						while (searchOption) {
							System.out.println("What is the first int to search?  DOMAIN: [400000, 800000]");
							System.out.print(">> ");
							try {
								tempValueHold = scan.nextInt();
								if (tempValueHold >= 400000 && tempValueHold <= 800000) {
									this.a = tempValueHold;
									searchOption = false;
								} else {
									searchOption = true;
									System.out.println("Enter a valid value");
								}
							} catch (Exception e) {
								System.out.println("Enter a valid value");
							}
						}

						searchOption = true;
						while (searchOption) {
							System.out.println("What is the 2nd int to search?  DOMAIN: [200000, 800000]");
							System.out.print(">> ");
							try {
								tempValueHold = scan.nextInt();
								if (tempValueHold >= 400000 && tempValueHold <= 800000) {
									this.b = tempValueHold;
									searchOption = false;
								} else {
									searchOption = true;
									System.out.println("Enter a valid value");
								}
							} catch (Exception e) {
								System.out.println("Enter a valid value");
							}
						}

						searchOption = true;
						while (searchOption) {
							System.out.println("What is the 3rd int to search?  DOMAIN: [400000, 800000]");
							System.out.print(">> ");
							try {
								tempValueHold = scan.nextInt();
								if (tempValueHold >= 400000 && tempValueHold <= 800000) {
									this.c = tempValueHold;
									searchOption = false;
								} else {
									searchOption = true;
									System.out.println("Enter a valid value");
								}
							} catch (Exception e) {
								System.out.println("Enter a valid value");
							}
						}
					}
					

					//this.a = 516521;
					//this.b = 767623;
					//this.c = 612312;
					
					// PREORDER SEARCH
					System.out.println("Preorder nodes searched: " + middleware.calculatePreorderNodesSearched(this.a, this.b, this.c));
					
					// ORDER SEARCH
					System.out.println("In order nodes searched: " + middleware.calculateInOrderNodesSearched(this.a, this.b, this.c));
					
					System.out.println(middleware.calculateBigORelationship(numOfElements));
					
					//JUNIT TEST
					middlewhereStringBuilder.append(middlewhere.calculatePreorderNodesSearched(this.a, this.b, this.c));
					middlewhereStringBuilder.append(middlewhere.calculatePreorderSearchDuration(this.a, this.b, this.c));
					middlewhereStringBuilder.append(middlewhere.calculateInOrderNodesSearched(this.a, this.b, this.c));
					middlewhereStringBuilder.append(middlewhere.calculateInOrderSearchDuration(this.a, this.b, this.c));
					middlewhereStringBuilder.append(middlewhere.calculateBigORelationship(numOfElements));
					
					binaryOption = false;
				}
				break;
			case "3":
				hashTableOption = true;
				while (hashTableOption) {
					System.out.println("You have selected Hash Tables. Please select the number of elements: ");
					
					/// How many elements does the user want?
					printElementChoices();
					System.out.print(">> ");
					
					/// Store entered value as int
					int numOfElements = getNumOfElements( scan.next() );
					
					/// If invalid input, try again
					if (numOfElements == -1)
						continue;
					
					System.out.println("You have selected " + String.format("%,d", numOfElements) + " elements.");
					
					middleware.makeHashTable(numOfElements);

					//JUNIT TEST
					middlewhere.makeHashTable(numOfElements);
					

						
					if (a == -1){
						searchOption = true;
						while (searchOption) {
							System.out.println("What is the first int to search?  DOMAIN: [400000, 800000]");
							System.out.print(">> ");
							try {
								tempValueHold = scan.nextInt();
								if (tempValueHold >= 400000 && tempValueHold <= 800000) {
									this.a = tempValueHold;
									searchOption = false;
								} else {
									searchOption = true;
									System.out.println("Enter a valid value");
								}
							} catch (Exception e) {
								System.out.println("Enter a valid value");
							}
						}

						searchOption = true;
						while (searchOption) {
							System.out.println("What is the 2nd int to search?  DOMAIN: [200000, 800000]");
							System.out.print(">> ");
							try {
								tempValueHold = scan.nextInt();
								if (tempValueHold >= 400000 && tempValueHold <= 800000) {
									this.b = tempValueHold;
									searchOption = false;
								} else {
									searchOption = true;
									System.out.println("Enter a valid value");
								}
							} catch (Exception e) {
								System.out.println("Enter a valid value");
							}
						}

						searchOption = true;
						while (searchOption) {
							System.out.println("What is the 3rd int to search?  DOMAIN: [400000, 800000]");
							System.out.print(">> ");
							try {
								tempValueHold = scan.nextInt();
								if (tempValueHold >= 400000 && tempValueHold <= 800000) {
									this.c = tempValueHold;
									searchOption = false;
								} else {
									searchOption = true;
									System.out.println("Enter a valid value");
								}
							} catch (Exception e) {
								System.out.println("Enter a valid value");
							}
						}
					}
						
						
					returnTime = middleware.searchValuesAndGetTime(a);
					System.out.println("Searched: " + a + "\tHash Search Took: " + returnTime + " ns");
					returnTime = middleware.searchValuesAndGetTime(b);
					System.out.println("Searched: " + b + "\tHash Search Took: " + returnTime + " ns");
					returnTime = middleware.searchValuesAndGetTime(c);
					System.out.println("Searched: " + c + "\tHash Search Took: " + returnTime + " ns");
					double hold = middleware.getBigO();
					System.out.println("BigO: " + hold);
					System.out.println("1 element searched");
					hashTableOption = false;
					
					middlewhereStringBuilder.append(middlewhere.searchValuesAndGetTime(a));
					middlewhereStringBuilder.append(middlewhere.searchValuesAndGetTime(b));
					middlewhereStringBuilder.append(middlewhere.searchValuesAndGetTime(c));
					middlewhereStringBuilder.append(middlewhere.getBigO());
				}
				break;

			case "44":
			case "4":
				System.out.println("You have selected class schedule. Please enter students data: ");

				middleware.clearTheStack();
				
				if (menuString.equals("4"))
					createClass();
				else
					// if (menuString == "44")
					createClass2();


				
				boolean flagExit = false;
				boolean stayIn = true;
				String tempToParse;
				String returnStuff;
				// CUT CLASS
				studentOption = true;
				while (studentOption) {
					System.out.println("Do you want to cut students?");
					System.out.println("1.) Continue");
					System.out.println("2.) Exit (You will lose everything)");
					System.out.print(">> ");
					
					menuString = scan.next();
					switch (menuString) {
					case "1":
						System.out.println("How many students do you want to cut?");
						tempToParse = scan.next();
						while (stayIn){
							try {
								cutStudentAmount = Integer.parseInt(tempToParse);
								if (cutStudentAmount > totalStudentCount){
									System.out.println(
											"Need to enter valid number to cut students.");
									System.out.print(">> ");
									tempToParse = scan.next();
								}
								else{
									
								stayIn = false;
								}
							} catch (Exception e) {
								System.out.println(
										"Need to enter valid number to cut students.");
								System.out.print(">> ");
								tempToParse = scan.next();
							}
						}
						stayIn = true;

						System.out.println("The following students were cut: ");
						System.out.println();

						returnStuff = middleware.cutStudents(cutStudentAmount, true, 0);
						System.out.println(returnStuff);
						
						//FOR OVERALL JUNIT TEST
						sb.append(returnStuff.trim()); // FOR OVERALL TEST
						
											
						System.out.println("The following students were not cut: ");
						System.out.println();
						
						returnStuff = middleware.cutStudents(cutStudentAmount, false, 0);
						System.out.println(returnStuff);
						//sb.append(returnStuff);
						
						//FOR THE DUMB CLASS TEST
						middlewhereStringBuilder.append(middlewhere.cutStudents(cutStudentAmount, true, 0));
						middlewhereStringBuilder.append(middlewhere.cutStudents(cutStudentAmount, false, 0));
						
						studentOption = false;
						break;
					case "2":
						flagExit = true;
						studentOption = false;
						break;
					default:
						System.out.println("Invalid entry.");
						continue;
					}
				}
				if (flagExit) {
					break;
				}

				// Process Scholarship
				studentOption = true;
				while (studentOption) {
					System.out.println("Do you want to Process Scholarships?");
					System.out.println("1.) Process Scholarships for students");
					System.out.println("2.) Exit (You will lose everything)");
					System.out.print(">> ");
					menuString = scan.next();
					switch (menuString) {
					case "1":
						System.out.println("Process scholarships the class");
						
						System.out.println("How many students do you want to get scholarship?");
						tempToParse = scan.next();
						while (stayIn){
							try {
								scholarshipStudent = Integer.parseInt(tempToParse);
								if (scholarshipStudent > (totalStudentCount - cutStudentAmount)){
									System.out.println(
											"There are too many scholarships compared to students.");
									System.out.print(">> ");
									tempToParse = scan.next();									
								}
								else {
								stayIn = false;
								}
								
							} catch (Exception e) {
								System.out.println(
										"Need to enter valid number to cut students.");
								System.out.print(">> ");
								tempToParse = scan.next();
							}
						}
						stayIn = true;

						
						System.out.println("The following students received scholarships: ");
						System.out.println();
						returnStuff = (middleware.cutStudents(totalStudentCount - cutStudentAmount - scholarshipStudent, false, cutStudentAmount));
						System.out.println(returnStuff);
						sb.append(returnStuff.trim());
						
						//JUNIT TEST
						middlewhereStringBuilder.append(middlewhere.cutStudents(totalStudentCount - cutStudentAmount - scholarshipStudent, false, cutStudentAmount));
						
						System.out.println("The following students did not receive scholarships: ");
						System.out.println();
						returnStuff = (middleware.cutStudents(totalStudentCount - cutStudentAmount - scholarshipStudent, true, cutStudentAmount));
						System.out.println(returnStuff);
						//sb.append(returnStuff);
						
						//JUNIT TEST
						middlewhereStringBuilder.append(middlewhere.cutStudents(totalStudentCount - cutStudentAmount - scholarshipStudent, false, cutStudentAmount));
						
						studentOption = false;
						break;
					case "2":
						flagExit = true;
						studentOption = false;
						break;
					default:
						System.out.println("Invalid entry.");
						continue;
					}
				}
				if (flagExit) {
					break;
				}
				
				// reinstate class
				studentOption = true;
				while (studentOption) {
					System.out.println("Do you want to reinstate to class?");
					System.out.println("1.) Reinstate to Class");
					System.out.println("2.) Exit (You will lose everything)");
					System.out.print(">> ");
					menuString = scan.next();
					switch (menuString) {
					case "1":
						System.out.println("Reinstate to people to the class");
						
						returnStuff = (middleware.getThesis());
						System.out.println(returnStuff);
						//sb.append(returnStuff);
						
						middlewhereStringBuilder.append(middlewhere.getThesis());
						
						studentOption = false;
						break;
					case "2":
						flagExit = true;
						studentOption = false;
						break;
					default:
						System.out.println("Invalid entry.");
						continue;
					}
					middleware.clearTheStack();
					System.out.println("CLASS DONE.");
				}

				break;
			case "5":
				runnable = false;
				System.out.println("Goodbye!");
				break;
			default:
				System.out
						.println("That was not a valid input. Please try again!");
				continue;
			}
			


		}
		this.middlewhereString = middlewhereStringBuilder.toString();
		
		return sb.toString();
	}


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
		
		System.out.println("How many students do you want to add?");
		tempToParse = scan.next();
		while (stayIn){
			try {
				this.totalStudentCount = Integer.parseInt(tempToParse);
				if (this.totalStudentCount < 10){
					System.out.println("Min class is 10 students, How many students do you want to add?");
					tempToParse = scan.next();
				}
				else{
				stayIn = false;
				}
			} catch (Exception e) {
				System.out.println(
						"Not a valid number. How many students do you want to add?");
				System.out.print(">> ");
				tempToParse = scan.next();
			}
		}
		stayIn = true;

		middleware.setStackSize(this.totalStudentCount);
		
		//JUNIT TEST
		middlewhere.setStackSize(this.totalStudentCount);
		
		while (stayIn) {
			System.out.println("Enter student data:");
			System.out.println("What is the student's Grizzly ID?");
			System.out.print(">> ");
			tempToParse = scan.next();
			
			while (notSuccessful){
				try {
					grizzlyID = Integer.parseInt(tempToParse);
					notSuccessful = false;
				} catch (Exception e) {
					System.out.println(
							"ID Entered is not a valid number,"
							+ " What is the student's Grizzly ID?");
					System.out.print(">> ");
					tempToParse = scan.next();
				}
			}
			notSuccessful = true;

			System.out.println("What is the student's name?");
			System.out.print(">> ");
			name = scan.next();
			System.out.println("What is the major of the student");
			System.out.print(">> ");
			major = scan.next();

			System.out.println("What is the GPA");
			System.out.print(">> ");
			tempToParse = scan.next();
			do {
				try {
					gpa = Double.parseDouble(tempToParse);
					notSuccessful = false;
				} catch (Exception e) {
					System.out.println(
							"GPA Entered is not a valid number, "
							+ "What is the GPA?");
					System.out.print(">> ");
					tempToParse = scan.next();
				}
			} while (notSuccessful);
			notSuccessful = true;
			System.out.println("Thesis grade?");
			System.out.print(">> ");
			tempToParse = scan.next();
			do {
				try {
					thesisGrade = Integer.parseInt(tempToParse);
					notSuccessful = false;
				} catch (Exception e) {
					System.out.println(
								"Thesis Entered is not a valid number, "
								+ "What is the student's thesis grade?");
					System.out.print(">> ");
					tempToParse = scan.next();
				}
			} while (notSuccessful);
			notSuccessful = true;

			//Create the student
			middleware.createStudent(grizzlyID, name, major, gpa, thesisGrade);

			counter++;
			if (counter >= this.totalStudentCount) {
				stayIn = false;
			}
		} 
		return true;
	}

}