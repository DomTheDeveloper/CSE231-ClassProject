package edu.oakland.production.ClassProject.middleware;

public class Node{
	
	public int tg;
	public String name;
	public double gpa;
	public Node leftChild;
	public Node rightChild;
	
	Node(String stringName, double doubleGpa, int intTg){
		this.name = stringName;
		this.gpa = doubleGpa;
		this.tg = intTg;
	}
	public String toString(){
		return name + " has a thesis grade of " + tg;
	}
}