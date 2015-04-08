package edu.oakland.production.middleware;
import java.util.*;
//import edu.oakland.production.ClassProject.middleware.*;
//version 2.0
public class Student{
	private int gID;
	private String name;
	private String major;
	private double gpa;
	private int tg;
       
	public Student(int gID, String name, String major, double gpa, int tg){
                this.gID = gID;
                this.name = name;
                this.major = major;
                this.gpa = gpa ;
                this.tg = tg;
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
            return gpa;
        }

        public int getTG(){
            return tg;
        }
	}