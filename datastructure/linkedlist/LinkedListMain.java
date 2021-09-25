package com.fellowship.datastructure.linkedlist;
import java.util.*;

public class LinkedListMain {
	
	public static void main(String args[]) {
		
		showOptionMenu();
		
	}
	public static void showOptionMenu() {
		LinkedList list = new LinkedList();
		boolean exit =true;
		do {
			System.out.println("Make Your Choice..");
			System.out.println("1.Add Data\n2.Delete data \n3.Display List \n4.Size of list\n5.Search data\n6.Add data at front.\n7.Sort Ascending\n8.Exit");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
					
			switch(choice) {
				case 1:
					System.out.println("Enter data to add.");
					int data = scanner.nextInt();
					list.add(data);
					break;
				case 2:
					System.out.println("Enter data to delete ");
					int data1 = scanner.nextInt();
					list.deleteKey(list, data1);
					break;
				case 3:
					list.display();
					break;
				case 4:
					int size = list.sizeOfList();
					System.out.println("Size of list is "+size);
					break;
				case 6:
					System.out.println("Enter data to at from front");
					int data2 = scanner.nextInt();
					list.addDataAtFront(data2);
					break;
				case 5:
					System.out.println("Enter data to search");
					int data3 = scanner.nextInt();
					boolean found = list.search(data3);
					if(found) {
						System.out.println("data found.");
					}else {
						System.out.println(data3+" is not present in linkedList");
					}
					break;
				case 7:
					list.sort();
					System.out.println("List Sorted.");
					break;
				case 8:
					System.out.println("You are exiting.");
					exit = false;
					break;
				default:
					System.out.println("Enter choice Only from Menu.");
			}
			
		}while(exit);
		
	}


}
