package com.fellowship.datastructure.hashTable;

public class HashMapDemo {

	public static void main(String[] args) {
		
		int valueArray[] = {1,2,3,4,5,6,7,8,9,10,11,12,99};
		int size = 7;
		
		Object objs[] = new Object[size];		
		
		for(int i=0; i<size; i++) {
			objs[i] = new LinkedList();
		}
		
		for(int i=0; i<valueArray.length; i++) {
			int hashIndex = hashIndex(size,valueArray[i]);
			LinkedList list = (LinkedList) objs[hashIndex];
			addToHash(list,valueArray[i]);
		}
		printHash(objs);
	}
	
	private static void addToHash(LinkedList list,int value) {
		list.add(value);
	}
	
	private static void printHash(Object objs[]) {
		for(int i=0;i<objs.length;i++){
			LinkedList list = (LinkedList) objs[i];
			System.out.print("Hash["+i+"]->");
			list.display();
			System.out.println();
		}
		
	}
	
	public static int hashIndex(int size,int value) {
		int hashIndex = value % size;
		return hashIndex;
	}
}
