
package edu.oakland.production;

import java.util.*;

public class Student{
	private int gID;
	private String name;
	private String major;
	private double GPA;
	private int TG;
        
	public Student(int gID, String name, String major, double GPA, int TG){
	    this.gID = gID;
	    this.name = name;
	    this.major = major;
	    this.GPA = GPA;
	    this.TG = TG;
    }
	public int getID(){
		return gID;
	}
	public String getName(){
		return name;
	}
    public String getMajor(){
        return major;
    }
    public double getGPA(){
        return GPA;
    }
    public int getTG(){
        return TG;
    }
    public static void main(String [] args){
    	Student student1 = new Student(677422, "Jones", "IT", 3.82, 95);	
		Student student3 = new Student(444811, "Breaux", "CS", 3.95, 98);
		Student student4 = new Student(113625, "Brady", "CS", 3.77, 92);
		Student student5 = new Student(382707, "Rominske", "CS", 3.82, 79);
		Student student6 = new Student(447447, "Hardy", "IT", 3.68, 99);
		Student student7 = new Student(661284, "Kominsky", "IT", 3.23, 70);
		Student student8 = new Student(855462, "O'Brien", "IT", 3.44, 85);
		Student student9 = new Student(223344, "Chamberlain", "CS", 3.99, 96);
		Student student10 = new Student(348689, "Grant", "CS", 3.88, 99);
        StackCut stackcut = new StackCut(10);
		
		stackcut.push(student1.getID());
        stackcut.push(student2.getID());
        stackcut.push(student3.getID());
        stackcut.push(student4.getID());
        stackcut.push(student5.getID());
        stackcut.push(student6.getID());
        stackcut.push(student7.getID());
        stackcut.push(student8.getID());
        stackcut.push(student9.getID());
        stackcut.push(student10.getID());

        System.out.println("The current stack is: ");
        stackcut.displayStacks();
        System.out.println();
        
        for(int i=0;i<5;i++){
            Object sgid = stackcut.peek();
            int h = (Integer) sgid;
            if(h == student1.getID()){
                System.out.println("Student of name: "+student1.getName()+" and GID: "+student1.getID()+" was removed from the list.");
                System.out.println(student1.getName()+" had a major of: "+student1.getMajor()+" a GPA of: "+student1.getGPA()+" and a thesis grade of: "+student1.getTG());
                System.out.println();
            }
            if(h == student2.getID()){
                System.out.println("Student of name: "+student2.getName()+" and GID: "+student2.getID()+" was removed from the list.");
                System.out.println(student2.getName()+" had a major of: "+student2.getMajor()+" a GPA of: "+student2.getGPA()+" and a thesis grade of: "+student2.getTG());
                System.out.println();
            }
            if(h == student3.getID()){
                System.out.println("Student of name: "+student3.getName()+" and GID: "+student3.getID()+" was removed from the list.");
                System.out.println(student3.getName()+" had a major of: "+student3.getMajor()+" a GPA of: "+student3.getGPA()+" and a thesis grade of: "+student3.getTG());
                System.out.println();
            }
            if(h == student4.getID()){
                System.out.println("Student of name: "+student4.getName()+" and GID: "+student4.getID()+" was removed from the list.");
                System.out.println(student4.getName()+" had a major of: "+student4.getMajor()+" a GPA of: "+student4.getGPA()+" and a thesis grade of: "+student4.getTG());
                System.out.println();
            }
            if(h == student5.getID()){
                System.out.println("Student of name: "+student5.getName()+" and GID: "+student5.getID()+" was removed from the list.");
                System.out.println(student5.getName()+" had a major of: "+student5.getMajor()+" a GPA of: "+student5.getGPA()+" and a thesis grade of: "+student5.getTG());
                System.out.println();
            }
            if(h == student6.getID()){
                System.out.println("Student of name: "+student6.getName()+" and GID: "+student6.getID()+" was removed from the list.");
                System.out.println(student6.getName()+" had a major of: "+student6.getMajor()+" a GPA of: "+student6.getGPA()+" and a thesis grade of: "+student6.getTG());
                System.out.println();
            }
            if(h == student7.getID()){
                System.out.println("Student of name: "+student7.getName()+" and GID: "+student7.getID()+" was removed from the list.");
                System.out.println(student7.getName()+" had a major of: "+student7.getMajor()+" a GPA of: "+student7.getGPA()+" and a thesis grade of: "+student7.getTG());
                System.out.println();
            }
            if(h == student8.getID()){
                System.out.println("Student of name: "+student8.getName()+" and GID: "+student8.getID()+" was removed from the list.");
                System.out.println(student8.getName()+" had a major of: "+student8.getMajor()+" a GPA of: "+student8.getGPA()+" and a thesis grade of: "+student8.getTG());
                System.out.println();
            }
            if(h == student9.getID()){
                System.out.println("Student of name: "+student9.getName()+" and GID: "+student9.getID()+" was removed from the list.");
                System.out.println(student9.getName()+" had a major of: "+student9.getMajor()+" a GPA of: "+student9.getGPA()+" and a thesis grade of: "+student9.getTG());
                System.out.println();
            }
            if(h == student10.getID()){
                System.out.println("Student of name: "+student10.getName()+" and GID: "+student10.getID()+" was removed from the list.");
                System.out.println(student10.getName()+" had a major of: "+student10.getMajor()+" a GPA of: "+student10.getGPA()+" and a thesis grade of: "+student10.getTG());
                System.out.println();
            }
            stackcut.pop();    
        }
        System.out.println();
        System.out.println("The stack after the cut is: ");
        stackcut.displayStacks();
        System.out.println();
        Object unluckystudentone =stackcut.peek();
        stackcut.pop();
        Object unluckystudenttwo = stackcut.peek();
        stackcut.pop();
        System.out.println("The stack after the cut is: ");
        stackcut.displayStacks();
        System.out.println();
        System.out.println("The student with GID: "+unluckystudentone+" did not recieve the scholarship.");
        System.out.println("The student with GID: "+unluckystudenttwo+" also did not recieve the scholarship.");
                     
	}
}