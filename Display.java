 package edu.oakland.production.ClassProject;
import java.util.*;

/**
 * 
 * @author Display Group
 * @version 1.0 The start
 * @since 3/24/2015
 */
public class Display
{
	Middleware middleware = new Middleware();
	Scanner scan = new Scanner(System.in);
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
					//Lists()
					System.out.println("lists done");
					break;
			
				case "2":
					HashTable();
					System.out.println("Hash Completed");
					break;
				case "3":
					BinaryTree();
					System.out.println("Binary Completed");
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
	
	public void HashTable(){
        boolean stayIn = true;
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
                    //Call Method with 100,000 elements
                    System.out.println("You have selected 100,000 elements");
                    break;
				case "2":
	                //Call Method with 200,000 elements
	                System.out.println("You have selected 200,000 elements");
					break;
				case "3":
	                //Call Method with 400,000 elements
	                System.out.println("You have selected 400,000 elements");
					break;
				case "4":
					//SchedulingClass();
					System.out.println("Schedule");
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
	
	public void BinaryTree(){
		long start_time = 0;
		long end_time = 0;  
        boolean stayIn = true;

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
				start_time = System.currentTimeMillis();
				//Call some method
				end_time = System.currentTimeMillis();
				System.out.println("100k element created");
				System.out.println("Binary search took : "+ (end_time - start_time)+ " ms");
				break;
			case "2":
				start_time = System.currentTimeMillis();
				//Call some method
				end_time = System.currentTimeMillis();
				System.out.println("200k element created");
				System.out.println("Binary search took : "+ (end_time - start_time)+ " ms");
				break;
			case "3":
				start_time = System.currentTimeMillis();
				//Call some method
				end_time = System.currentTimeMillis();
				System.out.println("400k element created");
				System.out.println("Binary search took : "+ (end_time - start_time)+ " ms");
				break;
			default :
				System.out.println("Did not choose a correct version");
				break;
				
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


		}while (stayIn);

	
	
	}

	
	
	

	public void SchedulingClass(){
		boolean isClassMade = false;
		boolean stayIn = true;
		do {
			System.out.println("Select an option");
			System.out.println("1.) Input student data into class. Enter 1");
			System.out.println("2.) Cut Last 5 students Enter 2");
			System.out.println("3.) Process Scholarships Enter 3");
			System.out.println("4.) Reinstate Students to class Enter 4");
			System.out.println("5.) Exit Enter E" );
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
							temp = middleware.CreateClass();
							isClassMade = true;
			            }
					}
					else{
						temp = middleware.CreateClass();
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

}