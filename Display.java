package edu.oakland.production.ClassProject;

package cse231;
import java.util.*;

/**
 * 
 * @author Display Group
 * @version 1.0 The start
 * @since 3/24/2015
 */
public class Display
{
	/**
	 * Constructor
	 */
	public Display(){

	}

	Middleware middleware = new Middleware();
	
	public void BinaryTree(){
		long start_time = 0;
		long end_time = 0;  
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("Choose the number of elements.");
			System.out.println("1. 100k Elements (A)");
			System.out.println("2. 200k Elements (B)");
			System.out.println("3. 400k Elements (C)");
            System.out.print(">");
			
			String response = scan.next();
			
			switch(response)
			{
			case "A":
				start_time = System.currentTimeMillis();
				//Call some method
				end_time = System.currentTimeMillis();
				System.out.println("100k element created");
				break;
			case "B":
				start_time = System.currentTimeMillis();
				//Call some method
				end_time = System.currentTimeMillis();
				System.out.println("200k element created");
				break;
			case "C":
				start_time = System.currentTimeMillis();
				//Call some method
				end_time = System.currentTimeMillis();
				System.out.println("400k element created");
				break;
			case "D":
				break;
				
			}
			System.out.println("Binary search took : "+ (end_time - start_time)+ " ms");
			System.out.println("Would you like to do another search? (y/n)");
            response = scan.next();
            if ("y".equals(response))
            {
                   //Run again
            }
            else
            {
                break;
            }
		}
		scan.close();
	
	
	}
	
	
	public void HashTable(){
        final Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Choose Number of Elements: ");
            System.out.println("A: 100,000 Elements");
            System.out.println("B: 200,000 Elements");
            System.out.println("C: 400,000 Elements");
            
            try {
                String choice = sc.nextLine();
                                
                if (choice.equals("A") || choice.equals("a")){
                    //Call Method with 100,000 elements
                    System.out.println("You have selected 100,000 elements");
                    break;
                }
                else if (choice.equals("B") || choice.equals("b")){
                    //Call Method with 200,000 elements
                    System.out.println("You have selected 200,000 elements");
                    break;
                }
                else if (choice.equals("C") || choice.equals("c")){
                    //Call Method with 400,000 elements
                    System.out.println("You have selected 400,000 elements");
                    break;
                }
                else {
                    System.out.println("Invalid Input. Try Again.");
                }
                
            } catch(final InputMismatchException e) {
                System.out.println("Invalid Input. Try again.");
            }
            
        } while(true);
        
        sc.close();
    }

	public void SchedulingClass(){
		boolean isClassMade = false;
		boolean stayIn = true;
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Select an option");
			System.out.println("1.) Input student data into class. Enter A");
			System.out.println("2.) Cut Last 5 students Enter B");
			System.out.println("3.) Process Scholarships Enter C");
			System.out.println("4.) Reinstate Students to class Enter D");
			System.out.println("5.) Exit Enter E" );
            System.out.print(">");
			String response = scan.next();
			String temp = "";
			
			if ("E".equals(response)){
				stayIn = false;
			}
			else if (!"A".equals(response) && isClassMade == false){
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
				case "A":
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
				case "B":
					temp = middleware.CutClass();
					System.out.println("Cut Class");
					break;
				case "C":
					temp = middleware.Scholarship();
					System.out.println("Scholar");
					break;
				case "D":
					temp = middleware.ResetClass();
					System.out.println("Reset Class");
					break;
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
		scan.close();
		
	}
}