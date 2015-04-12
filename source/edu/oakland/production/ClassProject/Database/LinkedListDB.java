package edu.oakland.production.ClassProject.Database;

/**
* Updates: Returns Data instead of link when "Deleting" a Link. Added Method "getSize". Modified Get to Match Middleware req.
* Added ToString for Debugging. Added My own version of Set since it was missing.
* 
*@author Nicholas Herman, Craig Hardy
*@version 4.0 150408
*@since version 3.0
*/

public class LinkedListDB<T> {
	/**
	 *  Declares an instance of the Link class 
	 */
	public Link<T> firstLink;
	
	private int size = 0;
	/**
	 * Default constructor which sets size to 0 and firstLink to null.
	 */ 
	public LinkedListDB(){
		size = 0;
		firstLink = null;
	}
	/** 
	 * Returns the number of elements in this list.
	 * 
	 * @return The number of elements in this list.
	 */
	public int size() {
		return size;
	}
	/**
	 * Returns true if this collection contains no elements.
	 * 
	 * @return True if this collection contains no elements.
	 */
	public boolean isEmpty(){
	
		return(firstLink == null);
	}
	/**
	 * Appends the specified element to the end of this list and increases the size of this list.
	 * 
	 * @param obj Element that is to be appended to the end of this list.
	 */
	public void add(T obj) {
		size++;
		insertFirstLink(obj);
	}
	/**
	 * Appends the specified element to the end of this list.
	 * 
	 * @param obj Element that is to be appended to the end of this list.
	 */
	public void insertFirstLink( T obj ){
	
		Link<T> newLink = new Link<T>(obj);
		
		newLink.next = firstLink;
		
		firstLink = newLink;
	}
	/** 
	 * Removes the first link in this list.
	 * 
	 * @return Object that has been removed from this list
	 */
	public T removeFirst(){
	
		Link<T> linkReference = firstLink;
		
		if(!isEmpty()){
		
			firstLink = firstLink.next;
			size--;
		}else{
		
			System.out.println("Empty LinkedList");
		}
		
		return linkReference.getData();
	}
	/**
	 * Locates and returns the specified element.
	 * 
	 * @param obj The element you want to locate within this list.
	 * @return If found, it returns the element that was specified.
	 */
	public Link<T> find(T obj){
	
		Link<T> theLink = firstLink;
		
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
	 * Locates and removes the specified link.
	 * 
	 * @param obj The element that needs to be removed from this list.
	 * @return The link that was removed.
	 */
	public Link<T> removeLink(T obj){
	
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
			size = size > 0 ? size-- : 0;
			previousLink.next = currentLink.next;
		}
		
		return currentLink;
	}
	/**
	 * Returns the element at the specified position in this list.
	 * 
	 * @param id The index of the element.
	 * @return The element at the specified position in this list.
	 */
	public Link<T> get(int id){
        
        if (id < 0)
		{
            return null;
		}
 
        Link<T> currentLink = firstLink;
        for (int i = 0; i < id; i++) {
            if (currentLink == null)
                return null;
 
            currentLink = currentLink.next;
        }
        	return currentLink;
    	}
    	/**
    	 * Replaces the element at the specified position in this list with the specified element.
    	 * 
    	 * @param index Index of the element to replace.
    	 * @param obj Element to be stored at the specified position.
    	 * @return The element previously at the specified position.
    	 */
    	public void set(int index, T obj){
		Link<T> current = firstLink;
		for(int i = 0; i < index; i++)
		{
			current = current.next;
		}
		if(current != null)
			current.setData(obj);
    	}
     	/**
     	 * Returns a string representation of this list.
     	 * 
     	 * @return A string representation of this list.
     	 */
	public String toString() {
		Link<T> current = firstLink;
		String output = "Linked DB:";
		while(current != null)
		{
			output += current.toString();
			current = current.next;
		}
		return output;
	}
}



