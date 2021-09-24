package com.fellowship.datastructure.stack;

class Node{
	int data;
	Node nextAddress;
	
	public Node(int data) {
		this.data = data;
		this.nextAddress = null;
	}
}

public class StackDemo {
	static Node firstNode;		
	public void push(int data) {
		Node newNode = new Node(data);

		if(firstNode == null) {
			firstNode = newNode;
		}else {
			Node temp = firstNode;
			//newNode.nextAddress = null;
			while(temp.nextAddress != null) {
				temp = temp.nextAddress;
			}
			temp.nextAddress = newNode;
		}
		System.out.println("added.");
	}
	
	public void pop() {
		Node temp = firstNode;
		Node parent = null;
		while(temp.nextAddress != null) {
			parent = temp;
			temp = temp.nextAddress; 
		}
		parent.nextAddress = null;
		System.out.println(temp.data+" deleted");
	}
	
	public void display() {
		Node temp = firstNode;
		if(temp == null) {
			System.out.println("Tack is Empty.Add data first.");
		}
		while(temp!= null) {
			System.out.print(temp.data+"->");
			temp = temp.nextAddress; 
		}
		System.out.println();
	}

	public void sizeOfStack() {
		Node temp = firstNode;
		int count = 0;
		while(temp != null) {
			count += 1;
			temp = temp.nextAddress; 
		}
		System.out.println("size of stack is "+count);
	}
	
	public boolean search(int data) {
		Node temp = firstNode;
		boolean search = false;
		while(temp!= null ) {
			if(temp.data == data) {
				search = true;
				return search;
			}else {
				temp = temp.nextAddress; 
			}
		}
		return search;	
	}
}
