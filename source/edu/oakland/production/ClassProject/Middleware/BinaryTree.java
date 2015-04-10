package edu.oakland.production.ClassProject.Middleware;

import edu.oakland.production.ClassProject.Database.BinaryTreeDB;
import edu.oakland.production.ClassProject.Database.Node;
import java.util.*;

public class BinaryTree extends BinaryTreeDB<Student>{
		
		public ArrayList<Node> getLess(int tg, double gpa) {
			return getLess(root, tg, gpa);
		}
		
		private ArrayList<Node> getLess(Node<Student> n, int tg, double gpa) {
			ArrayList<Node> nodes = new ArrayList<Node>();
			if(n.getValue().getTG() < tg && n.getValue().getGPA() < gpa) {
				nodes.add(n);
			}
			if(n.leftChild != null) {
				ArrayList<Node> left = getLess(n.leftChild, tg,gpa);
				for(int i = 0 ; i < left.size(); i++){
					nodes.add(left.get(i));
				}
			}
			if(n.rightChild != null ) {
				ArrayList<Node> right = getLess(n.rightChild,tg,gpa);
				for(int i = 0 ; i < right.size(); i++){
					nodes.add(right.get(i));
				}
			}
			return nodes;
		}
		
		public static void main(String[] args) {
			BinaryTree bt = new BinaryTree();
		//	bt.add(new Student(int gID, String name, String major, double gpa, int tg));
			bt.addNode(90, new Student(111111, "Jelo", "CSE", 3.8, 88));
			bt.addNode(88, new Student(222222, "Janet", "CSE", 3.6, 88));
			bt.addNode(92, new Student(333333, "Jackson", "CSE", 3.4, 92));
			bt.addNode(77, new Student(444444, "Michael", "CSE", 3.7, 77));
			bt.addNode(70, new Student(555555, "Allen", "CSE", 3.0, 70));
			System.out.println(bt.getLess(90, 3.6));
		}
	}

