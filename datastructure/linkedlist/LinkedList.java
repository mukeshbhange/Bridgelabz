package com.fellowship.datastructure.linkedlist;

class Node{
	int data;
	Node nextAddress;

	public Node(int data) {
		this.data = data;
		this.nextAddress = null;
	}	
}
public class LinkedList {
	static Node firstNode;
	
	public void add(int data) {
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
	}

	public void addDataAtFront(int data) {
		Node newNode = new Node(data);
		newNode.nextAddress = firstNode;
		firstNode = newNode;
	}

	public void display() {
		Node temp = firstNode;
		if(temp == null) {
			System.out.println("List is Empty.Add data first.");
		}
		while(temp!= null) {
			System.out.print(temp.data+"->");
			temp = temp.nextAddress; 
		}
		System.out.println();
	}

	public int sizeOfList() {
		Node temp = firstNode;
		int count = 0;
		while(temp != null) {
			count += 1;
			temp = temp.nextAddress; 
		}
		return count;	
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

	public void deleteFromEnd() {
		Node temp = firstNode;
		//Node parent = null;
		while(temp.nextAddress.nextAddress != null) {
			//parent = temp;
			temp = temp.nextAddress; 
		}
		temp.nextAddress = null;
	}

	public LinkedList deleteKey(LinkedList list,int data) {
		Node temp = firstNode;
		Node parent = null;
		if(temp != null && temp.data == data) {
			firstNode = temp.nextAddress;
			return list;
		}

		while(temp != null && temp.data != data) {
			parent = temp;
			temp = temp.nextAddress; 
		}

		if(temp != null) {
			parent.nextAddress = temp.nextAddress;
			System.out.println(data+" deleted");
		}else {
			System.out.println("Data not found");
		}
		return list;
	}
	
	public void sort() {
		Node temp = firstNode,parent = null;
		
		if(temp == null) {
			System.out.println("List is Empty.");
			return;
		}else {
			while(temp != null) {
				parent = temp.nextAddress;
				
				while(parent != null) {
					if(temp.data > parent.data) {
						int t = temp.data;
						temp.data = parent.data;
						parent.data = t;
					}
					parent = parent.nextAddress;
				}
				temp = temp.nextAddress;
			}
		}
	}
}
