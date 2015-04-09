package edu.oakland.production.ClassProject.Database;

/**
* Updates: Returns Data instead of link when "Deleting" a Link. Added Method "getSize". Modified Get to Match Middleware req.
* Added ToString for Debugging. Added My own version of Set since it was missing.
*@author Nicholas Herman, Craig Hardy
*@version 4.0 150408
*@since version 2.0
*/




public class LinkedListDB<T> {

	public Link<T> firstLink;
	
	private int size = 0;
	
	public LinkedListDB(){
		size = 0;
		firstLink = null;
	}
	
	public boolean isEmpty(){
	
		return(firstLink == null);
	}
	
	public void add(T obj) {
		size++;
		insertFirstLink(obj);
	}
	
	public void insertFirstLink( T obj ){
	
		Link<T> newLink = new Link<T>(obj);
		
		newLink.next = firstLink;
		
		firstLink = newLink;
	}
	
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
	
	public Link<T> removeLink(Link<T> obj){
	
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
    
    public void set(int index, T obj){
        	//write me plz
			Link<T> current = firstLink;
			for(int i = 0; i < index; i++)
			{
				current = current.next;
			}
			if(current != null)
				current.setData(obj);
    }
      
	  
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



