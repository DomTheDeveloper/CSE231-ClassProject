package edu.oakland.production.ClassProject.Database;

import java.util.*;

/**
 * This is the class that implements the JCF container of Stack
 * to provide stack functionality (i.e. methods) based upon LIFO data element processing.
 * @version "version 2.0" "20150904"
 * @author Sam Bell and Binh Ton
 */
public class StackCut extends Stack<Object>{
    private int stackSize;
    private Object[] stackArray;
    private int topOfStack = -1;

    /**
     * Default constructor which creates an array for stack.
     * 
     * @param param Size of the stack array.
     */
    public StackCut(int param){
        this.stackSize = param;
        stackArray = new Object[stackSize];
    }
	/**
	 * Pushes an item onto the top of this stack.
	 * 
	 * @param param The item to be pushed onto this stack.
	 * @return The param argument.
	 */
    public Object push(Object param) {
        if(topOfStack+1<stackSize){
            topOfStack++;
            stackArray[topOfStack]= param;
        }
        else{
            System.out.println("stack is full");
	    return null;
        }
	return param;
    }
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * 
     * @return The object at the top of this stack.
     */
    public Object pop(){
        if(topOfStack>=0){
            stackArray[topOfStack]=null;
            return stackArray[topOfStack--];
        }
        else{
            return null;
        }
    }
	/**
	 * Displays this stack array.
	 */
    public void displayStacks(){
        for(int n=0; n<stackSize;n++){
            System.out.println(stackArray[n]);
        }
    }
	/**
	 * Looks at the object at the top of this stack without removing it from the stack.
	 * 
	 * @return The object at the top of this stack.
	 */
    public Object peek(){
	if ( topOfStack >= 0)
	        return stackArray[topOfStack];
	else
		return null;
    }
	/**
	 * Creates and returns a copy of this stack.
	 * 
	 * @return A copy of this stack.
	 */
	public StackCut clone() {
		StackCut clone = new StackCut(this.stackSize);
		for(int i = 0; i <= topOfStack; i++) {
			clone.push(stackArray[i]);
		}
		return clone;
	}
	/**
	 * Gets the size of this stack.
	 * 
	 * @return The number of elements in this stack.
	 */
	public int getSize() {
		return topOfStack + 1;
	}
	
	public void setSize(int newStackSize) {
		this.stackSize = newStackSize;
		stackArray = new Object[stackSize];
	}
}
