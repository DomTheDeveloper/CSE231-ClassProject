package edu.oakland.production.ClassProject.Middleware;
import java.util.*;
/**
 *@version 1.0
 * @author Sam
 */
public class StackCut extends Stack<Object>{
    private int stackSize;
    private Object[] stackArray;
    private int topOfStack = -1;


    public StackCut(int param){
        this.stackSize = param;
        stackArray = new Object[stackSize];
    }

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
    public Object pop(){
        if(topOfStack>=0){
            stackArray[topOfStack]=null;
            return stackArray[topOfStack--];
        }
        else{
            return null;
        }
    }

    public void displayStacks(){
        for(int n=0; n<stackSize;n++){
            System.out.println(stackArray[n]);
        }
    }

    public Object peek(){
	if ( topOfStack >= 0)
	        return stackArray[topOfStack];
	else
		return null;
    }

}
