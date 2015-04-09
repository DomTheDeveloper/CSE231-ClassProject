package edu.oakland.production.ClassProject.Database;
/**
* @version "version 2.0" "150204"
* @since "version 1.0" "150104"
*/

public class LinkedListDB<T> {

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
