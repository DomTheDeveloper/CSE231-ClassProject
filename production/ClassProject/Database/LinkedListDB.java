package edu.oakland.production.ClassProject.Database;
/**
* @version "version 2.0" "150204"
* @since "version 1.0" "150104"
*/

public class LinkedListDB<T> {

<<<<<<< .merge_file_a01484
	public Link<T> firstLink;
	
	public LinkedListDB(){
		firstLink = null;
	}
	
	/**
	*This method sets the the firstLink to null
	*/
	public boolean isEmpty(){
		return(firstLink == null);
	}
	
	/**
	*This method inserts a link and assigns it to first link
	*/
	public void insertFirstLink( T obj ){
	
		Link<T> newLink = new Link<T>(obj);
		
		newLink.next = firstLink;
		
		firstLink = newLink;
	}
	
	/**
	*This method removes a link from the linkedList
	*/
	
	public Link removeFirst(){
	
		Link linkReference = firstLink;
		
		if(!isEmpty()){
		
			firstLink = firstLink.next;
		}else{
		
			System.out.println("Empty LinkedList");
		}
		
		return linkReference;
	}
	
	/**
	*This method takes an object as a parameter and finds it in the linked list
	*/
	
	public Link find(T obj){
	
		Link theLink = firstLink;
		
		if(!isEmpty()){
		
			while(theLink.getData() != obj){
			
				if(theLink.next == null){
				
					return null;
				}else {
				
					theLink = theLink.next;
				}
			}
		}else {
		
			System.out.println("Empty LinkedLint");
		}
		return theLink;
	}
	
	/**
	*This method takes an object as a parameter, removes it form the list,
	* and assigns the nextLink to link
	*/
	public Link removeLink(T obj){
	
		Link<T> currentLink = firstLink;
		Link<T> previousLink = firstLink;
		
		while(currentLink.getData() != obj) {
		
			if(currentLink.next == null){
			
				return null;
			}else {
			
				previousLink = currentLink;
				
				currentLink = currentLink.next;
				
			}
		}
		
		if(currentLink == firstLink){
		
			firstLink = firstLink.next;
		}else{
		
			System.out.println("FOUND A MATCH");
			System.out.println("currentLink: " + currentLink);
			System.out.println("firstLink: " + firstLink);
			
			previousLink.next = currentLink.next;
		}
		
		return currentLink;
	}
	
	/**
	*This method takes an int and returns the object at that link
	*/
	public Link get(int id){
        
        if (id <= 0)
=======
    private Node head;
    private int listCount;
 
    public LinkedListDB() {
        head = new Node(null);
        listCount = 0;
    }
    /**
    * Appends the specified element to the end of this list.
    * @param data Of type Object, add element to list
    * @return 
    */
    public void add(Object data){
        Node temp = new Node(data);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        listCount++;
    }
 
    /**
    * Inserts the specified element at the specified position in this list
    * @param index Location at which you want to place the element
    * @param data Object you want to add to list at specified index
    */
    public void set(int index, Object data){
        Node temp = new Node(data);
        Node current = head;
        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        temp.setNext(current.getNext());
        current.setNext(temp);
        listCount++;
    }
 
    /**
    * Returns the element at the specified position in this list
    * @param index Location of link you want from the list
    * @return element at specified position
    */
    public Object get(int index){
        if (index <= 0)
>>>>>>> .merge_file_a01688
            return null;
 
        Node current = head.getNext();
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null)
                return null;
 
            current = current.getNext();
        }
        return current.getData();
    }
 
    /**
    * Optional method - if Middleware needs it
    * Removes the element at the specified position in this list
    * @param index Location of link you want from the list
    * @return true or false if element was removed
    */
    public boolean remove(int index){
        if (index < 1 || index > size())
            return false;
 
        Node current = head;
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null)
                return false;
 
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listCount--;
        return true;
    }
 
    /**
    * @return size of linked list
    */
<<<<<<< .merge_file_a01484
        public void setLink(int index){
        	
        	 if (id <= 0)
        	     return;
             
             Link currentLink = firstLink.next;
        }
}
=======
    public int size(){
        return listCount;
    }
 
    private class Node {
        Node next;
        Object data;
 
        public Node(Object dataValue) {
            next = null;
            data = dataValue;
        }

        public Node(Object dataValue, Node nextValue) {
            next = nextValue;
            data = dataValue;
        }
 
        public Object getData() {
            return data;
        }
 
        public void setData(Object dataValue) {
            data = dataValue;
        }
 
        public Node getNext() {
            return next;
        }
 
        public void setNext(Node nextValue) {
            next = nextValue;
        }
    }
}
>>>>>>> .merge_file_a01688
