package edu.oakland.production.ClassProject;

import edu.oakland.production.ClassProject.Display.Splash;

/**
 * CSE 231 -- Class Project main class.
 * This class will instantiate a Display object, and the whole program
 * will run from there.
 * @author DomTheDeveloper
 * @version 1.0
 * @since 2015-04-13
 */
public class RunSplash {
    public static void main(String[] args) {
       Splash splash = new Splash();
       splash.runSplash();
    }
}
