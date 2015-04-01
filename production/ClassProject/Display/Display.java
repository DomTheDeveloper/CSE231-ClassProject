package edu.oakland.production.ClassProject.Display;

import java.util.*;

/**
 * 
 * @author Display Group
 * @version 2.1 Hopefully this works
 * @since 3/30/2015
 */
public class Display
{
	Middleware middleware = new Middleware();
	Scanner scan = new Scanner(System.in);
	String first;
	String second;
	String third;
	/**
	 * Constructor
	 */
	public Display(){

	}
	
	public void mainMenu(){

		scan = new Scanner(System.in);
		boolean stayIn = true;
		do{

			System.out.println("What do you want to do, 1,2,3,4");
			switch (scan.next())
			{
				case "1":
					Lists();
					System.out.println("lists done");
					break;
			
				case "2":
					BinaryTree();
					System.out.println("Binary Completed");
					break;
				case "3":
					HashTable();
					System.out.println("Hash Completed");
					break;
				case "4":
					SchedulingClass();
					System.out.println("Schedule Completed");
					break;
				case "5":
					stayIn = false;
					break;
				default:
					System.out.println("Invalid Entry");
			}
			
			if (stayIn == false){
				System.out.println("Exit");
				break;
			}

            System.out.println("Would you like to do another search? (y/n) search");
            switch (scan.next())
            {
            	case "y":
            		break;
            	case "n":
            	default:
            		stayIn = false;
            		break;
            }


		}while (stayIn);
		System.out.println("Exit program");
		scan.close();
	}
	
	public void lists(){
        boolean stayIn = true;
		boolean notSuccessful = true;
		boolean invalidOption = false;
		int numberOfElements;
		int element;
		String tempToParse;
        do{

            System.out.println("Choose the amount of elements for your arraylist and linkedlist: ");
            System.out.println("1.) 100,000 Elements (1)");
            System.out.println("2.) 200,000 Elements (2)");
            System.out.println("3.) 400,000 Elements (3)");
            System.out.println("4.) Exit ArrayList and LinkedList Menu (4)");
            System.out.print("");

            switch (scan.next())
			{
            	case "1":
                    numberOfElements = 100000;
            		System.out.println("You have selected 100,000 elements");
                    break;
				case "2":
                    numberOfElements = 200000;
	                System.out.println("You have selected 200,000 elements");
					break;
				case "3":
                    numberOfElements = 400000;
	                System.out.println("You have selected 400,000 elements");
					break;
				case "4":
					stayIn = false;
					break;
				default:
					System.out.println("Invalid Entry");
					invalidOption = true;
					break;
					
			}
          
			if (stayIn == false){
				System.out.println("Exit");
				break;
			}       
			
			if (!invalidOption){
				// CREATE LIST
				// middleware.list(numberOfElements);
				
				// ASK TO SORT THE LISTS
				// sortLinked();
				// sortArray();
				// ASK FOR THE TIME TO SORT
				// sortTimeLinked();
				// sortTimeArray();
				// ASK FOR THE BIGO PARAMETER
				// bigOLink();
				// bigOArray();
				System.out.println("What element do you want to see?");
				tempToParse = scan.next();
				
				do{
					try{
						element = Integer.parseInt(tempToParse);
						notSuccessful = false;
					} catch (Exception e) {
						System.out.println("NOT A VALID NUMBER, GIVE A NUMBER");
						tempToParse = scan.next();
					}
				} while (notSuccessful);
				notSuccessful = true;
				// SEARCH THE STRUCTURE Linear
				// searchLinear(element);
				// SEARCH THE STRUCTURE BINARY
				// searchBinary(element);
			}
			invalidOption = false;
			


            System.out.println("Would you like to do another LinkedList search? (y/n) search");
            switch (scan.next())
            {
            	case "y":
            		break;
            	case "n":
            	default:
            		stayIn = false;
            		break;
            }

           
        } while(stayIn);
    }
	
	public void binaryTree(){

        boolean stayIn = true;
		String temp;
		int numberOfElements;
		boolean invalidOption = false;
		
		do{
			System.out.println("Choose the number of elements.");
			System.out.println("1. 100k Elements (1)");
			System.out.println("2. 200k Elements (2)");
			System.out.println("3. 400k Elements (3)");
			System.out.println("4. Exit to main menu (4)");
            System.out.print("");
			
			String response = scan.next();
			
			if (response.equals("4")){
				stayIn = false;
				break;
			}
			
			switch(response)
			{
			case "1":
				numberOfElements = 100000;
				break;
			case "2":
				numberOfElements = 200000;
				break;
			case "3":
				numberOfElements = 400000;
				break;
			case "4":
				stayIn = false;
				break;
			default :
				System.out.println("Did not choose a correct version");
				invalidOption = true;
				break;
			}
  
			if (stayIn == false){
				System.out.println("Exit");
				break;
			}       
	
			if (!invalidOption){
				//middleware.binary(numberofElements);
				// SELECT 3 STRINGS
				if (first == "" && second == "" && third == "")
				{
					System.out.println("What is the first string to search?");
					first = scan.next();
					System.out.println("What is the second string to search?");
					second = scan.next();
					System.out.println("What is the third string to search?");
					third = scan.next();
				}
				else
				{
					System.out.println("Values of the search have been set, replace? (y/n)");
					temp = scan.next();
					if ("y".equals(response))
					{
						System.out.println("What is the first string to search?");
						first = scan.next();
						System.out.println("What is the second string to search?");
						second = scan.next();
						System.out.println("What is the third string to search?");
						third = scan.next();
					}
				}
				invalidOption = false;
	
	
				// PREORDER SEARCH
				// searchPreorderBinary(first, second, third);
				// ORDER SEARCH
				// searchOrderedBinary(first, second, third);
				// GET TIME ELAPSED
				// teimElapsedBinary();
				// GET BIG O RELATIONSHIP
				//	bigOBinary();
			}

			System.out.println("Would you like to do another search? (y/n)");
            response = scan.next();
            if ("y".equals(response))
            {
                   //Run again
            }
            else
            {
            	stayIn = false;
                break;
            }


		} while (stayIn);
	}
	
	public void hashTable(){
        boolean stayIn = true;
		String temp;
		int numberOfElements;
		boolean invalidOption = false;
        do{

            System.out.println("Choose the amount of elements for your Random HashTable: ");
            System.out.println("1.) 100,000 Elements (1)");
            System.out.println("2.) 200,000 Elements (2)");
            System.out.println("3.) 400,000 Elements (3)");
            System.out.println("4.) Exit Hashtable Menu (4)");
            System.out.print("");

            switch (scan.next())
			{
				case "1":
					numberOfElements = 100000;
					break;
				case "2":
					numberOfElements = 200000;
					break;
				case "3":
					numberOfElements = 400000;
					break;
				case "4":
					stayIn = false;
					break;
				default :
					System.out.println("Did not choose a correct version");
					invalidOption = true;
					break;
				}
	  
				if (stayIn == false){
					System.out.println("Exit");
					break;
				}       
		
				if (!invalidOption){
					//middleware.binary(numberofElements);
					// SELECT 3 STRINGS
					if (first == "" && second == "" && third == "")
					{
						System.out.println("What is the first string to search?");
						first = scan.next();
						System.out.println("What is the second string to search?");
						second = scan.next();
						System.out.println("What is the third string to search?");
						third = scan.next();
					}
					else
					{
						System.out.println("Values of the search have been set, replace? (y/n)");
						temp = scan.next();
						if ("y".equals(temp))
						{
							System.out.println("What is the first string to search?");
							first = scan.next();
							System.out.println("What is the second string to search?");
							second = scan.next();
							System.out.println("What is the third string to search?");
							third = scan.next();
						}
					}
					invalidOption = false;
		
		
					// PREORDER SEARCH
					// searchPreorderHash(first, second, third);
					// ORDER SEARCH
					// searchOrderedHash(first, second, third);
					// GET TIME ELAPSED
					// timeElapsedHash();
					// GET BIG O RELATIONSHIP
					//	bigOHash();
				}
			
			

			
            System.out.println("Would you like to do another hashtable search? (y/n) search");
            switch (scan.next())
            {
            	case "y":
            		break;
            	case "n":
            	default:
            		stayIn = false;
            		break;
            }

           
        } while(stayIn);
    }
	
	public void schedulingClass(){
		boolean isClassMade = false;
		boolean stayIn = true;
		do {
			System.out.println("Select an option");
			System.out.println("1.) Input student data into class. Enter 1");
			System.out.println("2.) Cut Last 5 students Enter 2");
			System.out.println("3.) Process Scholarships Enter 3");
			System.out.println("4.) Reinstate Students to class Enter 4");
			System.out.println("5.) Exit Enter 5" );
			String response = scan.next();
			String temp = "";
			
			if ("5".equals(response)){
				stayIn = false;
			}
			else if (!"1".equals(response) && isClassMade == false){
				System.out.println("Class has not been made yet. Do you want to make the class? (y/n)");
	            response = scan.next();
	            if ("y".equals(response))
	            {
					temp = middleware.CreateClass();
					isClassMade = true;
	            }

			}
			else{
				
				switch(response)
				{
				case "1":
					if (isClassMade){
						System.out.println("Class already was made, do you want to enter new data? (y/n)");
			            if ("y".equals(response))
			            {
			            	//CLEAR 
							createClass();
							isClassMade = true;
			            }
					}
					else{
						createClass();
						System.out.println("Class Made");
						isClassMade = true;
					}
					break;
				case "2":
					temp = middleware.CutClass();
					System.out.println("Cut Class");
					break;
				case "3":
					temp = middleware.Scholarship();
					System.out.println("Scholar");
					break;
				case "4":
					temp = middleware.ResetClass();
					System.out.println("Reset Class");
					break;
				default:
					System.out.println("Invalid entry.");
				}
				System.out.println("Would you like to do continue in the class edit menu? (y/n)");
	            response = scan.next();
	            if ("y".equals(response))
	            {
	                   //Run again
	            }
	            else
	            {
	                stayIn = false;
	            }
			}
				
		}while(stayIn);
		
	}
	
	private void createClass(){
	
		boolean stayIn = true;
		
		do{
			boolean notSuccessful = true;
			String tempToParse;
			String temp;
			int grizzlyID;
			String name;
			String major;
			double gpa;
			int thesisGrade;
			System.out.println("Enter student data:");
			System.out.println("What is the student's Grizzly ID?");
			tempToParse = scan.next();
			do{
				try{
					grizzlyID = Integer.parseInt(tempToParse);
					notSuccessful = false;
				} catch (Exception e) {
					System.out.println("ID Entered is not a valid number, What is the student's Grizzly ID?");
					tempToParse = scan.next();
				}
			} while (notSuccessful);
			notSuccessful = true;
			
			System.out.println("What is the student's name?");
			name = scan.next();
			System.out.println("What is the major of the student");
			major = scan.next();
		
			System.out.println("What is the GPA");
			tempToParse = scan.next();
			do{
				try{
					gpa = Double.parseDouble(tempToParse);
					notSuccessful = false;
				} catch (Exception e) {
					System.out.println("GPA Entered is not a valid number, What is the GPA?");
					tempToParse = scan.next();
				}
			} while (notSuccessful);
			notSuccessful = true;
			System.out.println("Thesis grade?");
			tempToParse = scan.next();
			do{
				try{
					thesisGrade = Integer.parseInt(tempToParse);
					notSuccessful = false;
				} catch (Exception e) {
					System.out.println("Thesis Entered is not a valid number, What is the student's thesis grade?");
					tempToParse = scan.next();
				}
			} while (notSuccessful);
			notSuccessful = true;
		
			/// CREATE STUDENT
			
			
			System.out.println("Would you like to do continue in the class edit menu? (y/n)");
			temp = scan.next();
			if ("y".equals(temp))
			{
				   //Run again
			}
			else
			{
				stayIn = false;
			}
		} while (stayIn);
	}
}
