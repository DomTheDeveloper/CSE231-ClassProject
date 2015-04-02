package edu.oakland.production.ClassProject.middleware;

public class Node{
	
	public int tg;
	public String name;
	public double gpa;
	public Node leftChild;
	public Node rightChild;
	
	Node(int intTg, String stringName, double doubleGpa){
		this.tg = intTg;
		this.name = stringName;
		this.gpa = doubleGpa;
	}
	public String toString(){
		return name + " has a thesis grade of " + tg;
	}
}