package edu.oakland.production.ClassProject.Middleware;

import edu.oakland.production.ClassProject.Database.BinaryTreeDB;
import edu.oakland.production.ClassProject.Database.Node;
import java.util.*;

public class BinaryTree extends BinaryTreeDB<Student>{
	
	//public Node root;
	/*
	public void addNode(String name, double gpa, int tg){
		Node newNode = new Node(name, gpa, tg);
			if(root == null){
				root = newNode;
			}
			else{
				Node focusNode = root;
				Node parent;
				while(true){
					parent = focusNode;
					if(tg < focusNode.tg){
						focusNode = focusNode.leftChild;
					
					if(focusNode == null){
						parent.leftChild = newNode;
						return;
						}
					}
					else {
					focusNode = focusNode.rightChild;
					if(focusNode == null){
						parent.rightChild = newNode;
						return;
						}
					}
				}
			}
		}
		
		public void preorderTraverseTree(Node focusNode){
			if(focusNode != null){
				System.out.println(focusNode);
				preorderTraverseTree(focusNode.leftChild);
				preorderTraverseTree(focusNode.rightChild);
			}
		}
		
		public ArrayList<Node> preorderTraverseTreeNodes(Node focusNode) {
			ArrayList<Node> nodes = new ArrayList<Node>();
			if(focusNode != null){
				nodes.add(focusNode);
				ArrayList<Node> left = preorderTraverseTreeNodes(focusNode.leftChild);
				for(int i = 0; i < left.size(); i++)
					nodes.add(left.get(i));
				ArrayList<Node> right =	preorderTraverseTreeNodes(focusNode.rightChild);
				for(int i = 0; i < right.size(); i++) {
					nodes.add(right.get(i));
				}
			}
			return nodes;
		}
		*/
		/* public List<Node> findNodes(int tgs){
			Node focusNode = root;
			
			for (int i = focusNode.count(); i > 0; i++){
				
				if (child.tg < 90)
					child.remove();
			}
			
			
		} */
		
		/*
		public Node findNode(int tg){
			// List<Node> lstNodes = new List<Node>(); 
			
			Node focusNode = root;
			while(focusNode.tg != tg){
				
				if(tg < focusNode.tg){
					focusNode = focusNode.leftChild;
				}
				else{
					focusNode = focusNode.rightChild;
				} 
			}
			return focusNode;
		}*/
		
		public ArrayList<Node> getLess(int tg) {
			return getLess(root, tg);
		}
		
		private ArrayList<Node> getLess(Node<Student> n, int tg) {
			ArrayList<Node> nodes = new ArrayList<Node>();
			if(n.getValue().getTG() < tg) {
				nodes.add(n);
			}
			if(n.leftChild != null) {
				ArrayList<Node> left = getLess(n.leftChild, tg);
				for(int i = 0 ; i < left.size(); i++){
					nodes.add(left.get(i));
				}
			}
			if(n.rightChild != null ) {
				ArrayList<Node> right = getLess(n.rightChild,tg);
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
			System.out.println(bt.getLess(90));
		}
	}

