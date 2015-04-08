package edu.oakland.production.ClassProject.Database;

/**
*@author Bryan J. and David M.
*@version version 2.0 150324
*@since version 1.0
*/

public class BinaryTreeDB<T> {

	Node<T> root;
	
/**
*The addNode method adds a node to the binary tree
*@param key The integer being added/stored withing the binaryTree
*@param name The name of the node being added/stored
*/
	public void addNode(int key, T name) {
	
		Node<T> newNode = new Node<T>(key, name);
		
		if(root == null){
		
			root = newNode;
		}else {
		
			Node<T> focusNode = root;
			
			Node<T> parent;
			
			while(true){
			
				parent = focusNode;
				
				if(key < focusNode.key){
				
					focusNode = focusNode.leftChild;
					
					if(focusNode == null){
					
						parent.leftChild = newNode;
						return;
				}
				}else {
					focusNode = focusNode.rightChild;
					
					if(focusNode == null){
						parent.rightChild = newNode;
						return;
						
					}
				}
			}
		}
	}
				
	
/**
*The inOrderTraverseTree method uses an In-Order search and prints out the value of each node as it traverses
*@param focusNode The node that you want to begin your search at
*/
	public void inOrderTraverseTree(Node focusNode) {
	
		if( focusNode != null){
		
			inOrderTraverseTree(focusNode.leftChild);
			
			System.out.println(focusNode);
			
			inOrderTraverseTree(focusNode.rightChild);
		}
	}
/**
*The preorderTraverseTree method uses an Pre-Order search and prints out the value of each node as it traverses
*@param focusNode The node that you want to begin your search at
*/	
	public void preorderTraverseTree(Node focusNode) {
	
		if( focusNode != null){
		
			System.out.println(focusNode);
		
			preorderTraverseTree(focusNode.leftChild);
			
			preorderTraverseTree(focusNode.rightChild);
		}	
	}
	
/**
*The findNode method finds a node containing the specified key value
*@param key The int value you want to find
*@return The node containing the specified int value
*/
	public Node<T> findNode(int key){
	
		Node<T> focusNode = root;
		
		while(focusNode.key != key){
		
			if(key < focusNode.key){
			
				focusNode = focusNode.leftChild;
			}else {
			
				focusNode = focusNode.rightChild;
			}	
			
			if (focusNode == null)
				return null;
		}		
		
		return focusNode;
	}
	
/**
*The remove method removes a node from the tree
*@param key The integer you want to remove
*@return A boolean representing whether the node was removed or not, true for yes, false for no
*/
	public boolean remove(int key){
	
		Node<T> focusNode = root;
		Node<T> parent = root;
		
		boolean isItALeftChild = true;
		
		while(focusNode.key != key){
		
			parent = focusNode;
			
			if(key < focusNode.key){
			
				isItALeftChild = true;
				
				focusNode = focusNode.leftChild;
			}else {
			
				isItALeftChild = false;
				
				focusNode = focusNode.rightChild;
			}
			
			if(focusNode == null)
				return false;
		}
		
		if(focusNode.leftChild == null && focusNode.rightChild == null){
		
			if(focusNode == root)		
				root = null;
				
			 else if(isItALeftChild)			
				parent.leftChild = null;
			
			else 			
				parent.rightChild = null;
		}
			
			
			else if(focusNode.rightChild == null){
			
				if(focusNode == root)
					root = focusNode.leftChild;
					
				else if(isItALeftChild)
					parent.leftChild = focusNode.leftChild;
					
				else 
					parent.rightChild = focusNode.leftChild;
			}
			
			else if(focusNode.leftChild == null){
			
				if(focusNode == root)
					root = focusNode.rightChild;
					
				else if(isItALeftChild)
					parent.leftChild = focusNode.leftChild;
					
				else 
					parent.rightChild = focusNode.rightChild;
			}
			
			else {
			
				Node<T> replacement = getReplacementNode(focusNode);
				
				if(focusNode == root)
					root = replacement;
					
				else if(isItALeftChild)
					parent.leftChild = replacement;
					
				else 
					parent.rightChild = replacement;
					
				replacement.leftChild = focusNode.leftChild;
				
			}
			
			return true;
		}
		
		public Node<T> getReplacementNode(Node<T> replacedNode){
		
			Node<T> replacementParent = replacedNode;
			Node<T> replacement = replacedNode;
			
			Node<T> focusNode = replacedNode.rightChild;
			
			while(focusNode != null){
			
				replacementParent = replacement;
				
				replacement = focusNode;
				
				focusNode = focusNode.leftChild;
			}
			
			if(replacement != replacedNode.rightChild){
			
				replacementParent.leftChild = replacement.rightChild;
				replacement.rightChild = replacedNode.rightChild;
			}
			
			return replacement;
		}
		
			
/**
*The getRootNode method finds the root node for the given Binary Tree
*@param tree The Binary Tree of which you're trying to find the root node
*@return The root node
*/
		public Node<T> getRootNode(){
			return root;
		}
	
	public static void main(String[] args) {
	
		BinaryTreeDB<String> theTree = new BinaryTreeDB<String>();
		
		theTree.addNode(1, "first");
		theTree.addNode(5, "second");
		theTree.addNode(10, "third");
		theTree.addNode(25, "fourth");
		theTree.addNode(50, "fifth");
		theTree.addNode(100, "sixth");
		
		BinaryTreeDB<String> theTree1 = new BinaryTreeDB<String>();
		
		BinaryTreeDB<String> theTree2 = new BinaryTreeDB<String>();
		System.out.println("ie. Removing 25");
		theTree.remove(25);
		theTree.preorderTraverseTree(theTree.root);	
	}
}
