package edu.oakland.production.ClassProject;

import java.io.*;
import java.util.*;

public class Display
{
	public Display(){

	}


	Middleware middleware = new Middleware();
	
	private void HashTable(){
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
        
    }



	private void SchedulingClass(){
		boolean isClassMade = false;
		boolean getOut = false;

		do
		{
			System.out.println("Select an option");
			System.out.println("1.) Input student data into class. Enter 1");
			
			//option 2 shows the following
			//Shows grizzy ids and names of students cut
			//shows description of last student cut
			//Show grizzy ids and names of the remaining students
			System.out.println("2.) Cut Last 5 students Enter 2");


			//option 3
			//show students on scholarship
			//show students that are not on scholarship
			System.out.println("3.) Process Scholarships Enter 3");
		
			System.out.println("4.) Reinstate Students to class Enter 4" );
			System.out.println("5.) Exit Enter 5" );
			
			Scanner scan = new Scanner(System.in);
			String answer = scan.Next();
			
			if (isClassMade == false && answer != "1"){
				System.out.println("Class has not been made");
			
			}
			else{
				if (answer == "1"){
				
					//DONT KNOW WHAT YOU ARE RETURNING YET, THESE METHODS WILL RETURN SOMETHIKNG FOR US TO PRINT
					middleware.CreateClass();
				}
				else if (answer == "2"){
					middleware.CutClass();
				}
				else if (answer == "3"){
					middleware.Scholarship();
				}
				else if (answer == "4"){
					String blah = middleware.ResetClass(){
				}
				else if (answer == "5"){
					getOut = true;
				}
				else {
					System.out.println("You suck at typing.");
				}
				
			scan.close();
			}while (getOut == false);
		
		}
	}
}