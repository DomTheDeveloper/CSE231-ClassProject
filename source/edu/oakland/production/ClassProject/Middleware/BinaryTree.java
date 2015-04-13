package edu.oakland.production.ClassProject.Middleware;

/**
 * @author Blair Sibu
 * @version version 2.0.0 date 150405
 * since version 1.0.0 date 150331
 */
import edu.oakland.production.ClassProject.Database.*;
import java.util.*;

public class BinaryTree extends BinaryTreeDB<Student>{

		/**
		*This returns the getLess array.
		*@param tg
		*@param gpa
		*/
		public ArrayList<Node> getLess(int tg, double gpa) {
			return getLess(root, tg, gpa);
		}

		/**
		*This method returns the students whose thesis and gpa are below a certain amount.
		*@param n
		*@param tg
		*@param gpa
		*/
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
	}
