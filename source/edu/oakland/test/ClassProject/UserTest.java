package edu.oakland.production.ClassProject;

import edu.oakland.production.ClassProject.*;
import junit.framework.*;

/**
 * UserTest -- Tests the whole system.
 * @author Duncan Taylor
 * @version 2.0
 * @since version 1.0
 */
public class UserTest extends TestCase{

	Display display;
	int last = 348689;
	int winner = 677422;
	// String should match middleware.createStudent(grizzlyID, name, major, gpa, thesisGrade)
	// I believe that a space should work as a delimiter. -- Evan
	String students = "4 " + "677422 " + "Jones " + "IT " + "3.82 " + "95 ";
			/*Student student2 = new Student(177993, "Smith", "IT", 3.47, 78);
			Student student3 = new Student(444811, "Breaux", "CS", 3.95, 98);
			Student student4 = new Student(113625, "Brady", "CS", 3.77, 92);
			Student student5 = new Student(382707, "Rominske", "CS", 3.82, 79);
			Student student6 = new Student(447447, "Hardy", "IT", 3.68, 99);
			Student student7 = new Student(661284, "Kominsky", "IT", 3.23, 70);
			Student student8 = new Student(855462, "O'Brien", "IT", 3.44, 85);
			Student student9 = new Student(223344, "Chamberlain", "CS", 3.99, 96);
			Student student10 = new Student(348689, "Grant", "CS", 3.88, 99);*/

	/**
	 * setUp() -- Sets the coniditions for the test.
     */		
	public void setUp(){
		Display display = new Display(students);
		display.runMainMenu();
	}
	
	public void testLIFO(){
		display.runMainMenu();
		int lastReg = display.runMainMenu();/*This call to the runMainMenu() method needs to input the correct cases to return the 
							grizzID of the last person to register**/
		assertEquals(last,last0);
	}
	
	public void testFI_wins(){
		display.mainMenu();
		int winner0 = display.runMainMenu();/*This call to the runMainMenu() method needs to input the correct cases to return the 
							grizzID of the person who won the scholarship**/
		assertEquals(winner,winner0);
	}
}
