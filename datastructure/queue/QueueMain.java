package com.fellowship.datastructure.queue;
import java.util.Scanner;

public class QueueMain {
	public static void main(String[] args) {
		showMenu();
	}

	private static void showMenu() {	
		QueueDemo queue = new QueueDemo();
		boolean exit =true;
		do {
			System.out.println("Make Your Choice..");
			System.out.println("1.Add Data\n2.Delete data \n3.Display Queue \n4.Size of stack\n5.Search \n6.Exit.");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
					
			switch(choice) {
				case 1:
					System.out.println("Enter data to add.");
					int data = scanner.nextInt();
					queue.push(data);
					break;
				case 2:
					queue.pop();
					break;
				case 3:
					queue.display();
					break;
				case 4:
					queue.sizeOfStack();
					break;
				case 5:
					System.out.println("Enter data to search");
					int data3 = scanner.nextInt();
					boolean found = queue.search(data3);
					if(found) {
						System.out.println("data found.");
					}else {
						System.out.println(data3+" is not present in linkedList");
					}
					break;
				case 6:
					exit = false;
					break;
				default:
					System.out.println("Enter choice Only from Menu.");
			}
			
		}while(exit);
		
	}
}
