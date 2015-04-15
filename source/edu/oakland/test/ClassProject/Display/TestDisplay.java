package edu.oakland.test.ClassProject.Display;

import edu.oakland.production.ClassProject.Display.*;
import junit.framework.*;
/**
 * @version Hello
 * @author Mel and Ben
 */
public class TestDisplay extends TestCase{

	/**
	 * Tests the display to for 1 student cut and 1 scholarship student to get the return value correct
	 */
	public void testStack(){
		Display display = new Display("1 1 100 2 1 400000 500000 600000 3 1 44 1 1 1 1 1 5");
		display.set100kValueForTest(100);
		display.runMainMenu();
		assertEquals("111111111111111111111.011111", display.middlewhereString);
	}

	
}