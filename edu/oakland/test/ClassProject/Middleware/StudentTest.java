package edu.oakland.test.ClassProject.Middleware;
import junit.framework.*;
import edu.oakland.production.ClassProject.Middleware.*;
import edu.oakland.production.ClassProject.Database.StackCut;
//version 2.2
public class StudentTest extends TestCase{
	private static Student student1;
	private static Student student2;
	private static Student student3;
	private static Student student4;
	private static Student student5;
	private static Student student6;
	private static Student student7;
	private static Student student8;
	private static Student student9;
	private static Student student10;
	
	public void setUp(){
		student1 = new Student(677422, "Jones", "IT", 3.82, 95);
		student2 = new Student(177993, "Smith", "IT", 3.47, 78);
		student3 = new Student(444811, "Breaux", "CS", 3.95, 98);
		student4 = new Student(113625, "Brady", "CS", 3.77, 92);
		student5 = new Student(382707, "Rominske", "CS", 3.82, 79);
		student6 = new Student(447447, "Hardy", "IT", 3.68, 99);
		student7 = new Student(661284, "Kominsky", "IT", 3.23, 70);
		student8 = new Student(855462, "O'Brien", "IT", 3.44, 85);
		student9 = new Student(223344, "Chamberlain", "CS", 3.99, 96);
		student10 = new Student(348689, "Grant", "CS", 3.88, 99);
	}
	
	public void testStudent(){
		
		final String firstStudentName = "Jones";
		
		assertEquals(firstStudentName, student1.getName());
		
		final String secondStudentName = "Smith";
		student2 = new Student(177993, "Smith", "IT", 3.47, 78);
		assertEquals(secondStudentName, student2.getName());
		
		final String thirdStudentName = "Breaux";
		student3 = new Student(444811, "Breaux", "CS", 3.95, 98);
		assertEquals(thirdStudentName, student3.getName());
		
		final String fourthStudentName = "Brady";
		student4 = new Student(113625, "Brady", "CS", 3.77, 92);
		assertEquals(fourthStudentName, student4.getName());
		
		final String fifthStudentName = "Rominske";
		student5 = new Student(382707, "Rominske", "CS", 3.82, 79);
		assertEquals(fifthStudentName, student5.getName());
		
		final String sixthStudentName = "Hardy";
		student6 = new Student(447447, "Hardy", "IT", 3.68, 99);
		assertEquals(sixthStudentName, student6.getName());
		
		final String seventhStudentName = "Kominsky";
		student7 = new Student(661284, "Kominsky", "IT", 3.23, 70);
		assertEquals(seventhStudentName, student7.getName());
		
		final String eighthStudentName = "O'Brien";
		student8 = new Student(855462, "O'Brien", "IT", 3.44, 85);
		assertEquals(eighthStudentName, student8.getName());
		
		final String ninethStudentName = "Chamberlain";
		student9 = new Student(223344, "Chamberlain", "CS", 3.99, 96);
		assertEquals(ninethStudentName, student9.getName());
		
		final String tenthStudentName = "Grant";
		student10 = new Student(348689, "Grant", "CS", 3.88, 99);
		assertEquals(tenthStudentName, student10.getName());
	}
	
	public void testStack(){
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
                System.out.println("The student with GID: "+unluckystudentone+" did not receive the scholarship.");
                System.out.println("The student with GID: "+unluckystudenttwo+" also did not receive the scholarship.");
				
				
				Object sgid = stackcut.peek();
				System.out.println();
				System.out.println("The Student with GID: " + sgid + " received the Scholarship.");
				assertEquals(sgid , 444811);
				stackcut.pop();
				
				sgid = stackcut.peek();
				System.out.println("The Student with GID: " + sgid + " received the Scholarship.");
				assertEquals(sgid, 177993);
				stackcut.pop();
				
				sgid = stackcut.peek();
				System.out.println("The Student with GID: " + sgid + " received the Scholarship.");
				assertEquals(sgid, 677422);
				stackcut.pop();
	}
	 public void testTree(){
	 	  BinaryTree tree = new BinaryTree();

	 	  System.out.println();
	 	  tree.addNode(student1.getName(),student1.getGPA(),student1.getTG());
	 	  tree.addNode(student2.getName(),student2.getGPA(),student2.getTG());
		  tree.addNode(student3.getName(),student3.getGPA(),student3.getTG());
		  tree.addNode(student4.getName(),student4.getGPA(),student4.getTG());
		  tree.addNode(student5.getName(),student5.getGPA(),student5.getTG());
		  tree.addNode(student6.getName(),student6.getGPA(),student6.getTG());
		  tree.addNode(student7.getName(),student7.getGPA(),student7.getTG());
		  tree.addNode(student8.getName(),student8.getGPA(),student8.getTG());
		  tree.addNode(student9.getName(),student9.getGPA(),student9.getTG());
		  tree.addNode(student10.getName(),student10.getGPA(),student10.getTG());
		  
		  tree.preorderTraverseTree(tree.root);
		  System.out.println();
		  System.out.println("Students with a tg of less than 90");
		   System.out.println();
		//  System.out.println(tree.findNode(90));
		  System.out.println(tree.getLess(90));
		  System.out.println();
		  
	  }
}





