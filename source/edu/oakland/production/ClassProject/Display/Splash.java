package edu.oakland.production.ClassProject.Display;

import edu.oakland.production.ClassProject.Display.Display;
import java.util.*;

/**
 * CSE 231 -- Class Project main class.
 * This class will run the splash, instantiate a Display object, and the whole program
 * will run from there.
 * @author DomTheDeveloper
 * @version 1.0
 * @since 2015-04-13
 */
public class Splash {
	/**
	 * Scanner variable for input scan
	 */
	private Scanner scan;
	/**
	 * menuString that takes the scan input
	 */
	private String menuString;
	
	public Splash(){
		this.scan = new Scanner(System.in);
	}

    public void runSplash() {

		System.out.println(); 
		System.out.println("  ::::::::   ::::::::  ::::::::::       ::::::::   ::::::::    :::     ");                                                                  
		System.out.println(" :+:    :+: :+:    :+: :+:             :+:    :+: :+:    :+: :+:+:     ");                                                                    
		System.out.println(" +:+        +:+        +:+                   +:+         +:+   +:+     ");                                                                    
		System.out.println(" +#+        +#++:++#++ +#++:++#            +#+        +#++:    +#+     ");                                                                    
		System.out.println(" +#+               +#+ +#+               +#+             +#+   +#+     ");                                                                    
		System.out.println(" #+#    #+# #+#    #+# #+#              #+#       #+#    #+#   #+#     ");                                                                    
		System.out.println("  ########   ########  ##########      ##########  ########  #######   ");     
		System.out.println();
		System.out.println("  ::::::::  :::            :::      ::::::::   ::::::::    ");                   
		System.out.println(" :+:    :+: :+:          :+: :+:   :+:    :+: :+:    :+:   ");                   
		System.out.println(" +:+        +:+         +:+   +:+  +:+        +:+          ");                   
		System.out.println(" +#+        +#+        +#++:++#++: +#++:++#++ +#++:++#++   ");                    
		System.out.println(" +#+        +#+        +#+     +#+        +#+        +#+   ");                    
		System.out.println(" #+#    #+# #+#        #+#     #+# #+#    #+# #+#    #+#   ");                    
		System.out.println("  ########  ########## ###     ###  ########   ######## 	  "); 
		System.out.println(" :::::::::  :::::::::   ::::::::  ::::::::::: :::::::::: :::::::: :::::::::::");  
		System.out.println(" :+:    :+: :+:    :+: :+:    :+:     :+:     :+:       :+:    :+:    :+:     "); 
		System.out.println(" +:+    +:+ +:+    +:+ +:+    +:+     +:+     +:+       +:+           +:+     "); 
		System.out.println(" +#++:++#+  +#++:++#:  +#+    +:+     +#+     +#++:++#  +#+           +#+     "); 
		System.out.println(" +#+        +#+    +#+ +#+    +#+     +#+     +#+       +#+           +#+     "); 
		System.out.println(" #+#        #+#    #+# #+#    #+# #+# #+#     #+#       #+#    #+#    #+#     "); 
		System.out.println(" ###        ###    ###  ########   #####      ########## ########     ### 	 "); 
		System.out.println();                                                                                        

		
		System.out.println("1. Run program");
		System.out.println("2. Exit");
		System.out.print(">> ");
		menuString = scan.next();
		
		switch (menuString){
		case "1":
		default:
			for (int i = 0; i < 25; i++)
				System.out.println();
			Display display = new Display();
			display.runMainMenu();
			break;
		case "2":
			System.out.println("Goodbye!");
			System.exit(0);
			break;
		case "3":
			System.out.println();
			runSplash();
			break;
		}
	}
}