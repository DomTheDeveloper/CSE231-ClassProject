package edu.oakland.production.ClassProject.Database;

/**
*@author Nicholas Herman, Craig Hardy
*@version 1.0 150325
*@since version 2.0
*/


/**
*This class provides middleware with the ability to store, get, and set links in 
* in a LinkedList.
*/

class LinkedListDB<T> {

	public Link<T> firstLink;
	
	LinkedList(){
	
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
            return null;
 
        Link currentLink = firstLink.next;
        for (int i = 1; i < id; i++) {
            if (currentLink.next == null)
                return null;
 
            currentLink = currentLink.next;
        }
        return currentLink;
    }
    
    /**
    * This method replaces existing value at the index with the given value
    */
        public void setLink(int index){
        	
        	 if (id <= 0)
        	     return null,
             
             Link currentLink = firstLink.next;
        }
      
}



