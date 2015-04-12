package edu.oakland.production.ClassProject;

import edu.oakland.production.ClassProject.Display.Display;

/**
 * CSE 231 -- Class Project main class.
 * This class will instantiate a Display object, and the whole program
 * will run from there.
 * @author Evan Bradley
 * @version 1.2
 * @since 2015-04-01
 */

public class ClassProject {

    public static void main(String[] args) {
       Display display = new Display();
       String hello = display.runMainMenu();

    }
}
