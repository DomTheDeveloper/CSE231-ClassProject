package edu.oakland.test.ClassProject;

import edu.oakland.production.ClassProject.Display.*;
import junit.framework.*;
/**
 * @version Hello
 * @author Mel and Ben for LSI's shitty ass group.
 */
public class UserTest extends TestCase{

	/**
	 * Tests the display to for 1 student cut and 1 scholarship student to get the return value correct
	 */
	public void testStack(){
	       Display display = new Display("44 1 1 1 1 1 5");
	       
		  assertEquals("gID: 348689, name:10. Grant, major:CS, GPA:3.88, TG:99gID: 677422, name:1. Jones", display.runMainMenu()); //this is meant to fail
	}

	
}