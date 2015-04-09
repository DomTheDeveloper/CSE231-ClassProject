package edu.oakland.production.ClassProject.Database;

/**
*
*
*@author Jacques Breaux
*@version 1.0 150408
*@since 1.0 150408
*/
public class Link<T> {
	public Link<T> next;
	private T data;
	
	public Link(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T obj) {
		this.data = obj;
	}
	
	public String toString() {
		return "Link Data: " + data.toString();
	}
}